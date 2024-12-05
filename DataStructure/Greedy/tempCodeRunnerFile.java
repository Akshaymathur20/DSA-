public class AcitivitySelection{
    public static void main(String[] args) {
        
        //we will take 
        int start[]={1,2,4,6,5,8};
        int end[]={3,5,6,7,8,9};


        int n = start.length;
        int m = end.length;

        solve(start, end, n);
    }

    static void solve(int start[],int end[],int n){

        int i ,j;
       i=0;

       for(j=1;j<n;j++){
          if(start[j]>=end[i]){
            System.out.print(j+ " ");
            i=j;
          }
       }

       System.out.println("Acitivites that are selected");

    //    i=0;
       System.out.print(i+ " ");

    }
}