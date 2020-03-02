public class IntegerMatrix {
    private Integer[][] data;

    public IntegerMatrix(int rowNum, int colNum, Integer[] linearData) {
        data = new Integer[rowNum][colNum];
        for (int i = 0; i < linearData.length; i++) {
            int row = (int) Math.floor(i/colNum);
            int col = i % colNum;
            data[row][col] = linearData[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String rowDel = "";
        String colDel = "";
        for (Integer[] row : data) {
            sb.append(rowDel);
            rowDel = ";";
            for (Integer e : row) {
                sb.append(colDel);
                sb.append(e);
                colDel = ",";
            }
            colDel = "";
        }
        return sb.toString();
    }
}
