import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BookStorageImp extends UnicastRemoteObject implements BookStorage {
    ArrayList<Book> BookList = new ArrayList<Book>();
    protected BookStorageImp() throws RemoteException {};
    @Override
    public Book getBook(int id) throws RemoteException {
        for(Book book : BookList) {
            if(book.getId() == id) {
                return book;
            }
        }
        return null;
    };

    @Override
    public String insertBook(Book b) throws RemoteException {
        BookList.add(b);
        return "Insert book " + b.getTitle() + " Successfully!";
    };
}