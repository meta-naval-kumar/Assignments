import java.sql.Timestamp;
public interface Shape {
	public static int Xmax=100;
	public static int Ymax=100;
	public static enum ShapesType{
		SQUARE,CIRCLE,RECTANGLE,TRIANGLE,REGULARPOLYGON
	}
	public float getArea();
	public void setPoint(int x,int y);
	public float getPerimeter(); 
	public Point getOrigin(); 
	public boolean isPointEnclosed(int x,int y);
    public void setValues(String type);
    public Timestamp getTimestamp();
    public String getType();
}
