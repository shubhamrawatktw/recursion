public class power {
public static int calpower(int x, int n) {
    if (x==0 && n==0) {
        return 1;
    }
    if (n==0) {
        return 1;
    }
  int ans = calpower(x, n-1); 
return x * ans;
   
}

    public static void main(String[] args) {
        int output = calpower(3, 4);
        System.out.println(output);
    }
}
