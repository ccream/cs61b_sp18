package Project1B;

public class OffByOne implements CharacterComparator{
	public boolean equalChars(char x, char y)  {
		if(x-y <= 1 && x-y >= -1)  {
			return true;
		}
		return false;
	}
}