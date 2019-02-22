import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CommonImp extends UnicastRemoteObject implements Common {
    protected CommonImp() throws RemoteException {};
    @Override
    public String sayHello() throws RemoteException {
        return "Hello RMI";
    }
}