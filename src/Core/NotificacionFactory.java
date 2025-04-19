package Core;

public interface NotificacionFactory {
    Notificacion crear(String destinatario, String mensaje);
}
