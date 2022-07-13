
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class ListaController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private Button direita;

    @FXML
    private Button esquerda;

        void load(){
            int indice = 0;
            String i = App.BD.imprimir(indice);
            this.label.setText(i);
        }
        
        @FXML
        void direita(ActionEvent event) {
            if(App.i < App.indice-1){
                String i = App.BD.imprimirD();
                this.label.setText(i);
            }
        }
    
        @FXML
        void esquerda(ActionEvent event) {
            if(App.i != 0){
                String i = App.BD.imprimirE();
                this.label.setText(i);
           }
        }
        
        @Override
        public void initialize(URL location, ResourceBundle resources) {
            if(App.indice != 0 )
                load();
            else
            this.label.setText(" ");
        }



}