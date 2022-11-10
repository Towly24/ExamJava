package addStudent;

import entities.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import static rootStage.RootStage.rootStage;


public class AddStudentController {
    public TextField txPhone;
    public TextField txName;
    public TextField txAddress;
    public TextField txId;
    public static Student addStudent;

    public void add(ActionEvent actionEvent) {
        try {
            Integer id = Integer.parseInt(txId.getText());
            String name = txName.getText();
            String address = txAddress.getText();
            Integer phone = Integer.parseInt(txPhone.getText());
            Student st = new Student(id,name,address,phone);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Parent backHome = FXMLLoader.load(getClass().getResource("../home.fxml"));
        rootStage.setTitle("Back");
        rootStage.setScene(new Scene(backHome,800,600));
    }
}
