/* Generated By:JJTree: Do not edit this line. ASTMaxt.java */

package anl.verdi.parser;

import anl.verdi.formula.IllegalFormulaException;
import anl.verdi.util.FormulaArray;


public class ASTMaxt extends AggregateFuncNode {

	public ASTMaxt(int id) {
		super(id);
	}

	public ASTMaxt(Parser p, int id) {
		super(p, id);
	}

	protected int getIndex(Frame frame) {
		return frame.getTimeStep();
	}

	/**
	 * Evaluates this Node.
	 *
	 * @param frame
	 * @return the result of the evaluation.
	 */
	@Override
	public FormulaArray evaluate(Frame frame) throws IllegalFormulaException {
		int maxt = max(frame.getTimeStep(), frame);
		return new FormulaArray(maxt + frame.getTimeStepOffset());
	}
}
