package model;

public class Aluno {
    private String nome;
    private String rgm;
    private int idade;
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

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        if (rgm.length() == 6){
            this.rgm = rgm;
        }
        else{
            System.out.println("RGM inválido");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() >= 3){
            this.nome = nome;
        }
        else{
            System.out.println("Nome inválido!!!");
        }
    }

    public void setNota1(double nota){
        if(nota >= 0 && nota <=10){
            this.nota1 = nota;
        }
        else{
            System.out.println("Nota com valor errado!!!");
        }
    }

    public double getNota1(){
        return this.nota1;
    }

    public void setNota2(double nota){
        if(nota >= 0 && nota <=10){
            this.nota2 = nota;
        }
        else{
            System.out.println("Nota com valor errado!!!");
        }
    }

    public double getNota2(){
        return this.nota2;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 18){
            this.idade = idade;
        }
        else{
            System.out.println("Idade Inválida");
        }
    }

    public String imprimirDados(){
        return "Nome: " + this.nome +
                "\nRGM: " + this.rgm +
                "\nIdade: " + this.idade +
                "\nNota 1: " + this.nota1 +
                "\nNota 2: " + this.nota2 +
                "\nMédia: " + this.calcularMedia(this.nota1, this.nota2) +
                "\nStatus: " + ((this.verificarAprovacao(this.calcularMedia(this.nota1, this.nota2)))?"Aprovado":"Reprovado");
    }
}
