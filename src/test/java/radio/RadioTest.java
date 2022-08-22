package radio;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {

	@Test
	public void nextNumberLess9() {
		Radio radio = new Radio(0, 0);
		
		radio.nextNumber();
		
		assertEquals(radio.getCurrentNumber(), 1);
	}
	
	@Test
	public void prevNumberMore0() {
		Radio radio = new Radio(5, 0);
		
		radio.prevNumber();
		
		assertEquals(radio.getCurrentNumber(), 4);
	}
	
	@Test
	public void nextNumberEqual9() {
		Radio radio = new Radio(9, 0);
		
		radio.nextNumber();
		
		assertEquals(radio.getCurrentNumber(), 0);
	}
	
	@Test
	public void prevNumberEqual0() {
		Radio radio = new Radio(0, 0);
		
		radio.prevNumber();
		
		assertEquals(radio.getCurrentNumber(), 9);
	}
	
	@Test
	public void specifiedNumberStandart() {
		Radio radio = new Radio(0, 0);
		
		radio.specifiedNumber(5);
		
		assertEquals(radio.getCurrentNumber(), 5);
	}
	
	@Test
	public void specifiedNumberMore9() {
		Radio radio = new Radio(0, 0);
		
		radio.specifiedNumber(11);
		
		assertEquals(radio.getCurrentNumber(), 0);
	}
	
	@Test
	public void specifiedNumberLess0() {
		Radio radio = new Radio(0, 0);
		
		radio.specifiedNumber(-1);
		
		assertEquals(radio.getCurrentNumber(), 0);
	}
	
	@Test
	public void increaseVolumeEqual10() {
		Radio radio = new Radio(0, 10);
		
		radio.increaseVolume();
		
		assertEquals(radio.getCurrentVolume(), 10);
	}
	
	@Test
	public void increaseVolumeLess10() {
		Radio radio = new Radio(0, 5);
		
		radio.increaseVolume();
		
		assertEquals(radio.getCurrentVolume(), 6);
	}
	
	@Test
	public void decreaseVolumeEqual0() {
		Radio radio = new Radio(0, 0);
		
		radio.decreaseVolume();
		
		assertEquals(radio.getCurrentVolume(), 0);
	}
	
	@Test
	public void decreaseVolumeMore0() {
		Radio radio = new Radio(0, 5);
		
		radio.decreaseVolume();
		
		assertEquals(radio.getCurrentVolume(), 4);
	}
}
