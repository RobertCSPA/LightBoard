public class LightBoard{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for(int row = 0; row < lights.length; row++){
            for(int col = 0; col < lights[0].length; col++){
                double a = Math.random();
                if(a <= 0.4) lights[row][col] = true;
            }
        }
    }

    public void getLights(){
        for(int row = 0; row < lights.length; row++){
            for(int col = 0; col < lights[0].length; col++){
                System.out.print(lights[row][col]+" ");
            }
            System.out.println();
        }
    }

    public boolean evaluateLight(int row, int col){
        if (lights[row][col] == true){
            int count = 0;
            for(int i = 0; i < lights.length; i++){
                if(lights[i][col] == true)count++;
            }
            if(count % 2 == 0) return false;
        }
        if (lights[row][col] == false){
            int count = 0;
            for(int i = 0; i < lights.length; i++){
                if(lights[i][col] == true)count++;
            }
            if(count % 3 == 0) return true;
        }
        return lights[row][col];
    }
}
