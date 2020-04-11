package pOp;

public class numElem {
    public static int cnt = 0;
    public int num;
    public numNode head;

    public numElem(){
        num = cnt++;
        head = new numNode(num);
    }
}
