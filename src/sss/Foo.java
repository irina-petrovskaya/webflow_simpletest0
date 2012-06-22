package sss;

import java.io.Serializable;

/**
 * by Irina.Petrovskaya, on 15.06.12, 18:40
 */

public class Foo implements Serializable {
    
    public String returnGreeting(String name){
        return "hello "+name;
    }
}
