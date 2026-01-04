package pckg2;

public class Main {
    public static void main(String[] args) {
        Ventilador v = new Ventilador();

        v.isLigado = true;
        v.isParado = false;
        v.velocidade = 3;

        v.desligar();
    }
}
