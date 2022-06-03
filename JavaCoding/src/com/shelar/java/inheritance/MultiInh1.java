package com.shelar.java.inheritance;

class Mobile_2g{
	void voiceCalling() {
		System.out.println("I can voice call");
	}
}
class Mobile_3g extends Mobile_2g{
	void videocalling() {
		System.out.println("i can video call");
	}
}

class Mobile_4g extends Mobile_3g{
	void videoCalling() {
		System.out.println("i can do hd video call");
	}
}
public class MultiInh1 {
	public static void main(String[] args) {
		Mobile_4g obj=new Mobile_4g();
		obj.voiceCalling();
		obj.videocalling();
		obj.videoCalling();
		
	}

}
