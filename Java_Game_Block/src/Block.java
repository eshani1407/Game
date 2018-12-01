//This class holds all of the necessary information for a given block.
public class Block
{
	public char ID;
	public int start_row;
	public int start_col;
	public int width;
	public int height;
	public char direction;
	
	public Block(int start_row, int start_col, int width, int height, char direction, char ID) 
	{
		this.start_row = start_row;
		this.start_col = start_col;
		this.width = width;
		this.height = height;
		this.direction = direction;
		this.ID = ID;
	}
	
	// Constructor that creates a copy of the block b
	public Block(Block b)
	{
		this(b.start_row, b.start_col, b.width, b.height, b.direction, b.ID);
	}
}