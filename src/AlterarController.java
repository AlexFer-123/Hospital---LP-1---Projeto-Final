import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AlterarController {

    @FXML
    private Button botaoM;

    @FXML
    private Button botaoP;

    @FXML
    private TextField textoM;

    @FXML
    private TextField textoP;


    @FXML
    void botaoM(ActionEvent event) throws IOException{
        String numeroA = textoM.getText();
        if(App.BD.alterarM(numeroA) == true){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("scenes/AlterarM.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Alterar Medico");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }

    @FXML
    void botaoP(ActionEvent event) throws IOException{
        String numeroA = textoP.getText();
        if(App.BD.alterarP(numeroA) == true){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("scenes/AlterarP.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Alterar Paciente");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}