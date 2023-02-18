import javax.swing.JOptionPane;

public class UsaConta {
    public static void main(String[] args) {
        Conta c1, c2;

        // declaraÃ§Ã£o de variÃ¡veis
        String n;
        double s, v;

        // entrada de dados
        n = JOptionPane.showInputDialog("Digite o nÃºmero da conta");
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo"));

        // instancia objeto
        c1 = new Conta(n, s);

        c2 = new Conta("123", 1000.5);

        // usando os mÃ©todos
        c1.imprimeDados();
        c2.imprimeDados();

        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar"));
        c1.sacarValor(v);
        c1.imprimeDados();

        JOptionPane.showMessageDialog(null, "Maior saldo: " + c1.maiorSaldo(c2));

    }
}