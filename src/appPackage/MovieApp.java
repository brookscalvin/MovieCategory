package appPackage;

import java.util.ArrayList;
import java.util.Scanner;
import moviePackage.Movie;
import moviePackage.MovieIO;
import validatorPackage.validator;
public class MovieApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Movie m = new Movie();
		ArrayList<Movie>myList = new ArrayList<>();
		int drama=0;
		for (int i = 0; i < 100; i++){
			myList.add(MovieIO.getMovie(i+1));
//			System.out.print("Title :");
//			myList.get(i).setTitle(input.nextLine());
//			System.out.print("Category :");
//			myList.get(i).setCategory(input.nextLine());
//				}
		System.out.println("there are "+myList.size()+" movies in this list");
		System.out.print("What category are you interested in?: ");
		input.nextLine();
		for (int i=0; i<myList.size();i++){
			if(input.equals("Drama")){
				System.out.println(myList.get(i).getCategory());
			}
		}
	}
}
