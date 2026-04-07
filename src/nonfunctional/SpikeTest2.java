package nonfunctional;

import org.testng.annotations.Test;

public class SpikeTest2 {
    @Test
    void spike() {
        for(int i=0;i<5000;i++) System.out.print("");
    }
}