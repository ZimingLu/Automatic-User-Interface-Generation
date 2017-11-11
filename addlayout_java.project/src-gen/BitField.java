
public class BitField{
	private String name;
	
	private int offset;
	private int width;
	
	public BitField(String name, int offset, int width){
		this.name = name;
		this.offset = offset;
		this.width = width;
	} 
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setOffset(int offset){
		this.offset = offset;
	}
	
	public int getOffset(){
		return offset;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getWidth(){
		return width;
	}
}