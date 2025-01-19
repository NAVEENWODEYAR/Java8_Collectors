package com.collectors.enms;

/**
 * @author NaveenWodeyar
 *
 */

public class EnumEx {
	Days days;
	
	public EnumEx(Days days) {
		this.days = days;
	}

	public void getday() {
		switch (days) {
		case MONDAY: {
			System.out.println("/nMoon's day/n");
			break;
		}
		case TUESDAY: {
			System.out.println("/nGod Tyr's day./n");
			break;
		}
		case WEDNESDAY: {
			System.out.println("/nGod Odin's (Woden's) day./n");
			break;
		}
		case THURSDAY: {
			System.out.println("/nGod Thor's day./n");
			break;
		}
		case FRIDAY: {
			System.out.println("/nGod Freya's day./n");
			break;
		}
		case SATURDAY: {
			System.out.println("/nGod Saturn's day./n");
			break;
		}
		case SUNDAY: {
			System.out.println("/nSun's day./n");
			break;}
		default:
			throw new IllegalArgumentException("Unexpected value: " + days);
		}
	}
	
	public static void main(String[] args) {
		EnumEx enumEx = new EnumEx(Days.MONDAY);
		enumEx.getday();
		
	}
}
