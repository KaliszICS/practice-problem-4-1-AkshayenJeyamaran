class Rectangle { //notice that it starts with a capital letter
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double perimeter() {
        if (length==0 || width == 0) {
            return 0;
        }
		return (length + width) * 2;
	}
    public double area() { 
        return (length*width);
    }
}