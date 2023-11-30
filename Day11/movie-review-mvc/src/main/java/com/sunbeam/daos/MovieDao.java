package com.sunbeam.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.pojos.Movie;

/**
 * Advanced Java @ DMC Sep 2023
 * Trainer: Nilesh Ghule
 * Time: 2023-11-28 18:22 
 */
@Repository
public class MovieDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MovieRowMapper movieRowMapper;
	
	public List<Movie> findAll() {
		String sql = "SELECT * FROM movies";
		List<Movie> list = jdbcTemplate.query(sql, movieRowMapper);
		return list;
	}
}








