package game.rounds;

/**
 * Class for the PotLimit betting game.rounds.rules used in Texas Hold'em.
 * @author Cedric
 */
public class PotLimit extends BettingRules {

	/**********************************************************
	 * Constructors
	 **********************************************************/
	public PotLimit(Round round) {
		super(round);
	}
	public PotLimit(){
		super();
	}

	/**********************************************************
	 * Raise
	 **********************************************************/
	@Override
	public boolean isValidRaise(int amount) {
		if(amount<getLastBetAmount()){
			setLastRaiseErrorMessage("ERROR : the betted amount must be atleast the amount of the previous bet/raise" +
					"in the current round");
			return false;
		}
		//TODO: @kenzo amount mag niet groter zijn dan het total bedrag dat op dit moment in de pot zit
		//if(amount>)
		return super.isValidRaise(amount);
	}

	/**********************************************************
	 * Betting
	 **********************************************************/
	@Override
	public boolean isValidBet(int amount) {
		// TODO @kenzo amount mag niet groter zijn dan het total bedrag dat op dit moment in de pot zit
		return super.isValidBet(amount);
	}
}
