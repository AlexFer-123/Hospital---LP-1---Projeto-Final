import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application{
    public static Repositorio BD = new Repositorio();
    public static String a;
    public static int i=0;
    public static int indice=0;
    public static String procura;
    public static int b;
    public static void main(String[] args) throws Exception {
        launch(args);                  
        }

    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("scenes/HospitalInicial.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("imgs/MassaReboot.png");
        primaryStage.initStyle(StageStyle.UNDECORATED);

        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Teste");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}