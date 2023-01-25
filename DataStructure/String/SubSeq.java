import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
    //  System.out.println(  subSequence(" ", "abc"));
    System.out.println(subSeqAscii("", "a"));
    }

    // static void subSequence(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.print(p+" ");
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     subSequence(p+ch, up.substring(1));
    //     subSequence(p, up.substring(1));
    // }

    // static void subSeqAscii(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.print(p+" ");
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     subSeqAscii(p+ch, up.substring(1));
    //     subSeqAscii(p, up.substring(1));
    //     subSeqAscii(p+(ch+0), up.substring(1));
    // }

    static ArrayList<String> subSequence(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        char ch = up.charAt(0);

      ArrayList<String> left = subSequence(p+ch, up.substring(1));
      ArrayList<String> right = subSequence(p, up.substring(1));

      left.addAll(right);
      return left;
    }


    static ArrayList<String> subSeqAscii(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        char ch = up.charAt(0);

      ArrayList<String> first = subSeqAscii(p+ch, up.substring(1));
      ArrayList<String> second = subSeqAscii(p, up.substring(1));
      ArrayList<String> third = subSeqAscii(p+(ch+0), up.substring(1));

      first.addAll(second);
      first.addAll(third);
      return first;
    }
    
}
