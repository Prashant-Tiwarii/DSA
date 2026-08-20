public class recurrsiontable04 {
    public static void main(String args[]) {
        int ans=printtable(5,1);
        System.out.println(ans);
    }

    static int printtable(int n,int m) {
        if(m>10) {
            return n*m;
        }
        return printtable(n,m+1);
    }
}