class Circle { //notice that it starts with a capital letter
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double circumference() {
		return (radius) * 6.28;
	}
    public double area() { 
        return (radius * radius) * 3.14;
    }
}