

public class Stringbuilder01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<26;i++){
char ch = (char)('a'+i);

System.out.print(ch + " ");
builder.append(ch);
    }
    System.out.println();
    System.out.println(builder);
   // System.out.println(builder.toString());
   builder.deleteCharAt(0);
    System.out.println(builder);
   builder.delete(1, 05);
   
   System.out.println(builder);
   builder.reverse();
    System.out.println(builder);
    
}
}
