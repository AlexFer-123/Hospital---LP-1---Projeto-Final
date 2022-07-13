
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HospitalInicialController{
   
    Stage stage;
    
    @FXML
    private BorderPane PanePrincipal;

    @FXML
    private Button alterar;

    @FXML
    StackPane StackPane;

    @FXML
    private Button sair;

    @FXML
    private Button cadastro;

    @FXML
    private Button principal;

    @FXML
    private Button lista;

    @FXML
    private Button medico;

    @FXML
    private Button procurar;

    @FXML
    private Button remover;
   
    @FXML
    void sair(ActionEvent e)  {
        stage = (Stage) PanePrincipal.getScene().getWindow();
        stage.close();
    }
  
    public void principal(javafx.event.ActionEvent e) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/Principal.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }

    public void cadastro(javafx.event.ActionEvent e) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/CadastroM.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
    @FXML
    public void paciente(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/CadastroP.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
    @FXML
    void listar(ActionEvent event) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/Lista.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
    @FXML
    void procurar(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/Procurar.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
    @FXML
    void remover(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/Remover.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
    @FXML
    void alterar(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("scenes/Alterar.fxml"));
        StackPane.getChildren().removeAll();
        StackPane.getChildren().setAll(fxml);
    }
}






