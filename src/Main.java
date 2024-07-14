public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num=1000;
        float Flo=0.2879f;
        double duo = 170812637.7683296;
        System.out.println(duo);
        boolean a =true;
        System.out.println(a);
        int limit =10;
        int i;
        for(i=0;i<=limit;i++){
            if(i%2==0){
                System.out.println(i+"is an even number");
            }else if(i%2==1){
                System.out.println(i+" is a odd number");
            }else{
                System.out.println("enter valid number");
            }

        }
    }
}