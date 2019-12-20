package com.net.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Socket khdtjz=new Socket("10.2.103.31",8899);
		File wj=new File("d:\\1.jpg");
		FileInputStream fin=new FileInputStream(wj);
		OutputStream os;
		os=khdtjz.getOutputStream();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		
		InputStream is=khdtjz.getInputStream();
		 zjhc=new byte[1024];
		 b=is.read(zjhc);
		while(b!=1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
