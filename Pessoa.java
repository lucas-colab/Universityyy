
import javax.swing.JOptionPane;

public class Pessoa {
    // atribuos
    // modificador de acesso e o tipo
    private String nome;
    private int idade;
    private double renda;

    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.getNome() + "\nIdade: " + idade +
                        "\nRenda: " + renda);
    }

    // mÃ©todos de acesso
    // escrita (ou gravaÃ§Ã£o) = set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 130) {
            this.idade = idade;
        }
    }

    public void setRenda(double renda) {
        if (renda >= 0) {
            this.renda = renda;
        }
    }

    // leitura = get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

}