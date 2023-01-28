package Test;

import Dao.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



class Test01Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Hello hello=(Hello) context.getBean("hello");
        hello.show();

    }

}