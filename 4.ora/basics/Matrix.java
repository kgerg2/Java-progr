package basics;

public class Matrix {
    private float[][] m;

    public Matrix(float[][] m) {
        this.m = new float[m.length][];
        for (int i = 0; i < m.length; i++) {
            //this.m[i] = new float[m[i].length];
            this.m[i] = m[i].clone();
        }
    }

    public Matrix(int n, int m) {
        this.m = new float[n][m];
    }

    public static Matrix id(int n) {
        float[][] m = new float[n][n];
        for (int i = 0; i < n; i++) {
            m[i][i] = 1;
        }
        return new Matrix(m);
    }

    public Matrix transpose() {
        float[][] m = new float[this.m[0].length][this.m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[j][i] = m[i][j];
            }
        }
        return new Matrix(m);
    }

    public Matrix add(Matrix that) {
        float[][] res = new float[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = this.m[i][j] + that.m[i][j];
            }
        }
        return new Matrix(res);
    }

    public Matrix sub(Matrix that) {
        float[][] res = new float[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = this.m[i][j] - that.m[i][j];
            }
        }
        return new Matrix(res);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rd = "[", cd;
        for (float[] fs : m) {
            sb.append(rd);
            rd = "],\n[";
            cd = "";
            for (float f : fs) {
                sb.append(cd);
                sb.append(f);
                cd = ", ";
            }
        }
        sb.append("]");
        return sb.toString();
    }
}