import java.util.Scanner;

import javax.xml.transform.Source;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dias trabalhados após a ultima férias: ");
        int diasTrabalhados = scanner.nextInt();

        podeSairFerias(diasTrabalhados);

    }

    public static void podeSairFerias(int diasTrabalhados) {
        if (diasTrabalhados > 365) {
            System.out.println("Pode sair de ferias");
        } else {
            System.out.println("Não pode sair de ferias");
        }
    }
}
