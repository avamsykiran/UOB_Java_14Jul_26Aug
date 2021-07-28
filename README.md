Java SE
---------------------------------------------------------------------------------

    Evolution

            Java 1.1

            Java 1.2            Java2
            Java 1.3
            Java 1.4

            Java 1.5
            Java 1.8
            Java 1.11

            JRE         Java Runtime Env
                            JVM     Java Virtual Machine
                            JIT     Just In Time Compiler
                            GC      Garbbage Collector
                            Supporting Classes

            JDK         Java Dev Kit
                            JRE ...
                            Java Tools
                                javac
                                java
                                jar
                                ....etc
                            JSE Libraries
            
            JSE + JEE + JME

            platform = Hardware + OS 

            .class is only platform independent
            .jar are also platform independent because they are a pack of .class file only.

    Features and Characteristics

            1. Case Sensitive
            2. A statement can span into any number of lines of code but must be terminated with a ;
            3. Whitespace are ignored
            4. a block of statements should lie in between { and a }
            5. strongly typed and type safe

            1. Simple
            2. High Level Strictly but Partially Object Orietned Language
            3. Robust
            4. MultiThreaded
            5. Distributed
            6. Platform Independent
            7. Archetecture Neutral
            8. Self Documented.

    Tokens and Coding Standards

        A Token is the atomic part of a piece of source code.

       
        Identifiers

                Name of Variable and Methods
                    must follow camelCase

                    length
                    boxLength
                    boxLengthInMeter

                    display()
                    displayData()
                    displayAllData()

                Name of User Defiend Data types (Classes, interfaces, Enums, Annotations)
                    must follow PascalCase

                    Exception
                    InputStream
                    ArrayIndexOutOfBoundsException

                Name of Constants
                    all capitals

                    PI
                    MIN_VALUE
                    MAX_VALUE

                Name of Packages
                    package names are short lower incase and mostly are abrevated

                    java
                    java.lang
                    java.util
                    java.io
                    java.nio ...etc

        Keywords
                    reserved words

        Operators
                    Binary Operators
                        Arithemtic
                            +   sum
                            -   differenbce
                            *   product
                            /   quitiont        7/3 ---> 2
                                                7.0/3 ----> 7/3.0 ---> 7.0/3.0 ----> 2.33
                            %   reminder

                        Assignment
                            =               a = b;      b's value is assigned to a
                            +=              a += b;     a = a + b ;
                            -=
                            *=
                            /=
                            %=

                        Relational
                            ==         is equals to
                            <          is less than
                            >          is greater than
                            <=         is less than or equals to
                            >=         is greater than or equals to
                            !=         is not equals to

                        Logical
                            &&          and
                            ||          or
                            !           not

                    Unary Operators
                            unary minus
                                b = -5;
                                a = -b;  //the value of a will be 5

                            increemnt       ++

                                a = 5;
                                a++;    //post increment    a will be 6
                                ++a;    //pre increment     a will be 7

                                b = a++; //b will be 7 and a will be 8
                                c = ++a; //c will be 9 and a will be 9

                            decrement       --

                                b = a--; //b will be 9 and a will be 8
                                c = --a; //c will be 7 and a will be 7

                    Ternary Pair Operators

                                variable = boolean_expression ? value_if_true : value_if_false ;

                                g = a>=b?a:b;
                                g = a>=b?(a>=c?a:c):(b>=c?b:c);

                    Bitwise Operators

                            &       bitwise and
                            |       bitwise or
                            ^       bitwise xor (exlusive or)
                            >>      right shift
                            <<      left shift

                    Misc Operators

                            ;       line tgermiantor
                            .       membership/reference operators
                            {}      blocvk operators
                            ()      methiod call or expression block operators
                            []      array base operators
                            ::      scope resolution operator
                            ...     epsilon - var args operator


        Comments
                    //end of line comm1ents
                    /* block comments */ 

        Literals

            are hard-coded values.

            String                  "this is a string"
            Character               '$','A','7'
            Integer                 
                    Decimal         1,2,3,4,5,6,7,8,9,0
                                    int population=25_15_00_000;
                    HexaDecimal     0x12
                    Octal           01

            Floating Point          3.14
            Boolean                 true    false
            Void Leteral            null

            class Dummny{
                public static void main(String a[]){
                    double r = 2.5;
                    final double PI = 3.14;
                    double c = 2*PI*r;
                }
            }

            identifier      Dummy,main,String,a,r,PI,c
            keywords        double, final, class,public,static,void
            operator        {},(),[],=,;,*
            comments        none
            Literals        2.5, 3.14, 2

    Language Fundamentals
        Primetive Data Types
                        byte
                        short
                        int
                        long

                        double
                        float

                        char
                        boolean
                        void

        User Defiend Data Types
                        class
                        enum
                        interface
                        annotation
                
        Control Structures

                        Sequential Flow        
                        Selective Flow
                        Iterative Flow

                        control structures are sued to convert sequential flow into
                        selective flow or iterative flow.


                        Branching / Decision Making Control Structures (Offer Selective Flow)

                            if
                                simple if
                                if..else
                                if..ladder

                            switch

                        Loops (Iterative Flow)

                            for(initialization;cond;inc/dec){
                                ........................
                            } //a entry-check loop or pre-conditioned loop and definite loop

                            while(cond){
                                ...............................
                            } //a entry-check loop or pre-conditioned loop and indefinite loop

                            do {
                                .................................
                            }while(cond); //a exit-check loop or post-conditioned loop and indefinite loop

                            for(datatype ele:array){
                                ....do anything with the ele.....
                            }//enhanced for loop or forEach loop

                        Non-Condition Control Structures (Offer escape a flow)
                            break          is used to termiante a loop before the exit condition
                            continue       is used to skip an iteration of a loop     
                            return         is used to abort a function execution midway.

        Arrays
                is a homoginous linear collection of elements.

                index   is the position of an ele in the array, it is zero-based in java.

                datatype arraName[];
                datatype[] arrayName;

                arrNaem = new datatype[size];

                String[] names = new String[10];
                System.out.println(names[4]); //5th element

                double[] readings = new double[]{1.0,2.5,4.5,6.7,8.9,9.6}; //array initialization

                for(int i=0;i<readings.length;i++){
                    System.out.println(readings[i]);
                }

                for(double reading : readings){
                    System.out.println(reading);
                }


        Multi-dimenssioned Arrays

                int[][] matrix1 = new int[2][3];

                matrix1[0][0]=34;
                matrix1[0][1]=56;
                matrix1[0][2]=546;

                int[][][] threeDimdArray = new int[3][4][5];

        Jagged Arrays

                int[][] ja1 = new int[3][];

                ja1[0] = new int[5];
                ja1[1] = new int[3];
                ja1[2] = new int[10];

        OOPs and Packages

            Class and Object

                    a class is a user defiend data type.
                    represent   an entity
                                a model
                                a software component like DAO/Service/Controller/.........etc

                    through properties and behaviours of an entity
                    as fields and methods.

                    class Rectangle {
                        int length;
                        int breadth;

                        int area() {
                            return length*breadth;
                        } 

                        int perimeter() {
                            return 2*(length+breadth);
                        }
                    }

                    Object is an instance of a class (object is a variable of class type).

                    Rectangle r = new Rectangle();    

            Encapsulation

                    Data Hiding - providing indirect access to the fields and methods
                                to avoid operations that are not allowed or expected.

                    Access Specifiers
                            public    allowed to be accessed anywhere all thorugh the app.
                            protected allowed to be accessed only within the class and its sub-classes
                            private   allowed to be accessed only within the class 
                            default   allowed to be accessed anywhere all thorugh the package

                    class Employee {
                        private int empId;

                        public int getEmpId(){
                            return empId;
                        }

                        public void setEmpId(int x){
                            empId=x;
                        }
                    }

                    Employee e = new Employee();
                    e.setEmpId(67);
                    System.out.println(e.getEmpId());

                    class Rectangle {
                        private int length;
                        private int breadth;

                        public void setLength(int length){
                            this.length=length;
                        }
                        
                        public void setBreadth(int breadth){
                            this.breadth=breadth;
                        }

                        public int area() {
                            return length*breadth;
                        } 

                        public int perimeter() {
                            return 2*(length+breadth);
                        }
                    }

                    Rectangle r1 = new Rectangle();
                    Rectangle r2 = new Rectangle();
                    Rectangle r3 = new Rectangle();

                    r1.area(); //r1 is the current object of area()
                    r2.area(); //r2 is the current object of area()
                    r3.area(); //r3 is the current object of area()

                    'this' keyword
                    ------------------------------------

                            this is a reference used inside a method to access
                            the current object of that mehtod.


                    'toString()' method
                    -------------------------------------

                            double pi=3.14;
                            System.out.println(pi);

                            Rectangle r1 = new Rectangle();
                            System.out.println(r1);

                    constructor
                    --------------------------------------

                    declaration     informing the system that we are going to 
                                    need a memry bock of some naem and type
    
                    allocation      reserving some memory space to the givne variable name

                    initialization  storing a value to the variable immidiate after allocation

                    assignemnt      stroring a value to the variable.


                    int x;          declaration

                    x = 65;         allocation and assignemnt

                    x = 77;         assignment

                    int y=45;       declaration, allocation and initialization

                    Rectangle r1;   declaration

                    r1 = new Rectangle();   allocation and initialization

                    How to pass values to the fields of an object while initializing?

                        we can do it using the constructor.

                    a constructor is special function that gets executed 
                    immidiatly after the allaocation of an object.
                    the constructor is identified through two rules
                        1. the name of the constructor should exactly match with its class name
                        2. the constructor do not return any value (even not void).

            Polymorphisim

                poly-morphic
                multiple-existence of the same behaviour

                Multiply the below:

                        (a)     10          20
                        
                        (b)     ax+b        mx+c
                        
                        (c)     {1,2,3,4}   {4,5,6,7}

                        (d)     1   2       4   5   6
                                3   4

                 How many constructors can we have in a single class ?
                       as many as you want , as long as each of them have
                       a different type or count of arguments.

                        constructor has no args         default constructor
                        constructor has atleast 1 arg   paramatrized construcotr
                        constructor has atleast 1 arg   copy constructor
                        of the same class type   

                 Function or Constructor Overloading
                 -------------------------------------
                    two methods are said to be overlaoded if
                    1. they belong the same class or to a super and sub-class AND
                    2. they have the same name but differ in 
                        (a) no of args  (or)
                        (b) args type    (or)
                        (c) both no of args and arg type

                    class Citizen {
                        public Energy eat(Apple a) {
                            wash(a);
                            Energy e = new Energy();
                            Piece[] pcs = cut(a);
                            for(Piece p : pcs){
                                e.accumulate(chewAndSwallowing(p));
                            }
                            return e;
                        }

                        public Energy eat(IceCream ic) {
                            Energy e = new Energy();
                            while(!ic.isComplete()) {
                                e.accumulate(lick(ic));
                            }
                            return e;
                        }
                    }

                 Function Overriding
                 -------------------------------------
                    two methods are said to be overridden if
                    1. they belong to a super and a sub-class each AND
                    2. they have the same signature (returnType functionName(paramList))


            Inheretence 

                class Pen {
                    nib;
                    color;
                    barrel;
                    
                    //f1
                    write(Paper p){
                        /* very thin and bright */
                    }
                }

                class Marker extends Pen{
                    //f2
                    write(Paper p){
                        /* very thick and blotted */
                    }

                    //f3
                    write(WhiteBoard wb){

                    }
                }

                f1 and f3           overloading
                f1 and f2           overriding
                f2 and f3           overloading

                creating a new class from an existing class is called
                inheretence.

                The existing class 'Pen' is called super class
                the new class 'Marker' is called sub class

                Simple Inheretence
                        Super <--- Sub

                        Rectangle <--- Cuboid
                            l,b             l,b,h

                MultiLevel Inheretence

                    Super <---- Sub  <----- Sub ..etc.,

                    Employee  <---- Manager <---- Director <---- ManagingDirector

                Hyrarchial Inheretence
                                    |---Sub
                    Super   <-------|
                                    |---Sub

                                    |---- Manager
                    Employee <------|
                                    |---- ContractEmployee

                Multiple Inheretence        (is not supported in java)

                    Super <------|
                                 |----Sub
                    Super <------|

                    Camera <-----|
                                 |----SmartPhone
                    Telephone<---|

                Hybrid Inheretence      (multielvel + hyrarchial)


                                    |---- Manager  <---- Director <---- ManagingDirector
                    Employee <------|
                                    |---- ContractEmployee

                Constructor Chaining
                --------------------------------------------

                    on allocating an object to a class, its constructor is automatically executed.

                    on allocating an object to a sub-class, its super class constrctor followed by its construcotr are executed.

                'super' keyword
                ---------------------------------------------

                    super can be used to call the super class constructor from sub-class constructor.
                    super can also be used to call a overriden method from super class in its image of the sub-class.

                    class TestOne{
                        public String toString(){
                            return "testing one";
                        }
                    }
                    class TestTwo extends TestOne{
                        public String toString(){
                            return super.toString() + " testtwo also";
                        }
                    }

                'final' keyword
                ------------------------------------------------

                    final when applied on a local variable or field, then those variable will be constants.

                    final when applied on a method , those methods can no be overridden.

                    final when applied on a class, those classes can not be inhereted any more.
                
                'static' keyword
                --------------------------------------------------

                    static fields
                            non-static fields are called instance variables
                            static fields are called class variables

                            static variables/class variables are allcoated in a special memory called class-space, 
                            and only one copy of such variables are allocated commonly for all objects
                            of that class, whereas, instance variable/non-static fields are allocated
                            separtly for each object of class.

                            static members if are public also
                            can be accessed directly on the class name.

                    static methods

                            static emthods are also called class methods and can not access 
                            the non-static members directly or they can not refere to the this keyword.

                    static block

                        class Test{
                            static {
                                //this block of code gets executed when
                                // the its class gets accessed for the first time.

                                //a class cna have a maximum of only one static block.
                                //a static block executes only once for each application execution.
                            }
                        }

                    Why java constants are marked as 'public static final'?
                    ----------------------------------------------------------------

                        final is to make it as constant.
                        static ensure that only one copy of that cosntant is allcoated.
                        public makes it readable anywhere, and however it is not writable due to final
                                and hence public will do no harm.

                    MiniCaseStudy - D2H Operator - D@HSubscribersManagement
                    ------------------------------------------------------------------

                        GeneralSubscriber       subId,name,mobile,channelPack,monthlyFee
                            GoldenSubscriber        annualFee
                                PlatinumSubscriber         longTermFee,term
                            DataSubscriber          dataFee,dataLimit

            Abstraction

                means non-detail.

                is hiding the implementation detaisl of a method
                and only exposing the mehtod signature.

                Windows OS:     how to copy a file from one location to another?
                                    select source file, ctrl+c
                                    got to target place, ctrl+v

                                ---------OS-Shell---------------
                            a read from src file and a write into the target file 

                                reading from a HDD != reading from a CD != reading from an SD Card
                                writing from a HDD != writing from a CD != writiing from an SD Card

                Abstract Functions
                -------------------------------

                    an abstract function can not have implementation.
                    it has only signature.

                Abstract Class
                -------------------------------

                    is a class that can not have objects allocated.
                    And abstract classes can accomidate abstract functions.

                    Any sub-class of an abstract class is bound to provide
                    implementations for all the abstract methods in that abstaract class
                    failing which the sub-class also must be marked as abstract.

                Interface
                --------------------------------

                    is a user defined data type that represent a role
                    through its abstract behaviours.

                    class can extedn only one class.
                    class can implemenet multiple interfaces

                    an interface can not have fields.

                    uniil java 8, interface can have only constants and public abstract methods
                    after java 8, interface can have only constants, public abstract methods 
                                    and method with implementation(default mehtods)
                    after java 11,interface can have only constants, public abstract methods 
                                    and method with implementation(default mehtods) and private methods

                    Animal                               Bird
                        |                                  |
                    ----------------                   --------------     
                    |              |                    |           |
                    MaleAnimal     FemaleAnimal         MaleBird    FemnaleBird


                    Father
                        protect()

                    Mother
                        giveBirth()

                    Sibling
                        share()

                    Animal and Bird abstract classes
                    MaleAnimal, FemalAnimal, MaleBird, FemaleBird are all classes
                    Father,Mother and sibling are interfaces

                    MaleAnimal extends Animal and implements Father,Sibling
                    FemaleAnimal extends Animal and implements Mother,Sibling

        java.lang Package

    Exceptions
    Threads
    IO Streams
    NIO Streams
    Generics and Collections
    Functional Interfaces, Method References and Lambda Expressions
    Streams API
    JDBC
    Multi-Threading
    Java 5 to 11 features.
    JUnit and Mockito
