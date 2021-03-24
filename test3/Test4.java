package test3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class Test4 {
	public static void main(String[] args) throws IOException {
		System.out.println("�����룺");
		Scanner sc = new Scanner(System.in);
		String filein=sc.nextLine();
		String[] in = filein.split(" ");		
		sc.close();
		int n = 0;  //��¼��������
		String[] province = new String[500];
        String[] city = new String[500];
        String[] sum = new String[500];
        ArrayList<Prov> provs = new ArrayList<Prov>();
		try {
	        File file_in = new File("D:\\\\" + in[0]);   
	        Scanner sca = new Scanner(file_in);   	        
		        for(int len = 0; sca.hasNext();len++) {
		            province[len] = sca.next();
		            city[len] = sca.next();
		            sum[len] = sca.next();
		            n++;
		        }
	        sca.close();
		}catch(Exception e) {}
		
        //���ݼӹ������	
		try {
			Prov prov = new Prov(province[0]);
	        FileWriter pS =new FileWriter("D:\\\\" + in[1]);
	        String lastpro = province[0]; //��pro��¼�ϸ�province	        
	        for(int i = 0; i < n; i++) {
	            if (!lastpro.equals(province[i])) {
	            	provs.add(prov);
	            	prov = new Prov(province[i]);
	            	lastpro = province[i];
	            }	
	            prov.setYqsum(prov.getYqsum() + Integer.parseInt(sum[i]));
	            prov.getCitys().add(new City(city[i],Integer.parseInt(sum[i])));
	        }
	        provs.add(prov);
	        Collections.sort(provs);
	        for(Prov p : provs) {
	        	Collections.sort(p.getCitys());
	        	pS.write(p.getProname() + " " + p.getYqsum() + "\n");
	        	for(City c : p.getCitys()) {
	        		pS.write(c.getCityname() + " " + c.getYqnum() + "\n");
	        	}
	        	pS.write("\n");
	        }
	        
		       
		pS.close();
		}catch(Exception e) {
			e.printStackTrace();
		 }	
	 }	
}