package tilab.facerecogniser;

import java.io.IOException;
import java.util.Random;

public class main {

    public static void main(String[] args) throws IOException {
//        FaceList theList = new FaceList();
//
//        Reader reader = new Reader();
//        
//        int[][] faceMat = new int[0][0];
//        
//        reader.readFiles(faceMat);
//      
        int[][] A = {{4, 3}, {2, 1}};
        int[][] B = {{1, 2}, {1, -2}};

        RandomMatrix rand = new RandomMatrix();
        
        double[][] C = rand.multiplicator(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + ", ");
            }
            System.out.println("");
        }

    }

}
