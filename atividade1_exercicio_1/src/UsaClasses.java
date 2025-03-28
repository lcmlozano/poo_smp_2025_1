public class UsaClasses {
    public static void main(String[] args) {
        Funcionario obj1 = new Funcionario();
        obj1.setCracha(1);
        obj1.setSalario(1000);
        obj1.calcularAumento(10);
        obj1.Imprimir();

        Funcionario obj2 = new Funcionario(2,2000.00,"vendedor");
        obj2.calcularAumento(10.0);
        obj2.Imprimir();

    }
}
