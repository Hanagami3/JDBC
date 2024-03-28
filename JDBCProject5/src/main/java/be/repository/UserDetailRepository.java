package be.repository;

import be.config.MySQLConfig;
import be.model.UserDetail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDetailRepository {
    public void addUserDetail(UserDetail userDetail) {
        String query = "INSERT INTO userdetail (firstName, lastName, email, accountUsername)" +
                "VALUES (?, ?, ?, ?)";

        try (Connection connection = MySQLConfig.getConnection()) {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, userDetail.getFirstName());
            statement.setString(2, userDetail.getLastName());
            statement.setString(3, userDetail.getEmail());
            statement.setString(4, userDetail.getAccount().getUsername());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UserDetail getAllUserDetails(){
        String query = "SELECT * FROM UserDetail";

        List<UserDetail> userDetailList = new ArrayList<>();



        try (Connection connection = MySQLConfig.getConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
