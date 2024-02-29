package LargeStrings;

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    //constructor 1
    StringBuffer sb=new StringBuffer();
    System.out.println(sb.capacity());

    //constructor 2
    StringBuffer sb2=new StringBuffer("Kunal Kushwaha");

    //constructror 3
    StringBuffer sb3=new StringBuffer(30);
    System.out.println(sb3.capacity());

    sb.append("We make devs");
    sb.append(" is nice!");

    // sb.insert(2,"Rahul ");

    sb.replace(1,5,"Kushwaha");

    sb.delete(1,5);

    sb.reverse();

    String str=sb.toString();
    System.out.println(str);

    Random random=new Random();
    System.out.println(random.nextFloat());
    System.out.println((char)(97+1));

    int n=20;
    String name=RandomString.generate(n);
    System.out.println(name);  

    //remove whitespace

    String sentence="hi    h df sd fdh f";
    System.out.println(sentence);
    System.out.println(sentence.replaceAll("\\s",""));

    //split
    String arr="Kunal,Apoorv,Rahul,Snehal";
    String[] names=arr.split(",");
    System.out.println(Arrays.toString(names));

    //decima format
    DecimalFormat df=new DecimalFormat("0.000");
    System.out.print(df.format(7.20))
      
      ;
  }
  
 
}
