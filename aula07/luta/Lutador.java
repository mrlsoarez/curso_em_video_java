package luta;

public class Lutador {
    private String nome; 
    private String nacionalidade;
    private int idade; 
    private float altura; 
    private float peso; 
    private String categoria; 
    private int vitorias; 
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float alt, float p, int vit, int der, int emp) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(alt);
        setPeso(p);
        setVitorias(vit);
        setDerrotas(der);
        setEmpates(emp);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.peso);
    }

    private String getCategoria() {
        return categoria;
    }

    private void setCategoria(float p) {
        if (p < 52) {
            this.categoria = "Inválido";
        }
        else if (p < 70.3) {
            this.categoria = "Leve";
        }
        else if (p > 81.9) {
            this.categoria = "Médio";
        }
        else if (p < 120.2) {
            this.categoria = "Pesado";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Categoria: " + getCategoria());
    }

    public void Status() {
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setDerrotas(getEmpates() + 1);
    }

}
