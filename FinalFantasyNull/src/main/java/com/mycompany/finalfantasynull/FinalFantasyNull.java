/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalfantasynull;

/**
 *
 * @author Asus
 */
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class FinalFantasyNull{
	
	public static String hpm;
	public static String bm;
	public static int bullet1 = 5;
	public static int bullet2 = 5;
	public static int cl1 = 0;
	public static int cl2 = 0;
	public static int chdmg;
	public static int heal;
	public static String clm;
	public static String p1name;
	public static String p2name;
	public static int p1c;
	public static int p2c;
	public static int hp;
	public static int P1hp = 100;
	public static int P2hp = 100;
	public static int badmg;
	public static int ba = 0;
	
	
	public static void vert(){ //ADD VERTICAL SPACE
		for (int i = 0; i < 20; i++){
					System.out.println();
				}
	}
	
	public static void spc(){ // ADD PARTITION
		for (int i = 0; i < 100; i++){
					System.out.print("=");
				}
	}
	
	public static void blnk(){ //ADD PARTITION
		for (int i = 0; i < 100; i++){
					System.out.print("-");
				}
	}
	
	public static void pressEnter() { //LITERALLY JUST PRESS ENTER LMAO
		Scanner dummy = new Scanner(System.in);
		System.out.println("\r\n\r\nPress Enter to continue\r\n"); 
		String useless = dummy.nextLine();
	}
	
	public static int ch1(){ //CHARGE METER FOR PLAYER 1
		
		if ( cl1 == 3 ){
			clm = "[HHH]";
			System.out.println("Charge level: " + clm + " " + cl1);
		}
		
		else if ( cl1 == 2 ){
			clm = "[HH-]";
			System.out.println("Charge level: " + clm + " " + cl1);
		}
		
		else if ( cl1 == 1 ){
			clm = "[H--]";
			System.out.println("Charge level: " + clm + " " + cl1);
		}
		
		else if ( cl1 <= 0 ){
			clm = "[xxx]";
			System.out.println("Charge level: " + clm + " " + cl1);
			
		}
		
		return cl1;
		
		
		
	}
	
	public static int ch2(){ //CHARGE METER FOR PLAYER 2
		
		if ( cl2 == 3 ){
			clm = "[HHH]";
			System.out.println("Charge level: " + clm + " " + cl2);
		}
		
		else if ( cl2 == 2 ){
			clm = "[HH-]";
			System.out.println("Charge level: " + clm + " " + cl2);
		}
		
		else if ( cl2 ==1 ){
			clm = "[H--]";
			System.out.println("Charge level: " + clm + " " + cl2);
		}
		
		else if ( cl2 <= 0 ){
			clm = "[xxx]";
			System.out.println("Charge level: " + clm + " " + cl2);
			
		}
		
		return cl2;
		
	}
	
	public static int p1b(){ //BULLET TRACKER FOR PLAYER 1
		
		
		if ( bullet1 == 5 ){
			bm = "(@-@-@-@-@)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			
		}
		
		else if ( bullet1 == 4 ){
			bm = "(@-@-@-@-0)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			
		}
		
		else if ( bullet1 == 3 ){
			bm = "(@-@-@-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			
		}
		
		else if ( bullet1 == 2 ){
			bm = "(@-@-0-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			
		}
		
		else if ( bullet1 == 1 ){
			bm = "(@-0-0-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			
		}
		
		else if ( bullet1 <= 0 ){
			bm = "(x-x-x-x-x)";
			System.out.println("Bullets: " + bm + " " + bullet1);
			System.out.println("No more Bullets available! Reload Bullets\r\n");
			
		}
		
		return bullet1;
		
	}
	
	public static int p2b(){ //BULLET TRACKER FOR PLAYER 2
		
		if ( bullet2 == 5 ){
			bm = "(@-@-@-@-@)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			
		}
		
		else if ( bullet2 == 4 ){
			bm = "(@-@-@-@-0)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			
		}
		
		else if ( bullet2 == 3 ){
			bm = "(@-@-@-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			
		}
		
		else if ( bullet2 == 2 ){
			bm = "(@-@-0-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			
		}
		
		else if ( bullet2 == 1 ){
			bm = "(@-0-0-0-0)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			
		}
		
		else if ( bullet2 <= 0 ){
			bm = "(x-x-x-x-x)";
			System.out.println("Bullets: " + bm + " " + bullet2);
			System.out.println("No more Bullets available! Reload Bullets\r\n");
			
		}
		
		return bullet2;
	}
	
	public static int Player1HP(){ //HEALTHBAR DISPLAY FOR PLAYER 1
		
		if ( P1hp >= 100){
			P1hp = 100;
			hpm = "(**********)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 89){
			hpm = "(*********-)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 79){
			hpm = "(********--)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 69){
			hpm = "(*******---)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 59){
			hpm = "(******----)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 49){
			hpm = "(*****-----)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 39){
			hpm = "(****------)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 29){
			hpm = "(***-------)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 19){
			hpm = "(**--------)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 9){
			hpm = "(*---------)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp > 0){
			hpm = "(----------)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		else if ( P1hp <= 0){
			hpm = "(xxxxxxxxxx)";
			System.out.println("\r\n" + p1name + " Health: " + hpm + " " + P1hp );
			
			
		}
		
		return P1hp;

	}

	public static int Player2HP(){ //HEALTHBAR DISPLAY FOR PLAYER 2
		
		if ( P2hp >= 100){
			P2hp = 100;
			hpm = "(**********)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 89){
			hpm = "(*********-)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 79){
			hpm = "(********--)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 69){
			hpm = "(*******---)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 59){
			hpm = "(******----)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 49){
			hpm = "(*****-----)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 39){
			hpm = "(****------)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 29){
			hpm = "(***-------)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 19){
			hpm = "(**--------)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 9){
			hpm = "(*---------)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp > 0){
			hpm = "(----------)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		else if ( P2hp <= 0){
			hpm = "(xxxxxxxxxx)";
			System.out.println("\r\n" + p2name + " Health: " + hpm + " " + P2hp );
			
			
		}
		
		return P2hp;

	}
	
	public static void p1(){ //ATTACK CHOICES FOR PLAYER 1
		
		System.out.print("\r\n[1] Basic Attack - Deal some damage to your opponent");
		System.out.print("\r\n[2] Special Attack - (20% chance to miss) Deal significant damage to your opponent. consumes (1) bullet");
		System.out.print("\r\n[3] Charge Attack - Deal damage to your opponent equal to current charge level");
		System.out.print("\r\n[4] Cure - Recover your Hitpoints");
		System.out.print("\r\n[5] Reload - reset available Special attack bullets ");
		System.out.print("\r\n[6] Recharge - increase charge level");
		System.out.print("\r\n[7] Run - Chance to escape, if succesful; match will be forfeited and opponent wins");
		System.out.println();
		
		Scanner numin = new Scanner(System.in);
		p1c = numin.nextInt();
		
		pr1();
		
	
	}
	
	public static void p2(){ //ATTACK CHOICES FOR PLAYER 2
		
		System.out.print("\r\n[1] Basic Attack - Deal some damage to your opponent");
		System.out.print("\r\n[2] Special Attack - (20% chance to miss) Deal significant damage to your opponent. consumes (1) bullet");
		System.out.print("\r\n[3] Charge Attack - Deal damage to your opponent equal to current charge level");
		System.out.print("\r\n[4] Cure - Recover your Hitpoints");
		System.out.print("\r\n[5] Reload - reset available Special attack bullets ");
		System.out.print("\r\n[6] Recharge - increase charge level");
		System.out.print("\r\n[7] Run - Chance to escape, if succesful; match will be forfeited and opponent wins");
		System.out.println();
		
		
		Scanner numin2 = new Scanner(System.in);
		p2c = numin2.nextInt();
		
		pr2();
		
	}
	
	public static void pcpu(){ //ATTACK CHOICES FOR PLAYER 2
		
		System.out.print("\r\n[1] Basic Attack - Deal some damage to your opponent");
		System.out.print("\r\n[2] Special Attack - (20% chance to miss) Deal significant damage to your opponent. consumes (1) bullet");
		System.out.print("\r\n[3] Charge Attack - Deal damage to your opponent equal to current charge level");
		System.out.print("\r\n[4] Cure - Recover your Hitpoints");
		System.out.print("\r\n[5] Reload - reset available Special attack bullets ");
		System.out.print("\r\n[6] Recharge - increase charge level");
		System.out.print("\r\n[7] Run - Chance to escape, if succesful; match will be forfeited and opponent wins");
		System.out.println();
		
		
		Random rand = new Random();
				int r1 = rand.nextInt(7);
				
				if ( r1 == 0 ) {
					p2c = 2;
					
					pr2();
					
				}
				
				else {
					p2c = r1;
					
					pr2();
					
				}
		
		
		
	}
	
	public static void pr1(){ //CHOICE REDIRECTOR FOR PLAYER 1
		if ( p1c == 1 ){
			System.out.println("\r\nBasic Attack was Chosen! \r\n");
			
			Random rba = new Random();
			ba = rba.nextInt(6);
		
			if ( ba == 0 ){
				ba = 3;
			}
		
			badmg = ba * 3;
		
			System.out.println("\r\n");
			System.out.println("Damage dealt to [" + p2name + "] is [" + badmg + "]!!");
			System.out.println("\r\n");
		
			P2hp = P2hp - badmg;
			
			Player2HP();
			
			
			
			
			
		}
		
		
		
		else if ( p1c == 2 ){
			
			System.out.println("\r\nSpecial Attack was Chosen! \r\n");
			
			if ( bullet1 <= 0 ){
				System.out.println("You're unable to attack! You're out of Bullets!");
				p1b();
			}
			
			else {
			
				System.out.println("\r\nConsumed [1] Bullet!");
			
			
			
				p1b();
				Random sa = new Random();
				int sac = sa.nextInt(20);
			
			
			
				if ( sac >= 2  & sac <= 5){
				
					System.out.println("\r\nToo bad! You missed!\r\n");
				
				}
			
				else {
					Random rsa = new Random();
					int spa = rsa.nextInt(6);
		
					if ( spa == 0 ){
						spa = 3;
					}
				
					else if ( spa == 1) {
						spa =  3;
					}
				
					else if ( spa == 2) {
						spa =  3;
					}
		
					int spadmg = spa * 6;
		
					System.out.println("\r\n");
					System.out.println("Damage dealt to [" + p2name + "] is [" + spadmg + "]!!");
					System.out.println("\r\n");
		
					P2hp = P2hp - spadmg;
			
					Player2HP();
				}
			
				bullet1 = bullet1 - 1;
				p1b();
			
			}
			
		}
		
		else if ( p1c == 3 ){
			
			
			if ( cl1 == 3 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p2name + "] is [" + chdmg + "]!!");
				
				P2hp = P2hp - chdmg;
				
				Player2HP();
				
				cl1 = 0;
				System.out.println("Charge level reset to [0]");
				
				
			}
			
			else if ( cl1 == 2 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Medium, Significant damage was dealt!!!");
				
				chdmg = 30;
				
				System.out.println("Damage dealt to [" + p2name + "] is [" + chdmg + "]!!");
				
				P2hp = P2hp - chdmg;
				
				Player2HP();
				cl1 = 0;
				System.out.println("Charge level reset to [0]");
			}
			
			else if ( cl1 == 1 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Low, Basic damage was dealt!!!");
				
				chdmg = 15;
				
				System.out.println("Damage dealt to [" + p2name + "] is [" + chdmg + "]!!");
				
				P2hp = P2hp - chdmg;
				
				Player2HP();
				cl1 = 0;
				System.out.println("Charge level reset to [0]");
			}
			
			else if ( cl1 <= 0 ){
				cl1 = 0;
				ch1();
				System.out.println("\r\nOut of energy! recharge to attack again!!");
				
				
				
				
			}
			
			
		}
		
		else if ( p1c == 4 ){
			
			if (P1hp >= 100){
				System.out.println("\r\nHealth is Full!!!, Cure's effects is insignificant!");
			}
			
			else{
			
				Random rheal = new Random();
			
				heal = rheal.nextInt(6);
			
				if ( heal == 0 ){
					heal = 3;
				}
			
				heal = heal * 3;
			
				System.out.println("\r\nCure was chosen!");
			
				P1hp = P1hp + heal;
			
				System.out.println( p1name + " was healed by " + heal + "!!!" );
				Player1HP();
			}
			
		}
		
		else if ( p1c == 5 ) {
			
			System.out.println("\r\nReload was chosen!!");
			
			bullet1 = 5;
			
			System.out.println("\r\nBullets reloaded to " + bullet1 + "!!\r\n" + p1name);
			p1b();
			
		}
		
		else if ( p1c == 6 ){
			
			if ( cl1 >= 3 ){
				System.out.println("\r\nCannot recharge any further!!!, Charge level already at max");
				ch1();
			}
			
			else{
				System.out.println("\r\nRecharge was chosen!");
				cl1 = cl1 + 1;
				System.out.println("Charge level is increased by [1]\r\n" + p1name);
				ch1();
			}
		}
		
		else if ( p1c == 7 ) {
			Random flee = new Random();
			int run = flee.nextInt(20);
			
			if ( run >= 2  & run <= 5){
				
				System.out.println("\r\nYou can't escape!!! \r\nYou must continue the Battle!");
				
			}
			
			else {
				P1hp = 0;
			
				System.out.println("\r\nYou've successfully escaped!!, Unfortunately this makes you lose the battle." );
				GameOver();
			}
		}
		
	}
	
	public static void pr2(){ //CHOICE REDIRECTOR FOR PLAYER 2
		
		if ( p2c == 1 ){
			System.out.println("\r\nBasic Attack was Chosen! \r\n");
			
			Random rba = new Random();
			ba = rba.nextInt(6);
		
			if ( ba == 0 ){
				ba = 3;
			}
		
			badmg = ba * 3;
		
			System.out.println("Damage dealt to [" + p1name + "] is [" + badmg + "]!!");
		
			P1hp = P1hp - badmg;
			
			Player1HP();
			
			
			
			
		}
		
		else if ( p2c == 2){
			
			
			System.out.println("\r\nSpecial Attack was Chosen! \r\n");
			
			if ( bullet2 <= 0 ){
				System.out.println("You're unable to attack! You're out of Bullets!");
				p2b();
			}
			
			else{
				
				System.out.println("\r\nConsumed [1] Bullet!");
			
			
			
				p2b();
			
				Random sa = new Random();
				int sac = sa.nextInt(20);
			
			
			
				if ( sac >= 2  & sac <= 5){
				
					System.out.println("\r\nToo bad! You missed!\r\n");
				
				}
			
				else {
					Random rsa = new Random();
					int spa = rsa.nextInt(6);
		
					if ( spa == 0 ){
					spa = 3;
					}
				
					else if ( spa == 1) {
						spa =  3;
					}
				
					else if ( spa == 2) {
						spa =  3;
					}
		
					int spadmg = spa * 6;
		
					System.out.println("\r\n");
					System.out.println("Damage dealt to [" + p1name + "] is [" + spadmg + "]!!");
					System.out.println("\r\n");
		
					P1hp = P1hp - spadmg;
			
					Player1HP();
				}
			
				bullet2 = bullet2 - 1;
				p2b();
			}
		}
		
		else if ( p2c == 3){
			
			
			if ( cl2 == 3 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p1name + "] is [" + chdmg + "]!!");
				
				P1hp = P1hp - chdmg;
				
				Player1HP();
				cl2 = 0;
				System.out.println("Charge level reset to [0]");
				
			}
			
			else if ( cl2 == 2 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Medium, Significant damage was dealt!!!");
				
				chdmg = 30;
				
				System.out.println("Damage dealt to [" + p1name + "] is [" + chdmg + "]!!");
				
				P1hp = P1hp - chdmg;
				
				Player1HP();
				cl2 = 0;
				System.out.println("Charge level reset to [0]");
				
			}
			
			else if ( cl2 == 1 ){
				
				System.out.println("\r\nCharge Attack was chosen!!!");
				System.out.println("\r\nwith Charge level at Low, Basic damage was dealt!!!");
				
				chdmg = 15;
				
				System.out.println("Damage dealt to [" + p1name + "] is [" + chdmg + "]!!");
				
				P1hp = P1hp - chdmg;
				
				Player1HP();
				cl2 = 0;
				System.out.println("Charge level reset to [0]");
				
			}
			
			else if ( cl2 <= 0 ){
				cl2 = 0;
				ch2();
				System.out.println("\r\nOut of energy! recharge to attack again!!");
				
				
				
				
			}
			
			
			
		}
		
		else if (p2c == 4){
			
			if (P2hp >= 100){
				System.out.println("\r\nHealth is Full!!!, Cure's effects is insignificant!");
			}
			
			else{
				Random rheal = new Random();
			
				heal = rheal.nextInt(6);
			
				if ( heal == 0 ){
					heal = 3;
				}
			
				heal = heal * 3;
			
				System.out.println("\r\nCure was chosen!");
			
				P2hp = P2hp + heal;
			
				System.out.println( p2name + " was healed by " + heal + "!!!" );
				Player2HP();
			}
			
		}
		
		else if ( p2c == 5 ) {
			
			System.out.println("\r\nReload was chosen!!");
			
			bullet2 = 5;
			
			System.out.println("\r\nBullets reloaded to " + bullet2 + "!!\r\n" + p2name);
			p2b();
			
		}
		
		else if ( p2c == 6 ){
			
			if ( cl2 >= 3 ){
				System.out.println("\r\nCannot recharge any further!!!, Charge level already at max");
				ch2();
			}
			
			else{
				System.out.println("\r\nRecharge was chosen!");
				cl2 = cl2 + 1;
				System.out.println("Charge level is increased by [1]\r\n" + p2name);
				ch2();
			}
		}
		
		else if ( p2c == 7 ) {
			Random flee = new Random();
			int run = flee.nextInt(20);
			
			if ( run >= 2  & run <= 5){
				
				System.out.println("\r\nYou can't escape!!! \r\nYou must continue the Battle!");
				
			}
			
			else {
				
				P2hp = 0;
				System.out.println("\r\nYou've successfully escaped!!, Unfortunately this makes you lose the battle." );
				GameOver();
			}
		}
		
		
		
	}

	public static void randenc(){ //METHOD FOR RANDOM ENCOUNTERS EVERY 5 ROUNDS
		
		Random rand = new Random();
		int re = rand.nextInt(20);
		
		vert();
		
		if ( re == 0 ){
			System.out.println("\r\n" + p2name + " is blessed by the Divine, Curaga was casted to " + p2name );
			P2hp = 100;
			System.out.println("\r\n" + p2name + " was healed back to full health!");
			Player2HP();
		}
		
		else if ( re >= 1 & re <= 4 ){
			
			if ( P2hp >= 100 ){
				System.out.println("\r\n" + p2name + " is aided by the Divine, Victory was wished upon " + p2name );
				
			}
			
			
			else {
				System.out.println("\r\n" + p2name + " is aided by the Divine, Cura was casted to " + p2name );
			
				Random rheal = new Random();
			
				heal = rheal.nextInt(6);
			
				if ( heal == 0 ){
					heal = 3;
				}
			
				heal = heal * 5;
			
			
			
				P2hp = P2hp + heal;
			
				System.out.println( p2name + " was healed by " + heal + "!!!" );
				Player2HP();
			}
		}
		
		else if ( re >= 5 & re <= 8 ){
			System.out.println("\r\n" + p2name + " saw an opening and attacked!!!");
			
			Random rba = new Random();
			ba = rba.nextInt(6);
		
			if ( ba == 0 ){
				ba = 3;
			}
		
			badmg = ba * 3;
		
			System.out.println("Damage dealt to [" + p1name + "] is [" + badmg + "]!!");
		
			P1hp = P1hp - badmg;
			
			Player1HP();
			
		}
		
		else if ( re == 9 ){
			System.out.println(p2name + " was reinvigorized by the define, Max Charge level was granted to " + p2name );
			System.out.println("\r\n" + p2name + " saw an opening and Charge attacked!!!");
			
			if ( cl2 == 3){
				
				
				System.out.println("");
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p1name + "] is [" + chdmg + "]!!");
				P1hp = P1hp - chdmg;
				Player1HP();
				cl2 = 0;
				System.out.println("Charge level reset to [0]");
				ch2();
			}
			
			else {
				
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p1name + "] is [" + chdmg + "]!!");
				
				P1hp = P1hp - chdmg;
				Player1HP();
				cl2 = 0;
				System.out.println("Charge level reset to [0]");
				ch2();
			}
			
		}
		
		else if ( re == 10 ){
			System.out.println( p1name + " was reinvigorized by the define, Max Charge level was granted to " + p1name );
			System.out.println("\r\n" + p1name + " saw an opening and Charge attacked!!!");
			
			if ( cl2 == 3){
				
				
				System.out.println("");
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p2name + "] is [" + chdmg + "]!!");
				
				P2hp = P2hp - chdmg;
				Player2HP();
				cl1 = 0;
				System.out.println("Charge level reset to [0]");
				ch1();
			}
			
			else {
				
				System.out.println("\r\nwith Charge level at Full, Maximum damage was dealt!!!");
				
				
				chdmg = 60;
				
				System.out.println("Damage dealt to [" + p2name + "] is [" + chdmg + "]!!");
				
				P2hp = P2hp - chdmg;
				Player2HP();
				cl1 = 0;
				System.out.println("Charge level reset to [0]");
				ch1();
			}
			
		}
		
		else if ( re >= 11 & re <= 14 ){
			System.out.println("\r\n" + p1name + " saw an opening and attacked!!!");
			
			Random rba = new Random();
			ba = rba.nextInt(6);
		
			if ( ba == 0 ){
				ba = 3;
			}
		
			badmg = ba * 3;
		
			System.out.println("Damage dealt to [" + p2name + "] is [" + badmg + "]!!");
		
			P2hp = P2hp - badmg;
			
			Player2HP();
			
		}
		
		else if ( re >= 15 & re <= 18 ) {
			
			if ( P1hp >= 100 ){
				System.out.println("\r\n" + p1name + " is aided by the Divine, Victory was wished upon " + p1name );
				
			}
			
			else {
				System.out.println("\r\n" + p1name + " is aided by the Divine, Cura was casted to " + p1name );
			
				Random rheal = new Random();
			
				heal = rheal.nextInt(6);
			
				if ( heal == 0 ){
					heal = 3;
				}
			
				heal = heal * 5;
			
			
			
				P1hp = P1hp + heal;
			
				System.out.println( p1name + " was healed by " + heal + "!!!" );
				Player1HP();
			}
		}
		
		else if ( re == 19 ) {
			
		System.out.println("\r\n" + p1name + " is blessed by the Divine, Curaga was casted to " + p1name );
			P1hp = 100;
			System.out.println("\r\n" + p1name + " was healed back to full health!");
			Player1HP();
		}
		
		vert();
		
		
		if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
		
			vert();
			System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
			pressEnter();
			
			System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
			Scanner resp = new Scanner(System.in);
			int choice = resp.nextInt();
			
			if ( choice == 1 ){
				PlayAgainVCPU();
				
			}
			
			else if ( choice == 2 ){
				System.exit(0);
			}
			
			else {
				System.out.print("\r\nInvalid Parameters... Exiting Game now");
				System.exit(0);
			}
		}
	
	
		else if ( P1hp <= 0 ) {
		
			vert();
			System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
			pressEnter();
			
			System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
			Scanner resp = new Scanner(System.in);
			int choice = resp.nextInt();
			
			if ( choice == 1 ){
				PlayAgainVCPU();
				
			}
			
			else if ( choice == 2 ){
				System.exit(0);
			}
			
		}
		
		
	}

	public static void PlayAgain(){ //METHOD IF PLAYER CHOOSES TO PLAY AGAIN
		P1hp = 100;
		P2hp = 100;
		bullet1 = 5;
		bullet2 = 5;
		cl1 = 0;
		cl2 = 0;
		
		GameSequence();
		
	}
	
	public static void PlayAgainVCPU(){ //METHOD IF PLAYER CHOOSES TO PLAY AGAIN *VS CPU*
		P1hp = 100;
		P2hp = 100;
		bullet1 = 5;
		bullet2 = 5;
		cl1 = 0;
		cl2 = 0;
		
		GameSeqVCPU();
		
	}
	
	public static void TieBreaker(){ //LITERALLY WHAT THE NAME MEANS LMAO
		
		
		
		if ( P1hp > P2hp ){
			System.out.println("\r\nTime limit reached!, whoever has the higher HP is the winner!\r\n");
			System.out.println(p1name);
			Player1HP();
			System.out.println("\r\n");
			System.out.println(p2name);
			Player2HP();
			P2hp = 0;
			GameOver();
		}
		
		else if (P1hp < P2hp){
			System.out.println("\r\nTime limit reached!, whoever has the higher HP is the winner!\r\n");
			System.out.println(p1name);
			Player1HP();
			System.out.println("\r\n");
			System.out.println(p2name);
			Player2HP();
			P1hp = 0;
			GameOver();
		}
		
		else if ( P1hp == P2hp){
			System.out.println("\r\n" + p1name + " and " + p2name + " are tied!");
			System.out.println("\r\nto determine the winner, a coin flip will commence!\r\n");
			System.out.println("Player 1 picks!\r\nPress [1] for Heads\r\nPress [2] for Tails\r\n");
			
			Scanner numin = new Scanner(System.in);
			int tc = numin.nextInt();
			System.out.println();
			Random tbreak = new Random();
			int tie = tbreak.nextInt(2);
			
			if ( tc == 1){
				System.out.println("\r\n" + p1name + "'s choice is Heads, while " + p2name + "'s choice is Tails");
				
				pressEnter();
				
				if ( tie == 0 ){
					System.out.println("\r\nCoin flip result is Heads!\r\n\r\n" + p1name + "'s Victory!!!");
					P2hp = 0;
					GameOver();
					
				}
				
				else if ( tie == 1 ){
					System.out.println("\r\nCoin flip result is Tails!\r\n\r\n" + p2name + "'s Victory!!!");
					P1hp = 0;
					GameOver();
					
				} 
			}
			
			else if ( tc == 2 ){
				System.out.println("\r\n" + p1name + "'s choice is Tails, while " + p2name + "'s choice is Heads");
				
				pressEnter();
				
				if ( tie == 0 ){
					
					System.out.println("\r\nCoin flip result is Tails!\r\n\r\n" + p2name + "'s Victory!!!");
					P1hp = 0;
					GameOver();
					
				}
				
				else if ( tie == 1 ){
					System.out.println("\r\nCoin flip result is Heads!\r\n\r\n" + p1name + "'s Victory!!!");
					P2hp = 0;
					GameOver();
					
					
				} 
			}
		}
	}
	
	public static void GameOver(){ //METHOD IF PLAYER FORFEITS
		vert();
		
		if ( P2hp <= 0 ){
			vert();
			System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
			pressEnter();
			
			System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
			Scanner resp = new Scanner(System.in);
			int choice = resp.nextInt();
			
			if ( choice == 1 ){
				PlayAgain();
				
			}
			
			else if ( choice == 2 ){
				System.exit(0);
			}
			
			else {
				System.out.print("\r\nInvalid Parameters... Exiting Game now");
				System.exit(0);
			}
		}
				
		else if ( P1hp <= 0 ){
			vert();
			System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
			pressEnter();
			
			System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
			Scanner resp = new Scanner(System.in);
			int choice = resp.nextInt();
			
			if ( choice == 1 ){
				PlayAgain();
				
			}
			
			else if ( choice == 2 ){
				System.exit(0);
			}
			
			else {
				System.out.print("\r\nInvalid Parameters... Exiting Game now");
				System.exit(0);
			}
			
		}
		
		else {
			System.exit(0);
		}
	}
	
	
	public static void GameSequence(){ //GAME ENGINE
		
		pressEnter();
		
		for (int r = 1; r < 6; r++){
			System.out.println("\r\n[ROUND " + r + "]\r\n");

			for (int r2 = 0; r2 < 1; r2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
		
				p2();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
			
		}
		
		randenc();
		
		
		for (int ro = 6; ro < 11; ro++){
			System.out.println("\r\n[ROUND " + ro + "]\r\n");

			for (int ro2 = 0; ro2 < 1; ro2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
		
				p2();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
		
		randenc();
		
		for (int rou = 11; rou < 16; rou++){
			System.out.println("\r\n[ROUND " + rou + "]\r\n");

			for (int rou2 = 0; rou2 < 1; rou2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
		
				p2();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
	
		randenc();
		
		for (int roun = 15; roun < 21; roun++){
			System.out.println("\r\n[ROUND " + roun + "]\r\n");

			for (int rou2 = 0; rou2 < 1; rou2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
		
				p2();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
	
		randenc();
		
		TieBreaker();
		
	}
	
	
	public static void GameSeqVCPU(){ //GAME ENGINE VS CPU
		
		pressEnter();
		
		for (int r = 1; r < 6; r++){
			System.out.println("\r\n[ROUND " + r + "]\r\n");

			for (int r2 = 0; r2 < 1; r2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				pcpu();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgain();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
			
		}
		
		randenc();
		
		
		for (int ro = 6; ro < 11; ro++){
			System.out.println("\r\n[ROUND " + ro + "]\r\n");

			for (int ro2 = 0; ro2 < 1; ro2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
		
				
		
				pcpu();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
		
		randenc();
		
		for (int rou = 11; rou < 16; rou++){
			System.out.println("\r\n[ROUND " + rou + "]\r\n");

			for (int rou2 = 0; rou2 < 1; rou2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				pcpu();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
	
		randenc();
		
		for (int roun = 16; roun < 21; roun++){
			System.out.println("\r\n[ROUND " + roun + "]\r\n");

			for (int rou2 = 0; rou2 < 1; rou2++){
				Player1HP();
				Player2HP();
				System.out.println();
				blnk();
				System.out.println("\r\n");
				System.out.println( p1name + "'s turn!");
				System.out.println();
				p1b();
				ch1();
		
		
		
				p1();
		
				pressEnter();
		
				blnk();
		
				System.out.println();
				System.out.println( p2name + "'s turn!");
				System.out.println();
				Player2HP();	
				p2b();
				ch2();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				pcpu();
		
				pressEnter();
		
				spc();
				System.out.println();
				
				if ( P2hp <= 0 ){ //CHECK IF ANY PLAYER LOST THE BATTLE
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
			
					else {
						System.out.print("\r\nInvalid Parameters... Exiting Game now");
						System.exit(0);
					}
				}
				
				else if ( P1hp <= 0 ){
					vert();
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					pressEnter();
			
					System.out.print("\r\nWould you like to Play again?\r\nPress [1] for yes\r\nPress [2] for no\r\n");
					Scanner resp = new Scanner(System.in);
					int choice = resp.nextInt();
			
					if ( choice == 1 ){
						PlayAgainVCPU();
				
					}
			
					else if ( choice == 2 ){
						System.exit(0);
					}
					
				}
				
				
				
				
			}
		}
	
		randenc();
		
		TieBreaker();
		
	}
	
	public static void main (String args[]){ //MAIN METHOD
		
		System.out.print("\r\nWELCOME TO \r\n\r\n[ FINAL FANTASY NULL ]");
		
			pressEnter();
			
			System.out.println("\r\n\r\nWould you like to enter your names?\r\nPress [1] if yes \r\nPress [2] if no \r\nPress [3] if you wish to play vs CPU");
			
			Scanner numin = new Scanner(System.in);
			int n = 0;
			n = numin.nextInt();
			
			if ( n == 1){
				
				//ENCODE PLAYER 1 NAME
				System.out.print("\r\nEnter Player 1's name:");
				
				Scanner pl1name = new Scanner(System.in);
				String np1 = " ";
				np1 = pl1name.nextLine();
				p1name = np1;
				System.out.print("\r\nWELCOME TO THE BATTLE [" + p1name + "]!!!\r\n"); 
				
				
				//ENCODE PLAYER 2 NAME 
				System.out.print("\r\nEnter Player 2's name:");
				
				Scanner pl2name = new Scanner(System.in);
				String np2 = " ";
				np2 = pl2name.nextLine();
				p2name = np2;
				System.out.print("\r\nWELCOME TO THE BATTLE [" + p2name + "]!!!\r\n");
				System.out.println("\r\nBATTLE START!");
				System.out.println("\r\n");
				
				spc();
				
				System.out.println("\r\n");
				
				do {
					GameSequence();
					
					if ( P2hp <= 0 ){
					System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					}
				
					else if ( P1hp <= 0 ){
					System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					}
					
				} while (P1hp < 0 || P2hp < 0 );
				System.out.println("\r\n\r\nGAMEOVER\r\n");
				
				
			}
			
			else if ( n == 2 ){
				
				p1name = "Player 1";
				System.out.print("\r\nWELCOME TO THE BATTLE [" + p1name + "]!!!\r\n"); 
				
				
				
				p2name = "Player 2";
				System.out.print("\r\nWELCOME TO THE BATTLE [" + p2name + "]!!!\r\n");
				System.out.println("\r\nBATTLE START!");
				System.out.println("\r\n");
				
				spc();
				
				System.out.println("\r\n");
				
				do {
					GameSequence();
					
					if ( P2hp <= 0 ){
						System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
					}
				
					else if ( P1hp <= 0 ){
						System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
					}
					
				} while (P1hp < 0 || P2hp < 0 );
				System.out.println("\r\n\r\nGAMEOVER\r\n");
			}
			
			else if ( n == 3 ){
				
				
				System.out.println("\r\nWould you like to  enter your name? ");
				System.out.println("\r\nPress [1] if yes \r\nPress [2] if no");
				
				Scanner cpu = new Scanner(System.in);
				int nc = 0;
				nc = cpu.nextInt();
				
				if ( nc == 1) {
					
					//ENCODE PLAYER 1 NAME
					System.out.print("\r\nEnter Player 1's name:");
				
					Scanner pl1name = new Scanner(System.in);
					String np1 = " ";
					np1 = pl1name.nextLine();
					p1name = np1;
					System.out.println("\r\n");
					System.out.print("\r\nWELCOME TO THE BATTLE [" + p1name + "]!!!\r\n");
					
					p2name = "CPU";
					System.out.print("\r\nWELCOME TO THE BATTLE [" + p2name + "]!!!\r\n");
					System.out.println("\r\nBATTLE START!");
					System.out.println("\r\n");
				
					spc();
				
					System.out.println("\r\n");
					
					do {
						GameSeqVCPU();
					
						if ( P2hp <= 0 ){
							System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
						}
				
						else if ( P1hp <= 0 ){
							System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
						}
					}while (P1hp < 0 || P2hp < 0 );
						System.out.println("\r\n\r\nGAMEOVER\r\n");
					
				}
				
				
				else if ( nc == 2 ) {
					
				
				
					p1name = "Player 1";
					System.out.print("\r\nWELCOME TO THE BATTLE [" + p1name + "]!!!\r\n"); 
				
				
				
					p2name = "CPU";;
					System.out.print("\r\nWELCOME TO THE BATTLE [" + p2name + "]!!!\r\n");
					System.out.println("\r\nBATTLE START!");
					System.out.println("\r\n");
				
					spc();
				
					System.out.println("\r\n");
				
					do {
						GameSeqVCPU();
					
						if ( P2hp <= 0 ){
							System.out.println("\r\n CONGRATULATIONS [" + p1name + "] !!! \r\n YOU WON THE BATTLE!!!");
						}
				
						else if ( P1hp <= 0 ){
							System.out.println("\r\n CONGRATULATIONS [" + p2name + "] !!! \r\n YOU WON THE BATTLE!!!");
						}
					}while (P1hp < 0 || P2hp < 0 );
						System.out.println("\r\n\r\nGAMEOVER\r\n");
				}
			}
			
			
		}
	}
	