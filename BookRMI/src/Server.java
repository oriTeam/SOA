import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

class Server{
    private static Registry registry;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        registry = LocateRegistry.createRegistry(9999);
        BookStorage ci = new BookStorageImp();
        registry.bind("book", ci);
        System.out.println("Listening...");
    }
}
