package client;
public interface Subject {
public void registerObserver(Observer o);
public void removeObsever(Observer o);
public void publishMessage(Message m);
}