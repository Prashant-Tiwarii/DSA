//String is the most commonly used java class used in java.
//every string u create is a obj of type string.
//string pool is the separete memory structure inside the  heap memory structure.all the similar
//  value are not recreated , oncce creted will be stored in pool. another of same value will also point to that
public class String011 {
    public static void main(String args[]){
        String a=  "Prashant";
        String b = "Prashant";
        String c = "prashant";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b);
       // b==c;// cant be edited once created.STrinng are immutable in java.
       // but can new object can be created
       b= "tiwari";
        System.out.println(b);
        String e= new String("Shivi");// creted two object creted . outside of pool but in heeap/
        String f= new String("Shivi");
        System.out.println(e==f); //ye object compaere krta ha
        System.out.println(f.equals(e));// ye value compare krts h

    }
    
}
