package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class AlunoRepositoy {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	private JdbcTemplate jdbcTemplate;
//    @Autowired
//    public ArticleDAO (JdbcTemplate jdbcTemplate) {
//	   this.jdbcTemplate = jdbcTemplate;
//    }
//	

	public List<String> consultarAluno() {

		List<String> alunoLista = new ArrayList<>();
		String sql = "select aluno.name from aluno;";
		alunoLista.addAll(this.jdbcTemplate.queryForList(sql, String.class));
		
		System.out.println(alunoLista.stream().sorted().iterator());
		return alunoLista;
	}

//	public void incluirAluno(Aluno aluno) {
//		String sql = "INSERT INTO aluno (id, nome, email) values (?, ?, ?)";
//		this.jdbcTemplate.update(sql, 1, "l", "llll");
//	}

}
