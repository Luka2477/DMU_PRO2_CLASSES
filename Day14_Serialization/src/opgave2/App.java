package opgave2;

import java.io.*;

public class App {

    public static MyTime loadMyTime (String filePath) {
        MyTime myTime = null;

        try (FileInputStream fileIn = new FileInputStream(filePath)) {
            try (ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
                Object obj = objIn.readObject();
                if (obj instanceof MyTime) {
                    myTime = (MyTime) obj;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return myTime;
    }

    public static void saveMyTime (MyTime myTime, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            try (ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(myTime);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "day14_serialization/src/opgave2/data/data.ser";
        MyTime myTime = loadMyTime(filePath);
        //MyTime myTime = new MyTime();

        assert myTime != null;
        myTime.increase();
        myTime.increase();
        myTime.increase();
        myTime.saveTime();
        System.out.println(myTime.getTime());
        System.out.println(myTime.getTimes());

        saveMyTime(myTime, filePath);
    }

}
