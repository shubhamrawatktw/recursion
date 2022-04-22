public class Sorted {
    
public static boolean checkSorted(int input[]) {
    if (input.length<=1) {
        return true;
    }
    if (input[0]>input[1]) {
        return false;
    }
    int smallArr[] = new int[input.length-1];
    for (int i = 1; i < input.length; i++) {
      smallArr[i-1] = input[i];
    }
    
    boolean smallAns=checkSorted(smallArr);

    return smallAns;
}
    public static void main(String[] args) {
    int input[] = {2,2,4,5,6};
    System.out.println(checkSorted(input));    
    }
}
