package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URLŬ����
//=> ���ͳݿ��� Ȯ���� �� �ִ� �ڿ��� ����
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.daum.net");
			
			System.out.println(url.toString());
			System.out.println("url.getHost()=>"+url.getHost());
			System.out.println("url.getPath()=>"+url.getPath());
			//port�� -1
			//-1��Ʈ�� �����ߴٴ� �ǹ̰� �ƴ϶� http�� �⺻ ��Ʈ�� 80port
			//�츮�� ������ url�� �⺻ ��Ʈ�� ����ϰ� �ִٴ� �ǹ�
			System.out.println("url.getPort()=>"+url.getPort());
			System.out.println("url.getProtocol()=>"+url.getProtocol());
			System.out.println("url.getFile()=>"+url.getFile());
			//������ url���� �ڿ��� �о���� - �ѱ��� ������.
			//Reader�� ���� Ŭ������ �߰��ؼ� �о���� - �̹���, ������...
			InputStream data = url.openStream();
			InputStreamReader isr = new InputStreamReader(data);
			BufferedReader br = new BufferedReader(isr);
			while(true) {
				String data_byte = br.readLine();
				if(data_byte==null) { //��Ʈ���� ���� ������ while�� ����������
					break;
				}
				System.out.println(data_byte);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}
}