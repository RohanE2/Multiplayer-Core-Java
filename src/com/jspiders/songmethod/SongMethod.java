package com.jspiders.songmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


import com.jspiders.multipalyer.Multiplayer;
import com.jspiders.songoperation.SongOperation;

public class SongMethod extends SongOperation  {
	
	private static Boolean loop = true;
	static ArrayList Display = new ArrayList();
	
	
	
	static SongOperation defaultSong1;
	static SongOperation defaultSong2;
	static SongOperation defaultSong3;
	static SongOperation defaultSong4;
	static SongOperation defaultSong5;
	
	static SongOperation song;
	static SongOperation song1;
	static SongOperation song2;
	static SongOperation song3;
	static SongOperation song4;
	static SongOperation song5;
	
	
	
	
	
		public static void menu() {
			
			while(loop == true) {
			System.out.println("(1) Play Song");
			System.out.println("(2) Add/Remove Song");
			System.out.println("(3) Edit");
			System.out.println("(4) Exit");
				
			defaultSongs();
			
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				switch(input) {
				case 1: playSong();
						break;
				case 2: addRemoveSong();
						break;
				case 3: edit();
						break;
				case 4: exit();
						break;		
				default: System.out.println("Invaild Number " + input);
						menu();
						
				 }
				sc.close();
//				loop = false;
				}
		}
	
		public static void playSong() {
	
			System.out.println("(1) Choose Song");
			System.out.println("(2) Random Song");
			System.out.println("(3) All Song");
			System.out.println("(4) Go Back");
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
	
			switch(input) {
			case 1: chooseSong();
					break;
			case 2: randomSong();
					break;
			case 3: allSong();
					break;
			case 4: goBack();
					break;
			default: System.out.println("Invaild Number " + input);		
					playSong();
			}
			sc.close();
		}
		
