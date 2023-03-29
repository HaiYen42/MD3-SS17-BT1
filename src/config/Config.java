package config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Dạng generic<>--> Tham số hóa kiểu dữ liệu
public class Config<T> {
    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    //Tạo ra 2 phương thức readFile và writeFile
    public List<T> readFile(String pathName) {
        List<T> list = new ArrayList<>();
        File file = new File(pathName);

        try {
            if (!file.exists()) {
                file.createNewFile();

            }
            FileInputStream fileInputStream = new FileInputStream(file);
//           if (fileInputStream.available()!=0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<T>) objectInputStream.readObject();
            System.out.println(file.getAbsolutePath());
            fileInputStream.close();
            objectInputStream.close();
//           }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
        } catch (IOException e) {
            e.getStackTrace();
//           System.err.println("fffffIOException");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Exception");
        }
        System.out.println("lisst " + list);
        return list;
    }

    public void writeFile(String pathName, List<T> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("");
        } catch (IOException e) {
            System.err.println("");
        }
    }
}
