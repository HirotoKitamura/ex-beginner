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
	
	/**
	 * 曖昧検索を行う
	 * @param partOfName　名前の一部
	 * @return　partOfNameを含む名前の一覧
	 */
	public List<String> findByName(String partOfName) {
		String sql = "SELECT name FROM members WHERE name LIKE :name;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", "%" + partOfName + "%");
		return template.queryForList(sql, param, String.class);
	}
	
}
