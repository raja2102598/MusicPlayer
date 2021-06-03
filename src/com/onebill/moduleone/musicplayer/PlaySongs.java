package com.onebill.moduleone.musicplayer;
import com.onebill.moduleone.musicplayer.jdbc.DbConn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;


/*
 * All songs,Random songs,Particular song is implemented here
 * 
 * @version 1.0
 * 
 * @author Raja J
 * 
 */

public class PlaySongs {

	synchronized void playAllSongs() {
		DbConn obj = new DbConn();
		TreeSet<Song> s = obj.getAllSongs();
		Iterator<Song> iterator = s.iterator();
		while (iterator.hasNext()) {
			Song next = iterator.next();
			System.out.println("Playing " + next.Song_Title);
			try {
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void playSongsRandom() {
		DbConn obj = new DbConn();
		TreeSet<Song> s = obj.getAllSongs();
		ArrayList<Song> arS = new ArrayList<Song>(s);
		Random rand = new Random();
		int i=0;
		while (arS.size() > 0) {
			int index = rand.nextInt(arS.size());
			System.out.println("Playing " +arS.get(index).Song_Title);
			arS.remove(index);
			try {
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
				System.out.println("_");
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void playParticularSong() {
		String songName;
		Scanner s = new Scanner(System.in);
		DbConn obj = new DbConn();
		System.out.println("Enter The Song Name : ");
		songName = s.nextLine();
		TreeSet<Song> singlesong = obj.getParticularSongDB(songName);
		if (singlesong.size() > 0) {
			Iterator<Song> iterator = singlesong.iterator();
			while (iterator.hasNext()) {
				Song next1 = iterator.next();
				System.out.println("Playing " + next1.Song_Title);
				try {
					System.out.println("___");
					wait(1000);
					System.out.println("___");
					wait(1000);
					System.out.println("___");
					wait(1000);
					System.out.println("___");
					wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("Song not found");
		}
	}

}
