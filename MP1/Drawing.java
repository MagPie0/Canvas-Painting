public class Drawing{
    public static void createCanvas(char[][] canvasBorder){
        //The if statements inside the nested for loop are so we are able to create the border of
        //the canvas without hard coding it. Meaning that changing the rows and columns for the 
        //canvas 2D array in main will still come out with a border that fits no matter the size.
        for(int i = 0; i < canvasBorder.length; ++i){
            for(int j = 0; j < canvasBorder[i].length; ++j){
                if (j == 0){
                    canvasBorder[i][j] = '|';
                } else if (i == 0) {
                    canvasBorder[i][j] = '=';
                } else if (j == canvasBorder[0].length - 1){
                    canvasBorder[i][j] = '|';
                } else if (i == canvasBorder.length - 1) {
                    canvasBorder[i][j] = '=';
                } else {
                    canvasBorder[i][j] = ' ';
                }
            }
        }
        canvasBorder[0][0] = '+';
        canvasBorder[0][canvasBorder[0].length - 1] = '+';
        canvasBorder[canvasBorder.length - 1][0] = '+';
        canvasBorder[canvasBorder.length - 1][canvasBorder[0].length - 1] = '+';
    }
    public static void addCharacter(char[][] canvasBorder, char character, int xPosition, int yPosition){
        canvasBorder[xPosition][yPosition] = character;
    }
    public static void printCanvas(char[][] canvasBorder){
         for(int i = canvasBorder.length - 1; i >= 0; --i){ 
            System.out.print(i + " "); 
            for(int j = 0; j < canvasBorder[i].length; ++j){
                System.out.print(canvasBorder[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(" ");
        //I ended up using a separate for loop to output the row index since it wasn't
        //possible to add it to the nested for loop above. It would output the row indexes within the
        //canvas
        for (int i = 0; i < canvasBorder[0].length; ++i){
            System.out.print(" " + i);
        }
        System.out.println(); 
    }

    public static void main(String[] args){
        char[][] canvas = new char[5][10];

        createCanvas(canvas);

        addCharacter(canvas, '<', 2, 4); 
        addCharacter(canvas, '3', 2, 5);

        printCanvas(canvas);
        
    }
}