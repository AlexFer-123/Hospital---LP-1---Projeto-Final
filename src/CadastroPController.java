
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroPController {

    @FXML
    private TextField bairro;

    @FXML
    private Button cadastrar;

    @FXML
    private TextField cep;

    @FXML
    private TextField codigo;

    @FXML
    private TextField cpf;

    @FXML
    private TextField desc;

    @FXML
    private TextField valor;

    @FXML
    private TextField idade;

    @FXML
    private Label label;

    @FXML
    private TextField nome;

    @FXML
    private TextField numero;

    @FXML
    void cadastrar(ActionEvent event) {
        String bairroA = bairro.getText();
        String cepS = cep.getText();
        int cepA = Integer.parseInt(cepS);
        String cpfA = cpf.getText();
        String idadeS = idade.getText();
        int idadeA = Integer.parseInt(idadeS);
        String nomeA = nome.getText();
        String numeroS = numero.getText();
        int numeroA = Integer.parseInt(numeroS);
        String descA = desc.getText();
        String valorS = valor.getText();
        double valorA = Double.parseDouble(valorS);
        String codigoS = codigo.getText();
        int codigoA = Integer.parseInt(codigoS);

        Endereco end = new Endereco(bairroA, numeroA, cepA);
        Exame e = new Exame(descA,valorA,codigoA);
        Paciente p = new Paciente(nomeA, cpfA, idadeA, end,e);
        App.BD.inserir(p);
    }

}
