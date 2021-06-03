package com.onebill.moduleone.musicplayer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;

import com.onebill.moduleone.musicplayer.Song;

/*
 *Searching songs by name
 * 
 * @version 1.0
 * 
 * @author Raja J
 * 
 */
public class SearchSongsDB {
	public TreeSet<Song> getSongsDB(String songName) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TreeSet<Song> songs2 = new TreeSet<Song>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=1111";
			con = DriverManager.getConnection(url);
			String Query1 = "Select * from MusicFiles where Song_Title like ?";
			pstmt = con.prepareStatement(Query1);
			songName = songName.concat("%");
			pstmt.setString(1, songName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int Song_ID = rs.getInt("Song_ID");
				String Song_Title = rs.getString("Song_Title");
				String Artist_Name = rs.getString("Artist_Name");
				String Album_Name = rs.getString("Album_Name");
				String Song_Location = rs.getString("Song_Location");
				String Description = rs.getString("Description");
				songs2.add(new Song(Song_ID, Song_Title, Artist_Name, Album_Name, Song_Location, Description));
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return songs2;
	}
}
