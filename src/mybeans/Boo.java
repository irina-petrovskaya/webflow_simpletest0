package mybeans;

import org.springframework.stereotype.Component;

/**
 * by Irina.Petrovskaya, on 22.06.12, 13:38
 */
@Component
public class Boo {
    public void log(String arg){
        System.out.println(arg);
    }
}
