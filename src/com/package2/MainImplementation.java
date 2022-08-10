package com.package2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MainImplementation {

    /* array,stack,linkedlist,queue,priorityqueue all have predefined code ,
    we implemented it for understanding how the code works

        //Array code here
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(45);
        numbers.insert(55);
        System.out.println(numbers.indexOf(100));
        numbers.print();*/

    //LinkedList code here
        /*var list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        //list.removeLast();
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(20));
        System.out.println(list.size());
        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));*/

    //stack code here
        /*Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(stack);
        StringReverseUsingStack rev = new StringReverseUsingStack();
        System.out.println(rev.reverse("GOPI"));
        BalancedExpressions exp = new BalancedExpressions();
        System.out.println(exp.isBalanced(")1+2)"));*/

    //queue code here
    /*Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
    reverse(queue);
        System.out.println(queue);
}

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());

    }
    ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        //System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());

       //priority queue pre existing
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(12);
        pqueue.add(18);
        while (!pqueue.isEmpty())
            System.out.println(pqueue.remove());


        //priority queue using array code here
        PriorityQueueUsingArray queue = new PriorityQueueUsingArray();
        queue.add(5);
        queue.add(3);
        queue.add(9);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);//need to override toString method to print queue
        while(!queue.isEmpty())
            System.out.println(queue.remove());

        //HashMap using existing
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Roja");
        map.put(2,"Gopi");
        map.put(3,"floofy");
        map.containsKey(3); //O(1)
        map.containsValue("Gopi"); //O(n)
        System.out.println(map);

        //for iterations in maps use below
        // for(var item : map.entrySet())//entrySet gives list of key value pairs,
            //for(var item : map.keySet())// key set gives a list of keys

     */
}
