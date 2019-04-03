import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Server {
    public final static int SERVER_PORT = 9999;
    public static void main(String[] args) {
        ServerSocket serverSock = null;
        Socket sock = null;
        BufferedWriter out = null;
        BufferedReader in = null;
        ArrayList<Integer> clientRequest = new ArrayList<Integer>();
        String max = null;
        try {
            serverSock = new ServerSocket(SERVER_PORT);
            sock = serverSock.accept();
            out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            while (true) {
                String line = in.readLine();
                clientRequest.add(Integer.valueOf(line));
                if(clientRequest.size() == 2) {
                    max = (String.valueOf(Collections.max(clientRequest)));
                    out.write(max);
                    out.newLine();
                    out.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}