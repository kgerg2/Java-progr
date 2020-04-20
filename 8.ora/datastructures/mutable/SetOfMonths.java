package datastructures.mutable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import datastructures.Month;
import static datastructures.Month.*;

public class SetOfMonths {
    private short bitmask;

    private SetOfMonths(short bitmask) {
        this.bitmask = bitmask;
    }

    public static SetOfMonths empty() {
        return new SetOfMonths((short) 0);
    }

    public SetOfMonths add(Month month) {
        bitmask |= 1 << month.ordinal();
        return this;
    }

    public SetOfMonths add(String[] months) {
        for (String month : months) {
            bitmask |= (1 << Month.valueOf(month).ordinal());
        }
        return this;
    }

    public boolean contains(Month month) {
        return (bitmask & (1 << month.ordinal())) != 0;
    }

    public SetOfMonths remove(Month month) {
        bitmask &= ~(1 << month.ordinal());
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delim = "";
        short bm = bitmask;
        for (Month month : Month.values()) {
            if ((bm & 1) != 0) {
                sb.append(delim);
                delim = ", ";
                sb.append(month.name());
            }
            bm >>= 1;
        }
        sb.append("}");
        return sb.toString();
    }

    public static SetOfMonths of(Month... months) {
        short bitmask = 0;
        for (Month month : months) {
            bitmask |= 1 << month.ordinal();
        }
        return new SetOfMonths(bitmask);
    }

    public void write(String fileName) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
            out.writeShort(bitmask);
        }
    }

    public static SetOfMonths read(String fileName) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))) {
            return new SetOfMonths(in.readShort());
        }
    }

    public static void main(String[] args) {
        System.out.println(SetOfMonths.empty().add(January).add(April).add(July).remove(April));
        SetOfMonths set = SetOfMonths.of(October, September, March).add(December).remove(September).add(new String[]{"May"});
        System.out.println(set);

        try {
            set.write("setExample.dat");
            SetOfMonths s2 = SetOfMonths.read("setExample.dat");
            System.out.println(s2);
        } catch (Exception e) {
        }
    }
}