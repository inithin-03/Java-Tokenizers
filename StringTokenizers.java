package token;
import java.util.*;
public class Token
{
   public static void main(String[] args)
  {
	
	String s1 ="this,is,a,university,its,name,is,klu,it,is,in,vijayawada,";
    StringTokenizer st=new StringTokenizer(s1,",");
    System.out.println("Number of tokens are:"+st.countTokens());
    while(st.hasMoreTokens())
    {
    	System.out.println(st.nextToken());
    }
    StringBuffer sb=new StringBuffer(s1);
    sb.replace(0,3,"hello");
    sb.insert(3, false);
}
   }
