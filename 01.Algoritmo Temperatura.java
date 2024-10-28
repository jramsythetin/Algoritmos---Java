import java.util.Scanner; // Classe para ler entradas de dados
import java.util.Locale; // Adaptar a formatação para cada páis
public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double temperatura;
        System.out.println("Digite a temperatura atual");
        temperatura = scan.nextDouble(); // input de dados
            if (temperatura < 0 ){
                System.out.println(temperatura +" = Temperatura negativa");
            }
            else if (temperatura > 0 && temperatura < 39){
                System.out.println(temperatura + " = Temperatura na média");
            }
            else {
                System.out.println( temperatura + " = Temperatura acima do normal");
            }
            scan.close();
    }
}

