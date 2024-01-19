package DesignPatterns.ObserverDP.Observer;

import DesignPatterns.ObserverDP.Observable.StockObservable;

/**
 * Concrete observer class representing a mobile alert observer.
 * This observer is notified when the stock status changes and sends an SMS to a specified mobile number.
 */
public class MobileAlertObserver implements NotificationAlertObserver {
    // The mobile number to which the alerts will be sent
    private final long mobileNumber;

    // The observable subject to which this observer is attached
    private final StockObservable stockObservable;

    /**
     * Constructor to initialize the MobileAlertObserver.
     *
     * @param mobileNumber    The mobile number to which alerts will be sent.
     * @param stockObservable The observable subject (e.g., iPhone stock) to which this observer is attached.
     */
    public MobileAlertObserver(long mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    /**
     * Update method called by the observable subject when the stock status changes.
     * It triggers the sending of an SMS alert to the specified mobile number.
     */
    @Override
    public void update() {
        sendSMS(mobileNumber, "Product is in stock! Hurry up!");
    }

    /**
     * Method to simulate sending an SMS.
     *
     * @param mobileNumber The mobile number to which the SMS is sent.
     * @param message      The content of the SMS.
     */
    public void sendSMS(long mobileNumber, String message) {
        System.out.println("Hey " + mobileNumber + ", " + message);
    }
}
