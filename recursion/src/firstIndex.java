public class firstIndex {
    public static int first(int input[],int n, int startIndex) {
        if (startIndex >= input.length) {
            return -1;
        }
        if (input[startIndex] ==n) {
            return startIndex;
        }
        int ans = first(input, n, startIndex+1);
        return ans;
    }
    public static void main(String[] args) {
        int input[] = {9,4,8,2,8};
        int n = 8;
        int output =first(input, n, 0);
        System.out.println(output);
    }
}
