import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OfficeStuff {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		TreeMap<String, LinkedHashMap<String, Integer>> companyMap = new TreeMap<>();

		int n = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < n; i++) {
			String input = scn.nextLine().replaceAll("[| ]", "");
			String[] products = input.split("-");
			String company = products[0];
			int qty = Integer.parseInt(products[1]);
			String item = products[2];

			if (!companyMap.containsKey(company)) {
				LinkedHashMap<String, Integer> itemAndQty = new LinkedHashMap<>();
				itemAndQty.put(item, qty);
				companyMap.put(company, itemAndQty);
			} else {

				LinkedHashMap<String, Integer> itemAndQty = companyMap
						.get(company);
				if (!itemAndQty.containsKey(item)) {
					itemAndQty.put(item, qty);
				} else {
					int tempDistance = itemAndQty.get(item);
					tempDistance += qty;
					itemAndQty.put(item, tempDistance);
				}
				companyMap.put(company, itemAndQty);
			}
		}

		for (Iterator it = companyMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry company = (Map.Entry) it.next();

			String outputLine = company.getKey() + ": ";

			LinkedHashMap<String, Integer> itemAndQty = (LinkedHashMap<String, Integer>) company
					.getValue();
			for (Iterator it2 = itemAndQty.entrySet().iterator(); it2.hasNext();) {
				Map.Entry item = (Map.Entry) it2.next();

				outputLine += item.getKey() + "-" + item.getValue() + ", ";
			}

			outputLine = outputLine.substring(0, outputLine.length() - 2);
			System.out.println(outputLine);
		}
	}
}
