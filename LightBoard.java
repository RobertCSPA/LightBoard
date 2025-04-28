public class LightBoard{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for(boolean[] i : lights){
            for(boolean j : i){
                
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        if (lights[row][col] == true){
            int count = 0;
            for(int i = 0; i < row; i++){
                if(lights[i][col] == true)count++;
            }
            if(count % 2 == 0) return false;
        }
        if (lights[row][col] == false){
            int count = 0;
            for(int i = 0; i < row; i++){
                if(lights[i][col] == true)count++;
            }
            if(count % 3 == 0) return true;
        }
        return light[row][col];
    }
}
