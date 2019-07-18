package day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Learnbymyself {
	public static void main(String[] args) {
		File afFile =new File("C:\\Users\\ASUS\\Desktop\\娱乐\\abc.txt");
		try {
			afFile .createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}/*当且仅当不存在具有此抽象路径名指定的名称的文件时，
		原子地创建由此抽象路径名指定的一个新的空文件。(一般需要try catch*)
*/
		System.out.println(afFile.exists());/*测试此抽象路径名表示的文件或目录是否存在*/
		afFile.delete();
		String[] listddd=afFile. list( );/*返回由此抽象路径名所表示的目录
		中的文件和目录的名称所组成字符串数组 */
		File b1=new File("C:\\Users\\ASUS\\Desktop\\娱乐\\axcsc.txt");
		/*重新命名此抽象路径名表示的文件*/
		afFile.renameTo(b1);
		try {
			Files.delete(b1.toPath());
/*try {
	Files.copy(Paths.get("C:/a.txt"), Paths.get("C:/b.txt"));
} catch (IOException e) {
	e.printStackTrace();
}
删除指定目标路径的文件或文件夹
*/
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}
}
