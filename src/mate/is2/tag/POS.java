package mate.is2.tag;

import mate.is2.tag.POS;

public class POS implements Comparable<POS> {

	// pos tag 
	public int p;
	
	// score of the tag
	public float s;

	// the position of the word in the sentence
	public int w;
	
	public POS(int p, float s) {
		this.p=p;
		this.s=s;
	}

	@Override
	public int compareTo(POS o) {
		
		return s>o.s?-1:s==o.s?0:1;
	}
	
	public String toString() {
		return ""+p+":"+s; 
	}
	
}
