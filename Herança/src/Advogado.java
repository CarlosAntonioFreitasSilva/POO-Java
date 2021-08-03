public class Advogado extends Profissional {

    private int OAB;

    public Advogado(int OAB, String nome, Data nascimento, int cpf, String curso) {
        super(nome, nascimento, cpf, curso);
        this.OAB = OAB;
    }
   
    public int getOAB() {
        return OAB;
    }

    public void setOAB(int OAB) {
        this.OAB = OAB;
    }

    @Override
    public void trabalhar() {
        System.out.println("Advogado trabalhando");
    }

}