		public static void back() {
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input) {
			case 1: playSong();
					break;
			default: System.out.println("Invaild Number " + input);
					 back();
			}
			sc.close();
		}
		
		public static void 	defaultSongs() {
			 	defaultSong1 = new SongOperation();
			 	ArrayList Display1 = new ArrayList();
		
				
					defaultSong1.setNo(1);
					Display1.add(defaultSong1.getNo());
				
					defaultSong1.setSongName("That'Not True");
					Display1.add(defaultSong1.getSongName());
				
					defaultSong1.setArtistName("Skip Marley");
					Display1.add(defaultSong1.getArtistName());
				
					defaultSong1.setProd("Paul Rodgers");
					Display1.add(defaultSong1.getProd());
				
					defaultSong1.setDuration(3.19);
					Display1.add(defaultSong1.getDuration());
			
					defaultSong1.setReleaseDt("08-may-2019");
					Display1.add(defaultSong1.getReleaseDt());
				
					Display.add(Display1);
					
				
				defaultSong2 = new SongOperation();
				ArrayList Display2 = new ArrayList();
		
				
					defaultSong2.setNo(2);
					Display2.add(defaultSong2.getNo());
				
					defaultSong2.setSongName("Lightblood");
					Display2.add(defaultSong2.getSongName());
				
					defaultSong2.setArtistName("AlexSerra");
					Display2.add(defaultSong2.getArtistName());
				
					defaultSong2.setProd("Toti Arimany");
					Display2.add(defaultSong2.getProd());
				
					defaultSong2.setDuration(5.07);
					Display2.add(defaultSong2.getDuration());
			
					defaultSong2.setReleaseDt("20-june-2019");
					Display2.add(defaultSong2.getReleaseDt());
				
					Display.add(Display2);
					
				
				defaultSong3 = new SongOperation();
				ArrayList Display3 = new ArrayList();
			
					
					defaultSong3.setNo(3);
					Display3.add(defaultSong3.getNo());
					
					defaultSong3.setSongName("Ahora");
					Display3.add(defaultSong3.getSongName());
					
					defaultSong3.setArtistName("AlexSerra");
					Display3.add(defaultSong3.getArtistName());
					
					defaultSong3.setProd("Toti Arimany");
					Display3.add(defaultSong3.getProd());
					
					defaultSong3.setDuration(4.26);
					Display3.add(defaultSong3.getDuration());
				
					defaultSong3.setReleaseDt("20-june-2019");
					Display3.add(defaultSong3.getReleaseDt());
					
					Display.add(Display3);
					
					
				defaultSong4 = new SongOperation();
				ArrayList Display4 = new ArrayList();
			
		
					defaultSong4.setNo(4);
					Display4.add(defaultSong4.getNo());
					
					defaultSong4.setSongName("Conversations");
					Display4.add(defaultSong4.getSongName());
					
					defaultSong4.setArtistName("Juice WRLD");
					Display4.add(defaultSong4.getArtistName());
					
					defaultSong4.setProd("Ronny J");
					Display4.add(defaultSong4.getProd());
					
					defaultSong4.setDuration(3.02);
					Display4.add(defaultSong4.getDuration());
				
					defaultSong4.setReleaseDt("10-july-2022");
					Display4.add(defaultSong4.getReleaseDt());
					
					Display.add(Display4);
					
					
				defaultSong5 = new SongOperation();
				ArrayList Display5 = new ArrayList();
			
					defaultSong5.setNo(5);
					Display5.add(defaultSong5.getNo());
					
					defaultSong5.setSongName("Efecto Mariposa");
					Display5.add(defaultSong5.getSongName());
					
					defaultSong5.setArtistName("Mandragora");
					Display5.add(defaultSong5.getArtistName());
					
					defaultSong5.setProd("Mandragora");
					Display5.add(defaultSong5.getProd());
					
					defaultSong5.setDuration(3.00);
					Display5.add(defaultSong5.getDuration());
				
					defaultSong5.setReleaseDt("6-11-2020");
					Display5.add(defaultSong5.getReleaseDt());
					
					Display.add(Display5);	
						
		}
		
		public static void chooseSong() {
			
			HashSet list0 = new HashSet(Display);
			for(Object var:list0) {
				System.out.println(var);
			}
			System.out.println("Enter the song no.");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input) {
			case 1: 
					System.out.println(defaultSong1);
					System.out.println("Playing song");
					break;
			case 2: System.out.println(defaultSong2);
					System.out.println("Playing song");
					break;
			case 3: System.out.println(defaultSong3);
					System.out.println("Playing song");
					break;
			case 4: System.out.println(defaultSong4);
					System.out.println("Playing song");
					break;
			case 5: System.out.println(defaultSong5);
					System.out.println("Playing song");
					break;
			case 6: System.out.println(song);
					System.out.println("Playing song");
					break;
			case 7: System.out.println(song1);
					System.out.println("Playing song");
					break;	
			case 8: System.out.println(song2);
					System.out.println("Playing song");
					break;	
			case 9: System.out.println(song3);
					System.out.println("Playing song");
					break;	
			case 10:System.out.println(song4);
					System.out.println("Playing song");
					break;	
			case 11:System.out.println(song5);
					System.out.println("Playing song");
					break;	
			default:System.out.println("Invaild Number " + input);
					chooseSong();
			}
			
			System.out.println("(1) Go back");
			back();
		}
		
		public static void randomSong() {
			HashSet list = new HashSet(Display);
			int rand = (int)(Math.random() * list.size());
			System.out.println(rand);
			switch(rand) {
			case 1: System.out.println(defaultSong1);
					break;
			case 2: System.out.println(defaultSong2);
					break;
			case 3: System.out.println(defaultSong3);
					break;
			case 4: System.out.println(defaultSong4);
					break;
			case 5: System.out.println(defaultSong5);
					break;
			case 6: System.out.println(song);
					break;
			case 7: System.out.println(song1);
					break;
			case 8: System.out.println(song2);
					break;
			case 9: System.out.println(song3);
					break;
			case 10: System.out.println(song4);
					break;
			case 11: System.out.println(song5);
					break;
			default:System.out.println(defaultSong5);		
			}
			System.out.println("(1) Go back");
			back();
		}	
		
		public static void allSong() {
			HashSet list1 = new HashSet(Display);
			int rand = 0;
			for(int i = 1;i<=list1.size();i++) {
				rand++;
				switch(rand) {
				case 1: System.out.println(defaultSong1);
						break;
				case 2: System.out.println(defaultSong2);
						break;
				case 3: System.out.println(defaultSong3);
						break;
				case 4: System.out.println(defaultSong4);
						break;
				case 5: System.out.println(defaultSong5);
						break;
				case 6: System.out.println(song);
						break;
				case 7: System.out.println(song1);
						break;
				case 8: System.out.println(song2);
						break;
				case 9: System.out.println(song3);
						break;
				case 10: System.out.println(song4);
						break;
				case 11: System.out.println(song5);
						break;
				default:System.out.println(defaultSong5);
				}
			}
			System.out.println("(1) Go back");
			back();
		}
		public static void goBack() {
			menu();
		}	
			
			
			
		
		
		public static void addRemoveSong() {
			System.out.println("(1) Add Song");
			System.out.println("(2) Remove Song");
			System.out.println("(3) Go Back");
			
			
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
	
			switch(input) {
			case 1: addSong();
					break;
			case 2: removeSong();
					break;
			case 3: goBack();
					break;
			default: System.out.println("Invaild Number " + input);		
					addRemoveSong();
			}
			sc.close();
		}
		
		public static void back1() {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input) {
			case 1:addRemoveSong();
					break;
			default:System.out.println("Invaild Number " + input);
					addRemoveSong();
			}
			
		}
		
		public static void addSong() {
			try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How many songs you wanted to add (MAX 3)?");
			int input = sc.nextInt();
			switch(input) {
			case 1:	 song = new SongOperation();
					ArrayList addSong = new ArrayList();
			
//					System.out.println("Enter the Song no");
					song.setNo(6);
					addSong.add(song.getNo());
					
//					System.out.println("Enter the Song Name");
//					sc.nextLine();
					song.setSongName("Outter Space");
					addSong.add(song.getSongName());
					
//					System.out.println("Enter the Artist Name");
//					sc.nextLine();
					song.setArtistName("AlexSerra");
					addSong.add(song.getArtistName());
					
//					System.out.println("Enter the Producer Name");
//					sc.nextLine();
					song.setProd("Toti Arimany");
					addSong.add(song.getProd());
					
//					System.out.println("Enter the Song Duration");
					song.setDuration(4.26);
					addSong.add(song.getDuration());
					
//					System.out.println("Enter the Song Release Date");
//					sc.nextLine();
					song.setReleaseDt("23-12-2018");
					addSong.add(song.getReleaseDt());
					
					Display.add(addSong);
					
					System.out.println("1 Song added Automatically");
					System.out.println("(1)Go back");
					
					back1();
					
					break;
					
			case 2:	 song1 = new SongOperation();
					ArrayList addSong1 = new ArrayList();
					
					System.out.println("Enter the Song no");
					song1.setNo(sc.nextInt());
					addSong1.add(song1.getNo());
					
					System.out.println("Enter the Song Name");
					sc.nextLine();
					song1.setSongName(sc.next());
					addSong1.add(song1.getSongName());
					
					System.out.println("Enter the Artist Name");
					sc.nextLine();
					song1.setArtistName(sc.next());
					addSong1.add(song1.getArtistName());
			
					System.out.println("Enter the Producer Name");
					sc.nextLine();
					song1.setProd(sc.next());
					addSong1.add(song1.getProd());
					
					System.out.println("Enter the Song Duration");
					song1.setDuration(sc.nextDouble());
					
					addSong1.add(song1.getDuration());
						
					System.out.println("Enter the Song Release Date");
					sc.nextLine();
					song1.setReleaseDt(sc.next());
					addSong1.add(song1.getReleaseDt());
					
					System.out.println("Song added successfuly");
					System.out.println("Enter 2nd song");
					
					Display.add(addSong1);
					
					song2 = new SongOperation();
					
					System.out.println("Enter the Song no");
					song2.setNo(sc.nextInt());
							
					System.out.println("Enter the Song Name");
					sc.nextLine();
					song2.setSongName(sc.next());
						
					System.out.println("Enter the Artist Name");
					sc.nextLine();
					song2.setArtistName(sc.next());
						
					System.out.println("Enter the Producer Name");
					sc.nextLine();
					song2.setProd(sc.next());
						
					System.out.println("Enter the Song Duration");
					song2.setDuration(sc.nextDouble());
						
					System.out.println("Enter the Song Release Date");
					sc.nextLine();
					song2.setReleaseDt(sc.next());
					
					System.out.println("Song added successfuly");
					
					ArrayList addSong2 = new ArrayList();
					addSong2.add(song2.getNo());
					addSong2.add(song2.getSongName());
					addSong2.add(song2.getArtistName());
					addSong2.add(song2.getProd());
					addSong2.add(song2.getDuration());
					addSong2.add(song2.getReleaseDt());

					Display.add(addSong2);
							
					System.out.println("(1)Go back");
					
					back1();
					
					break;
					
			case 3:	ArrayList addSong3 = new ArrayList();
					song3 = new SongOperation();
					
					System.out.println("Enter the Song no");
					song3.setNo(sc.nextInt());
					addSong3.add(song3.getNo());
			
					System.out.println("Enter the Song Name");
					sc.nextLine();
					song3.setSongName(sc.next());
					addSong3.add(song3.getSongName());
			
					System.out.println("Enter the Artist Name");
					sc.nextLine();
					song3.setArtistName(sc.next());
					addSong3.add(song3.getArtistName());
			
					System.out.println("Enter the Producer Name");
					sc.nextLine();
					song3.setProd(sc.next());
					addSong3.add(song3.getProd());
			
					System.out.println("Enter the Song Duration");
					song3.setDuration(sc.nextDouble());
					addSong3.add(song3.getDuration());
			
					System.out.println("Enter the Song Release Date");
					sc.nextLine();
					song3.setReleaseDt(sc.next());
					addSong3.add(song3.getReleaseDt());
			
					System.out.println("Song added successfuly");
					System.out.println("Enter 2nd song");
					
					ArrayList addSong4 = new ArrayList();
					song4 = new SongOperation();
					
					System.out.println("Enter the Song no");
					song4.setNo(sc.nextInt());
					addSong4.add(song4.getNo());
			
					System.out.println("Enter the Song Name");
					sc.nextLine();
					song4.setSongName(sc.next());
					addSong4.add(song4.getSongName());
			
					System.out.println("Enter the Artist Name");
					sc.nextLine();
					song4.setArtistName(sc.next());
					addSong4.add(song4.getArtistName());
			
					System.out.println("Enter the Producer Name");
					sc.nextLine();
					song4.setProd(sc.next());
					addSong4.add(song4.getProd());
			
					System.out.println("Enter the Song Duration");
					song4.setDuration(sc.nextDouble());
					addSong4.add(song4.getDuration());
			
					System.out.println("Enter the Song Release Date");
					sc.nextLine();
					song4.setReleaseDt(sc.next());
					addSong4.add(song4.getReleaseDt());
					
					ArrayList addSong5 = new ArrayList();
					song5 = new SongOperation();
					
					System.out.println("Enter the Song no");
					song5.setNo(sc.nextInt());
					addSong5.add(song5.getNo());
			
					System.out.println("Enter the Song Name");
					sc.nextLine();
					song5.setSongName(sc.next());
					addSong5.add(song5.getSongName());
			
					System.out.println("Enter the Artist Name");
					sc.nextLine();
					song5.setArtistName(sc.next());
					addSong5.add(song5.getArtistName());
			
					System.out.println("Enter the Producer Name");
					sc.nextLine();
					song5.setProd(sc.next());
					addSong5.add(song5.getProd());
			
					System.out.println("Enter the Song Duration");
					song5.setDuration(sc.nextDouble());
					addSong5.add(song5.getDuration());
			
					System.out.println("Enter the Song Release Date");
					sc.nextLine();
					song5.setReleaseDt(sc.next());
					addSong5.add(song5.getReleaseDt());
					
					System.out.println("Song added successfuly");
					
					Display.add(addSong3);
					Display.add(addSong4);
					Display.add(addSong5);
					
					System.out.println("(1)Go back");
					
					back1();
					
					break;
					
			default:addSong();
			}	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static void removeSong() {
			HashSet list = new HashSet(Display);

			for(Object var:list) {
				System.out.println(var);
			}
			
			System.out.println("Enter the song No");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input) {
			case 1: Display.remove(0);
					System.out.println("Song removed Successfully");
					for(int i = 0;i<Display.size();i++) {
						System.out.println(Display.get(i));
					}
					break;
			case 2: Display.remove(1);
					System.out.println("Song removed Successfully");
					break;
			case 3: Display.remove(2);
					System.out.println("Song removed Successfully");
					break;
			case 4: Display.remove(3);
					System.out.println("Song removed Successfully");
					break;
			case 5: Display.remove(4);
					System.out.println("Song removed Successfully");
					break;
			case 6: Display.remove(5);
					System.out.println("Song removed Successfully");
					break;	
			case 7: Display.remove(6);
					System.out.println("Song removed Successfully");
					break;
			case 8: Display.remove(7);
					System.out.println("Song removed Successfully");
					break;
			case 9: Display.remove(8);
					System.out.println("Song removed Successfully");
					break;
			case 10: Display.remove(9);
					System.out.println("Song removed Successfully");
					break;
			case 11: Display.remove(10);
					System.out.println("Song removed Successfully");
					break;
			default:System.out.println("Invaild Number " + input);
					removeSong();
			}
			System.out.println("(1)Go back");
			
			back1();	
		}
		
		public static void edit() {
			HashSet list = new HashSet(Display);
//			for(int i = 0;i<Display.size();i++) {
//				System.out.println(Display.get(i));
//			}
			for(Object var:Display) {
				System.out.println(var);
			}
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Song No To Edit");
			int input = sc.nextInt();
			
			switch(input) {
			case 1: sc.nextLine();
					defaultSong1.setSongName(sc.nextLine());
					break;
			case 2: sc.nextLine();
					defaultSong2.setSongName(sc.nextLine());
					break;
			case 3:sc.nextLine(); 
					defaultSong3.setSongName(sc.nextLine());
					break;
			case 4:sc.nextLine(); 
					defaultSong4.setSongName(sc.nextLine());
					break;
			case 5: sc.nextLine();
					defaultSong5.setSongName(sc.nextLine());
					break;
			case 6: sc.nextLine();
					song.setSongName(sc.nextLine());
					break;
			case 7:sc.nextLine();
					song1.setSongName(sc.nextLine());
					break;
			case 8:sc.nextLine(); 
					song2.setSongName(sc.nextLine());
					break;
			case 9: sc.nextLine();
					song3.setSongName(sc.nextLine());
					break;
			case 10:sc.nextLine(); 
					song4.setSongName(sc.nextLine());
					break;
			case 11:sc.nextLine();
					song5.setSongName(sc.nextLine());
					break;
			default: System.out.println("Invaild Number " + input);
					edit();
			}
			System.out.println("(1)Go back");
			
			back1();	
		}
		public static void exit() {
			loop = false;
		}
		
}
