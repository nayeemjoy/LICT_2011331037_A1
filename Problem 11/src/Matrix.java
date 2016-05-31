import java.util.Arrays;


public class Matrix {
	private int[][]  array = new int[10][10];
	private int rows;
	private int columns;
	public Matrix() {
		super();
		
		for (int[] is : array) {
			for (int i : is) {
				i = 0;
			}
		}
	}
	
	
	public Matrix(int rows, int columns) {
		this();
		this.rows = rows;
		this.columns = columns;
	}


	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	@Override
	public String toString(){
		
		return "Matrix [array=" + Arrays.toString(array) + ", rows=" + rows
				+ ", columns=" + columns + "]";
	}
	
	
	public void setElement(int r, int c, int value){
		if(r < 0 || r > this.rows || c < 0 || c > this.columns || value < 0){
			return;
		}
		array[r][c] = value;
		return;
	}
	
	public void showInfo(){
		System.out.println("Elements of Matrix");
		int i,j;
		for (i= 0 ;i < rows;i++) {
			for (j = 0 ;j < columns;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void transpos(){
		
		int i,j;
		for (i = 0; i < rows; i++) {
			for (j = 0 ;j < columns;j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		int temp = rows;
		rows = columns;
		columns = temp;
	}
	public static void main(String[] args) {
		Matrix matrix = new Matrix(3,4);
		matrix.showInfo();
		
		matrix.setElement(2,3,23);
		matrix.showInfo();
		
		matrix.transpos();
		matrix.showInfo();
		
		
	}
}
