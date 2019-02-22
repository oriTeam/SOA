import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Client {
    private final static String SERVER_IP = "localhost";
    private final static int SERVER_PORT = 9999;
    public static void main(String[] args){
        BufferedWriter out = null;
        BufferedReader in = null;
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap gia tri cua a: ");
        a = sc.nextInt();
        System.out.println("Nhap gia tri cua b : ");
        b = sc.nextInt();

        try (Socket clientSock = new Socket(SERVER_IP, SERVER_PORT)) {
            out = new BufferedWriter(new OutputStreamWriter(clientSock.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
            while (true) {
                out.write(String.valueOf(a));
                out.newLine();
                out.flush();
                out.write(String.valueOf(b));
                out.newLine();
                out.flush();
                String response;
                while ((response = in.readLine()) != null) {
                    System.out.println("So lon hon trong 2 so la : " + response);
                }

                out.close();
                in.close();
                clientSock.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}