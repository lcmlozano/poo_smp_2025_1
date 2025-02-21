public class Pessoa {
    public static void main(String[] args) {
        //psvm + tecla tab cria o main
        String nome;
        int idade;
        double salario;
        double reajuste;

        //entrada
        nome = "Lozano";
        idade = 41;
        salario = 600.00;

        //processamento
        reajuste = (salario * 15) / 100;  //reajuste = salario * 0.15;

        //saída
        System.out.println("Nome:.......... " + nome); //sout + TAB cria um print
        System.out.println("Idade:......... " + idade);
        System.out.println("Salario:....... " + salario);
        System.out.println("Reajuste:...... " + reajuste);
    }
}
