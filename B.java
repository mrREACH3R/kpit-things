
public class B {

     int accNumber;
     String name;
     String address;

     B(int ac,String nam,String add){
       ac=accNumber;
       nam=name;
       add=address;
     }

     void show(){
      System.out.println("Acc no is :"+accNumber);
      System.out.println("Name: "+name);
      System.out.println("address"+address);
     }

public static void main(String[] args) {
   
   B obj=new B(10,"Shubham","Pune");

   obj.show();
}
     
}

