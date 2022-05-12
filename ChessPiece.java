public class ChessPiece {
    private String name;
    private int xPos;
    private int yPos;
    private String color;

    /**
     * 
     * @param name name of the chess piece
     * @param xPos x-coordinate of the chess piece
     * @param yPos y-coordinate of the chess piece
     * @param color black or white piece
     */
    public ChessPiece(String name, int xPos, int yPos, String color) {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }
    
    /**
     * 
     * @param name sets the name of the chess piece
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param xPos sets the x-coordinate of the chess piece
     */
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * 
     * @param yPos sets the y-coordinate of the chess piece
     */
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }


    /**
     * 
     * @param color sets the color of the chess piece
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return Returns the name of the chess piece
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @return Returns the x-coordinate of the chess piece
     */
    public int getXPos() {
        return this.xPos;
    }

    /**
     * 
     * @return Returns the y-coordinate of the chess piece
     */
    public int getYPos() {
        return this.yPos;
    }

    /**
     * 
     * @return Returns the color of the chess piece
     */
    public String getColor() {
        return this.color;
    }
}