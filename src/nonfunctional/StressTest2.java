package nonfunctional;

import org.testng.annotations.Test;

public class StressTest2 {
    @Test
    void stress() {
        for(int i=0;i<10000;i++) System.out.print("");
    }
}