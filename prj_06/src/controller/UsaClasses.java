package controller;
import model.Aluno;
import javax.swing.*;

public class UsaClasses {
    public static void main(String[] args) {
        Aluno obj_aluno = new Aluno();
        Aluno obj_aluno2 = new Aluno();


        //entrada de dados
        obj_aluno.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        obj_aluno.setRgm(JOptionPane.showInputDialog("Digite o rgm: "));
        obj_aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        obj_aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        obj_aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));

        //saida de dados
        JOptionPane.showMessageDialog(null,obj_aluno.imprimirDados());
        JOptionPane.showMessageDialog(null,obj_aluno2.imprimirDados());

    }
}
