public class linkedList {
    private node rootNode;
    private int length;

    // No argument contructor
    public linkedList() {
    }

    public linkedList(node rootNode) {
        this.rootNode = rootNode;
    }

    public linkedList(int[] values) {
        createList(values);
    }

    // Creates a linkedList given an array of values
    public node createList(int[] values) {
        rootNode = new node(values[0]);
        length = values.length;
        iterateCreateList(values, 0, rootNode);
        return rootNode;
    }

    // Helper method for createList
    private static void iterateCreateList(int[] values, int indexOn, node currentNode) {
        if (indexOn < values.length - 1) {
            node nextNode = new node(values[indexOn + 1]);
            currentNode.setRightNode(nextNode);
            iterateCreateList(values, indexOn + 1, nextNode);
        } else {
            returnNode(currentNode);
        }
    }

    // helper method for iterateCreateList
    private static node returnNode(node node) {
        return node;
    }

    // Prints a list given root node
    public void printList() {
        System.out.println(rootNode.getValue());
        printList(rootNode.getRightNode());
    }

    // Helper method for printList
    private void printList(node node) {
        System.out.println(node.getValue());
        if (node.getRightNode() != null) {
            printList(node.getRightNode());
        }
    }

    // Acessor methods
    public int getLength() {
        return length;
    }

    // returns node at specific index
    public node getNode(int index) {
        node currentNode = rootNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getRightNode();
        }
        return currentNode;
    }

    // Add node to specified index
    public node addNode(node newNode, int index) {
        node addNode = newNode;
        node pushNode = getNode(index);
        node primaryNode = getNode(index - 1);
        addNode.setLeftNode(primaryNode);
        primaryNode.setRightNode(addNode);
        pushNode.setLeftNode(addNode);
        addNode.setRightNode(pushNode);
        return addNode;
    }

}
