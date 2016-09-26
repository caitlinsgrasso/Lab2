package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import pokerEnums.eHandStrength;
//lab2
public class HandScore {

	private int HandStrength;
	private int HiHand;
	private int LoHand=0;
	private ArrayList<Card> Kickers = new ArrayList<Card>();

	public HandScore(int handStrength, int hiHand, int loHand, ArrayList<Card> Kickers) {
		super();

		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
	}

	public int getHandStrength() {
		return HandStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public ArrayList<Card> getKickers() {
		return Kickers;
	}

	public void setHandStrength(int ThreeOfAKind) {
		HandStrength = ThreeOfAKind;
		
	}

	public void setKickers(ArrayList<Card> kickers) {
		Kickers = kickers;
	}

}
