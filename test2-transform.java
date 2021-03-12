package test3;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class transform {
	public static void main(String[] args) throws IOException {
        File file_in = new File("D:\\yq_in.txt"); 
        File file_out = new File("D:\\file_out.txt"); 
        //文件扫描传入数组
        String[] province = new String[500];
        String[] city = new String[500];
        String[] sum = new String[500];
        Scanner sca = new Scanner(file_in);   
        int n = 0;  //记录数据条数
        for(int len = 0; sca.hasNext();len++) {
            province[len] = sca.next();
            city[len] = sca.next();
            sum[len] = sca.next();
            n++;
        }
        //数据加工并输出
        PrintStream pS = new PrintStream(file_out);
        String pro = "value"; //用pro记录上个province
        for(int i = 0; i < n; i++) {
            if (!pro.equals(province[i])) {
            	if (i != 0)	{
            	pS.println();
            	}
            		pS.println(province[i] + "\t");
            		pro = province[i];
            }
            pS.println(city[i] + "\t" + sum[i]);
        }
        System.out.println("输出完成");
        sca.close();
        pS.close();
    }
}
