package lotto;

import java.util.Random;

public class lotto {
	public static void main(String args[])
	{
		 // �迭ũ�� ����
        int LottoNumber[] = new int[7];
 
        // �����Լ� ����
        Random random = new Random();
 
        // �ζǼ��� ���� (min, max ����)
        int min = 1;
        int max = 45;
 
        for(int k = 0; k < 5; k++) {
        	// for�� ������ 1 ~ 45���� �������� ����
	        for (int i = 0; i < LottoNumber.length; i++) {
	            // nextInt(45) �̸� �ش� ������ 0 ~ 44 �̹Ƿ�
	            // ���� ���� ���ϰ� ������ 1 ~ 45 �̱� ������ �������� �M�Ұ��� min�� �����ָ� �ȴ�!
	            LottoNumber[i] = (random.nextInt((max - min) + 1) + min);
	            //System.out.println("LottoNumber --> " + LottoNumber[i]);
	 
	            // �ߺ�ó������
	            // ���� ���ڿ� ���� ���ڰ� ������ �ߺ��� ���ڸ� �˷��ְ� �ٽ� �� ������.
	 
	            for (int j = 0; j < i; j++) {
	                if (LottoNumber[i] == LottoNumber[j]) {
	                    //System.out.println("�ߺ��� ���ڰ� �־�� --> " + LottoNumber[i]);
	                    // �ߺ��Ǽ��� ó���ϱ����� �ݺ��� i ��°�� �ٽ� ������.
	                    i--;
	                }
	 
	                //�������� ó������
	                //�ش� �˰����� �������� ���δ�. ����� ���� ������ ũ�� ������ �ڵ�������
	                //�ε�ȣ�� �ݴ�����ָ� ū ������ ���ʴ�� �����Ѵ�.
	                if (LottoNumber[i] < LottoNumber[j]) {
	                    int LottoNumberTemp = LottoNumber[i];
	                    LottoNumber[i] = LottoNumber[j];
	                    LottoNumber[j] = LottoNumberTemp;
	                }
	 
	            }
	 
	        }
	        System.out.print("LOTTO NUMBER  : ");
	        // ������ ������ LottoNumber �迭�� �ٽ� ���������� ����
	        for (int i = 0; i < LottoNumber.length - 1; i++) {
	        	System.out.print(LottoNumber[i] + " ");
	        }
	        System.out.println("\nBONUS : " + LottoNumber[LottoNumber.length - 1]);
	    }
	}
}
