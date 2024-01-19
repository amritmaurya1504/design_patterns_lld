package DesignPatterns.ObserverDP.Observable;

import DesignPatterns.ObserverDP.Observer.NotificationAlertObserver;

/**
 * This interface represents an observable object that can be observed by NotificationAlertObservers.
 */
public interface StockObservable {
    /**
     * Adds a new observer to the list of subscribers.
     *
     * @param observer The observer to be added.
     */
    void add(NotificationAlertObserver observer);

    /**
     * Removes an observer from the list of subscribers.
     *
     * @param observer The observer to be removed.
     */
    void remove(NotificationAlertObserver observer);

    /**
     * Notifies all subscribed observers when a change occurs in the observable object.
     */
    void notifySubscribers();

    /**
     * Sets the new stock count and notifies observers if the count has changed.
     *
     * @param newCount The new stock count.
     */
    void setStockCount(int newCount);

    /**
     * Gets the current stock count.
     *
     * @return The current stock count.
     */
    int getStockCount();
}

