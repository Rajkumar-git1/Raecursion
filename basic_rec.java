public class basic_rec {

    public static  void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);

    }
    // factorial
     static int fact(int n){
        if(n==0) return 1;

        return n*fact(n-1);
    }
    static String rev(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
// cheak palindrome
    

    public static void main(String[] args) {
        print(10);
        System.out.println(fact(4));
        System.out.println(rev("ABCDEFGH"));
    }
}
