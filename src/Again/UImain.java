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
				System.out.println("----员工打卡系统----\r\n" + 
						"输入 0--------退出\r\n" + 
						"输入 1--------签到\r\n" + 
						"输入 2--------签退\r\n" + 
						"输入 3--------查看签到签退信息\r\n" + 
						"请输入想执行的操作：");
			
			int tempKey = sc1.nextInt();
			switch (tempKey) {
			case 0:
				System.out.println("退出");
				flag=false;break;
			case 1:
				System.out.println("请输入签到员工ID：");
				int IDD=sc1.nextInt();
				if (Company.dakaifos.get(IDD).arrive!=null) {
					System.out.println("今天已经打过卡了");
				} else if(Company.dakaifos.get(IDD).arrive==null) {
					System.out.println("卡号："+Company.dakaifos.get(IDD).ID+" 打卡成功");					    
				    Company.dakaifos.get(IDD).arrive=new Date();
				    record.reset();
				    record.writeObject(Company.dakaifos);
				    record.flush();
				    break;
				}
				else if(!Company.dakaifos.containsKey(IDD)) {
					System.out.println("无此ID员工");
					break;
				}
				
			case 2:
				System.out.println("请输入签到员工ID：");
				int IDD2=sc1.nextInt();
				if (Company.dakaifos.get(IDD2).arrive!=null&&Company.dakaifos.get(IDD2).leave!=null) {
					System.out.println("今天已经打过卡了");break;
				} 
				else if(Company.dakaifos.get(IDD2).leave==null&&Company.dakaifos.get(IDD2).arrive!=null) {
					System.out.println("卡号："+Company.dakaifos.get(IDD2).ID+" 打卡成功");					    
				    Company.dakaifos.get(IDD2).arrive=new Date();
				    record.reset();
				    record.writeObject(Company.dakaifos);
				    record.flush();break;
				    }
				else if(Company.dakaifos.get(IDD2).arrive==null) {
					System.out.println("卡号："+Company.dakaifos.get(IDD2).ID+" 今天还没有签到，无法签退");break;
				}
				
				else if(!Company.dakaifos.containsKey(IDD2)) {
					System.out.println("无此ID员工");break;
				}
				
			case 3:
				
				}
			}
		
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		// TODO 自动生成的构造函数存根
}

	
