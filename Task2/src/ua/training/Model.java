package ua.training;

public class Model {

    public final int[] ARRAY = {6, 2, 8, 9, 11, 1, 2, 2, 6, 5, 11};
    private int index;
    private int []indexList;

    public int[] getArray() {
        return ARRAY;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setIndexList(int[] indexList) {
        this.indexList = indexList;
    }

    public int[] getIndexList() {
        return indexList;
    }
}
