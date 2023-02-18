import javax.swing.JOptionPane;

public class Boletim {
    // atributos
    double n1;
    double n2;
    double media;

    // construtor
    public Boletim(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // mÃ©todos
    public void imprimeBoletim() {
        JOptionPane.showMessageDialog(null,
                "Nota 1: " + n1 + "\nNota 2: " + n2 +
                        "\nMedia: " + media);
    }

    public void calculaMedia() {
        media = (n1 + n2) / 2;
    }

    public String verificaConceito() {
        String conceito = "";
        if (media >= 8 && media <= 10) {
            conceito = "A";
        } else {
            if (media >= 6) {
                conceito = "B";
            } else {
                if (media >= 4) {
                    conceito = "C";
                } else {
                    conceito = "D";
                }
            }
        }
        return conceito;
    }
}