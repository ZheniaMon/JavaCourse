package oa.training;

public class Model {

    private String line;

    public String addLine(String newLine) {
        return this.line += newLine;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
