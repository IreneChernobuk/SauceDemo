package dbconnection;

import constants.SQLQueries;
import model.StudentModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBDemo {
    public static void main(String[] args) throws SQLException {
        ExecuteSqlQueries executeSqlQueries = new ExecuteSqlQueries();
        String query = String.format(SQLQueries.SELECT_STUDENT_BY_ID, "students", "1");
        ResultSet results = executeSqlQueries.selectByQuery(query);
        StudentModel student = executeSqlQueries.getStudent(results);
        executeSqlQueries.addUser();
    }
}