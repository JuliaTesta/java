package application;
import java.util.Scanner;

public class UrlTransformer {

    public static int maxSubstringLength(String originalUrl, String targetUrl, int cost) {
        int maxLen = 0;
        int start = 0;
        int totalCost = 0; //vai acumulando os custos

        for (int i = 0; i < originalUrl.length(); i++) {
            int diff = Math.abs(originalUrl.charAt(i) - targetUrl.charAt(i));
            totalCost += diff;  //math.abs retira os sinais dos numeros 

            while (totalCost > cost) {
                int startDiff = Math.abs(originalUrl.charAt(start) - targetUrl.charAt(start));
                totalCost -= startDiff; //tira o custo do inicio do total acumulado
                start++;
            }

            maxLen = Math.max(maxLen, i - start + 1); //ex: 4-2  +1 (tamanho=3) //??????
        } //math.max retorna o maior valor, nesse caso (maxLen ou i-start+1)

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a URL original: ");
        String original = scanner.nextLine();

        System.out.print("Digite a URL de destino: ");
        String target = scanner.nextLine();

        System.out.print("Digite o custo máximo permitido: ");
        int cost = scanner.nextInt();

        // Verificação rápida (as duas strings devem ter o mesmo tamanho)
        if (original.length() != target.length()) {
            System.out.println("Erro: As strings devem ter o mesmo tamanho.");
            return;
        }

        // Chamada da função e saída
        int result = maxSubstringLength(original, target, cost);
        System.out.println("Maior substring transformável: " + result);
    }
}

