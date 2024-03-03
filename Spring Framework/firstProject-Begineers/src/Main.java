import Abstract.Animal;
import Abstract.CatBark;
import Abstract.DogBark;
import Abstract.RecipeOne;
import Array.StringRunner;
import Array.StudentRunner;
import FunctionalProgramming.FunctionalProgramming;
import Interface.*;
import MultiThreading.AnotherThread;
import MultiThreading.CallableService;
import MultiThreading.ThreadBasics;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//import static com.sun.tools.javac.main.Option.X;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
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

//        LearningGenerics<String> genericsString =  new LearningGenerics();
//        LearningGenerics<Integer> genericsString2 =  new LearningGenerics();
//
//        genericsString.addElement("Param");
//        genericsString.addElement("Arvind");
//
//        genericsString2.addElement(1);
//        //THey both are the same thing
//        genericsString2.addElement(Integer.valueOf(100));
//        genericsString2.getElement(1);

//        FunctionalProgramming functionMethods = new FunctionalProgramming();
//        List<String> list = List.of("a","b","c");
//        List<Integer> listNumbers = List.of(10,21);
//        functionMethods.printElements(list);
//        functionMethods.printWithStream(list);
//        functionMethods.printWithFiltering(listNumbers);
//        Integer result = functionMethods.returnSum(listNumbers);
//        System.out.println(result);
//
//        System.out.println(List.of(1,2,3,4,5));

//        System.out.println("Task One Kicked Off");
//        ThreadBasics firstThread = new ThreadBasics();
//
//        firstThread.setPriority(10);
//        firstThread.start();
//
//        System.out.println("Task Two Kicked Off");
//        AnotherThread secondThread = new AnotherThread();
//        Thread thread2 = new Thread(secondThread);
//        thread2.setPriority(1);
//        thread2.start();
//        firstThread.join();
//        thread2.join();
//
//        Thread.sleep(10000);
//
//        System.out.println("Task Three Kicked Off");
//        for (int i = 301; i < 399; i++) {
//            System.out.print(i+" ");
//        }
//        System.out.println("Task 3: Done");
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//
//        executorService.execute(new ThreadBasics(1));
//        executorService.execute(new ThreadBasics(2));
//        executorService.execute(new ThreadBasics(3));
//        executorService.execute(new ThreadBasics(4));
//        executorService.execute(new ThreadBasics(5));

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableService> tasks = List.of(new CallableService("First callable"), new CallableService("Second service"));


        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        System.out.println("Main method");

        executorService.shutdown();


        }
    }

