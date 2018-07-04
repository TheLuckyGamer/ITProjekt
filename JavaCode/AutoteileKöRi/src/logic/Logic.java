package logic;

import overlay.Gui;
import db_Kommunikation.*;

public class Logic {
		static Gui gui;
		static Db_Reciever rec;
		static Db_Sender sen;
	
	public static void main(String[] args) {
		init();
		update();

	}

	public static void init(){
		gui = new Gui();
		rec = new Db_Reciever();
		sen = new Db_Sender();
	}
	public static void update(){
		
	}
	
}
