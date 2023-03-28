package music_store;

import java.util.Arrays;

public class Album {
	private String albumName;
	private String singer;
	private int year;
	private double albumPrice;
	private Song [] songs;
	public Album(String albumName, String singer, int year, double albumPrice, Song[] songs) {
		this.albumName = albumName;
		this.singer = singer;
		this.year = year;
		this.albumPrice = albumPrice;
		this.songs = songs;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getAlbumPrice() {
		return albumPrice;
	}
	public void setAlbumPrice(double albumPrice) {
		this.albumPrice = albumPrice;
	}
	public Song[] getSongs() {
		return songs;
	}
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
	
	
}
