package Test;

import Model.User;
import Utils.ArrayIndexedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by LazEness on 10/12/2016.
 */
 public class ArrayIndexedListTest<E extends Comparable> implements Iterator {
    ArrayIndexedList<User> list = new ArrayIndexedList<User>();
    @Test
    public void add() throws Exception {
        list.add(new User("Sam", "pass1"));
        list.add(new User("Bob", "pass2"));
        list.add(new User("Jack", "pass3"));
        Assert.assertFalse(list.isEmpty());
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Test
    public void remove(){
        list.add(new User("Sam", "pass1"));
        list.add(new User("Bob", "pass2"));
        list.add(new User("Jack", "pass3"));

    }

    @Test
    public void contains() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

}
