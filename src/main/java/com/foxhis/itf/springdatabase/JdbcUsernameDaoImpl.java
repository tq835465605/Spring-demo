package com.foxhis.itf.springdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcUsernameDaoImpl implements UsernameDao{

	//@Autowired(required=false)
	private  DataSource dataSourcess;
	
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSourcess() {
		return dataSourcess;
	}
	@Autowired(required=false)
	public void setDataSourcess(DataSource dataSourcess) {
		this.dataSourcess = dataSourcess;
	}



	public Username getUsernameById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from username where id='"+id+"'";
		Connection connection=null;
		try {
			connection = dataSourcess.getConnection();
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			Username username =new Username();
			if(set.next())
			{
				username.setId(set.getInt("id"));
				username.setUsername(set.getString("username"));
				username.setPassword(set.getString("password"));
				username.setRemark(set.getString("remark"));
			}
			return username;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		//使用JdbcTemplate 
		
	}
	
	

}
