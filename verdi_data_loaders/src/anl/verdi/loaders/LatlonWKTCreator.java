package anl.verdi.loaders;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import ucar.unidata.geoloc.projection.LatLonProjection;

/**
 * Creates a wkt for latitute-logititute based on
 * netcdf produced parameters.
 * 
 * Adapted from LambertWKTCreator
 *
 * @author Alexis Zubrow & Qun He
 * @version $Revision$ $Date$
 */
public class LatlonWKTCreator {

	public String createWKT(LatLonProjection proj) throws IOException {
		VelocityContext context = new VelocityContext();
		String template = getClass().getPackage().getName();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
		template = template.replace('.', '/');
		template = template + "/latlon_wkt.vt";

		Writer writer = new StringWriter();
		try {
			Velocity.mergeTemplate(template, "UTF-8", context, writer);
		} catch (Exception ex) {
			throw new IOException("Error merging template", ex);
		} finally {
			if (writer != null) writer.close();
			Thread.currentThread().setContextClassLoader(loader);
		}

		return writer.toString();
	}
}
