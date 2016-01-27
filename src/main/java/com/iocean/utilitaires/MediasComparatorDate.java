package com.iocean.utilitaires;

import java.util.Comparator;

import com.iocean.model.Media;

public class MediasComparatorDate implements Comparator<Media> {

	public int compare(Media o1, Media o2) {
		return o1.getDateEmprunt().compareTo(o2.getDateEmprunt());
	}

}
