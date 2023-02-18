import javax.swing.JOptionPane;

public class Conta {
    // atributos
    String numero;
    double saldo;

    // construtor
    public Conta(String n, double s) {
        numero = n;
        saldo = s;
    }

    // mÃ©todos
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,
                "NÃºmero: " + numero + "\nSaldo: " + saldo);
    }

    public void sacarValor(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Saldo insuficiente");
        }
    }

    public double maiorSaldo(Conta c) {
        if (this.saldo > c.saldo) {
            return this.saldo;
        } else {
            return c.saldo;
        }
    }
}
