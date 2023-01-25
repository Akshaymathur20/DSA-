import java.util.Scanner;


// Question- "Remove the given character from the word";

public class Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String  p = sc.nextLine();
        // String up = sc.nextLine();
        // char dekh = sc.next().charAt(0);
        // skip("", up,dekh);

       System.out.println(skipNotApple("bacappcdah")); 
    }

    // static void skip(String p, String up,char dekh){

    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch = up.charAt(0);
    //     if(ch=='a'){
    //         skip(p, up.substring(1),dekh);
    //     }else{
    //         skip(p+ch,up.substring(1),dekh);
    //     }
    // }

    // static String skip(String up){

    //     if(up.isEmpty()){
    //         return " ";
    //     }

    //     char ch = up.charAt(0);
    //     if(ch=='a'){
    //        return skip( up.substring(1));
    //     }else{
    //        return ch+skip(up.substring(1));
    //     }
    // }

    // static String skipApple(String up){

    //     if(up.isEmpty()){
    //         return " ";
    //     }

    //     if(up.startsWith("apple")){
    //        return skipApple( up.substring(5));
    //     }else{
    //        return up.charAt(0)+skipApple(up.substring(1));
    //     }
    // }

    static String skipNotApple(String up){

        if(up.isEmpty()){
            return " ";
        }

        if(up.startsWith("app")&& !up.startsWith("apple")){
           return skipNotApple( up.substring(5));
        }else{
           return up.charAt(0)+skipNotApple(up.substring(1));
        }
    }

}
