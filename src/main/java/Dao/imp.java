package Dao;

import entity.UserDao;

public class imp implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取用户数据");
    }
}
