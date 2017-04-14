import java.util.Scanner;
class GS{
private String gn;
 public void setName(String name){
 gn = name;
 }
public String getName(){
return gn;}
public void show(){
System.out.println("My first program of getter setter funtion" + getName());
}
}

class Get_Set{ public static void main(String args[]){
Scanner I= new Scanner(System.in);
System.out.println("Enter here");
GS g = new GS();
String T = I.nextLine();
g.setName(T);
g.show();
}}