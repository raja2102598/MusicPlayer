package com.onebill.moduleone.musicplayer;

import java.util.Scanner;


/*
 * Main Method of the Project
 * 
 * @version 1.0
 * 
 * @author Raja J
 * 
 */
public class MusicPlayer {

	public static void main(String[] args) {
//		declaring variables
		String choiceOne; 
		String choiceTwo; 
		int i=0;
		while(i==0) {
			System.out.println("=================================\nMusic Player \n==============================="
					+ "==\nWelcome !\nOptions\n1.Play a song(Press 1)\n2.Search a song(Press 2)\n"
					+ "3.Show all songs(Press 3)\n4.Operate on song Database(Press 4)\n5.To Exit (Press 5)\nEnter Your Choice: ");
			Scanner scan1=new Scanner(System.in);
//			getting input from user
			int choice1=scan1.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("\nPress A to Play all songs\nPress B to Play songs randomly\nPress C to Play a particular song\n"
						+ "Enter your Choice: ");
				choiceOne=scan1.next();
				switch (choiceOne) {
				case "A":
					 PlaySongs playA=new PlaySongs();
//					 calling method
					 playA.playAllSongs();
					break;
				case "B":
					 PlaySongs playR=new PlaySongs();
//					 calling method
					 playR.playSongsRandom();
					break;
				case "C":
					PlaySongs playp=new PlaySongs();
//					calling method
					playp.playParticularSong();
					break;
				default:
					System.out.println("Wrong Choice");
					break;
				}
				break;
			case 2:
				SearchSong ss=new SearchSong();
//				calling method
				ss.displaySongs();
				break;
			case 3:
				System.out.println("Display all");
				AllSongs song=new AllSongs();
//				calling method
				song.displayAllSongs();
				break;
			case 4:
				System.out.println("\nPress A to Add Songs to Repository\nPress B to Edit an Existing Song\nPress C to Delete an Existing Song\n"
						+ "Enter your Choice: ");
//				getting input from user
				choiceTwo=scan1.next();
				switch (choiceTwo) {
				case "A":
					CRUDOperations add=new CRUDOperations();
//					calling method
					add.addSong();
					break;
				case "B":
					CRUDOperations edit=new CRUDOperations();
//					calling method
					edit.updateSong();
					break;
				case "C":
					CRUDOperations del=new CRUDOperations();
//					calling method
					del.deleteSong();
					break;
				default:
					System.out.println("Wrong Choice");
					break;
				}
				break;
			case 5:
				i=5;
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
	}

}
