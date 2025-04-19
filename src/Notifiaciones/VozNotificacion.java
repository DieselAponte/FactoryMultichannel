package Notifiaciones;

import Core.Notificacion;

public class VozNotificacion implements Notificacion {
    private String telefono;
    private String mensaje;

    public VozNotificacion(String telefono, String mensaje) {
        this.telefono = telefono;
        this.mensaje = mensaje;
    }

    private void convertirTextoAVoz(String texto) {
        System.out.println("[TTS] Convirtiendo texto a voz: " + texto);
    }

    private boolean realizarLlamada(String texto) {
        System.out.println("Llamando a " + telefono);
        convertirTextoAVoz(texto);
        int duracion = texto.length() / 10; // simulación de duración
        System.out.println("Duración de llamada: " + duracion + " segundos");
        return Math.random() > 0.3; // 70% chance de éxito
    }

    @Override
    public void enviar() {
        String[] partes = mensaje.split("(?<=\n.{500})");
        for (String parte : partes) {
            int intentos = 0;
            boolean enviado = false;
            while (intentos < 3 && !enviado) {
                enviado = realizarLlamada(parte);
                intentos++;
                if (!enviado) System.out.println("Reintentando llamada...");
            }
            if (!enviado) {
                System.out.println("No se pudo contactar tras 3 intentos a " + telefono);
            }
        }
    }
}
