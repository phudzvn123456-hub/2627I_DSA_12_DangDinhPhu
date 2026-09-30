import java.util.Scanner;

class chongdia{
    public int h1[];
    public int h2[];
    public int h3[];
    public static int sum(int h[]){
        int count=0;
        for(int i=0;i<h.length;i++){
            count+=h[i];
        }
        return count;
    }
    public static int ketqua(int h1[],int h2[],int h3[]){
        int i1=0,i2=0,i3=0;
        int sum1=sum(h1);
        int sum2=sum(h2);
        int sum3=sum(h3);
        while (true) {
            if (i1==h1.length || i2==h2.length || i3==h3.length){
                return 0;
            }
            if (sum1==sum2 && sum3==sum2) return sum2;
            if (sum1>=sum2 && sum1>=sum3){
                sum1-=h1[i1];
                i1++;
            }
            else if (sum2>=sum1 && sum2>=sum3){
                sum2-=h2[i2];
                i2++;
            }
            else if (sum3>=sum1 && sum3>=sum2){
                sum3-=h3[i3];
                i3++;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];

        for (int i = 0; i < n1; i++) {
            h1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            h2[i] = sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            h3[i] = sc.nextInt();
        }
        System.out.println(ketqua(h1, h2, h3));

        sc.close();
    }
}