//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa obj_pessoa1 = new Pessoa();
        Pessoa obj_pessoa2 = new Pessoa();

        obj_pessoa1.nome = "Lozano";
        obj_pessoa1.idade = 41;
        obj_pessoa1.renda = 600.00;

        obj_pessoa2.nome = "João";
        obj_pessoa2.idade = 20;
        obj_pessoa2.renda = 6000.00;

        System.out.println("Nome:............... " + obj_pessoa1.nome);
        System.out.println("Idade:.............. " + obj_pessoa1.idade);
        System.out.println("Renda:.............. " + obj_pessoa1.renda);

        System.out.println("Nome:............... " + obj_pessoa2.nome);
        System.out.println("Idade:.............. " + obj_pessoa2.idade);
        System.out.println("Renda:.............. " + obj_pessoa2.renda);
    }
}