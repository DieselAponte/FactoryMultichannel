import Core.Notificador;


public class Main {
    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        notificador.enviarNotificacion("VOZ", "correo@ejemplo.com", "Hola por email");
        notificador.enviarNotificacion("SMS", "123456789", "Hola por SMS");
        notificador.enviarNotificacion("PUSH", "DEVICE-001", "Notificación push enviada");

        String mensajeLargo = "Este es un mensaje de voz muy largo que necesita ser dividido en varias partes porque supera los 500 caracteres...".repeat(5);
        notificador.enviarNotificacion("VOZ", "987654321", mensajeLargo);
    }
}
