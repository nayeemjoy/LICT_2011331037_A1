
public class Rectangle {
	protected float length = 1f;
	protected float width = 1f;

	public Rectangle(float length, float width) {
		super();
		this.setLength(length);;
		this.setWidth(width);;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		if(length < 1 || length >= 20.0){
			System.out.println("Length Must Be between 0 and 20.0");
		}
		else
			this.length = length;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		if(width < 1 || width >= 20.0){
			System.out.println("Width Must Be between 0 and 20.0");
		}
		else
			this.width = width;
	}
	
	public float area() {
		return this.length * this.width;
	}
	
	public float perimeter() {
		return 2 * (this.length + this.width);
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area="+area()+ ", perimeter="+perimeter()+"]";
	}
	
	
}
