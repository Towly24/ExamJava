import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class HomeController {
    public TableColumn tdPhone;
    public TableColumn tdAdress;
    public TableColumn tdName;
    public TableColumn tdId;
    public TableView tbStudent;

    public void AddStudent(ActionEvent actionEvent) throws Exception {
        Parent addStudent = FXMLLoader.load(getClass().getResource("addStudent/addStudent.fxml"));
        Main.rootStage.setTitle("AddStudent");
        Main.rootStage.setScene(new Scene(addStudent,800,600));
    }
}
