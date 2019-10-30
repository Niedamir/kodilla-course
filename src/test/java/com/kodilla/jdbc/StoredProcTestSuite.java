package com.kodilla.jdbc;

import com.kodilla.kodillacourse.jdbc.DbManager;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
	@Test
	public void testUpdateBestseller() throws SQLException {
		//Given
		DbManager dbManager = DbManager.getInstance();
		String sqlUpdate = "UPDATE BOOKS SET IS_BESTSELLER=FALSE";
		Statement statement = dbManager.getConnection().createStatement();
		statement.executeUpdate(sqlUpdate);
		//When
		String sqlProcedureCall = "CALL UpdateBestseller";
		statement.execute(sqlProcedureCall);
		//Then
		String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE IS_BESTSELLER=TRUE";
		ResultSet rs = statement.executeQuery(sqlCheckTable);
		int howMany = -1;
		if(rs.next()) {
			howMany = rs.getInt("HOW_MANY");
		}
		assertEquals(4,howMany);
	}
}
