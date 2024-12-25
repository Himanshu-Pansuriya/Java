public class PrimeNumber1to20 {
    public static void main(String[] args) {
        int i,count=0,b=0;
        for(int n=1;count<=20;n++){
            for(i=2;i<=n;i++){
                if(n%i==0){
                    b++;
                    if(b==0){
                        System.out.println(n);
                    }
                }
            }
            b=0;
        }
    }
}
