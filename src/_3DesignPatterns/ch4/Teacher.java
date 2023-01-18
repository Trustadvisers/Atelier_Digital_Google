package _3DesignPatterns.ch4;

public class Teacher implements ObservedSubject {
    private Observer[] observers = new Observer[10];
    private int size = 0;

    @Override
    public void register(Observer obj) {
        observers[size] = obj;
        size++;
    }

    private void delete_observer(int pos) {
        for (int i = pos; i < size - 1; i++) {
            observers[i] = observers[i + 1];
        }
        observers[size] = null;
        size--;
    }

    @Override
    public void unregister(Observer obj) {
        for (int i = 0; i < size; i++)
            if (observers[i] == obj) {
                delete_observer(i);
                break;
            }
    }

    @Override
    public void NotifyObserver(String message) {
        for (int i = 0; i < size; i++)
            observers[i].update(message);
    }
}
