package br.com.etecalbertoferes.tp.utils;

public class CalculosUtils {
    /**
     * @author Esdras b Silva
     * Método responsável por calcular a média aritmética de 4 notas recebidas
     * que representam a nota final de um aluno.
     * @param n1 Nota referente ao primeiro bimestre
     * @param n2 Nota referente ao segundo bimestre
     * @param n3 Nota referente ao terceiro bimestre
     * @param n4 Nota referente ao quarto bimestre
     * @return Double - Retorno da média final
     */
    public static Double mediaAritimeticaQuatroNotas(Double n1, Double n2, Double n3, Double n4) {
        return (n1+n2+n3+n4)/4;
    }

    public static Double mediaPonderadaPesoDez(Double n1, Double n2, Double n3, Double n4) {
        return (n1*1+n2*3+n3*2+n4*4)/10;
    }
}
