
public class Engenheiro extends Profissional {

    private int CREA;

    public Engenheiro(int CREA, String nome, Data nascimento, int cpf, String curso) {
        super(nome, nascimento, cpf, curso);
        this.CREA = CREA;
    }
      
    public int getCREA() {
        return CREA;
    }

    public void setCREA(int CREA) {
        this.CREA = CREA;
    }

    @Override
    public void trabalhar() {
        System.out.println("Engenheiro trabalhando");
    }

}
