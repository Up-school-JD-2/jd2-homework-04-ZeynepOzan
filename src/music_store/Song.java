package music_store;

public class Song {
	private String songName;
	private String singerName;
	private double songLength;
	private double price;
	public Song(String songName, String singerName, double songLength, double price) {
		this.songName = songName;
		this.singerName = singerName;
		this.songLength = songLength;
		this.price = price;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public double getSongLength() {
		return songLength;
	}
	public void setSongLength(double songLength) {
		this.songLength = songLength;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
