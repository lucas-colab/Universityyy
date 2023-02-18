public class UsaFatura {
    public static void main(String[] args) {
        Fatura dep1, dep2, dep3, titular; // recebem o retorno dos mÃ©todos

        // instancia o objeto
        dep1 = new Fatura(200.5f, 100);

        dep2 = dep1.somaCom(50); // passa um int como parÃ¢metro

        dep3 = dep1.somaCom(200, 1000.5f);

        dep1.imprimeFatura();
        dep2.imprimeFatura();
        dep3.imprimeFatura();

        titular = dep3.somaCom(dep1);

        titular.imprimeFatura();

    }
}