package day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Learnbymyself {
	public static void main(String[] args) {
		File afFile =new File("C:\\Users\\ASUS\\Desktop\\����\\abc.txt");
		try {
			afFile .createNewFile();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}/*���ҽ��������ھ��д˳���·����ָ�������Ƶ��ļ�ʱ��
		ԭ�ӵش����ɴ˳���·����ָ����һ���µĿ��ļ���(һ����Ҫtry catch*)
*/
		System.out.println(afFile.exists());/*���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ����*/
		afFile.delete();
		String[] listddd=afFile. list( );/*�����ɴ˳���·��������ʾ��Ŀ¼
		�е��ļ���Ŀ¼������������ַ������� */
		File b1=new File("C:\\Users\\ASUS\\Desktop\\����\\axcsc.txt");
		/*���������˳���·������ʾ���ļ�*/
		afFile.renameTo(b1);
		try {
			Files.delete(b1.toPath());
/*try {
	Files.copy(Paths.get("C:/a.txt"), Paths.get("C:/b.txt"));
} catch (IOException e) {
	e.printStackTrace();
}
ɾ��ָ��Ŀ��·�����ļ����ļ���
*/
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		

	}
}
