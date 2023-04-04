package org.bolton.ramsy;

import org.bolton.dao.Registrationdao;
import org.bolton.model.Registration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication(scanBasePackages = {"org.bolton"})
public class RamsyApplication {

    public static void main(String[] args) {
        ApplicationContext vo =SpringApplication.run(RamsyApplication.class, args);
        Registration rg=new Registration();
        rg.setAddress1("pokhariput");
        rg.setCity("bbsr");
        rg.setPassword("password");
        rg.setUsername("username");
        rg.setDob(new Date());
        rg.setEmail("my email.com");
    Registrationdao dd=vo.getBean(Registrationdao.class);
    dd.save(rg);
    }

}
