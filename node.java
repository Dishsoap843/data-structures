public class node {
    private node leftNode;
    private node rightNode;
    private int value;
    //No argument constructor
    public node(){}
    //Constructor just with value
    public node(int value){this.value = value;}
    //Full constructor
    public node(int value, node leftNode, node rightNode){this.value = value;this.leftNode = leftNode;this.rightNode = rightNode;}

    //Acessor methods
    public int getValue(){return value;}
    public node getLeftNode(){return leftNode;}
    public node getRightNode(){return rightNode;}
    //Mutator methods
    public int setValue(int newValue){value = newValue; return value;}
    public node setLeftNode(node newNode){leftNode = newNode; return leftNode;}
    public node setRightNode(node newNode){rightNode = newNode;return rightNode;}
    //Other Methods
    public static boolean isEqual(node compareNode1, node compareNode2){return compareNode1.getValue() == compareNode2.getValue();}
}
