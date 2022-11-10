package entities;

import addStudent.AddStudentController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static rootStage.RootStage.rootStage;
import addStudent.AddStudentController;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private String address;
    public Integer phone;
    public Button add;

    public Student(Integer id, String name, String address, Integer phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.add = new Button("add");
        this.add.setOnAction((event)->{
            try {
                AddStudentController.addStudent = this;
                Parent add = FXMLLoader.load(getClass().getResource("../addStudent.fxml"));
                rootStage.setScene(new Scene(add,800,600));
            }catch (Exception e){

            }

        });
    }

    public Button getAdd() {
        return add;
    }

    public void setAdd(Button add) {
        this.add = add;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
