package com.onebill.moduleone.musicplayer.jdbc;

import java.util.Comparator;


/*
 * Sort Songs by name
 *  
 * @version 1.0
 * 
 * @author Raja J
 * 
 */

import com.onebill.moduleone.musicplayer.Song;

public class SortByName implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		return o1.getSong_Title().compareTo(o2.getSong_Title());
	}

}
