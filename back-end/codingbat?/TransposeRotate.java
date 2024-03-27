public class TransposeRotate {
    int[][] matrix;
    public TransposeRotate(int[][] is){
        matrix = is;
    }
    public TransposeRotate(){
    }
    public String toString() {
        String temp = "\n";
        for (int i = 0; i < matrix.length; i++) {
            temp+="| ";
            for (int j = 0; j < matrix[i].length; j++) {
                temp += matrix[i][j];
                if (j < matrix[i].length - 1) {
                    temp += " ";
                }
            }
            temp += " |\n";
        }
        return temp;
    }
    public TransposeRotate transpose(TransposeRotate m) {
        int[][] transposed = new int[m.matrix[0].length][m.matrix.length];
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                transposed[j][i] = m.matrix[i][j];
            }
        }
        return new TransposeRotate(transposed);
    }

    public TransposeRotate rotate(TransposeRotate m){
        int[][] rotated = new int[m.matrix[0].length][m.matrix.length];
        int jcol;
        for (int i=0; i<m.matrix.length; i++){
            jcol=2;
            for ( int j=0; j<m.matrix.length; j++){
                rotated[i][j] = m.matrix[i][jcol];
                jcol--;
            }
        }
        return new TransposeRotate(rotated);
    }
    public static void main(String[] args) {
        TransposeRotate m = new TransposeRotate();
        System.out.println(new TransposeRotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        TransposeRotate array = m.transpose(new TransposeRotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(m.rotate(array));
    }
}
