package com.iocean.utilitaires;

import java.util.Comparator;

import com.iocean.model.Emprunt;

public class EmpruntComparatorDate implements Comparator<Emprunt> {

	public int compare(Emprunt o1, Emprunt o2) {
		return o1.getDate_emprunt().compareTo(o2.getDate_emprunt());
	}

}
