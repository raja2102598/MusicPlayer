package com.onebill.moduleone.musicplayer;

/*
 * Class for displaying all songs table
 * 
 * @version 1.0
 * @author Raja J
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.onebill.moduleone.musicplayer.jdbc.DbConn;

public class AllSongs {
	public void displayAllSongs() {
//		creating db object
		DbConn obj = new DbConn();
//		treeset containing all the songs object
		TreeSet<Song> singleSong2 = obj.getAllSongs();
		Iterator<Song> iterar = singleSong2.iterator();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("| File Name \t\t| Attributes\t\t\t\t\t\t\t\t\t\t\t| Play\t|");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------");
		while (iterar.hasNext()) {
			Song next = iterar.next();
			System.out.println("|" + next.Song_Title + "\t\t|Title :" + next.Song_Title + "Album Name :"
					+ next.Album_Name + "Artist Name : " + next.Artist_Name + " \t\t| " + next.Song_ID);
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------");
	}
}
