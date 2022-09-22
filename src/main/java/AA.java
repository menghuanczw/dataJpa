import java.math.BigDecimal;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal b = new BigDecimal("1098.145");
		BigDecimal c = new BigDecimal("1");
		b = b.add(c);
		System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		System.out.println(b.setScale(2, BigDecimal.ROUND_HALF_DOWN));
		
	}

}
