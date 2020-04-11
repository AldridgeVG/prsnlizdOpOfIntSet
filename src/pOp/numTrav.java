package pOp;

public class numTrav {

    public static void traverseN(int n, numElem[] N){
        int i;
        try {
            if(N == null) {
                System.out.println("N is NULL");
            }
            else{
                for (i = 1; i <= n; i++) {
                    if(N[i] == null)
                        System.out.println("error occurs at "+i);
                    else
                        System.out.println(N[i].num + " " + N[i].head.num + "     ");
                }
            }
        }catch (Exception NullPointerException){System.out.println("N could be null");}
        return;
    }
}
