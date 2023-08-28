package Road14Override.Models;

public class Square extends SmoothFigure{
    static final String FIGURE_NAME = "Square";
    protected int size;
    public Square (int size){ this.size = size; }


    public void printFigure(){

        buildHorizontalLine();
        if (this.size > 2) {
            for (int i = 1; i < this.size - 1; i++) {
                buildMiddleLines();
            }
        }
        if (this.size > 1)
            buildHorizontalLine();

    }

    void buildHorizontalLine(){
        String line = "";
        for (int i = 0; i < this.size; i++) {
            line = line + " = ";
        }
        System.out.println(line);;
    }
    void buildMiddleLines(){
        String line = " | ";
        for (int i = 1; i < this.size - 1; i++) {
            line += "   ";
        }
        line += " | ";
        System.out.println(line);;
    }
}
