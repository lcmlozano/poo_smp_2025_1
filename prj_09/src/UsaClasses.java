public class UsaClasses {
    public static void main(String[] args) {
        //Pessoa pessoa1 = new Pessoa("Joao","5555-5555");
        //pessoa1.print();
        Cliente cliente1 = new Cliente("Jose","6666-6666",1000);
        cliente1.print();
        System.out.println("Juros: "+cliente1.calcularJuros(10));

        Fornecedor fornecedor1 = new Fornecedor("Unicsul","7777-7777",2000);
        fornecedor1.print();
        fornecedor1.calcularImposto(15);
    }
}
