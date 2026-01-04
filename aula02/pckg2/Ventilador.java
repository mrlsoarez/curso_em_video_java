package pckg2;

public class Ventilador {
    boolean isLigado;
    boolean isParado;
    int velocidade;
    
    void ligar() {
        if (this.isLigado == true) {
            System.out.println("Já está ligado!");
        }
        else {
            this.isLigado = true;
            System.out.println("Ligando ventilador...");
        }
    }

    void desligar() {
        if (this.isLigado == false) {
            System.out.println("Já está desligado!"); 
        }
        else {
            this.isLigado = false; 
            System.out.println("Desligando ventilador..");
        }
    }

    void fixar() {
        if (this.isParado == true) {
            System.out.println("O ventilador já está fixado!");
        }
        else {
            this.isParado = true;
            System.out.println("Fixando ventilador..");
        }
    }

    void desfixar() {
        if (this.isParado == false) {
            System.out.println("O ventilador já está girando!");
        }
        else {
            System.out.println("Desfixando ventilador..");
            this.isParado = false;
        }
    }

   
}
