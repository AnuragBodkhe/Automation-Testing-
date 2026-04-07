package nonfunctional;

import org.testng.annotations.Test;

public class LoadTest2 {
    @Test
    void simulateLoad() {
        for(int i=0;i<1000;i++) System.out.print("");
    }
}