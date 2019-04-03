import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private static String SERVER = "localhost";
    private static int PORT = 9999;

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry stub = LocateRegistry.getRegistry(SERVER, PORT);
        BookStorage BookStorge = (BookStorage) stub.lookup("book");
        Book bookA = new Book(001, "Java", "PVT", "00000001");
        Book bookB = new Book(002, "HTML", "VNC", "00000002");
        Book bookC = new Book(003, "Python", "NVM", "00000003");
        Book bookD = new Book(004, "Javascript", "VNC", "00000004");
        Book bookE = new Book(005, "CSS", "PVT", "00000005");
        String insertResultA = BookStorge.insertBook(bookA);
        System.out.println(insertResultA);

        String insertResultB = BookStorge.insertBook(bookB);
        System.out.println(insertResultB);
        String insertResultC = BookStorge.insertBook(bookC);
        System.out.println(insertResultC);
        String insertResultD = BookStorge.insertBook(bookD);
        System.out.println(insertResultD);
        String insertResultE = BookStorge.insertBook(bookE);
        System.out.println(insertResultE);

        Book bookResult = BookStorge.getBook(001);
        System.out.println("Book: " + bookResult.getTitle() + "; Id: " + String.valueOf(bookResult.getId()) + "; Author: " + bookResult.getAuthor() + "; ISBN: " + bookResult.getISBN());
    }
}