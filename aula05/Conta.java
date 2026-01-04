package aula05;

public class Conta {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Float saldo; 
    private boolean status;

    public Conta(String d) {

        setDono(d);
        setSaldo(50f);
        setNumConta(12);

        abrirconta();
    }

    public void abrirconta() {
        
        if (isStatus()) {
            System.err.println(" A conta de " + getDono() + " já se encontra aberta!");
            return; 
        }

        setStatus(true);
        System.err.println("Conta aberta! Dono: " + getDono());
        
    }

    public void fecharconta() {
        if (getSaldo() < 0) {
            System.err.println("Conta está com saldo negativo e não é possível fechá-la.");
            return;
        }
        if (!(isStatus())) {
            System.err.println("Conta já se encontra fechada!");
            return;
        }

        setStatus(false);
        System.err.println("Conta fechada!");

    }

    public void pagarMensalidade() {
        setSaldo(getSaldo() - 12);
        System.err.println("Mensalidade paga! 12 reais foram descontados da conta.");
        return;
    }


    public void sacar(float d) {
        if (d < 0) {
            System.err.println("Valor de saque precisa ser maior que zero!");
            return;
        }
    
        if (!(isStatus())) {
            System.err.println("Conta está fechada! Não é possível sacar!");
            return;
        }

        if (getSaldo() < d) {
            System.err.println("Saldo insuficiente para resgate!");
            return;
        }

        setSaldo(getSaldo() - d);
        System.err.println("Saque realizado! O saldo atual é de " + getSaldo());
    }

    public void depositar(float d) {
        if (d < 0) {
            System.err.println("Valor depositado precisa ser maior que zero!");
            return;
        }
    
        if (!(isStatus())) {
            System.err.println("Conta está fechada! Não é possível depositar");
            return;
        }

        setSaldo(getSaldo() + d);
        System.err.println("Depósito realizado! Saldo atual: " + getSaldo());
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
