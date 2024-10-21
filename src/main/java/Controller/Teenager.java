+/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


public class Teenager {
    private int id;
    private String name;
    private int age;
    private String address;
    private String educationLevel; // học vấn
    private String status; // trạng thái hôn nhân

    // Constructor khởi tạo Teenager
    public Teenager() {
    }

    public Teenager(int id, String name, int age, String address, String educationLevel, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.educationLevel = educationLevel; // Khởi tạo educationLevel
        this.status = status; // Khởi tạo status
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducationLevel() {
        return educationLevel; // Getter cho educationLevel
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel; // Setter cho educationLevel
    }

    public String getStatus() {
        return status; // Getter cho status
    }

    public void setStatus(String status) {
        this.status = status; // Setter cho status
    }

    @Override
    public String toString() {
        return "Teenager [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address +
                ", educationLevel=" + educationLevel + ", status=" + status + "]"; // Cập nhật phương thức toString
    }
}
