/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;
import java.util.ArrayList;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class MyStack extends ArrayList<Object>{
    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object obj = get(size() - 1);
        remove(size() - 1);
        return obj;
    }

    public void push(Object obj) {
        add(obj);
    }


    @Override 
    public String toString() {
        return "Stack " + super.toString();
    }
}
