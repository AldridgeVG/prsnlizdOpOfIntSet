package pOp;

public class numOp {

    public static void op1(int x, int y, numElem[] N){

        int y1 = N[y].head.num;

        //if x has no child, remove x and set 0, attach to y's group head;
        if(N[x].head.nxt == null){

            //signify x is now in y's list
            N[x].num = 0;
            N[x].head.num = y1;

            //attach numNode x(new) to linked list y
            numNode p = new numNode(x);
            p.nxt = N[y1].head.nxt;
            N[y1].head.nxt = p;
        }

        //if x has child, attach x's whole linked list to y
        else{

            //find tail of x's linked list
            numNode tmp = N[x].head.nxt;
            N[x].num = 0;
            N[x].head.num = y1;
            N[x].head.nxt = null;
            while(tmp.nxt != null){
                tmp = tmp.nxt;
            }

            //attach tmp list to y's head
            tmp.nxt = N[y1].head.nxt;
            N[y1].head.nxt = N[x].head.nxt;
        }
        return;
    }

    public static void op2(int x, numElem[] N){

        //if x is a single set
        if(N[x].num == x && N[x].head.nxt == null){
            return;
        }

        //if x is in other set(including x)
        else if(N[x].num == 0){

            //delete x from origin list
            int xold = N[x].head.num;
            numNode p = N[xold].head;
            numNode q = p;
            while(p.num!=x){
                q = p;
                p = p.nxt;
            }
            //found x-node as p
            q.nxt = p.nxt;
            p = null;

            //restore x
            N[x].num = x;
            N[x].head = null;
            N[x].head = new numNode(x);
        }
    }

    public static int op3(int x, numElem[] N){

        int xgrp = N[x].head.num;
        int count = 1;
        numNode p = N[xgrp].head;
        while(p.nxt!=null){
            count++;
            p = p.nxt;
        }
        return count;
    }
}
