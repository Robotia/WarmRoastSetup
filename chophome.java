public class chophome
{
public static void main(String[] args)
{
String fullname = "";
for(String a : args)fullname += a + " ";
System.out.println(fullname.replace("[Opened ","").replace("jre/lib/rt.jar]","").replace("/ ","/").replace(" ",""));
}
}
