public class Aluno {
    String nome, rgm;
    int idade;
    double nota1, nota2;

    double calcularMedia(double pN1, double pN2){
        double media = (pN1 + pN2) /2;
        return media;
    }

    boolean verificarAprovacao(double pMedia){
        if(pMedia >= 6){
            return true;
        }
        else{
            return false;
        }
    }
}
