// There are mainly 4 types of application that can be  created using java programing:--
// 1) Standalone Application  :--  Examples of standalone application are Media player, antivirus, etc. AWT and Swing are used in Java for creating standalone applications.
// 2)Web Application      :-- An application that runs on the server side and creates a dynamic page is called a web application.
// 3)Enterprise Application  :-- An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise applications.
// 4)Mobile Application      :--  An application which is created for mobile devices is called a mobile application.

// There are 4 platforms or editions of Java:
// 1) Java SE (Java Standard Edition)
// 2) Java EE (Java Enterprise Edition)
// 3) Java ME (Java Micro Edition) 
// 4) JavaFX

// data Types in java [2 types of data types 1-primitive dataType 2- Non-primitive dataType]
// Primitive DataType
// 1-> int
// 2-> long
// 3-> double
// 4-> short
// 5-> byte
// 6-> float
// 7-> char
// 8-> boolean

// Non-Primitive Data Type


//  write hello world program in java
public class javaNotes {

    public static void main(String[] args) {
        System.out.println("hello world");
        // ------   data Types in java   --------
        // define a var
        String name = "Abhay Basani";
        int num;
        num = 344;
        short ab = 9244;
        long lg = 127733333;
        // double takes 8 bytes of memory
        double flt = 3.44554;
        // float take 4 bytes of memory. we have to put 'f' after define floating point number.
        float flt2 = 5.433f;
        // char only store only one character
        char achar = 'b';
        boolean bool = true;
        // byte type of data which can hold only 6 bytes of data.
        byte byt = 124;

        System.out.print(name);
        System.out.println(num);
        System.out.println(ab);
        System.out.println(lg);
        System.out.println(flt);
        System.out.println(flt2);
        System.out.println(achar);
        System.out.println(bool);
        System.out.println(byt);
    }
}
