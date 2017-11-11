import java.util.LinkedList;

public class Register{
	private String name;
	
	private int offset;
	private int dataWidth;
	private LinkedList<BitField> bitField = new LinkedList<>();
	
	public Register(String name, int offset, int dataWidth){
		this.name = name;
		this.offset = offset;
		this.dataWidth = dataWidth;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	
	public int getOffset(){
		return offset;
	}
	
	public void setDataWidth(int dataWidth){
		this.dataWidth = dataWidth;
	}
	
	public int getDataWidth(){
		return dataWidth;
	}
	
	public void addBitField(BitField bit){
		bitField.add(bit);
	}
	
	public LinkedList<BitField> getBitField(){
		return bitField;
	}
}