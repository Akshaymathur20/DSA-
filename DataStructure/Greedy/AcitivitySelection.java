class AcitivitySelection{
    public static void main(String[] args) {
        
        //we will take 
        int start[]={ 1, 3, 0, 5, 8, 5 };
        int end[]={ 2, 4, 6, 7, 9, 9 };


        int n = start.length;
        int m = end.length;

        solve(start, end, n);
    }

    //if the finish time is sorted
    static void solve(int start[],int end[],int n){

        int i ,j;
       i=0;

       System.out.println("Acitivites that are selected");
       System.out.print(i+ " ");  //"first one"

       for(j=1;j<n;j++){

        //activity has start time greater or equal than tot hte finish tie of previous seleted activity than we will select it
          if(start[j]>=end[i]){
            System.out.print(j+ " ");
            i=j;
          }
       }

       //TC-> O(n) Space->O(1);
    }
}