
public class overloadMethod {
	
public void area(int l,int b)
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

overloadMethod ob=new overloadMethod();
       ob.area(10,12);
       ob.area(10);  
   }
}
