public class lambda {
    public static void main(String[] args) {
        var a1=new demo(){
            @Override
            public void sum(int a, int b) {
                System.out.println("Sum= "+(a+b));
            }
        };
        a1.sum(3,4);
        demo a2=(a,b)->{ System.out.println("Sum= "+(a+b));};
        a2.sum(3,4);
        demo a3=lambda::info;
        a3.sum(3,4);

    }
    private static void info(int a,int b){
        System.out.println("Sum= "+(a+b));
    }
    interface demo{
        void sum(int a,int b);
    }
}
