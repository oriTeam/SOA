import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private static String SERVER = "localhost";
    private static int PORT = 9999;

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry stub = LocateRegistry.getRegistry(SERVER, PORT);
        Common saySomething = (Common) stub.lookup("sayHello");
        String result = saySomething.sayHello();
        System.out.println(result);
    }
}