package fes.aragon.clases;

public class punto {
	private int x1;
	private int fx;
	
	public punto() {
		super();
		this.x1=0;
		this.fx=0;
	}
	public punto(int x1, int fx) {
		super();
		this.x1 = x1;
		this.fx = fx;
	}
	public punto (int  arg1[], int arg2[]) {
		for (int i = 0; i < arg2.length; i++) {
			this.x1= arg1[i];
			this.fx= arg2[i];
		}
		
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		
		this.x1 = x1;
	}
	public int getFx() {
		return fx;
	}
	public void setFx(int fx) {
		this.fx = fx;
	}
	@Override
	public String toString() {
		return "(" + x1 + "," + fx + ")";
	}
	public void moverPunto(int dx,int dy) {
		this.x1+=dx;
		this.fx+=dy;
	}

}
