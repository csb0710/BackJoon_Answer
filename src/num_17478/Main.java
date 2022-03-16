package num_17478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String question = "\"����Լ��� ������?\"";
	static String answer = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.";
	static String answer2 ="���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.";
	static String answer3 = "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"";
	static String ending = "��� �亯�Ͽ���.";
	
	public static void QandA(int i, int count) {
		String stick = "";
		
		stick += "_".repeat(i);
		
		System.out.println(stick + question);
		if(count == 0) {
			System.out.println(stick + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		}
		else { 
			System.out.println(stick + answer);
			System.out.println(stick + answer2);
			System.out.println(stick + answer3);
			QandA(i+4, count-1);
		}
		
		System.out.println(stick + ending);
	}
	
	public static void main(String[] args) throws IOException{
		// Answer of BaekJoon no. 17478

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(scan.readLine());
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println(question);
		System.out.println(answer);
		System.out.println(answer2);
		System.out.println(answer3);
		
		QandA(4, count-1);
		
		System.out.println(ending);
	}

}
