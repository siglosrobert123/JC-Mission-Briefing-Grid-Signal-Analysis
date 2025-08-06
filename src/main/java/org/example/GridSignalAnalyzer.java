package org.example;

public class GridSignalAnalyzer {

    // Mission Data: The Scrambled Communications Grid
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();
    }

   public void  analyzeWithForLoop(){
        for(int i = 0; i < scrambledGrid.length; i++){
            for(int j = 0; j < scrambledGrid[i].length; j++){
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void  analyzeWithForEachLoop(){
        for(char[] rowArray : scrambledGrid){
            System.out.println("Processing Row with Hash: " + rowArray);
            for(char letter : rowArray){
                System.out.println("-> " + letter);
            }
        }
    }

    public void analyzeWithHybridLoop(){
        for(char[] rowArray: scrambledGrid){
            for(int j = 0; j < rowArray.length; j++){
                System.out.print(rowArray[j] + " ");
            }
            System.out.println();
        }
    }
}
