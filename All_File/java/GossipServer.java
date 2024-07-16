import java.io.*;
import java.net.*;
public class GossipServer
{
public static void main(String[] args) throws Exception
{
ServerSocket sersok=new ServerSocket(3000);
System.out.println("server is ready for chatting");
Socket sock = sersock.accept();
BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream=sock.getputStram();
printwriter pwrite=new printwriter(ostream,true);
InputStream istream=sock.getInputStream();
BufferedReader reciveRead=new BufferedReader(new InputStreamReader(istream));
String receiveMessage,sendMessage;
while(true)
{
if((receiveMessage=receiveRead.readLine()) !=null)
{
system.out.println(receiveMessage);
}
sendMessage=keyRead.readLine();
pwite.println(sendMessage);
pwrite.flush();
}
}
}