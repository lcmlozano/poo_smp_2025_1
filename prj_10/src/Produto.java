public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(int c, String d, double v) {
        //this.codigo = c;
        //this.descricao = d;
        //this.valor = v;
        this.setCodigo(c);
        this.setDescricao(d);
        this.setValor(v);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int argCodigo) {
        if (argCodigo >= 0){
            this.codigo = argCodigo;
        }
        else{
            System.out.println("Codigo invalido");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String argDescricao) {
        //não permitir descrição com menos de 3 caracteres
        if(argDescricao.length() >= 3){
            this.descricao = argDescricao;
        }
        else{
            System.out.println("Descrição inválida");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double argValor) {
        if (argValor >= 0){
            this.valor = argValor;
        }
        else{
            System.out.println("Valor invalido");
        }
    }

    public String print(){
        String retorno;
        retorno = "Codigo: " + this.codigo +
                "\nDescrição: " + this.descricao +
                "\nValor: " + this.valor;
        return retorno;
    }
}
