package music_store;

import java.util.ArrayList;
import java.util.List;

public class MusicStore {
	public static final List<Album> ALBUMS_LIST = new ArrayList<>();
	public static final List<Song> SONGS_LIST = new ArrayList<>();
	public static final List<User> USERS_LIST = new ArrayList<>();

	public static void generateStore() {

		Song song1 = new Song("Cruel World", "Lana Del Ray", 6.39, 35);
		Song song2 = new Song("Ultraviolence", "Lana Del Ray", 4.11, 50);
		Song song3 = new Song("Shades Of Cool", "Lana Del Ray", 5.42, 60);
		Song song4 = new Song("Brooklyn Baby", "Lana Del Ray", 5.51, 35);
		Song song5 = new Song("Safe and Sound", "Capital Cities", 3.13, 24);
		Song song10 = new Song("Kangou", "Capital Cities", 3.10, 90);
		Song song6 = new Song("Don't Panic", "Coldplay", 2.15, 25);
		Song song7 = new Song("Sparks", "Coldplay", 3.47, 65);
		Song song8 = new Song("Yellow", "Coldplay", 4.26, 23);
		Song song9 = new Song("Parachutes", "Coldplay", 0.46, 88);

		Album album1 = new Album("Ultraviolence", "Lana Del Ray", 2014, 400, new Song[] { song1, song2, song3, song4 });
		Album album2 = new Album("Fix You", "Coldplay", 2000, 500, new Song[] { song6, song7, song8, song9 });
		Album album3 = new Album("Safe and Sound", "Capital Cities", 2012, 340, new Song[] { song5, song10 });

		User user1 = new User("ZeynepOzan1", "vıe@gmail.com");
		User user2 = new User("Zeynep", "kfoe@gmail.com");

		USERS_LIST.add(user1);
		USERS_LIST.add(user2);

		SONGS_LIST.add(song1);
		SONGS_LIST.add(song2);
		SONGS_LIST.add(song3);
		SONGS_LIST.add(song4);
		SONGS_LIST.add(song5);
		SONGS_LIST.add(song6);
		SONGS_LIST.add(song7);
		SONGS_LIST.add(song8);
		SONGS_LIST.add(song9);
		SONGS_LIST.add(song10);

		ALBUMS_LIST.add(album1);
		ALBUMS_LIST.add(album2);
		ALBUMS_LIST.add(album3);

	}

	public static void printUser() {
		System.out.println("-----KULLANICI LISTESI-----");
		for (User users : USERS_LIST) {
			System.out.println(users.toString());
			System.out.println();
		}
		System.out.println();
	}

	public static void printAlbum() {
		System.out.println("-----ALBUM LISTESI-----");

		for (Album albums : ALBUMS_LIST) {
			System.out.println("Albüm Adı : " + albums.getAlbumName() + "\n" + "Şarkıcı Adı: " + albums.getSinger());
			System.out.println();
		}
	}

	public static void printSong() {
		System.out.println("-----SARKI LISTESI-----");
		for (Song songs : SONGS_LIST) {
			System.out.println("Şarkı Adı : " + songs.getSongName() + "\nŞarkıcı Adı: " + songs.getSingerName());
			System.out.println();
		}
	}
	
	public static void addAlbumToCart(Album album) {
		
		
	}
	public static void addSongToCart(Song song) {
		
	}

}
