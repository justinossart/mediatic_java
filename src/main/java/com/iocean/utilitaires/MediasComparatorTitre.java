package com.iocean.utilitaires;

import java.util.Comparator;
import com.iocean.model.Medias;

public class MediasComparatorTitre implements Comparator<Medias> {

	public int compare(Medias o1, Medias o2) {
		return o1.getTitre().compareTo(o2.getTitre());
	}

}
