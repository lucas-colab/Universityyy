import javax.swing.JOptionPane;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // p1.nome = "Silvio Santos";
        p1.setNome("Silvio Santos");
        // p1.idade = 94;
        p1.setIdade(94);
        // p1.renda = 15000.75;
        p1.setRenda(150000.75);

        // JOptionPane.showMessageDialog(null, "Nome: " + p1.nome);
        JOptionPane.showMessageDialog(null, "Nome: " + p1.getNome());
        p1.imprimeDados();
    }
}