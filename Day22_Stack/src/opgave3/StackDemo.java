package opgave3;

public class StackDemo {
    public static void main(String[] args) {
        NodeDropOutStack nodeStack = new NodeDropOutStack(5);
        nodeStack.push("Lukas");
        nodeStack.push("Mads");
        nodeStack.push("Magnus");
        nodeStack.push("Jeppe");
        nodeStack.push("Mikkel");
        nodeStack.print();
        nodeStack.push("Sidsel");
        nodeStack.print();

        System.out.println();

        ArrayDropOutStack arrayStack = new ArrayDropOutStack(5);
        arrayStack.push("Lukas");
        arrayStack.push("Mads");
        arrayStack.push("Magnus");
        arrayStack.push("Jeppe");
        arrayStack.push("Mikkel");
        arrayStack.print();
        arrayStack.push("Sidsel");
        arrayStack.print();

        System.out.println();

        NodeDoubleDropOutStack nodeDoubleStack = new NodeDoubleDropOutStack(5);
        nodeDoubleStack.push("Lukas");
        nodeDoubleStack.push("Mads");
        nodeDoubleStack.push("Magnus");
        nodeDoubleStack.push("Jeppe");
        nodeDoubleStack.push("Mikkel");
        nodeDoubleStack.print();
        nodeDoubleStack.push("Sidsel");
        nodeDoubleStack.print();
    }
}