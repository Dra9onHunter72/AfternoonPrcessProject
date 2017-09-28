package Process.controller;

import Process.model.playDohCircle;
import Process.model.PlayDohBear;

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
		
		
		
		playDohCircle thirdCircle = new playDohCircle(10);
		System.out.println(thirdCircle);
		
		PlayDohBear firstBear = new PlayDohBear(20);
		System.out.println(firstBear);
		
		System.out.println("What size should we change  to?");
		
		
		System.out.println("The circle now is.......");
		System.out.println(thirdCircle);
	}
}
