public class Pessoa {
    String nome;
    int idade;
    double renda;

    void imprimir(){
        System.out.println("\nNome: "+nome + "\nIdade: "+idade +"\nRenda: "+ renda
                + "\nReajuste: "+reajuste());
    }

    double reajuste(){
        //System.out.println("Valor do Reajuste: " + (renda * 15)/100);
        return (renda * 15)/100;
    }
}
