

public class Main {

    public static void main(String[] args) {

       Gerente gerente = new Gerente();
       Analista analista = new Analista();


        System.out.println("Bonoficação Analista " + analista.bonificacao(500d));
        System.out.println("Bonoficação Gerente " + gerente.bonificacao(500d));

    }
}
