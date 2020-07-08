import java.util.List;

public class Mainnnn {
	public static long  getMaxPercentage(List deals) {
        if (deals != null) {
            if (deals.size() > 1) {
                for (int i = 0; i < deals.size(); i++) {
                    for (int j = i + 1; j < deals.size(); j++) {
						/*
						 * long max = (((PercentageDiscount) deals.get(0).getDiscount()).getPercentage()
						 * / 100); if ((((PercentageDiscount)
						 * deals.get(j).getDiscount()).getPercentage() / 100) > max) return max =
						 * (((PercentageDiscount) deals.get(j).getDiscount()).getPercentage() / 100);
						 */
                    }
                }
            }
        }
		return 0;	
    }
}
