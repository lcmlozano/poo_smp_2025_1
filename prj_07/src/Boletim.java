public class Boletim {
    private double n1;
    private double n2;

    public Boletim(double argN1, double argN2){
        this.setN1(argN1);
        this.setN2(argN2);
    }

    public Boletim(double n1) {
        //this.n1 = n1;
        this.setN1(n1);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        if(n1 >= 0 && n1 <=10){
            this.n1 = n1;
        }
        else{
            System.out.println("Nota inválida");
        }
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        if(n2 >= 0 && n2 <=10){
            this.n2 = n2;
        }
        else{
            System.out.println("Nota inválida");
        }
    }

    public double calcularMedia(double argN1, double argN2){
        double resultado = (argN1 + argN2)/2;
        return resultado;
    }

    //sobrecarga, mesmo nome, mesmo retorno e argumentos diferentes
    public double calcularMedia(double argN1){
        return argN1;
    }

    public double calcularMedia(double argN1, double argN2, double argN3){
        double resultado = (argN1 + argN2 + argN3)/3;
        return resultado;
    }

    public String verificarConceito(double argMedia){
        if (argMedia >= 8){
            return "A";
        }
        else if(argMedia >= 6){
            return "B";
        }
        else if(argMedia >= 4){
            return "C";
        }
        else if(argMedia >= 2){
            return "D";
        }
        else{
            return "E";
        }
    }
}
