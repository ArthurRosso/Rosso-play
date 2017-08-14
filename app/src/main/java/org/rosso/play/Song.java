package org.rosso.play;

/**
 * Created by Arthur Rosso on 13/08/2017.
 */

public class Song {
	private long id;
	private String title;
	private String artist;

	public long getID(){return id;}
	public String getTitle(){return title;}
	public String getArtist(){return artist;}

	public Song(long songID, String songTitle, String songArtist) {
		id=songID;
		title=songTitle;
		artist=songArtist;
	}
}
