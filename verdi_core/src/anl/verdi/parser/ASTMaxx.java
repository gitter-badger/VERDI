/* Generated By:JJTree: Do not edit this line. ASTMaxx.java */

package anl.verdi.parser;

import anl.verdi.formula.IllegalFormulaException;
import anl.verdi.util.FormulaArray;

public class ASTMaxx extends AggregateFuncNode {
  public ASTMaxx(int id) {
    super(id);
  }

  public ASTMaxx(Parser p, int id) {
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
		int max = max(frame.getX(), frame);
		return new FormulaArray(max + frame.getXOffset());
	}
}
