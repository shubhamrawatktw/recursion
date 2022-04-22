public class digits {

    public static int printDigit(int n) {
        if (n==0) {
            return 0;
        }
        int small = printDigit(n/10);
        int ans =small +1;
        return ans;
    }
    public static void main(String[] args) {
        int output = printDigit(15645);
        System.out.println(output);
    }
}
