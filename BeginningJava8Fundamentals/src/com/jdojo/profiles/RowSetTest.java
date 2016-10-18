// RowSetTest.java
package com.jdojo.profiles;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetTest {
	public static void main(String[] args) {
		try {
			RowSetFactory rsFactory = RowSetProvider.newFactory();
			JdbcRowSet jdbcRs = rsFactory.createJdbcRowSet();

			// More code goes here
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
