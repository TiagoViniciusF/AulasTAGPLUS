

public class Main {

    public static void main(String[] args) {

       Gerente gerente = new Gerente();
       Analista analista = new Analista();


        System.out.println("Bonoficação Analista " + analista.bonificacao(1500d));
        System.out.println("Bonoficação Gerente " + gerente.bonificacao(1500d));

    }
}
