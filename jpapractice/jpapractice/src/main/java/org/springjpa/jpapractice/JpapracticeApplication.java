package org.springjpa.jpapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {

	ApplicationContext con= SpringApplication.run(JpapracticeApplication.class, args);

	Userdao ud=con.getBean(Userdao.class);
	/*User uu=new User();
	uu.setId(100);
	uu.setCity("hhhsr");
	uu.setName("monty");
	ud.save(uu);*/
//	ud.deleteById(1);
	List<User> jj=ud.findByName("monty");
	jj.forEach((x)->System.out.println(x));
	List<User> kk=ud.findByCityAndName("bbsr","monty");
	kk.forEach((x)->System.out.println(x.getId()));
	}





}
