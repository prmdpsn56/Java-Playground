import Abstract.Animal;
import Abstract.CatBark;
import Abstract.DogBark;
import Abstract.RecipeOne;
import Array.StringRunner;
import Array.StudentRunner;
import Interface.*;
import Shape.Rectangle;
import calculator.SimpleInterest;
import coollections.Student;
import customer.Address;
import customer.Customer;
import generics.LearningGenerics;
import inheritance.Employees;
import nested.Conditional;
import number.Operations;
import number.TestOperation;
import oops.Fan;
import vehicle.MotorBikeRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import static com.sun.tools.javac.main.Option.X;

public class Main {
    public static void main(String[] args) {
//        MotorBikeRunner ducati = new MotorBikeRunner();
//        MotorBikeRunner honda = new MotorBikeRunner(100000);
//        ducati.setTopSpeed(120);
//        honda.setTopSpeed(100);
//        System.out.printf("%d",ducati.getTopSpeed()).println();
//        System.out.printf("%d",honda.getTopSpeed()).println();
//        ducati.increaseSpeed(20);
//        System.out.printf("%d",ducati.getTopSpeed()).println();
//        ducati.start();
//        honda.start();
//        SimpleInterest SI = new SimpleInterest("1000","7.5");
//        System.out.println(SI.calculateTotalValue(5));
//        ifelseconditions.conditionalCheck();
//        Conditional ifElseConditions =  new Conditional();
//        Scanner scanner =  new Scanner(System.in);
//
//        System.out.println("Please enter your desired first number  -  ");
//        int number1 = scanner.nextInt();
//        System.out.println("Please enter your desired second number  -  ");
//        int number2 =scanner.nextInt();
//        System.out.println("choose magic Operation number");
//        int operation = scanner.nextInt();
//
//        ifElseConditions.conditionalCheckSwitch(operation,number1,number2);
//        String result = ifElseConditions.checkTernary(10);
//        System.out.println(result);
//        operations.sumUptoN();
//        operations.sumOfDivisors();
//        operations.printTriangle();
//        Operations operations = new Operations(10);
//        operations.checkWhile();
//        operations.checkDoWhile();
//
//        LocalDate myObj = LocalDate.now(); // Create a date object
//        System.out.println(myObj.getYear());
//        int[] Marks = new int[]{33,11,44,11};
//        StudentRunner param = new StudentRunner("Paramdeep",Marks);
//
//        param.addMark(100);
//
//        System.out.println(param.getTotalMarks());
//        System.out.println(param.getMaximumMarks());
//
//        BigDecimal averageMark = param.getAveragemark();
//        System.out.println(averageMark);
//        System.out.println(param);
//        param.removeMarkAtIndex(1);
//        System.out.println(param);
//        StringRunner stringRunner = new StringRunner();
//        stringRunner.printInReverse();
//        String result = stringRunner.printingFunction();
//        System.out.println(result);
//            Fan newFan = new Fan("orient",4,"white");
//            System.out.println(newFan);

//        Rectangle rectangle = new Rectangle(10,20);
//        System.out.println(rectangle);


//        Address homeAddresss = new Address("Mader ln","Delta","1234");
//        Address workAddresss = new Address("Mader ln 1","delta","12345");
//        Customer customer = new Customer("Param",workAddresss,homeAddresss);
//
//        System.out.println(customer);

//
//        Employees employee = new Employees("","","","");
//        employee.setEmail("singhparamdeep95@gmail.com");
//        employee.setPhone("7788391634");
//        employee.setName("Paramdeep");
//        employee.setEmployeeGrade('A');
//        employee.setTitle("Developer");
//        employee.setSalary(new BigDecimal(123123));
//        employee.setEmployerName("Cognizant");
//
//        employee.overridingTest();
//        System.out.println(employee.toString());
//
//        RecipeOne receipeOne = new RecipeOne();
//        receipeOne.execute();

//        GamingConsole[] games = {new MarioGame(), new ChessGame()};
//        for (GamingConsole game: games) {
//            game.up();
//            game.down();
//            game.right();
//            game.left();
//        }


//        TestOperation testOperation = new TestOperation(10);
//        testOperation.testMethod();
//
//        Operations operations = new Operations(10);
//
//        ComplexAlgo algo = new DummyAlgorithm();®®®
//        System.out.println(algo.complexAlgorithm(10,20));
//
//            Animal[] animals = {new DogBark(),new CatBark()};
//            for(Animal object: animals){
//                object.bark();
//
//        List<Student> students = List.of(new Student(1,"Paaram"),new Student(200,"param jr"),new Student(3, "Param Another JR"));
//
//        List<Student> studentsAl = new ArrayList<>(students);
//
//        System.out.println(students);
//        System.out.println("----------------");
//        Collections.sort(studentsAl);
//        Collections.sort(students);
//        System.out.println(studentsAl);

        LearningGenerics<String> genericsString =  new LearningGenerics();
        LearningGenerics<Integer> genericsString2 =  new LearningGenerics();

        genericsString.addElement("Param");
        genericsString.addElement("Arvind");

        genericsString2.addElement(1);
        //THey both are the same thing
        genericsString2.addElement(Integer.valueOf(100));
        genericsString2.getElement(1);


        }
    }

