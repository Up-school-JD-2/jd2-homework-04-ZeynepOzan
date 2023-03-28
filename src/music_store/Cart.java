package music_store;

public class Cart {
	private Album album;
	private Song song;
	private double price;

	public Cart(Album album, Song song, double price) {
		this.album = album;
		this.song = song;
		this.price = price;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
