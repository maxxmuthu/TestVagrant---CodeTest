package com.codingtest.TestVagrant;

/**
 * @author Muthukumar G added on 17th Mar 2023
 * 
 * Coding Assignment
 * Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. 
 * This store must have the capability to store a list of song-user pairs, with each song linked to a user.
 * It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.
 * 
 */

public class UsersAndSongs {

	public static void main(String[] args) {
			
		 RecentlyPlayedStore store = new RecentlyPlayedStore();   // creating the object from 'RecentlyPlayedStore' class
		 
	        store.setCapacity(3);
	        
	        store.playSong("user", "S1");    // adding user and song 
	        store.playSong("user", "S2");    // adding user and song 
	        store.playSong("user", "S3");    // adding user and song 
	      
	        System.out.println(store.getRecentlyPlayedSongs("user")); // Printing the recently played songs lists after adding the first 3 songs for user
	        
	        store.playSong("user", "S4");
	        System.out.println(store.getRecentlyPlayedSongs("user")); // Printing the recently played songs lists after adding the fourth song for user
	        
	        store.playSong("user", "S2");
	        System.out.println(store.getRecentlyPlayedSongs("user")); // Printing the recently played songs lists after replay the second song for user
	        
	        store.playSong("user", "S1");
	        System.out.println(store.getRecentlyPlayedSongs("user")); // Printing the recently played songs lists after replay the first song for user
	}

}
