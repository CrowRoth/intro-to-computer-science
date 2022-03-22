/*
 * File: Cards.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * Requirements: randomly pick 2 cards and add up their value
 * 
 * Variables:
 *      input: 
 *      
 *      	calculated: num, suit, card1, card2, value
 *      
 * Output: card 1:
 * card 2:
 * Total value:
 *
 *
 * Key calculations: 
 * num = (int)(Math.random() * 13) + 1;
 * suit = (int)(Math.random() * 4) + 1;
 * if (num > 10) {
 * 			card1 = 10;
 * 		}
 * 		else {
 * 			card1 = num;
 * 		}
 * if (num > 10) {
 * 			card2 = 10;
 * 		}
 * 		else {
 * 			card2 = num;
 * 		}
 * value = card1 + card2;
 * 
 * design:
 * enter amount
 * if amount >= 100/3 15% tip
 * else $5 tip
 * 
 * Test data: 
 * card 1:				card 2:				Total Value:
 * king of diamonds		5 of diamaonds		15
 * 8 of diamonds		jack of hearts		18
 */
public class Cards {

	public static void main(String[] args) {
		int num, suit, card1, card2, value;
		
		System.out.print("Card 1: ");
		
		num = (int)(Math.random() * 13) + 1;
		suit = (int)(Math.random() * 4) + 1;
		
		switch(num) {
		case 1:
			num = 1;
			System.out.print("Ace of ");
			break;
		case 11:
			num = 11;
			System.out.print("Jack of ");
			break;
		case 12:
			num = 12;
			System.out.print("Queen of ");
			break;
		case 13:
			num = 13;
			System.out.print("King of ");
			break;
		default: System.out.print(num + " of ");
		
		}
		
		if (num > 10) {
			card1 = 10;
		}
		else {
			card1 = num;
		}
		
		switch(suit) {
		case 1:
			suit = 1;
			System.out.println("spades");
			break;
		case 2:
			suit = 2;
			System.out.println("clubs");
			break;
		case 3:
			suit = 3;
			System.out.println("hearts");
			break;
		case 4:
			suit = 4;
			System.out.println("diamonds");
			break;
			
		}
		
System.out.print("Card 2: ");
		
		num = (int)(Math.random() * 13) + 1;
		suit = (int)(Math.random() * 4) + 1;
		
		switch(num) {
		case 1:
			num = 1;
			System.out.print("Ace of ");
			break;
		case 11:
			num = 11;
			System.out.print("Jack of ");
			break;
		case 12:
			num = 12;
			System.out.print("Queen of ");
			break;
		case 13:
			num = 13;
			System.out.print("King of ");
			break;
		default: System.out.print(num + " of ");
		
		}
		
		switch(suit) {
		case 1:
			suit = 1;
			System.out.println("spades");
			break;
		case 2:
			suit = 2;
			System.out.println("clubs");
			break;
		case 3:
			suit = 3;
			System.out.println("hearts");
			break;
		case 4:
			suit = 4;
			System.out.println("diamonds");
			break;
			
		}
		
		if (num > 10) {
			card2 = 10;
		}
		else {
			card2 = num;
		}
		
		value = card1 + card2;
		
		System.out.print("Total value: " + value);
		
	}

}
