import javax.swing.JOptionPane;

public class Fatura{
    //atributos
    float valor;
    int pontuacao;

    //construtor
    public Fatura (float v, int p){
        this.valor = v;
        this.pontuacao = p;
    }
    public Fatura(){}

    public void imprimeFatura(){
        JOptionPane.showMessageDialog(null,
        "Valor: " + valor +
        "\nPontuaÃ§Ã£o: " + pontuacao);
    }
    //cria nova fatura e adicona a pontuaÃ§Ã£o passada
    //como parÃ¢metro
    public Fatura somaCom (int pont){
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + pont;
        return aux;
    }
    public Fatura somaCom (int pont, float val)   {
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + pont;
        aux.valor = this.valor + val;
        return aux;       
    }
    public Fatura somaCom (Fatura fat){
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + fat.pontuacao;
        aux.valor = this.valor + fat.valor;
        return aux;
    }

}