package Core;

import Factories.VozNotificacionFactory;
import Factories.PushNotificacionFactory;
import Factories.EmailNotificacionFactory;
import Factories.SMSNotificacionFactory;

import java.util.HashMap;
import java.util.Map;

public class Notificador {

    private Map<String, NotificacionFactory> factories = new HashMap<>();

    public Notificador() {
        factories.put("EMAIL", new EmailNotificacionFactory());
        factories.put("SMS", new SMSNotificacionFactory());
        factories.put("PUSH", new PushNotificacionFactory());
        factories.put("VOZ", new VozNotificacionFactory());
    }

    public void enviarNotificacion(String tipo, String destinatario, String mensaje) {
        NotificacionFactory factory = factories.get(tipo.toUpperCase());
        if (factory == null) {
            throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
        Notificacion notificacion = factory.crear(destinatario, mensaje);
        notificacion.enviar();
    }
}
