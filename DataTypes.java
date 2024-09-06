/*4. Define variables for different Data Types int, Boolean, char, float,
  double and print on the Console*/
  import java.util.Scanner;
  class DataTypes
  {
      static Scanner sc=new Scanner(System.in);
      public static void main(String args[])
      {
          
          byte n=sc.nextByte();
          short s=sc.nextShort();
          int i=sc.nextInt();
          long l=sc.nextLong();
          char ch=sc.next().charAt(0);
          float f=sc.nextFloat();
          double d=sc.nextDouble();
          boolean b=sc.nextBoolean();
          String s1=sc.next();	
          System.out.println("Byte:"+n);	
          System.out.println("short:"+s);	
          System.out.println("Integer:"+i);	
          System.out.println("Long:"+l);	
          System.out.println("Character:"+ch);	
          System.out.println("Float:"+f);	
          System.out.println("Double:"+d);	
          System.out.println("Boolean:"+b);	
          System.out.println("String:"+s1);	
      }
  }