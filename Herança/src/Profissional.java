public class Profissional extends Pessoa{
    private String curso;
    
    public Profissional(String nome, Data nascimento, int cpf, String curso){
    
        super(nome, nascimento, cpf);
        this.curso=curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public void trabalhar(){
        System.out.println("Profissional trabalhando");
    }
}
