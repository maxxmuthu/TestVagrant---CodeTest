package com.codingtest.TestVagrant;

import java.util.ArrayList;
import java.util.List;

 /**
 * @author Muthukumar G added on 17th Mar 2023
 * 
 * Coding Assignment
 * Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. 
 * This store must have the capability to store a list of song-user pairs, with each song linked to a user.
 * It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.
 * 
 */

public class RecentlyPlayedStore {
	
     int capacity;
     List<String> songs = new ArrayList<>();      //Creating the arraylist for list of songs
     List<String> users = new ArrayList<>();      //Creating the arraylist for list of users

    public void setCapacity(int capacity) {
        this.capacity = capacity;                  //Setting the song capacity
    }

    public void playSong(String user, String song) {
        if (songs.contains(song)) {                //if song is already present it will remove from the list
            songs.remove(song);                          
            users.remove(song);
        }
        
        songs.add(song);                            // adding the song
        users.add(user);                            // adding the user
        
        if (songs.size() > capacity) {             // if the songs has exceeded its maximum capacity, the oldest song is removed.  
            songs.remove(0);
            users.remove(0);
        }
    }

    public List<String> getRecentlyPlayedSongs(String user) {
    	
        List<String> recentlyPlayedSongs = new ArrayList<>();
        
        for (int i = songs.size()-1; i >= 0; i--) {   
        	
            if (users.get(i).equals(user)) {       //loops through the users
            	
                recentlyPlayedSongs.add(songs.get(i)); //adding the songs is added for user
            }
        }
        
        return recentlyPlayedSongs;
    }

	
}
