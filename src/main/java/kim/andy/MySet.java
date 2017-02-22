package kim.andy;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by andykim on 2/22/17.
 */
public class MySet <T> extends MyArrayList {

    Object[] set = new Object[3];

    public void AddnoRepeats(Object[] mySet, Object object){
        int currentPosition = 1;
        Object lastFound = mySet[0];
        for (int i = 0; i < mySet.length; i++){
                object = mySet[i];
            if (lastFound != object){
                lastFound = object;
                mySet[currentPosition++] = object;
            }
        }
        System.out.print(mySet);
    }

    public boolean contains(Object[] mySet, Object o){
        for (int i = 0; i < mySet.length; i++){
            return (mySet[i] == o);


        }
            return false;
    }

    


}
