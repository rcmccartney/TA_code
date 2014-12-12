import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Fifteen {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket(Sixteen.ServerIP, Sixteen.ServerPort);
			s.getOutputStream().write(("Good day!"+Sixteen.EndOfMsg).getBytes());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Server said:\n\t" + br.readLine());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
