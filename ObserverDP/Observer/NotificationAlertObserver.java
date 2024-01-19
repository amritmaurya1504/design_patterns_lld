package DesignPatterns.ObserverDP.Observer;

/**
 * This interface represents an observer that receives notification alerts.
 * Concrete implementations must define the behavior in the update method.
 */
public interface NotificationAlertObserver {
    /**
     * This method is called by the subject (observable) when a change occurs.
     * Implementing classes should define specific actions to be taken when notified.
     */
    public void update();
}
