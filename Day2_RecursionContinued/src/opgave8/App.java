package opgave8;

import java.io.File;

public class App {

    public static void ScanDir(String path) {
        System.out.println("[DIR]  "+path);
        // skab et File-objekt svarende til mappen path
        File file=new File(path);
        // få listen over alle filer og undermapper
        String[] names=file.list();
        assert names != null;
        for (String name: names) {
            File file2=new File(path+"/"+name);
            if (file2.isDirectory())
                ScanDir(path+"/"+name);
        }
    }

    public static int scanDirCount (String path) {
        int mapper = 1;

        // skab et File-objekt svarende til mappen path
        File file=new File(path);
        // få listen over alle filer og undermapper
        String[] names=file.list();
        assert names != null;
        for (String name: names) {
            File file2=new File(path+"/"+name);
            if (file2.isDirectory())
                mapper += scanDirCount(path+"/"+name);
        }

        return mapper;
    }

    public static void ScanDirPretty(String path, int indent) {
        System.out.println(indent+": [DIR]  "+path);
        // skab et File-objekt svarende til mappen path
        File file=new File(path);
        // få listen over alle filer og undermapper
        String[] names=file.list();
        assert names != null;
        for (String name: names) {
            File file2=new File(path+"/"+name);
            if (file2.isDirectory())
                ScanDirPretty(path+"/"+name, indent+1);
        }
    }

    public static void main(String[] args) {
        //ScanDir("C:\\Users\\Luked\\OneDrive\\Documents\\Datamatiker Uddannelse");
        //System.out.println(scanDirCount("C:\\Users\\Luked\\OneDrive\\Documents\\Datamatiker Uddannelse\\DMU_PRO2_CLASSES\\Day1_Recursion\\src"));
        ScanDirPretty("C:\\Users\\Luked\\OneDrive\\Documents\\Datamatiker Uddannelse", 1);
    }

}
