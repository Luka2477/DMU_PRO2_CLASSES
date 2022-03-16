package opgave1;

import java.io.*;

public class App {

    public static void main(String[] args) {
        MyTime myTime = null;

        try (FileInputStream fileIn = new FileInputStream("day14_serialization/src/opgave1/data/data.ser")) {
            try (ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
                Object obj = objIn.readObject();
                if (obj instanceof MyTime) {
                    myTime = (MyTime) obj;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        assert myTime != null;
        myTime.increase();
        myTime.increase();
        myTime.increase();
        System.out.println(myTime.getTime());

        try (FileOutputStream fileOut = new FileOutputStream("day14_serialization/src/opgave1/data/data.ser")) {
            try (ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(myTime);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
