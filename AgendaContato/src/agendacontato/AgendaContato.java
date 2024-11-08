package agendacontato;

import java.util.Scanner;

public class AgendaContato {

    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("+------ Escolha a interface: ------+");
        System.out.println("1. Abrir no Console");
        System.out.println("2. Abrir com Swing");
        System.out.print("Digite sua escolha: ");
        int op = scanner.nextInt();

        if (op == 1){
            AgendaConsole consoleInterface = new AgendaConsole(agenda);
            consoleInterface.iniciar();
        } else if (op == 2) {
            AgendaSwing swingInterface = new AgendaSwing(agenda);
            swingInterface.iniciar();
        } else {
            System.out.println("Escolha invalida!");
        }
    }
    
}
