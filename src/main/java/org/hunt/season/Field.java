package org.hunt.season;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Field {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // Hunter hunter=new Hunter(context.getBean("goatBean", Animal.class));
        Hunter hunter = context.getBean("hunter",Hunter.class);

        hunter.killAnimal();
        context.close();


    }
}
