import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.reps.manage.Planner;
import com.reps.manage.UserDAO;

public class plannerStart {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to user bio");
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to add");

			System.out.println("PRESS 2 to exit");

			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("enter user_id");
				int user_id = Integer.parseInt(br.readLine());

				System.out.println("enter timing");
				String timing = br.readLine();

				System.out.println("enter exercise to perform");
				String exercise = br.readLine();

				System.out.println("enter target for the week");
				String target = br.readLine();

				System.out.println("enter diet goal");
				String diet_goal = br.readLine();

				System.out.println("enter date");
				String date = br.readLine();

				Planner p = new Planner(user_id, timing, exercise, target, diet_goal, date);
				boolean answer = UserDAO.insertuser(p);
				if (answer) {
					System.out.println("SUCCESSFUL");
				} else {
					System.out.println("SOMETHING WRONG");
				}

				System.out.println(p);

			} else if (c == 2) {
				// exit
				break;
			} else {

			}

		}

	}

}
