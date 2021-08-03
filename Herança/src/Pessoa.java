    public class Pessoa {

    private String nome;
    private Data nascimento;
    private int cpf;

    public Pessoa(String nome, Data nascimento, int cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }
    
    

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public void cumprimentar() {
        System.out.println("Oi, meu nome e " + getNome());
    }

    public void darBomDia() {
        System.out.println("Bom dia.");
    }

    public void darBoaTarde() {
        System.out.println("Boa tarde.");
    }

    public void darBoaNoite() {
        System.out.println("Boa noite.");
    }
}
