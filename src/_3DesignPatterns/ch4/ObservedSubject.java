package _3DesignPatterns.ch4;

public interface ObservedSubject {
    void register (Observer obj);
    void unregister (Observer obj);
    void NotifyObserver (String message);
}
