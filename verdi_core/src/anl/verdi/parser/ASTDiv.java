/* Generated By:JJTree: Do not edit this line. ASTDiv.java */

package anl.verdi.parser;

import anl.verdi.formula.IllegalFormulaException;
import anl.verdi.util.FormulaArray;

public class ASTDiv extends SimpleNode {
  public ASTDiv(int id) {
    super(id);
  }

  public ASTDiv(Parser p, int id) {
    super(p, id);
  }

	/**
	 * Evaluates this Node.
	 *
	 * @param frame
	 * @return the result of the evaluation.
	 */
	@Override
	public FormulaArray evaluate(Frame frame) throws IllegalFormulaException {
		return jjtGetChild(0).evaluate(frame).divide(jjtGetChild(1).evaluate(frame));
	}
}
