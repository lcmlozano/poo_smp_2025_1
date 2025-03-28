public class Funcionario {
    private int cracha;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.cargo = "assistente";
    }

    public Funcionario(int c, double s, String car) {
        this.setCracha(c);
        this.setSalario(s);
        this.setCargo(car);
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        if(cracha >= 1 && cracha <= 1000){
            this.cracha = cracha;
        }
        else{
            System.out.println("Número de crachá inválido");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularAumento(double porcentagem){
        this.salario = this.salario + ((this.salario * porcentagem)/100);
    }

    public void calcularAumento(int tempo){
        this.salario = this.salario + (tempo * 150);
    }

    public void Imprimir(){
        System.out.println("Cracha: " + this.cracha +
                         "\nSalario: " + this.salario +
                         "\nCargo: " + this.cargo);
    }
}
