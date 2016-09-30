import java.io.*;
import java.util.Scanner;

public class Matrix {
    public double[][] matrix;
    public static int CountRow() {
        int m = 0;
        try {
            FileReader fs = new FileReader("C:\\Users\\akili\\IdeaProjects\\Matrix\\Test.txt");
            BufferedReader bfs = new BufferedReader(fs);
            while (bfs.readLine() != null) {
                m++;
            }
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }
    public static int CountCol() {
        int n = 0;
        FileReader fs = null;
        try {
            fs = new FileReader("C:\\Users\\akili\\IdeaProjects\\Matrix\\Test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bfs = new BufferedReader(fs);
        try {
            Scanner sc = new Scanner(bfs.readLine());
            while (sc.hasNextDouble()){
                n++;
                sc.nextDouble();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
    public static void InMatr(){

    }
    public static void main(String[] args) {
        int m = CountRow();
        int n = CountCol();
        System.out.println(m);
        System.out.println(n);
    }
}


