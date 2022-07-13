
public class Paciente extends Pessoa {
    private Exame cemae;
    public Paciente(String nome, String cpf, int idade, Endereco end,Exame cemae) {
        super(nome, cpf, idade, end);
        this.cemae = cemae;
    }

    
    public String Relatorio(){
        String i = ("Nome : "+this.nome+"\n"+"CPF : "+this.cpf+"\n"+"Idade : "+this.idade+"\n"+"Endereço : "+this.end+"\n"+"Exame : "+this.cemae);
        return i;
    }
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    @Override
    public int getIdade() {
        return super.getIdade();
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    public Exame getCemae() {
        return cemae;
    }
    public Endereco getEnd(){
        return end;
    }
    @Override
    public String toString() {
        String a;
        a = (getNome()+getCpf()+getIdade()+getEnd()+getCemae());
        return a;
    }
}
