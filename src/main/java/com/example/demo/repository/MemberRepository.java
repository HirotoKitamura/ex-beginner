package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * 演習5　リポジトリクラス.
 * @author hiroto.kitamura
 *
 */
@Repository
public class MemberRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public List<String> findByName(String partOfName) {
		String sql = "SELECT name FROM members WHERE name LIKE :name;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", "%" + partOfName + "%");
		return template.queryForList(sql, param, String.class);
	}
	
}
