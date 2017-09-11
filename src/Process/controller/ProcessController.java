package Process.controller;

import Process.model.playDohCircle;

public class ProcessController
{
	
	public void start()
	{
		System.out.println("This a practice project.");
		System.out.println("By practicing I develop muscle memory:D" );
		
		playDohCircle firstcircle = new playDohCircle();
		playDohCircle secondcircle;
		secondcircle = new playDohCircle();
		
		System.out.println("Look I made a circle!");
		System.out.println(firstcircle);
		System.out.println(secondcircle);
	}
}
