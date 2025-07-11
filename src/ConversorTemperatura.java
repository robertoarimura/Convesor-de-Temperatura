import java.util.Scanner;
import java.util.Locale;

public class ConversorTemperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double temp;
        double novaTemp;
        String unidade;

        System.out.println("Conversor de Temperatura");

        System.out.print("Qual a temperatura a ser convertida?: ");
        temp = sc.nextDouble();

        System.out.println("Para qual unidade deseja converter? (C ou F): ");
        unidade = sc.next().toUpperCase();

        novaTemp = (unidade.equals("C")) ? (temp - 32 ) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s", novaTemp, unidade);

        sc.close();
    }
}
