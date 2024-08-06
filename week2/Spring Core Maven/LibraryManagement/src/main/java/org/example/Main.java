package org.example;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService obj1 = (BookService)factory.getBean("BookService");
        obj1.service();
        BookRepository obj2 = (BookRepository)factory.getBean("BookRepository");
        obj2.repository();
    }
}