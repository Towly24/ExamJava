import entities.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import addStudent.AddStudentController;
import addStudent.AddStudentController;

import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import static rootStage.RootStage.rootStage;
public class HomeController implements Initializable {
    public TableColumn tdPhone;
    public TableColumn tdAdress;
    public TableColumn tdName;
    public TableColumn tdId;
    public TableView<Student> tbStudent;

    @FXML
    public TableColumn<Student, Integer> idColumn;

    @FXML
    public TableColumn<Student, String> nameColumn;
    @FXML
    public TableColumn<Student, String> addressColumn;
    @FXML

    public TableColumn<Student, Integer> phoneColumn;

    public static ObservableList<Student> StudentList = FXCollections.observableArrayList() ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tdId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tdName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tdAdress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tdPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        tbStudent.setItems(AddStudentController.listStudent);
    }

    public void AddStudent(ActionEvent actionEvent) throws Exception {
        Parent addStudent = FXMLLoader.load(getClass().getResource("addStudent/addStudent.fxml"));
        rootStage.setTitle("AddStudent");
        rootStage.setScene(new Scene(addStudent,800,600));
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void save(ActionEvent actionEvent) {
        try {
            FileWriter f = new FileWriter("student.txt");
            f.write(AddStudentController.listStudent.toString());
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Save...");
    }
}
