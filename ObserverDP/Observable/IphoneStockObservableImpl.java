package DesignPatterns.ObserverDP.Observable;
import java.util.List;
import java.util.ArrayList;
import DesignPatterns.ObserverDP.Observer.NotificationAlertObserver;

public class IphoneStockObservableImpl implements StockObservable{
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = newCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
