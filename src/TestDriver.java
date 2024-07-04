import com.npru.se65.id65001.BmiIndexer;
import com.npru.se65.id65001.HealthAnalyzer;
import com.npru.se65.id65001.HumanBeing;

public class TestDriver {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(175);
		hb.setWeight(55);
		hb.calculateBMI();
		System.out.println(hb.analyzeBmi());
	}
}
