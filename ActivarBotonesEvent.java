import java.awt.*;

class ActivarBotonesEvent extends AWTEvent {
    public ActivarBotonesEvent(Object source) {
        super(source, AWTEvent.RESERVED_ID_MAX + 1);
    }
}