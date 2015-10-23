package anl.verdi.formula;

import ucar.ma2.Array;
import ucar.ma2.Index;
import anl.verdi.util.ArrayFactory;
import anl.verdi.util.FormulaArray;

/**
 * @author Nick Collier
 * @version $Revision$ $Date$
 */
public class TestData {
	// O3(0:2:1, 0:2:1, 0:5:1, 0:4:1)
	// tMin = 0, kMin = 0, xMin = 1, yMin = 1, tMax = 0, kMax = 2, xMax = 0, yMax = 5
	public static FormulaArray getArray() {
		Array array = ArrayFactory.createDoubleArray(new int[]{3, 3, 6, 5});
		Index index = array.getIndex();
		for (int t = 0; t < 3; t++) {
			for (int k = 0; k < 3; k++) {
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 5; j++) {
						double val = DATA[t][k][i][j];
						index.set(t, k, i, j);
						array.setDouble(index, val);
					}
				}
			}
		}
		return new FormulaArray(array);
	}
	
	public static double[][][][] DATA =
					{
									{
													{
																	{0.030126393, 0.030371226, 0.02978725, 0.031754922, 0.03243385},
																	{0.03629037, 0.029593393, 0.033903316, 0.032872364, 0.03126934},
																	{0.038046494, 0.030426726, 0.03167482, 0.030676868, 0.03432942},
																	{0.039200414, 0.03130507, 0.03756436, 0.03863811, 0.036597434},
																	{0.03963113, 0.032102156, 0.039106853, 0.031987917, 0.039934345},
																	{0.043932207, 0.036094837, 0.037710458, 0.037830167, 0.030994508}
													},
													{
																	{0.032346413, 0.035610847, 0.03383276, 0.03579438, 0.036871932},
																	{0.03690545, 0.0350472, 0.036128838, 0.037794758, 0.03546431},
																	{0.038587123, 0.033761203, 0.036493074, 0.035335146, 0.0364971},
																	{0.039818414, 0.033348598, 0.039440654, 0.0398765, 0.038719624},
																	{0.040799737, 0.032595932, 0.03939935, 0.033478905, 0.041275453},
																	{0.04481681, 0.037079196, 0.03837455, 0.03894101, 0.031975552}
													},
													{
																	{0.036910787, 0.03947386, 0.038031023, 0.039593335, 0.039855972},
																	{0.038258754, 0.038919494, 0.039513554, 0.0405221, 0.03740174},
																	{0.039398696, 0.035821754, 0.038672447, 0.03804355, 0.03820014},
																	{0.040572662, 0.038788985, 0.041982513, 0.04136718, 0.039965652},
																	{0.042064372, 0.03450152, 0.04085185, 0.03805254, 0.043995727},
																	{0.046018045, 0.038837623, 0.039546855, 0.040656906, 0.03520197}
													}
									},
									{
													{
																	{0.029699523, 0.038028188, 0.03753677, 0.036469955, 0.038139377},
																	{0.03439054, 0.04220031, 0.041911494, 0.04017, 0.038286075},
																	{0.034798406, 0.033245005, 0.04054213, 0.03921321, 0.039370697},
																	{0.03600654, 0.036317993, 0.042091444, 0.038853552, 0.03939376},
																	{0.035039846, 0.0371171, 0.04249671, 0.03957514, 0.042881303},
																	{0.03976265, 0.035151158, 0.038358264, 0.038840927, 0.033099502}
													},
													{
																	{0.03268463, 0.04010436, 0.03687814, 0.035509314, 0.03658288},
																	{0.03720441, 0.04255468, 0.041244887, 0.039478056, 0.037145004},
																	{0.03708616, 0.034692153, 0.040113844, 0.038099412, 0.03842825},
																	{0.038612835, 0.03889178, 0.042162016, 0.038880896, 0.03818348},
																	{0.038569123, 0.038003538, 0.042989638, 0.039776303, 0.043288052},
																	{0.042309802, 0.039035667, 0.040782653, 0.04084824, 0.033590395}
													},
													{
																	{0.033938203, 0.035549995, 0.03479557, 0.03570508, 0.036484},
																	{0.03732567, 0.038406897, 0.039615806, 0.039725192, 0.037233375},
																	{0.03783592, 0.03515493, 0.039095577, 0.03777946, 0.038229357},
																	{0.03963934, 0.0396427, 0.04141144, 0.040737603, 0.03883642},
																	{0.039554723, 0.036786094, 0.04093081, 0.037864286, 0.044938643},
																	{0.043397754, 0.038477305, 0.04053076, 0.04050301, 0.03563681}
													}
									},
									{
													{
																	{0.029966522, 0.037731662, 0.037455942, 0.037763465, 0.0387208},
																	{0.03464467, 0.04294987, 0.042531483, 0.042257115, 0.040103156},
																	{0.033763546, 0.0356923, 0.040032636, 0.041886337, 0.040537108},
																	{0.034686916, 0.0375103, 0.040973015, 0.038310405, 0.038166005},
																	{0.033357404, 0.038323466, 0.04211726, 0.03913539, 0.043799162},
																	{0.036487225, 0.03244788, 0.03863547, 0.038241714, 0.035009734}
													},
													{
																	{0.032059845, 0.037868567, 0.036112875, 0.035046626, 0.03618091},
																	{0.038139936, 0.04273286, 0.041101515, 0.04036099, 0.038271423},
																	{0.03646106, 0.03574062, 0.039962433, 0.0397993, 0.03939528},
																	{0.03817389, 0.038698684, 0.040953483, 0.0383572, 0.03743065},
																	{0.03767677, 0.038496047, 0.042277437, 0.03915949, 0.044034038},
																	{0.04016522, 0.038174026, 0.041457318, 0.039543457, 0.035653923}
													},
													{
																	{0.03188011, 0.034184612, 0.03318545, 0.033442736, 0.034238793},
																	{0.03706746, 0.040092245, 0.039318744, 0.0391958, 0.036821138},
																	{0.03666951, 0.035907324, 0.039536897, 0.038182538, 0.038347077},
																	{0.03909664, 0.03890695, 0.041334826, 0.040235553, 0.03778508},
																	{0.038426477, 0.037632823, 0.04171297, 0.039131165, 0.045732982},
																	{0.041218176, 0.038121227, 0.04077321, 0.039218336, 0.037733857}
													}
									}
					};

	public static void main(String[] args) {
		System.out.println(DATA.length);
		System.out.println(DATA[0].length);
		System.out.println(DATA[0][0].length);
		System.out.println(DATA[0][0][0].length);

		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		int tMin = 0, kMin = 0, yMin = 0, xMin = 0;
		int tMax = 0, kMax = 0, yMax = 0, xMax = 0;
		for (int t = 0; t < 3; t++) {
			for (int k = 0; k < 3; k++) {
				for (int y = 0; y < 6; y++) {
					for (int x = 0; x < 5; x++) {
						double val = DATA[t][k][y][x];
						if (val > max) {
							max = val;
							tMax = t;
							kMax = k;
							yMax = y;
							xMax = x;
						}

						if (val < min) {
							min = val;
							tMin = t;
							kMin = k;
							yMin = y;
							xMin = x;
						}
					}
				}
			}
		}

		System.out.println("min = " + min);
		System.out.println("max = " + max);
		System.out.println("tMin = "+ tMin);
		System.out.println("kMin = "+ kMin);
		System.out.println("xMin = "+ xMin);
		System.out.println("yMin = "+ yMin);

		System.out.println("tMax = "+ tMax);
		System.out.println("kMax = "+ kMax);
		System.out.println("xMax = "+ xMax);
		System.out.println("ytMax = "+ yMax);
	}
}
