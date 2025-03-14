import javax.swing.*;

public class UsaClasses {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));

        Boletim aluno1 = new Boletim(nota1,nota2);
        double media = aluno1.calcularMedia(aluno1.getN1(), aluno1.getN2());
        //System.out.println(media);
        JOptionPane.showMessageDialog(null,media);
        String conceito = aluno1.verificarConceito(media);
        //System.out.println(conceito);
        JOptionPane.showMessageDialog(null,conceito);
    }
}
