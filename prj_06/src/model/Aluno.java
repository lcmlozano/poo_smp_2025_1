package model;

public class Aluno {
    public String nome, rgm;
    public int idade;
    private double nota1;
    private double nota2;

    public double calcularMedia(double pN1, double pN2){
        double media = (pN1 + pN2) /2;
        return media;
    }

    public boolean verificarAprovacao(double pMedia){
        if(pMedia >= 6){
            return true;
        }
        else{
            return false;
        }
    }

    public void inserirNota1(double nota){
        if(nota >= 0 && nota <=10){
            this.nota1 = nota;
        }
        else{
            System.out.println("Nota com valor errado!!!");
        }
    }

    public double pegarNota1(){
        return this.nota1;
    }

    public void inserirNota2(double nota){
        if(nota >= 0 && nota <=10){
            this.nota2 = nota;
        }
        else{
            System.out.println("Nota com valor errado!!!");
        }
    }

    public double pegarNota2(){
        return this.nota2;
    }


}
