package Observer;

import java.util.ArrayList;

public class Newsletter implements Subject {
    private ArrayList<Observer> observers;
    private String news;

    public Newsletter(){ observers = new ArrayList<Observer>();}
    public ArrayList<Observer> getObservers() {return observers;}

    private void newsletters() {notifyObservers();}

    public void setNews(String news){
        this.news = news;
        newsletters();
    }

    public String getNews(){return news;}

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("---Sending newsletters to all members that are subscribe ---\n");
        for(Observer observer : observers) {
            observer.update(this.news);
        }
    }
}

