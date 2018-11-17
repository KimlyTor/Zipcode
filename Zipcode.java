//*********************************
//
// Zip code class
//
// In this class, five digits zip code 
// will be converted into barcode
// and vice versa
// 
//@author ktkay
//*********************************
import java.util.Scanner;

public class Zipcode{ 
  private int num1;//instance variabels for zip to bar method
  private int num2;
  private int num3;
  private int num4;
  private int num5;
  private int checkDig;
  private String barCode;
    
  private String zipCode;//instance variable for bar to zip method
  private String digit0;
  private String digit1;
  private String digit2;
  private String digit3;
  private String digit4;
  private String checkDigit;
      
  
  public Zipcode(int z){ // zip to bar method
    int remainDer;
    int sum;
    sum = 0;
  
    String digits = new Integer(z).toString();//convert int to string
     for (char c: digits.toCharArray())//separate each digit from string
      sum += c - '0';//sum all digits 
     
    //find checking ditgit = the added number that makes the sum a multiple of 10
    remainDer= sum%10;
    checkDig= 10-remainDer;
    if (remainDer==0)
      checkDig = 0;
     
    String add0 = String.format("%05d", z);// padding 0 before the input
    num1 = Integer.parseInt(add0.substring(0,1));// separate each digit
    num2 = Integer.parseInt(add0.substring(1,2));
    num3 = Integer.parseInt(add0.substring(2,3));
    num4 = Integer.parseInt(add0.substring(3,4));
    num5 = Integer.parseInt(add0.substring(4,5));
 
    System.out.println("sum:"+ sum);// debugging println
    System.out.println("checkDig:" + checkDig);
    System.out.println("1st dig:"+num1);
    System.out.println("2nd dig:"+num2);
    System.out.println("3rd dig:"+num3);
    System.out.println("4th dig:"+num4);
    System.out.println("5th dig:"+num5);
  
    // convert each digit to a barcode using switch method
    String barNum1 ="";
    String barNum2 ="";
    String barNum3 ="";
    String barNum4 ="";
    String barNum5 ="";
    String barNum6 ="";
    String barCheckDig = "";
     
    switch (num1){// switch method
      case 0: barNum1 = "||:::";break;
      case 1: barNum1 = ":::||";break;
      case 2: barNum1 = "::|:|";break;
      case 3: barNum1 = "::||:";break;
      case 4: barNum1 = ":|::|";break;
      case 5: barNum1 = ":|:|:";break; 
      case 6: barNum1 = ":||::";break;
      case 7: barNum1 = "|:::|";break;
      case 8: barNum1 = "|::|:";break;
      case 9: barNum1 = "|:|::";break;
      }
    switch (num2){
      case 0: barNum2 = "||:::";break;
      case 1: barNum2 = ":::||";break;
      case 2: barNum2 = "::|:|";break;
      case 3: barNum2 = "::||:";break;
      case 4: barNum2 = ":|::|";break;
      case 5: barNum2 = ":|:|:";break;
      case 6: barNum2 = ":||::";break;
      case 7: barNum2 = "|:::|";break;
      case 8: barNum2 = "|::|:";break;
      case 9: barNum2 = "|:|::";break;
      }
    switch (num3){
      case 0: barNum3 = "||:::";break;
      case 1: barNum3 = ":::||";break;
      case 2: barNum3 = "::|:|";break;
      case 3: barNum3 = "::||:";break;
      case 4: barNum3 = ":|::|";break;
      case 5: barNum3 = ":|:|:";break;
      case 6: barNum3 = ":||::";break;
      case 7: barNum3 = "|:::|";break;
      case 8: barNum3 = "|::|:";break;
      case 9: barNum3 = "|:|::";break;
      }
    switch (num4){
      case 0: barNum4 = "||:::";break;
      case 1: barNum4 = ":::||";break;
      case 2: barNum4 = "::|:|";break;
      case 3: barNum4 = "::||:";break;
      case 4: barNum4 = ":|::|";break;
      case 5: barNum4 = ":|:|:";break;
      case 6: barNum4 = ":||::";break;
      case 7: barNum4 = "|:::|";break;
      case 8: barNum4 = "|::|:";break;
      case 9: barNum4 = "|:|::";break;
      }
    switch (num5){
        case 0: barNum5 = "||:::";break;
        case 1: barNum5 = ":::||";break;
        case 2: barNum5 = "::|:|";break;
        case 3: barNum5 = "::||:";break;
        case 4: barNum5 = ":|::|";break;
        case 5: barNum5 = ":|:|:";break;
        case 6: barNum5 = ":||::";break;
        case 7: barNum5 = "|:::|";break;
        case 8: barNum5 = "|::|:";break;
        case 9: barNum5 = "|:|::";break;
        }
    switch (checkDig){
        case 0: barCheckDig = "||:::";break;
        case 1: barCheckDig = ":::||";break;
        case 2: barCheckDig = "::|:|";break;
        case 3: barCheckDig = "::||:";break;
        case 4: barCheckDig = ":|::|";break;
        case 5: barCheckDig = ":|:|:";break;
        case 6: barCheckDig = ":||::";break;
        case 7: barCheckDig = "|:::|";break;
        case 8: barCheckDig = "|::|:";break;
        case 9: barCheckDig = "|:|::";break;
       }
    
    barCode = "|" + barNum1+ barNum2+ barNum3 + barNum4 
                +barNum5+ barCheckDig+ "|"; //add up barcode

    }// end of method
   
