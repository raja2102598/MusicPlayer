package com.onebill.moduleone.musicplayer;


/*
 * Song Class to make object of this class
 *  
 * @version 1.0
 * @author Raja J
 */
public class Song{
	int Song_ID;
	String Song_Title;
	String Artist_Name;
	String Song_Location;
	String Description;
	String Album_Name;

	public Song(int song_ID, String song_Title, String artist_Name, String album_Name, String song_Location,
			String description) {
		super();
		Song_ID = song_ID;
		Song_Title = song_Title;
		Artist_Name = artist_Name;
		Album_Name = album_Name;
		Song_Location = song_Location;
		Description = description;
	}

	@Override
	public String toString() {
		return "Song [Song_ID=" + Song_ID + ", Song_Title=" + Song_Title + ", Artist_Name=" + Artist_Name
				+ ", Song_Location=" + Song_Location + ", Description=" + Description + ", Album_Name=" + Album_Name
				+ "]";
	}

	public int getSong_ID() {
		return Song_ID;
	}

	public void setSong_ID(int song_ID) {
		Song_ID = song_ID;
	}

	public String getSong_Title() {
		return Song_Title;
	}

	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}

	public String getArtist_Name() {
		return Artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}

	public String getSong_Location() {
		return Song_Location;
	}

	public void setSong_Location(String song_Location) {
		Song_Location = song_Location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getAlbum_Name() {
		return Album_Name;
	}

	public void setAlbum_Name(String album_Name) {
		Album_Name = album_Name;
	}
	
}