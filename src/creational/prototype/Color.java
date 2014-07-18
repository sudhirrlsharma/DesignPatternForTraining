package creational.prototype;

public class Color implements Cloneable  {
	

	private int red;
	private int green;
	private int blue;

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
	@Override
	public Object clone(){
		Object clonedObject=null;
		System.out.format("Cloning color RGB: %d,%d,%d \n",red, green, blue);
		try {
			clonedObject= super.clone();
		} catch (CloneNotSupportedException e) {
			clonedObject=this;
		}
		return clonedObject;
	}

}
