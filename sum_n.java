public class sum_n {
   public static int sum(int n){
        if(n==0)  return 1;
        return n + sum(n-1);
    }


    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
