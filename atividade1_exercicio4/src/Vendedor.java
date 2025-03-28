public class Vendedor {
    private double vendas;
    private double salario;
    private String nome;
    private int falta;

    public Vendedor(double v, double s, String n, int f) {
        //this.vendas = vendas;
        //this.salario = salario;
        //this.nome = nome;
        //this.falta = falta;
        this.setVendas(v);
        this.setSalario(s);
        this.setNome(n);
        this.setFalta(f);
        this.imprimirDados();
        this.calcularSalario();
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados(){
        System.out.println("Nome ....... : " + this.nome +
                         "\nSalario .... : " + this.salario +
                         "\nVendas ..... : " + this.vendas +
                         "\nFaltas ..... : " + this.falta);
    }

    public void calcularSalario(){
        double salarioLiquido = (this.salario + this.calcularComissao() - descontoFalta());
        System.out.println("O salario liquido é " + salarioLiquido);
    }

    public double calcularComissao(){
        if (this.vendas >= 1000 && this.vendas < 2000){
            return (this.vendas * 10) /100;
        }
        else if(this.vendas >= 2000){
            return (this.vendas * 15) /100;
        }
        else{
            return 0;
        }
    }

    public double descontoFalta(){
        return (this.salario/30)*this.falta;
    }
}
