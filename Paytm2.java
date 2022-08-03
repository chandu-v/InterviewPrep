public class Paytm2 {
    /**
MyStack : FILO
push()-->O(1)
pop()-->O(1)
isEmpty()

MyQueue : FIFO
enqueue()-->O(1)
dequeue()-->O(1)
isEmpty()
enqueue(1)
enqueue(2)
enqueue(3)
dequeue() -> return 1
enqueue(4)
dequeue() -> return 2
enqueue(5)
dequeue() -> return 3
dequeue() -> return 4
dequeue() -> return 5


s1 -> []

s2 -> [5,4]

1,2,3

class MyQueue {

    MyStack s1 = new MyStack();
    MyStack s2 = new MyStack();

    public void enqueue(int element) {
        s1.push(element);
    }
    
    public int dequeue() {
        if(this.isEmpty()) return -1;
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.pop();
        } else {
            return s2.pop();
        }
    }

    public boolean isEmpty() {
        return (s1.isEmpty() && s2.isEmpty())
    }

}


final class MySingleton {

    private static MySingleton instance;

    private MySingleton() {}

    public static MySingleton getInstance() {
        if(instance != null) return instance;
        synchronized {
            if(instance == null) {
                instance = new MySingleton();
            }
            return instance;
        }

    }

}

class TestClass {


    public static void main(String [] args) {

        MySingleton singletonOne = MySingleton.getInstance();
        MySingleton singletonTwo = MySingleton.getInstance();
        
    }
}


class Node {
	int value;
	Node next;
}

L1:    5->6->7
L2: 1->0->8->3
———————
L3: 1->6->5->0

Node findSumOfLinkedLists(Node L1, Node L2){

    int n1 = findInteger(L1);
    int n2 = findInteger(L2);
    int result = n1 + n2;

}

Node convertToList(int n) {
    //1650 -
    Node nextNode = new Node();
    Node temp;
    while(n != 0) {
        int rem= n%10;
        temp = new Node(rem);
        temp.next = nextNode.next;
        nextNode.next = temp;
        n = n/10;
    }
    // [1]
    // nextNode ->[1]-> [6]-> [5] -> [0] -> null
    //nextNode -> [0]->null
    return nextNode.next;
}

int findInteger(Node node) {

    int sum = 0;
    while(node != null) {
        sum = (sum*10)+node.value;
        node = node.next;
    }

    return sum;
}


     */


}
