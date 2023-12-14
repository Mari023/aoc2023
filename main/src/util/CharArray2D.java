package util;

import java.util.Arrays;

public class CharArray2D {
    private final char[] chars;
    private final int columns;

    public CharArray2D(int x, int y) {
        this.chars = new char[y * x];
        columns = y;
    }

    public CharArray2D(CharArray2D array) {
        this(array.chars, array.columns);
    }

    public CharArray2D(char[] chars, int columns) {
        this.chars = chars.clone();
        this.columns = columns;
    }

    public CharArray2D(String[] strings) {
        this(strings.length, strings[0].length());
        for (int y = 0; y < strings.length; y++) {
            for (int x = 0; x < strings[y].length(); x++) {
                chars[x + y * columns] = strings[y].charAt(x);
            }
        }
    }

    public char get(int x, int y) {
        return chars[x + y * columns];
    }

    public void set(int x, int y, char c) {
        chars[x + y * columns] = c;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return chars.length / columns;
    }

    public char[] getRow(int y) {
        var result = new char[getColumns()];
        System.arraycopy(chars, y * getColumns(), result, 0, result.length);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CharArray2D that)) return false;

        return Arrays.equals(chars, that.chars);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % columns == 0) s.append("\n");
            s.append(chars[i]);
        }
        return s.toString();
    }
}
