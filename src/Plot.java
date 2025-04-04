/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer 
 * Description: record property position
 * Due: 4/8/2025
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Matthew Chen
*/

public class Plot {
    private int x, y, width, depth;

    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    public boolean overlaps(Plot otherPlot) {
        return !(this.x + this.width <= otherPlot.x || 
                 otherPlot.x + otherPlot.width <= this.x || 
                 this.y + this.depth <= otherPlot.y || 
                 otherPlot.y + otherPlot.depth <= this.y);
    }

    public boolean encompasses(Plot otherPlot) {
        return (this.x <= otherPlot.x && 
                this.y <= otherPlot.y && 
                this.x + this.width >= otherPlot.x + otherPlot.width && 
                this.y + this.depth >= otherPlot.y + otherPlot.depth);
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getDepth() { return depth; }
    public void setDepth(int depth) { this.depth = depth; }

    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}

