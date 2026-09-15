public class TestMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        System.out.println("Volumen inicial: " + player.getVolume());
        System.out.println("Estado inicial: " + player.getPlaybackState());

        player.play();
        System.out.println("\nEstado tras play(): " + player.getPlaybackState());

        System.out.println("\n--- Subir volumen hasta el limite (100) ---");
        for (int i = 0; i < 12; i++) {
            boolean increased = player.increaseVolume();
            System.out.println("Aumentar volumen: " + (increased ? "OK" : "RECHAZADO")
                    + " -> " + player.getVolume());
        }

        player.stop();
        System.out.println("\nEstado tras stop(): " + player.getPlaybackState());

        System.out.println("\n--- Bajar volumen hasta el limite (0) ---");
        for (int i = 0; i < 22; i++) {
            boolean decreased = player.decreaseVolume();
            System.out.println("Disminuir volumen: " + (decreased ? "OK" : "RECHAZADO")
                    + " -> " + player.getVolume());
        }
    }
}
