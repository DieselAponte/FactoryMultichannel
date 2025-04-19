package Factories;

import Core.NotificacionFactory;
import Core.Notificacion;
import Notifiaciones.SMSNotificacion;

public class SMSNotificacionFactory implements NotificacionFactory {
    public Notificacion crear(String destinatario, String mensaje) {
        return new SMSNotificacion(destinatario, mensaje);
    }
}
