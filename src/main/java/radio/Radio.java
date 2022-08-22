package radio;

public class Radio {

	private int currentNumber;
	
	private int currentVolume;
	
	public Radio(int currentNumber, int currentVolume) {
		this.currentNumber = currentNumber;
		this.currentVolume = currentVolume;
	}

	public int getCurrentNumber() {
		return currentNumber;
	}


	public int getCurrentVolume() {
		return currentVolume;
	}

	
	public void nextNumber() {
		if(currentNumber==9) {
			currentNumber = 0;
		} else {
			currentNumber++;
		}
	}
	
	public void prevNumber() {
		if(currentNumber==0) {
			currentNumber = 9;
		} else {
			currentNumber--;
		}
	}
	
	public void specifiedNumber(int number) {
		if(number>=0 && number<=9) {
			currentNumber = number;
		}
	}
	
	public void increaseVolume() {
	    if (currentVolume < 10) {
	      currentVolume = currentVolume + 1;
	    }
	  }
	
	public void decreaseVolume() {
	    if (currentVolume > 0) {
	      currentVolume = currentVolume - 1;
	    }
	  }
}
