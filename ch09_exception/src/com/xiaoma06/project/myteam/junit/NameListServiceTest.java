package com.xiaoma06.project.myteam.junit;

import com.xiaoma06.project.myteam.domain.Employee;
import com.xiaoma06.project.myteam.service.NameListService;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 16:40
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();

        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testgetEmployee(){
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
