
class Basic {
    public static void main(String[] args) {
        System.out.println("<<<<----Operators---->>>>");
        System.out.println();

        //BitWise OR
        System.out.println("BitWise OR");

       int a = 3;              //00000011
       int b = 5;              //00000101
       
       int result = a | b;     //00000111 --> 7
       System.out.println(result);


        //BitWise AND
        System.out.println();
        System.out.println("BitWise AND");

       int c = 3;              //00000011
       int d = 5;              //00000101

       int result1 = c & d;     //00000001 --> 1
       System.out.println(result1);


        //BitWise XOR
        System.out.println();
        System.out.println("BitWise XOR");

       int e = 3;              //00000011
       int f = 5;              //00000101

       int result2 = e ^ f;     //00000110 --> 6
       System.out.println(result2);


        //Left Shift Operator
        System.out.println();
        System.out.println("Left Shift Operator");

          int num = 2;             //00000010
          int result3 = num<<2;    //000001000--> 8
       System.out.println(result3);
    }
    
}
