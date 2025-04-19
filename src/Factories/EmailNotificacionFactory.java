package Factories;

import Core.NotificacionFactory;
import Core.Notificacion;
import Notifiaciones.EmailNotificacion;

public class EmailNotificacionFactory implements NotificacionFactory {
    public Notificacion crear(String destinatario, String mensaje) {
        return new EmailNotificacion(destinatario, mensaje);
    }
}
