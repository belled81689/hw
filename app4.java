import java.io.*; 
import java.util.Arrays;
public class app4{
    public static void main(String[] args)throws IOException{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�j�H �p�ĤH��(�H�r���j�}):");
		String[] in = (buff.readLine()).split(",");
		int[] count=new int [in.length];
		for (int i = 0; i < in.length; i++) {
			count[i]=Integer.parseInt(in[i]);
		}
		switch (count.length){
		case 2:
				calc(count[0],count[1]);
				break;
		default:
				System.out.print("Type error");
				break;
		}
	}
	public static void calc(int adt,int chi) throws IOException{
		int time = 0;
		int weekdays_adt = 268;
		int weekdays_chi = 120;
		int holiday_adt = 368;
		int holiday_chi = 150;
		int adt_money = 0;
		int chi_money = 0;
		int sum = 0;
		double total = 0;
		double tip = 0;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�ɬq (0:���餤�� 1:����ߤW 2:����):");
		time = Integer.parseInt(buf.readLine());
		if (time == 0) {
			if (((adt+chi) >= 3) && (chi >= 1)){
				if ((adt+chi) >= 10){
					adt_money = weekdays_adt * adt;
					chi_money = weekdays_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = sum+tip;
					total = (int)(total * 0.95);
					System.out.print("�`���B��:"+total+"��");
				}
				else{
					chi = chi - 1;
					adt_money = weekdays_adt * adt;
					chi_money = weekdays_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = (int)(sum+tip);
					System.out.print("�`���B��:"+total+"��");
				}
			}
			else if (((adt+chi) >= 3)&&(adt >= 1)){
				if ((adt+chi) >= 10){
					adt_money = weekdays_adt * adt;
					chi_money = weekdays_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = sum+tip;
					total = (int)(total * 0.95);
					System.out.print("�`���B��:"+total+"��");
				}
				else{
					adt = adt - 1;
					adt_money = weekdays_adt * adt;
					chi_money = weekdays_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = (int)(sum+tip);
					System.out.print("�`���B��:"+total+"��");
				}
			}
			else{
				adt_money = weekdays_adt * adt;
				chi_money = weekdays_chi * chi;
				sum = adt_money+chi_money;
				tip = sum * 0.1;
				total = (int)(sum+tip);
				System.out.print("�`���B��:"+total+"��");
			}
		}
		else if ((time == 1)||(time == 2)) {
			
			if (((adt+chi) >= 3)&&(chi >= 1)){
				if ((adt+chi) >= 10){
					adt_money = holiday_adt * adt;
					chi_money = holiday_chi * chi;
					sum = adt_money+chi_money;
					tip = sum*0.1;
					total = sum+tip;
					total = (int)(total * 0.95);
					System.out.print("�`���B��:"+total+"��");
				}
				else{
					chi = chi - 1;
					adt_money = holiday_adt * adt;
					chi_money = holiday_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = (int)(sum+tip);
					System.out.print("�`���B��:"+total+"��");
				}
			}
			else if (((adt+chi) >= 3)&&(adt >= 1)){
				if ((adt+chi) >= 10){
					adt = adt - 1;
					adt_money = holiday_adt * adt;
					chi_money = holiday_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = sum+tip;
					total = (int)(total * 0.95);
					System.out.print("�`���B��:"+total+"��");
				}
				else{
					adt = adt - 1;
					adt_money = holiday_adt * adt;
					chi_money = holiday_chi * chi;
					sum = adt_money+chi_money;
					tip = sum * 0.1;
					total = (int)(sum+tip);
					System.out.print("�`���B��:"+total+"��");
				}
			}
			else{
				adt_money = holiday_adt * adt;
				chi_money = holiday_chi * chi;
				sum = adt_money+chi_money;
				tip = sum * 0.1;
				total = (int)(sum+tip);
				System.out.print("�`���B��:"+total+"��");
			}
		}
		else{
			System.out.print("�ɬq�п�J0~2");
			return;
		}
	}
}