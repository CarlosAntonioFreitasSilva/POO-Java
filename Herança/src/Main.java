
public class Main {

    public static void main(String[] args) {
        Data nasc = new Data(16, "jan", 2003);
        Profissional p1 = new Profissional("Carlos", nasc, 1234, "Matematica");
        p1.cumprimentar();
        p1.darBoaTarde();
        p1.trabalhar();

        Engenheiro e1 = new Engenheiro(455, "Bruna", nasc, 1234, "Eng Civil");
        e1.trabalhar();
        e1.darBoaNoite();

        Advogado a1 = new Advogado(455, "Bruna", nasc, 1234, "Eng Civil");
        a1.trabalhar();
    }

}
