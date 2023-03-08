import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SwitchDiaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da semana: segunda, terça, quarta, quita, sexta, sabado, domingo: ");
        String semana = scanner.next();

        System.out.println(semana);

        switch (semana) {
            case "domingo":
                System.out.println(1);
                break;

            case "segunda":
                System.out.println(2);
                break;

            case "terca":
                System.out.println(3);
                break;

            case "quarta":
                System.out.println(4);
                break;

            case "quinta":
                System.out.println(5);
                break;

            case "sexta":
                System.out.println(6);
                break;

            case "sabado":
                System.out.println(7);
                break;

            default:
                System.out.println("Valor incorreto");
                break;

        }
    }

}