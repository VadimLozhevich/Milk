package by.gsu.epamlab;

public class Milk {
	private String name;
	private int proc;
	private boolean nal;
	public Milk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Milk(String name, int proc, boolean nal) {
		super();
		this.name = name;
		this.proc = proc;
		this.nal = nal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProc() {
		return proc;
	}
	public void setProc(int proc) {
		this.proc = proc;
	}
	public boolean isNal() {
		return nal;
	}
	public void setNal(boolean nal) {
		this.nal = nal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Название: " +name + " Жирность : " +proc + "%  "+ "Наличие :"   +nal;
	}
}
