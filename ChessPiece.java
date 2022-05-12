public class ChessPiece {
    private String name;
    private int xPos;
    private int yPos;
    private String color;

    public ChessPiece(String name, int xPos, int yPos, String color) {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }
    //Make the param stuff
    public void setName(String name) {
        this.name = name;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public String getColor() {
        return this.color;
    }
}