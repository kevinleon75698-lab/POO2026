import java.util.Scanner;

public class TestMediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaPlayer player = new MediaPlayer();

        System.out.println("--- Estado Inicial del Reproductor ---");
        System.out.println("Volumen actual: " + player.getVolume());
        System.out.println("¿Está reproduciendo?: " + (player.isPlaying() ? "Sí" : "No"));

        int option;
        do {
            System.out.println("\n--- Menú del Reproductor ---");
            System.out.println("1. Iniciar reproducción (Play)");
            System.out.println("2. Detener reproducción (Stop)");
            System.out.println("3. Subir volumen (+5)");
            System.out.println("4. Bajar volumen (-5)");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción (1-5): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    player.play();
                    System.out.println("-> Reproducción iniciada.");
                    break;
                case 2:
                    player.stop();
                    System.out.println("-> Reproducción detenida.");
                    break;
                case 3:
                    if (player.increaseVolume()) {
                        System.out.println("-> Volumen aumentado a: " + player.getVolume());
                    } else {
                        System.out.println("-> Error: El volumen ya está en el nivel máximo (100).");
                    }
                    break;
                case 4:
                    if (player.decreaseVolume()) {
                        System.out.println("-> Volumen disminuido a: " + player.getVolume());
                    } else {
                        System.out.println("-> Error: El volumen ya está en el nivel mínimo (0).");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la prueba del reproductor...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println("Estado actual: " + (player.isPlaying() ? "Reproduciendo" : "Detenido") 
                               + " | Volumen: " + player.getVolume());

        } while (option != 5);

        scanner.close();
    }
}