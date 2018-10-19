package kiet.dev;

public class JavaOOP {
	public static void main(String[] args) {
 				
  		final String arrName[] = {"Toan", "luan", "Anh"};
  		
 		final double arrToan[] = { 6, 8, 8};
 		final double arrLy[] = { 7, 9, 8};
 		final double arrHoa[] = {7, 10,8};
 		
 		SinhVien arrSinhVien[] = new SinhVien[arrName.length];
 		 for(int i = 0; i < arrSinhVien.length; i++) {
 			SinhVien sv = new SinhVien(arrName[i], arrToan[i], arrLy[i], arrHoa[i]);
 				arrSinhVien[i]=sv;
 		}
 		 for(int i = 0; i < arrSinhVien.length; i++) {
 			if(arrSinhVien[i].DiemTB(arrToan[i], arrLy[i], arrHoa[i]) > 8) {
 				arrSinhVien[i].Show();
 			}
 		}
 	}
  }