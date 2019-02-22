
import java.rmi.Remote;
import java.rmi.RemoteException;

interface Common extends Remote {
    public String sayHello() throws RemoteException;
}