package Service;

import Dao.imp;
import entity.UserDao;

public class UserServiceImp implements UserService{
    private UserDao userDao=new imp();
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
