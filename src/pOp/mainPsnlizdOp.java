package pOp;

import java.util.Scanner;

public class mainPsnlizdOp {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        //get n ENSURES n<=10000
        int n = -1;
        while (n>10000 || n<0){
            n = in.nextInt();
        }
        System.out.println("n = "+n);

        //init array
        numElem[] N = new numElem[n];
        System.out.println("array initialization successful");
        int end = 1;
        int x = 0;
        int y = 0;

        in.nextLine();
        //loop op
        while(end != 0) {

            //input command
            String commandOp = in.nextLine();
            System.out.println("ur command: "+commandOp);

            //analyze command
            String splitOp[] = commandOp.split(" ");
            System.out.println(splitOp[0]+splitOp[1]);

            end = new Integer(splitOp[0]).intValue();
            if(end == 0) break;

            else if(end == 1){
                x = new Integer(splitOp[1]).intValue();
                y = new Integer(splitOp[2]).intValue();
                numOp.op1(x,y,N);
            }

            else if(end == 2){
                x = new Integer(splitOp[1]).intValue();
                numOp.op2(x,N);
            }

            else if(end == 3){
                x = new Integer(splitOp[1]).intValue();
                System.out.println(numOp.op3(x,N));
            }
        }
        return;
    }

}
