public class Sum {
    public static int sum(int input[]) {
        int net =0;
        if (input.length<=0) {
            return 0;
        }
        if (input.length<=1) {
             net+= input[0];
             return net;
        }
        int[]smallArr = new int [input.length-1];
        for (int i = 1; i < input.length; i++) {
            smallArr[i-1] = input[i];
        }
        int smallAns =sum(smallArr);
          int ans = input[0] + smallAns;
          return ans;
    }

    public static void main(String[] args) {
        int input [] = {5,5,5,5,5,6};
        System.out.println(sum(input));
    }
}