  public Zipcode (String z){// bar to zip method
    String newBar0;                 
    String newBar1;                 
    String newBar2;                 
    String newBar3;                 
    String newBar4;                
    String newCheckDig;             
    String inputBar;
    
    inputBar= z; 
    newBar0 = inputBar.substring(1,6);// separate each bar from the inputBar
    newBar1 = inputBar.substring(6,11);
    newBar2 = inputBar.substring(11,16);
    newBar3 = inputBar.substring(16,21);
    newBar4 = inputBar.substring(21,26);
    newCheckDig = inputBar.substring(26,31);
     
    System.out.println("newBar0"+" "+newBar0);//debugging println for separated bar
    System.out.println("newBar1"+" "+newBar1);
    System.out.println("newBar2"+" "+newBar2);
    System.out.println("newBar3"+" "+newBar3);
    System.out.println("newBar4"+" "+newBar4);
    System.out.println("newChecDig"+" "+newCheckDig);
      
    //covert each bar code to a digit using comparision of two strings
    if (newBar0.equals("||:::"))
        digit0 ="0";
    if (newBar0.equals(":::||"))
        digit0 ="1";
    if (newBar0.equals("::|:|"))
        digit0 ="2";
    if (newBar0.equals("::||:"))
        digit0 ="3";
    if (newBar0.equals(":|::|"))
        digit0 ="4";
    if (newBar0.equals(":|:|:"))
        digit0 ="5";
    if (newBar0.equals(":||::"))
        digit0 ="6";
    if (newBar0.equals("|:::|"))
        digit0 ="7";
    if (newBar0.equals("|::|:"))
        digit0 ="8";
    if (newBar0.equals("|:|::"))
        digit0 ="9";
     
    if (newBar1.equals("||:::"))
        digit1 ="0";
    if (newBar1.equals(":::||"))
        digit1 ="1";
    if (newBar1.equals("::|:|"))
        digit1 ="2";
    if (newBar1.equals("::||:"))
        digit1 ="3";
    if (newBar1.equals(":|::|"))
        digit1 ="4";
    if (newBar1.equals(":|:|:"))
        digit1 ="5";
    if (newBar1.equals(":||::"))
        digit1 ="6";
    if (newBar1.equals("|:::|"))
        digit1 ="7";
    if (newBar1.equals("|::|:"))
        digit1 ="8";
    if (newBar1.equals("|:|::"))
        digit1 ="9";
    
    if (newBar2.equals("||:::"))
        digit2 ="0";
    if (newBar2.equals(":::||"))
        digit2 ="1";
    if (newBar2.equals("::|:|"))
        digit2 ="2";
    if (newBar2.equals("::||:"))
        digit2 ="3";
    if (newBar2.equals(":|::|"))
        digit2 ="4";
    if (newBar2.equals(":|:|:"))
        digit2 ="5";
    if (newBar2.equals(":||::"))
        digit2 ="6";
    if (newBar2.equals("|:::|"))
        digit2 ="7";
    if (newBar2.equals("|::|:"))
        digit2 ="8";
    if (newBar2.equals("|:|::"))
        digit2 ="9";
      
    if (newBar3.equals("||:::"))
        digit3 ="0";
    if (newBar3.equals(":::||"))
        digit3 ="1";
    if (newBar3.equals("::|:|"))
        digit3 ="2";
    if (newBar3.equals("::||:"))
         digit3 ="3";
    if (newBar3.equals(":|::|"))
         digit3 ="4";
    if (newBar3.equals(":|:|:"))
        digit3 ="5";
    if (newBar3.equals(":||::"))
        digit3 ="6";
    if (newBar2.equals("|:::|"))
        digit3 ="7";
    if (newBar3.equals("|::|:"))
       digit3 ="8";
    if (newBar3.equals("|:|::"))
        digit3 ="9";
    
     if (newBar4.equals("||:::"))
        digit4 ="0";
    if (newBar4.equals(":::||"))
        digit4 ="1";
    if (newBar4.equals("::|:|"))
         digit4 ="2";
    if (newBar4.equals("::||:"))
         digit4 ="3";
    if (newBar4.equals(":|::|"))
         digit4 ="4";
    if (newBar4.equals(":|:|:"))
        digit4 ="5";
    if (newBar4.equals(":||::"))
        digit4 ="6";
    if (newBar4.equals("|:::|"))
         digit4 ="7";
    if (newBar4.equals("|::|:"))
        digit4 ="8";
    if (newBar4.equals("|:|::"))
        digit4 ="9";
    
    if (newCheckDig.equals("||:::"))
        checkDigit="0";
    if (newCheckDig.equals(":::||"))
        checkDigit="1";
    if (newCheckDig.equals("::|:|"))
        checkDigit="2";
    if (newCheckDig.equals("::||:"))
        checkDigit="3";
    if (newCheckDig.equals(":|::|"))
        checkDigit="4";
    if (newCheckDig.equals(":|:|:"))
        checkDigit="5";
    if (newCheckDig.equals(":||::"))
        checkDigit="6";
    if (newCheckDig.equals("|:::|"))
        checkDigit="7";
    if (newCheckDig.equals("|::|:"))
        checkDigit="8";
    if (newCheckDig.equals("|:|::"))
        checkDigit="9";
      
    // debugging println for coverted bar code (to a digit)
    System.out.println("checkDigit:"+ checkDigit);
    System.out.println("digit0:" +digit0);
    System.out.println("digit1:" +digit1);
    System.out.println("digit2:" +digit2);
    System.out.println("digit3:" +digit3);
    System.out.println("digit4:" +digit4);
    
    //add up each digit string
    zipCode = digit0 + digit1 + digit2 + digit3 + digit4;
  
    }//end of method
    
  public String getBarcode(){
      return barCode;
      }
    
  public String getZIPcode(){
      return zipCode;
      }
}//end of class
    
    
