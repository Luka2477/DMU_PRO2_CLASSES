package opgave1;

import java.io.*;

public class MyTime implements Serializable {

    private int time = 0;

    public void increase () {
        time++;
    }

    public void reset () {
        time = 0;
    }

    public int getTime () {
        return time;
    }

}