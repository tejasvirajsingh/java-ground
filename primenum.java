public class primenum {
    public static void main(String args[])
    {
        int i , m=0, count=0 ;
        int  n = 76;
        m= n/2;
        if(n==0 || n ==1){
            System.out.println(n+ "is not prime number");

        }
        else{
            for (i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n+ "is not prime number");
                    count =1;
                    break ;
                }
            }
            
            if(count==0) {
                System.out.println(n + "is prime number");

            }
        }

    }
}
