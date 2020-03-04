package util;

public class Vector {
    private float[] v;

    public Vector(float[] v) {
        this.v = v.clone();
    }

    public float mult(Vector that) {
        float res = 0;
        for (int i = 0; i < v.length; i++) {
            res += v[i] * that.v[i];
        }
        return res;
    }

    public Vector mult(float f) {
        float[] res = v.clone();
        for (int i = 0; i < res.length; i++) {
            res[i] *= f;
        }
        return new Vector(res);
    }

    public Vector add(Vector that) {
        float[] res = new float[v.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = v[i] + that.v[i];
        }
        return new Vector(res);
    }

    public Vector sub(Vector that) {
        return this.add(that.mult(-1));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String del = "[";
        for (float f : v) {
            sb.append(del);
            sb.append(f);
            del = ", ";
        }
        sb.append("]");
        return sb.toString();
    }
}