package kim.andy;

import java.util.Arrays;

/**
 * Created by andykim on 2/22/17.
 */
public class MyArrayList<T> {

    public MyArrayList(){}

    private Object[] elements;

    private int realSize = 3;

    public MyArrayList(int size){
        elements = new Object[size];
    }

    public Object get(int index) throws Exception {
        if (index < realSize){
            return elements[index];
        }
        else {
            throw new Exception("out of bounds");
        }
    }

    public int size(){
        return realSize;
    }

    private void increaseSize(){
        Arrays.copyOf(elements, elements.length*2);
    }

    public void add(Object x){
       if (elements[realSize - 1] == null) {
           for (int i = 0; i < elements.length; i++) {
               if (elements[i] == null) {
                   elements[i] = x;
                   break;
               }
           }
       }
        else{
            increaseSize();
            elements[realSize++] = x;
            }
        }

    public void add(Object x, int index) throws Exception{
        if (elements[index] == null){
            elements[index] = x;
        }
        else throw new Exception("something's already there");
    }

    public void clear(){
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    public boolean isEmpty(){
        return elements == null;
        }


    }

















