//server
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (true) {
            if (br.ready()) {
                msg = br.readLine();
                if (msg.equals("exit")) break;
                System.out.println("Client: " + msg);
            }
            if (kb.ready()) {
                msg = kb.readLine();
                pw.println(msg);
                if (msg.equals("exit")) break;
            }
        }
        s.close();
        ss.close();
    }
}

//client
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (true) {
            if (br.ready()) {
                msg = br.readLine();
                if (msg.equals("exit")) break;
                System.out.println("Server: " + msg);
            }
            if (kb.ready()) {
                msg = kb.readLine();
                pw.println(msg);
                if (msg.equals("exit")) break;
            }
        }
        s.close();
    }
}
