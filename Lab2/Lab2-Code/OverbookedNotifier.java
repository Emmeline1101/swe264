import java.util.Observable;
import java.util.Observer;

public class OverbookedNotifier implements Observer {
    public OverbookedNotifier() {
        EventBus.subscribeTo(EventBus.EV_COURSE_OVERBOOKED, this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            System.out.println("Notification: " + arg);
        }
    }
}
