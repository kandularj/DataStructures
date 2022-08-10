package com.package2;

import java.util.Arrays;

public class PriorityQueueUsingArray {

    //items should be inserted in ascending order in a priority queue
    private int[] items = new int[5];
    private int count;
    int i;

    public void add(int item){
        if(count == items.length)
            throw new IllegalStateException();

        //shifting items to right so that we can make space and insert new item
        shiftItemsToInsert(item);
        items[i+1] = item;
        count++;
    }

    private void shiftItemsToInsert(int item) {
        for (i = count - 1 ; i >= 0; i--){
            if(items[i] > item)
                items[i+1] = items[i];
            else
                break;
        }
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public String toString(){
        return Arrays.toString(items);
    }
}
