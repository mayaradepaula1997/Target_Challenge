
import java.util.ArrayList;
import java.util.List;

public class Desafio3 {

    public static void main(String[] args) {

        // Dados de faturamento (simulando um arquivo JSON)
        List<Double> faturamentos = new ArrayList<>();
        faturamentos.add(1500.0);
        faturamentos.add(2000.0);
        faturamentos.add(0.0);    // Dia sem faturamento
        faturamentos.add(2500.0);
        faturamentos.add(3000.0);
        faturamentos.add(0.0);    // Dia sem faturamento
        faturamentos.add(0.0);    // Dia sem faturamento
        faturamentos.add(1800.0);

        // Calcular o menor, maior faturamento e média
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamentos) {
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = (diasComFaturamento > 0) ? somaFaturamento / diasComFaturamento : 0;

        // Contar dias acima da média
        int diasAcimaDaMedia = 0;
        for (double valor : faturamentos) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Imprimir resultados
        System.out.println("Menor valor de faturamento: R$ " + menorFaturamento);
        System.out.println("Maior valor de faturamento: R$ " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}








