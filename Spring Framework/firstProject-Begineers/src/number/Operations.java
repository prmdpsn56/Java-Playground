package number;

public class Operations {
    int myNumber;

    public Operations(int myNumber){
        this.myNumber = myNumber;
    }

     void sumUptoN(){
        int result = 0;
        for (int i = 0; i < myNumber; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public void sumOfDivisors(){
        int result = 0;
        for (int i = 1; i < myNumber ; i++) {
            if (myNumber%i==0){
                result +=i;
            }
        }
        System.out.println(result);
    }

    public void printTriangle(){
        for (int i = 0; i < myNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void checkWhile(){
        int i = 10;
        while ( i <= 5){
            System.out.println(i);
            i++;
        }
    }

    void checkDoWhile(){
        int i = 10;
        int j = i;
        System.out.println(i);
        System.out.println(j);
        i=11;
        System.out.println(j);
//        do{
//            System.out.println("do while");
//            System.out.println(i);
//        }while (i<5);
    }
}
