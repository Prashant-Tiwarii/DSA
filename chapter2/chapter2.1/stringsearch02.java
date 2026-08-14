import java.util.*;

public class stringsearch02 {
    public static void main(String[] args) {
        
    
    String str = "prashant";
    char ch = 'a';
    System.out.println(Arrays.toString(str.toCharArray()));
    System.out.println(search(str, ch));
    
}
// static boolean search2(String str ,char ch){
//      if(str.length()==0){
//             return false;
//     for(char ch : str.toCharArray()){
//         if(ch == target){
//             return true;
//         }
       
        //}

   // }

//}
static int search(String str, char ch){
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == ch){
            return i;
        }
    }
    return -1;
}
}