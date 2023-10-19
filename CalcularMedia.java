
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class CalcularMedia {
    public static void main(String[] args) {
        int n;
        do {
            n = parseInt(showInputDialog("Quantos alunos você tem?"));
        } while (n <= 0);

        double somaMedias = 0; // Variável para armazenar a soma das médias de todos os alunos

        for (int cont = 1; cont <= n; cont++) {
            double a1, a2, a3;
            do {
                a1 = parseDouble(showInputDialog("Digite o valor da a1 para o aluno " + cont + ":"));
            } while (a1 < 0 || a1 > 30);
            do {
                a2 = parseDouble(showInputDialog("Digite o valor da a2 para o aluno " + cont + ":"));
            } while (a2 < 0 || a2 > 30);
            do {
                a3 = parseDouble(showInputDialog("Digite o valor da a3 para o aluno " + cont + ":"));
            } while (a3 < 0 || a3 > 40);

            double media = (a1 + a2 + a3) / 3;
            somaMedias += media;

            showMessageDialog(null, "Média do aluno " + cont + ": " + media);
            if (media >= 70) {
                showMessageDialog(null, "Aluno " + cont + " Aprovado!");
            } else {
                showMessageDialog(null, "Aluno " + cont + " De recuperação!");
            }
        }

        double mediaTurma = somaMedias / n;
        showMessageDialog(null, "Média geral da turma: " + mediaTurma);
    }
}
