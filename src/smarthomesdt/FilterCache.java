/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomesdt;

import java.util.Hashtable;

/**
 *
 * @author cristina
 */

public class FilterCache {
	private static Hashtable<String, Filter> filterMap = new Hashtable<>();

	public static Filter getFilter(String message) {
		Filter f = filterMap.get(message);
		return (Filter) f.clone();
	}

	public static void loadCache() {
		Filter r = new Filter();
		r.setWord("moderate");
		r.setFilter("Moderate");
		filterMap.put(r.getWord(), r);

		Filter p = new Filter();
		p.setWord("severe");
		p.setFilter("Severe");
		filterMap.put(p.getWord(), p);
	}
}
