/* Generated By:JJTree: Do not edit this line. ASTMinx.java */

package anl.verdi.parser;

import anl.verdi.formula.IllegalFormulaException;
import anl.verdi.util.FormulaArray;

public class ASTMinx extends AggregateFuncNode {
  public ASTMinx(int id) {
    super(id);
  }

  public ASTMinx(Parser p, int id) {
    super(p, id);
  }

	protected int getIndex(Frame frame) {
		return frame.getX();
	}

	/**
	 * Evaluates this Node.
	 *
	 * @param frame
	 * @return the result of the evaluation.
	 */
	@Override
	public FormulaArray evaluate(Frame frame) throws IllegalFormulaException {
		int min = min(frame.getX(), frame);
		return new FormulaArray(min + frame.getXOffset());
	}

}
