package Again;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class UImain {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
		Company company=new Company();
		company.addemployee(new Employee("lyl",111));
		company.addemployee(new Employee("lys",222));
		company.addemployee(new Employee("lyd",333));
		company.addemployee(new Employee("lylw",444));
		
		OutputStream file1 ;
		ObjectOutputStream record=null;
		File file =new File("input.txt");
		FileOutputStream cc=null;
		
		Scanner sc1=new Scanner(System.in);
		try {
			cc=new FileOutputStream(file);
			file1=new FileOutputStream("input.txt");
			record=new ObjectOutputStream(file1);
			boolean flag=true;
			
			while (flag)
			{
				while(true) {
				System.out.println("----Ա����ϵͳ----\r\n" + 
						"���� 0--------�˳�\r\n" + 
						"���� 1--------ǩ��\r\n" + 
						"���� 2--------ǩ��\r\n" + 
						"���� 3--------�鿴ǩ��ǩ����Ϣ\r\n" + 
						"��������ִ�еĲ�����");
			
			int tempKey = sc1.nextInt();
			switch (tempKey) {
			case 0:
				System.out.println("�˳�");
				flag=false;break;
			case 1:
				System.out.println("������ǩ��Ա��ID��");
				int IDD=sc1.nextInt();
				if (Company.dakaifos.get(IDD).arrive!=null) {
					System.out.println("�����Ѿ��������");
				} else if(Company.dakaifos.get(IDD).arrive==null) {
					System.out.println("���ţ�"+Company.dakaifos.get(IDD).ID+" �򿨳ɹ�");					    
				    Company.dakaifos.get(IDD).arrive=new Date();
				    record.reset();
				    record.writeObject(Company.dakaifos);
				    record.flush();
				    break;
				}
				else if(!Company.dakaifos.containsKey(IDD)) {
					System.out.println("�޴�IDԱ��");
					break;
				}
				
			case 2:
				System.out.println("������ǩ��Ա��ID��");
				int IDD2=sc1.nextInt();
				if (Company.dakaifos.get(IDD2).arrive!=null&&Company.dakaifos.get(IDD2).leave!=null) {
					System.out.println("�����Ѿ��������");break;
				} 
				else if(Company.dakaifos.get(IDD2).leave==null&&Company.dakaifos.get(IDD2).arrive!=null) {
					System.out.println("���ţ�"+Company.dakaifos.get(IDD2).ID+" �򿨳ɹ�");					    
				    Company.dakaifos.get(IDD2).arrive=new Date();
				    record.reset();
				    record.writeObject(Company.dakaifos);
				    record.flush();break;
				    }
				else if(Company.dakaifos.get(IDD2).arrive==null) {
					System.out.println("���ţ�"+Company.dakaifos.get(IDD2).ID+" ���컹û��ǩ�����޷�ǩ��");break;
				}
				
				else if(!Company.dakaifos.containsKey(IDD2)) {
					System.out.println("�޴�IDԱ��");break;
				}
				
			case 3:
				
				}
			}
		
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		// TODO �Զ����ɵĹ��캯�����
}

	
