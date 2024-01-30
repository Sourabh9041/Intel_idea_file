class Main{

    int a=5;
    int fact=1;

     int callFactorial(int a){

        if(a>1){
            fact=fact*a;          // a=5 and fact=1, so the value of fact will be 5.
            callFactorial(a-1); // The Method callFactorial will now call itself but will reduce the Value by 1 which is 4
                                  // It will continue till this a>1 condition fails.

        }
         return fact;        // it will return the factorial value

     }

    public static void main(String[] args) {
        Main main=new Main();
        main.callFactorial(main.a);
        System.out.println(main.fact); //We have to print the Value for factorial after creating th class object here
    }
}