import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)  {
        // EN WINDOWS
        long tiempoInicial = System.currentTimeMillis();
        System.out.println("Tiempo inicial : " + tiempoInicial);

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        ProcessBuilder pb = new ProcessBuilder();

        pb.command("notepad.exe");

        int contador = 0;
        try {
            Process process = null;
            ArrayList<Process> lista = new ArrayList<Process>();

            for (int i = 0; i < entrada; i++) {
                process = pb.start();
                lista.add(process);
            }

            for (int i = 0; i < lista.size(); i++) {
                Process process1 = lista.get(i);
                while (process1.isAlive());
            }

            long tiempoFinal = System.currentTimeMillis();
            System.out.println("Tiempo final : " + tiempoFinal);
            System.out.println("Tiempo de ejecucion : " + (tiempoFinal-tiempoInicial));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
