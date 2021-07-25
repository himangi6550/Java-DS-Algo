import java.util.HashSet;

class ValidSudoku {
public int isValidSudoku(final String[] A) {
        
        HashSet set=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(A[i].charAt(j)!='.'){
                    if(!set.add("Row"+i+A[i].charAt(j)) || !set.add("Column"+j+A[i].charAt(j)))
                        return 0;
                    if(!set.add("Board"+((i/3)*3+(j/3))+A[i].charAt(j)))
                        return 0;
                }
            }
        }
        return 1;
        
    }
    
    public static void main(String args[]) {
    	ValidSudoku s=new ValidSudoku();
		String str[]= {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		int r=s.isValidSudoku(str);
		
		System.out.println("Sudoku is:"+((r==1)?"valid":"not valid"));
		}
}
