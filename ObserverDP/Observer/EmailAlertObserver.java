package DesignPatterns.ObserverDP.Observer;

import DesignPatterns.ObserverDP.Observable.StockObservable;

/**
 * Concrete observer class representing an email alert observer.
 * This observer is notified when the stock status changes and sends an email to a specified email address.
 */
public class EmailAlertObserver implements NotificationAlertObserver {
    // The email address to which the alerts will be sent
    private final String emailId;

    // The observable subject to which this observer is attached
    private final StockObservable stockObservable;

    /**
     * Constructor to initialize the EmailAlertObserver.
     *
     * @param stockObservable The observable subject (e.g., iPhone stock) to which this observer is attached.
     * @param emailId         The email address to which alerts will be sent.
     */
    public EmailAlertObserver(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    /**
     * Update method called by the observable subject when the stock status changes.
     * It triggers the sending of an email alert to the specified email address.
     */
    @Override
    public void update() {
        sendMail(emailId, "Product is in stock! Hurry up!");
    }

    /**
     * Method to simulate sending an email.
     *
     * @param emailId The email address to which the email is sent.
     * @param message The content of the email.
     */
    public void sendMail(String emailId, String message) {
        System.out.println("Hey " + emailId + ", " + message);
    }
}
