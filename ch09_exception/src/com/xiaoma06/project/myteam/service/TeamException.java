package com.xiaoma06.project.myteam.service;

/**
 * ClassName: TeamException
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 16:31
 * @Version 1.0
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -338793124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
