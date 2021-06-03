package com.onebill.moduleone.musicplayer;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.onebill.moduleone.musicplayer.jdbc.DbConn;
import com.onebill.moduleone.musicplayer.jdbc.SearchSongsDB;


/*
 * Method implemented to search songs
 *  
 * @version 1.0
 * 
 * @author Raja J
 * 
 */
public class SearchSong {
	synchronized void displaySongs() {
//		declaring variables
		String songName1;
		DbConn obj = new DbConn();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Song Name To Search: ");
//		getting input from user
		songName1 = s.nextLine();
//		calling method
		TreeSet<Song> singleSong1 = obj.getParticularSongDB(songName1);
		Iterator<Song> itera = singleSong1.iterator();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("| File Name \t| Attributes\t\t\t\t\t\t\t\t\t\t\t| Play\t|");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		while (itera.hasNext()) {
			Song next = itera.next();
			System.out.println("|"+ next.Song_Title+"\t\t|Title :"+next.Song_Title+"Album Name :"+next.Album_Name+"Artist Name : "+next.Artist_Name+" \t\t| "+next.Song_ID);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter the number to play Song");
		int choice =s.nextInt();		
		Iterator<Song> itera1 = singleSong1.iterator();
		int flag=0;
		while(itera1.hasNext()) {
			Song next1 = itera1.next();
			if(next1.Song_ID==choice) {
				System.out.println("Playing "+next1.Song_Title);
				flag=1;
				try {
					System.out.println("___");
					wait(1000);
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
		}
		if(flag==0)
			System.out.println("Entered Wrong number");
	}

}
