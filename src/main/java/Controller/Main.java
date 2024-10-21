/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.teenager.Controller.TeenagerController;
import com.teenager.Model.Teenager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeenagerController controller = new TeenagerController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm trẻ vị thành niên");
            System.out.println("2. Cập nhật thông tin trẻ vị thành niên");
            System.out.println("3. Xóa trẻ vị thành niên");
            System.out.println("4. Tìm trẻ vị thành niên");
            System.out.println("5. Hiển thị danh sách trẻ vị thành niên");
            System.out.println("6. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (choice) {
                case 1: // Thêm trẻ vị thành niên
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    controller.addTeenager(name, age, address);
                    System.out.println("Thêm thành công!");
                    break;
                case 2: // Cập nhật thông tin trẻ vị thành niên
                    System.out.print("Nhập ID của trẻ vị thành niên cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập tên mới: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int updateAge = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập địa chỉ mới: ");
                    String updateAddress = scanner.nextLine();
                    controller.updateTeenager(updateId, updateName, updateAge, updateAddress);
                    System.out.println("Cập nhật thành công!");
                    break;
                case 3: // Xóa trẻ vị thành niên
                    System.out.print("Nhập ID của trẻ vị thành niên cần xóa: ");
                    int deleteId = scanner.nextInt();
                    controller.deleteTeenager(deleteId);
                    System.out.println("Xóa thành công!");
                    break;
                case 4: // Tìm trẻ vị thành niên
                    System.out.print("Nhập ID của trẻ vị thành niên cần tìm: ");
                    int findId = scanner.nextInt();
                    Teenager teenager = controller.findTeenager(findId);
                    if (teenager != null) {
                        System.out.println(teenager);
                    } else {
                        System.out.println("Không tìm thấy trẻ vị thành niên với ID: " + findId);
                    }
                    break;
                case 5: // Hiển thị danh sách trẻ vị thành niên
                    List<Teenager> teenagers = controller.getAllTeenagers();
                    System.out.println("Danh sách trẻ vị thành niên:");
                    for (Teenager t : teenagers) {
                        System.out.println(t);
                    }
                    break;
                case 6: // Thoát
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
