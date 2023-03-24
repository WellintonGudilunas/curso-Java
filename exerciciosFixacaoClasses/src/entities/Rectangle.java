package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return this.width * this.height;
    }
	public double perimeter(){
		return this.width + this.width + this.height + this.height;
	}
	public double diagonal(){
		return Math.sqrt((this.height * this.height) + (this.width * this.width));
	}
	@Override
	public String toString() {
		return  "AREA = " + String.format("%.2f",area()) +
				"\nPERIMETER = " + String.format("%.2f", perimeter()) +
				"\nDIAGONAL = " + String.format("%.2f",diagonal());
	}

}
