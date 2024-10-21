/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;
import com.finalproj.JDBCConnection.DBConnection; // Đảm bảo đường dẫn này đúng với cấu trúc dự án của bạn
import com.finalproj.Modal.Teenager; // Đảm bảo rằng bạn đã có lớp Teenager
import java.sql.*;
import java.util.ArrayList;

public class TeenagerDAO {

    // Lấy danh sách tất cả trẻ vị thành niên và truyền vào ArrayList
    public ArrayList<Teenager> getAllTeenagers() {
        String query = "SELECT * FROM Teenager"; 
        ArrayList<Teenager> teenagersList = new ArrayList<>();

        try (Connection connection = DBConnection.getConnection(); 
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Teenager teenager = new Teenager();
                teenager.setId(resultSet.getInt("id")); 
                teenager.setName(resultSet.getString("name")); 
                teenager.setAge(resultSet.getInt("age")); 
                teenager.setAddress(resultSet.getString("address")); 
                teenager.setEducationLevel(resultSet.getString("educationLevel"));
                teenager.setStatus(resultSet.getString("status"));

                // Thêm đối tượng Teenager vào ArrayList
                teenagersList.add(teenager);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teenagersList; // Trả về danh sách trẻ vị thành niên
    }
}
