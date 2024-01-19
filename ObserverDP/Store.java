package DesignPatterns.ObserverDP;

import DesignPatterns.ObserverDP.Observable.IphoneStockObservableImpl;
import DesignPatterns.ObserverDP.Observable.StockObservable;
import DesignPatterns.ObserverDP.Observer.EmailAlertObserver;
import DesignPatterns.ObserverDP.Observer.MobileAlertObserver;
import DesignPatterns.ObserverDP.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        // Create an observable object for iPhone stock
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        // Create email alert observers
        NotificationAlertObserver observer1 = new EmailAlertObserver(
                iphoneStockObservable, "amritmaury@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserver(
                iphoneStockObservable, "sam@gmail.com"
        );

        // Create mobile alert observer
        NotificationAlertObserver observer3 = new MobileAlertObserver(
                9122040963L, iphoneStockObservable
        );

        // Add observers to the list of subscribers
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        // Set the initial stock count and notify observers
        iphoneStockObservable.setStockCount(15);
    }
}
