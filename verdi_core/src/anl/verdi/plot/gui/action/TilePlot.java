package anl.verdi.plot.gui.action;

import java.awt.event.ActionEvent;

import saf.core.ui.actions.AbstractSAFAction;
import anl.verdi.core.VerdiApplication;
import anl.verdi.formula.Formula;
import anl.verdi.plot.gui.DefaultPlotCreator;

/**
 * @author Nick Collier
 * @version $Revision$ $Date$
 */
public class TilePlot extends AbstractSAFAction<VerdiApplication> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1563732995589805696L;

	public void actionPerformed(ActionEvent e) {
		 new DefaultPlotCreator(workspace.getApplicationMediator(), Formula.Type.TILE).createPlot();
	}
}
