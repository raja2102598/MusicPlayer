package com.onebill.moduleone.musicplayer;

/*
 * CRUD functionality is implemented in this class
 * 
 * @version 1.0
 * @author Raja J
 */

import java.util.Scanner;

import com.onebill.moduleone.musicplayer.jdbc.CRUDOperationsDB;

public class CRUDOperations {
	
	public void addSong() {
//		declaring variables
		String sTitle1;
		String sArtist1;
		String sAlbum1;
		String sSongLoc1;
		String sDesc1;
//		getting input from user
		Scanner s1=new Scanner(System.in);
		System.out.print("Add Song\n Enter Song Title : ");
		sTitle1=s1.nextLine();
		System.out.print("\n Enter Artist Name : ");
		sArtist1=s1.nextLine();
		System.out.print("\n Enter Album Name : ");
		sAlbum1=s1.nextLine();
		System.out.print("\n Enter Song Location : ");
		sSongLoc1=s1.nextLine();
		System.out.print("\n Enter Song Description: ");
		sDesc1=s1.nextLine();
		CRUDOperationsDB db=new CRUDOperationsDB();
		db.addSongDB(sTitle1,sArtist1,sAlbum1,sSongLoc1,sDesc1);
	}
	public void updateSong() {
//		declaring variables
		String sTitle2;
		String sArtist2;
		String sAlbum2;
		String sSongLoc2;
		String sDesc2;
		int s_id1;
//		getting input from user
		Scanner s1=new Scanner(System.in);
		System.out.print("Edit Song\n Enter Song Title : ");
		sTitle2=s1.nextLine();
		System.out.print("\n Enter Artist Name : ");
		sArtist2=s1.nextLine();
		System.out.print("\n Enter Album Name : ");
		sAlbum2=s1.nextLine();
		System.out.print("\n Enter Song Location : ");
		sSongLoc2=s1.nextLine();
		System.out.print("\n Enter Song Description: ");
		sDesc2=s1.nextLine();
		System.out.print("\n Enter Song Id: ");
		s_id1=s1.nextInt();
		CRUDOperationsDB db=new CRUDOperationsDB();
//		calling method
		db.editSongDB(sTitle2, sArtist2, sAlbum2, sSongLoc2, sDesc2, s_id1);
	}
	
	public void deleteSong() {
		int s_id2;
		Scanner s2=new Scanner(System.in);
//		getting input from user
		System.out.print("Delete Song\n Enter Song Id : ");
		s_id2=s2.nextInt();
//		calling method
		CRUDOperationsDB db=new CRUDOperationsDB();
		db.deleteSongDB(s_id2);
	}

}
