public class MatrixOperation {
    int[][] matrix;
    int row,column;

    public MatrixOperation() {
        row=3;
        column=3;
        matrix = new int[][] {{1, 2, 3}, {8, 9, 10}, {4, 5, 6}};
    }
    public MatrixOperation(int row,int column,int[][] arr){
        int r=row;
        int c=column;
        matrix = arr;
    }
    public MatrixOperation(int[][]arr){
        matrix = arr;
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
    public MatrixOperation addition(MatrixOperation m){
        int[][] arr = new int[matrix.length][matrix[0].length];
        for(int i=0; i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[i][j] = matrix[i][j]+m.matrix[i][j];
            }
        }
        return new MatrixOperation(arr);
    }
    public MatrixOperation subtraction(MatrixOperation m){
        int[][] arr = new int[matrix.length][matrix[0].length];
        for(int i=0; i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[i][j] = matrix[i][j]-m.matrix[i][j];
            }
        }
        return new MatrixOperation(arr);
    }
    public MatrixOperation multiplication(MatrixOperation m){
        int[][] arr = new int[matrix.length][m.matrix[0].length];
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<m.matrix[0].length;j++){
                int val = 0;
                for(int k=0;k<matrix[0].length;k++){
                    val+=matrix[i][k]*m.matrix[k][j];
                }
                arr[i][j]=val;
            }
        }
        return new MatrixOperation(arr);
    }
    public MatrixOperation transpose(MatrixOperation m) {
        int[][] transposed = new int[m.matrix[0].length][m.matrix.length];
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                transposed[j][i] = m.matrix[i][j];
            }
        }
        return new MatrixOperation(transposed);
    }
    public boolean isIdentity(MatrixOperation m){
        for(int i=0; i<m.matrix.length;i++){
            for(int j=0;j<m.matrix.length;j++){
                if((i==j && m.matrix[i][j]!=1) || (i!=j && m.matrix[i][j]!=0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSquare(MatrixOperation m){
        if(m.matrix.length==m.matrix[0].length){
            return true;
        }
        return false;
    }
    public boolean isUpperTriangular(MatrixOperation m){
        if(m.matrix.length!=m.matrix[0].length){
            return false;
        }
        for (int i=0;i<m.matrix.length;i++){
            for (int j=0;j<m.matrix[0].length;j++){
                if(i>j && m.matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isLowerTriangular(MatrixOperation m){
        if(m.matrix.length!=m.matrix[0].length){
            return false;
        }
        for (int i=0;i<m.matrix.length;i++){
            for (int j=0;j<m.matrix[0].length;j++){
                if(i<j && m.matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSymmetric(MatrixOperation m){
        if(m.matrix.length!=m.matrix[0].length){
            return false;
        }
        for(int i=0;i<m.matrix.length;i++){
            for(int j=0;j<m.matrix[0].length;j++){
                if(m.matrix[i][j]!=m.matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSkewSymmetric(MatrixOperation m){
        if(m.matrix.length!=m.matrix[0].length){
            return false;
        }
        for(int i=0;i<m.matrix.length;i++){
            for(int j=0;j<m.matrix[0].length;j++){
                if(m.matrix[i][j]!=-m.matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        MatrixOperation m = new MatrixOperation(new int[][]{{2, 3, 4}, {4, 5, 6}});
        // System.out.println("addition: " + m.addition(new MatrixOperation(new int[][]{{1, 2, 3}, {4, 5, 6}})));
        // System.out.println("subtraction: " + m.subtraction(new MatrixOperation(new int[][]{{1, 2, 3}, {4, 5, 6}})));
        // System.out.println("multiplication: " + m.multiplication(new MatrixOperation(new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}})));
        System.out.println("transpose: " + m.transpose(new MatrixOperation(new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}})));
        // System.out.println("is an identity matrix: " + m.isIdentity(new MatrixOperation(new int[][]{{1,0,0},{0,1,0},{0,0,1}})));
        // System.out.println("is a square matrix: " + m.isSquare(new MatrixOperation(new int[][]{{1,0},{0,1}})));
        // System.out.println("is an upper triangular matrix: " + m.isUpperTriangular(new MatrixOperation(new int[][]{{1,2,3},{0,1,1},{0,0,3}})));
        // System.out.println("is an upper triangular matrix: " + m.isUpperTriangular(new MatrixOperation(new int[][]{{1,2,3},{3,1,1},{0,5,3}})));
        // System.out.println("is a lower triangular matrix: " + m.isLowerTriangular(new MatrixOperation(new int[][]{{1,0,0},{4,2,0},{3,4,3}})));
        // System.out.println("is a lower triangular matrix: " + m.isLowerTriangular(new MatrixOperation(new int[][]{{1,0,4},{4,2,1},{3,4,3}})));
        // System.out.println("is a symmetric matrix: " + m.isSymmetric(new MatrixOperation(new int[][]{{1,4},{2,9}})));
        // System.out.println("is a symmetric matrix: " + m.isSymmetric(new MatrixOperation(new int[][]{{1,0},{0,1}})));
        // System.out.println("is a skew symmetric matrix: " + m.isSkewSymmetric(new MatrixOperation(new int[][]{{0,-1,2},{1,0,-3},{-2,3,0}})));
        // System.out.println("is a skew symmetric matrix: " + m.isSkewSymmetric(new MatrixOperation(new int[][]{{0,-1,5},{4,0,-3},{-2,9,0}})));
    }
}
