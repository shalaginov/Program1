package prj1;

import java.io.PrintStream;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    	    Scanner cin = new Scanner(System.in); //����� ��� ������ �� �������
    	    PrintStream cout = System.out;    	  //����� ��� ������ � �������  
    	   
    	    //������ ������� ����������
    	    
 			int iX1 = cin.nextInt();
    		int iY1 = cin.nextInt();
    		int iZ1 = cin.nextInt();
    		double iW1 = cin.nextDouble();

	 		int iX0 = cin.nextInt();
	 		int iY0 = cin.nextInt();
	 		int iZ0 = cin.nextInt();
	 		double iW0 = cin.nextDouble();
    		
    		// ����������
    		int iXc = iX0/iX1;
    		int iYc = iY0/iY1;
    		int iZc = iZ0/iZ1;
    		int maxC = iXc*iYc*iZc;
    		double maxW = maxC*iW1;
    		double maxV = (double)(maxC*iX1*iY1*iZ1)/(double)(iX0*iY0*iZ0);
    		
    		// ����� ���������� �� �����
    		cout.printf("%1$d %2$.2f %3$.2f", maxC, maxW, maxV);
    	    cin.close();
    	    
    	    // ���� ������ ������ 50 150 250 0,5 1200 800 1400 750
    	    // ��������� ������ ���� 600 300 0,84
    }
}
