package pOp;

public class numOp {

    public void myPOp(int i){
        switch (i){
            case 1:

        }
    }

    public void op1(int x, int y, numElem[] N){

        //if x has no child, remove x and set 0, attach to y head;
        if(N[x].head.nxt == null){

            //signify x is now in y's list
            N[x].num = 0;
            N[x].head.num = y;

            //attach numNode x(new) to linked list y
            numNode p = new numNode(x);
            p.nxt = N[y].head.nxt;
            N[y].head.nxt = p;
        }

        //if x has child, attach x's whole linked list to y
        else{

            //find tail of x's linked list
            numNode tmp = N[x].head.nxt;
            N[x].head.num = y;
            N[x].head.nxt = null;
            while(tmp.nxt != null){
                tmp = tmp.nxt;
            }

            //attach tmp list to y's head
            tmp.nxt = N[y].head.nxt;
            N[y].head.nxt = N[x].head.nxt;
        }

        return;
    }

    public void op2(int x, numElem[] N){

        //if x is a single set
        if(N[x].head.num == x || N[x].head.nxt == null){
            return;
        }
        else if(N[x].head.nxt != null){
            
        }
    }

}
