package com.dotwait;

import com.dotwait.dependencyinjection.ExampleBean;
import com.dotwait.dependencyinjection.ThingOne;
import com.dotwait.service.ClientService;
import com.dotwait.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMVC {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
        clientService.show();
        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        messageService.show();
        ThingOne beanOne = applicationContext.getBean("beanOne", ThingOne.class);
        beanOne.showTwoAndThree();
        ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);
        exampleBean.show();
        exampleBean.printThreeProperties();
    }
}
