package com.iocean.utiltaires;

import java.util.Comparator;

import com.iocean.model.Medias;

public class MediasComparatorDate implements Comparator<Medias> {

	public int compare(Medias o1, Medias o2) {
		return o1.getDateEmprunt().compareTo(o2.getDateEmprunt());
	}

}
