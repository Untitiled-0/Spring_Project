package kr.co.softsoldesk.beans;

public class SamsumgTV implements TV{
	
	public SamsumgTV() {
		System.out.println("===> SamsungTV 객체 생성 ");
	}

	@Override
	public void powerOn() {
		System.out.println(" 삼성 TV 켜기 ");
		
	}

	@Override
	public void powerOff() {
		System.out.println(" 삼성 TV 끄기 ");
		
	}

	@Override
	public void volumeUp() {
		System.out.println(" 삼성 TV 볼륨 업 ");
		
	}

	@Override
	public void volumeDown() {
		System.out.println(" 삼성 TV 볼륨 다운 ");
		
	}

	
}
