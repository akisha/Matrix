import java.io.*;
import java.util.Scanner;

public class Matrix {
    public Matrix() {
        try {
            FileReader fs = new FileReader("C:\\Users\\akili\\IdeaProjects\\Matrix\\Test.txt");
            BufferedReader bfs = new BufferedReader(fs);
            int n = 0, m = 1;
            Scanner sc = new Scanner(bfs.readLine());
            while (sc.hasNextDouble()) {
                sc.next();
                n++;
            }
            while (bfs.readLine() != null){
                m++;
            }
            System.out.println(m);
            System.out.println(n);
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Matrix matr = new Matrix();
    }
}


