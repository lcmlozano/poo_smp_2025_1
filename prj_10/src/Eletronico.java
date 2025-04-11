public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(int c, String d, double v, int vo) {
        super(c, d, v);
        this.voltagem = vo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int argVoltagem) {
        if(argVoltagem == 110 || argVoltagem == 220){
            this.voltagem = argVoltagem;
        }
        else{
            System.out.println("Voltagem inválida");
        }
    }
    public String print(){
        /*
        String retorno;
        retorno = "Codigo: " + this.getCodigo() +
                "\nDescrição: " + this.getDescricao() +
                "\nValor: " + this.getValor() +
                "\nVoltagem: " + this.voltagem;
        return retorno;
         */
        String retorno;
        retorno = super.print();
        retorno = retorno + "\nVoltagem: " + this.voltagem;
        return retorno;
    }
}
