import java.io.*;
class File
{
public static void main(String[] args)
{
try{
String str;
//opening file in read mode using BufferedReader stream
BufferedReader br=new BufferedReader(new FileReader("D:\\MYAPPLICATIONS1\\Test\\src\\myfile.txt"));
while((str=br.readLine())!=null)
 {
System.out.println(str);
 }
br.close();	//closing BufferedReader stream
}catch(IOException ie)
{  System.out.println("exception" + ie);  }
 }
}