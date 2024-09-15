public class Desafio4 {


    public static void main(String[] args) {

        double[] faturamentos = {
                67836.43, // SP
                36678.66, // RJ
                29229.88, // MG
                27165.48, // ES
                19849.53  // Outros
        };

        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};

        // Calcula o faturamento total
        double totalFaturamento = 0;
        for (double valor : faturamentos) {
            totalFaturamento += valor;
        }

        // Calcula e imprime o percentual de representação de cada estado
        for (int i = 0; i < faturamentos.length; i++) {
            double percentual = (faturamentos[i] / totalFaturamento) * 100;
            System.out.printf("Percentual de representação de %s: %.2f%%\n", estados[i], percentual);
        }
    }
}

