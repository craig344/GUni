package application;

public class factorial {
	private int f = 1, n;
	public int getFact() {
		for(int i = 1; i<=n; i++) {
			f = f*i;
		}
		return f;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
