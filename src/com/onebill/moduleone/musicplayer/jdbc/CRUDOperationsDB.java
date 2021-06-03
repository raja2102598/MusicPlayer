package com.onebill.moduleone.musicplayer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


/*
 * CRUD JDBC Operations is implemented in this class
 * 
 * @version 1.0
 * 
 * @author Raja J
 * 
 */
public class CRUDOperationsDB {
	
	//Adding a song to db
	public void addSongDB(String sTitle1, String sArtist1, String sAlbum1, String sSongLoc1, String sDesc1) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=1111";
			con = DriverManager.getConnection(url);
			String query="insert into musicfiles(Song_Title,Artist_Name,Album_Name,Song_Location,Description) values(?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, sTitle1);
			pstmt.setString(2, sArtist1);
			pstmt.setString(3, sAlbum1);
			pstmt.setString(4, sSongLoc1);
			pstmt.setString(5, sDesc1);
			int res=pstmt.executeUpdate();
			if(res>0)
				System.out.println("Inserted");
			else {
				System.out.println("Failed to Insert");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Updating a song 
	public void editSongDB(String sTitle2, String sArtist2, String sAlbum2, String sSongLoc2, String sDesc2,
			int sId1) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=1111";
			con = DriverManager.getConnection(url);
			String query = "update musicfiles set Song_Title=?,Artist_Name=?,Album_Name=?,Song_Location=?,Description=? where Song_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, sTitle2);
			pstmt.setString(2, sArtist2);
			pstmt.setString(3, sAlbum2);
			pstmt.setString(4, sSongLoc2);
			pstmt.setString(5, sDesc2);
			pstmt.setInt(6, sId1);
			int res=pstmt.executeUpdate();
			if(res>0)
				System.out.println("Updated");
			else {
				System.out.println("Failed To Update");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	//deleting a song
	public void deleteSongDB(int sId2) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=1111";
			con = DriverManager.getConnection(url);
			String query="delete from musicfiles where Song_ID=?";
			ps = con.prepareStatement(query);
			ps.setInt(1, sId2);
			int count=ps.executeUpdate();
			if(count>0)
				System.out.println("Deleted");
			else 
				System.out.println("Failed to delete");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
