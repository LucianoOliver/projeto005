package com.example.demo.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.JdbctemplatestarterApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JdbctemplatestarterApplication.class, 
webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@DirtiesContext
public class AlunoRepositoyTest {
	@Autowired
	AlunoRepositoy a;
		

	@Test
	public void test() {
		//fail("Not yet implemented");
		//AlunoRepositoy a = new AlunoRepositoy();
		//Aluno aluno = new Aluno(1, "Luciano", "luan@gmail.com");
		//a.incluirAluno(aluno);
//		
		a.consultarAluno();
	}

}
