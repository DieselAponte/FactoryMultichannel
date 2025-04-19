package Factories;

import Core.NotificacionFactory;
import Core.Notificacion;
import Notifiaciones.PushNotificacion;

public class PushNotificacionFactory implements NotificacionFactory {
    public Notificacion crear(String destinatario, String mensaje) {
        return new PushNotificacion(destinatario, mensaje);
    }
}
