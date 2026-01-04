package aula05;

public class Aula {
    public static void main(String[] args) {
        Conta c = new Conta("Murilo"); 
        c.abrirconta();
        c.abrirconta();
    
        c.sacar(50f);
        c.pagarMensalidade();
        c.depositar(12f);
    }
}
