public class Cliente extends Pessoa{
    private double valorDivida;

    public Cliente(String n, String f, double v) {
        super(n, f);
        //this.valorDivida = valorDivida;
        this.setValorDivida(v);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void print(){
        super.print();
        System.out.println("Valor Divida: " + this.valorDivida);
    }

    public double calcularJuros(double tx){
        return (this.valorDivida * tx)/100;
    }
}
