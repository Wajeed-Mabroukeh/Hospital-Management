import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectDo extends Application {

    public static Stage Window ;


    public  void   start(Stage primaryStage) throws Exception{

        Window =primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Fxml/User.fxml"));
        Window.setTitle("Sign up");
        Window.setScene(new Scene(root, 670, 425));
        Window.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
