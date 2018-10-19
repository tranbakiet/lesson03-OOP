package kiet.dev;

public class SinhVien {
	  
	private String name;
	private double Toan;
	private double Ly;
	private double Hoa;
	
	public SinhVien(String name, double Toan, double Ly, double Hoa) {
			
		this.name = name;
		this.Toan = Toan;
		this.Ly = Ly;
		this.Hoa = Hoa;
			}
    public double DiemTB(double Toan, double Ly, double Hoa) {
   	 return (Toan + Ly + Hoa) / 3;
		}
    public void DiemTB() {
	  System.out.println(name+":"+DiemTB(Toan, Ly, Hoa));
	}
}
