
import java.rmi.Remote;
import java.rmi.RemoteException;

interface BookStorage extends Remote {
    public Book getBook(int id) throws RemoteException;
    public String insertBook(Book b) throws  RemoteException;
}