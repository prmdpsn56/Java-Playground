package nested;

public class Conditional {
    int i=25;
    public void conditionalCheck(int operationCode,int number1, int number2){
        if(operationCode == 1){
            System.out.printf("Addition Result %d",number1+number2).println();
        }else if(operationCode == 2){
            System.out.printf("Multiplication Result %d",number1*number2).println();
        }else if (operationCode == 3){
            System.out.printf("Division Result %d",number1/number2).println();
        }else {
            System.out.printf("Subtraction Result %d",number1-number2).println();
        }
    }

    public void conditionalCheckSwitch(int operationCode,int number1, int number2){
        switch (operationCode){
            case 1:
                System.out.printf("Addition Result %d",number1+number2).println();
                break;
            case 2:
                System.out.printf("Multiplication Result %d",number1*number2).println();
                break;
            case 3:
                System.out.printf("Division Result %d",number1/number2).println();
                break;
            case 4:
                System.out.printf("Subtraction Result %d",number1-number2).println();
                break;
            default:
                System.out.println("Please enter valid values for selecting an operation");
        }
    }

    public String checkTernary(int number){
        return number % 2 == 0? "Yes": "No";
    }
}
