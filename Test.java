import java.io.*;
public class Test {

    public int sum(int n)
    {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i; 
        }
        return sum;
    }
    public static int lcm(int a, int b)
    {
        int i = Math.min(a,b);
        while(true){
            if(i%a==0 && i%b==0){
                break;
            }
            i++;
        }
        return i;
    }
    public static int hcf(int a, int b)
    {
        int h = Math.max(a,b);
        while(true){
            if(a%h==0&&b%h==0){
                break;
            }
            h--;
        }
        return h;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test obj = new Test();
        //System.out.println("n=");
        // int n = Integer.parseInt(br.readLine());
        // System.out.println(obj.sum(n));
        System.out.println(hcf(15,5));
    }
}