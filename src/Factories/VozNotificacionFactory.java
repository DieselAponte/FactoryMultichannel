package Factories;

import Core.NotificacionFactory;
import Core.Notificacion;
import Notifiaciones.VozNotificacion;

public class VozNotificacionFactory implements NotificacionFactory {
    public Notificacion crear(String destinatario, String mensaje) {
        return new VozNotificacion(destinatario, mensaje);
    }
}
