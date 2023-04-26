package dbconnection;

import constants.SQLQueries;
import model.StudentModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteSqlQueries extends DBConnector {
    public ResultSet selectFrom(String tableName) {
        connect();
        try {
            return statement
                    .executeQuery(String.format("select * from %s", tableName));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close();
        return null;
    }

    public ResultSet selectByQuery(String query) {
        connect();
        try {
            return statement
                    .executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close();
        return null;
    }

    public void addStudentViaExecute(String name) {
        connect();
        try {
            statement
                    .execute(String.format(SQLQueries.ADD_STUDENT, name, 3));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close();
    }

    public StudentModel getStudent(ResultSet resultSet) throws SQLException {
        StudentModel studentModel = StudentModel.builder().build();
        while (resultSet.next()) {
            studentModel.setId(resultSet.getString("id"));
            studentModel.setName(resultSet.getString("name"));
            studentModel.setGroupId(resultSet.getString("group_ID"));
        }
        return studentModel;
    }

    public void writeResultSet(ResultSet resultSet)
            throws SQLException {
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String group_ID = resultSet.getString("group_ID");
            System.out.println("ID: " + id);
            System.out.println("NAME: " + name);
            System.out.println("GROUP ID" + group_ID);
        }
    }

    public void addUser() throws SQLException {
        connect();
        PreparedStatement preparedStatement = connect
                .prepareStatement("INSERT INTO aqa15.students values (default, ?, ?)");
        preparedStatement.setString(1, "Germiona");
        preparedStatement.setInt(2, 3);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}