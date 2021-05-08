import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.reps.manage.UserDAO;
import com.reps.manage.Userbio;

public class user_bio {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to user bio");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to add");
			System.out.println("PRESS 2 to delete");
			System.out.println("PRESS 3 to get height and weight of user");
			System.out.println("PRESS 4 to exit");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("enter user_id");
				int user_id = Integer.parseInt(br.readLine());

				System.out.println("enter weight");
				int weight = Integer.parseInt(br.readLine());

				System.out.println("enter height");
				int height = Integer.parseInt(br.readLine());

				System.out.println("enter gender");
				String gender = br.readLine();

				System.out.println("enter waist");
				int waist = Integer.parseInt(br.readLine());

				System.out.println("enter workout_plan_in_days");
				int workout_plan_in_days = Integer.parseInt(br.readLine());

				Userbio u = new Userbio(user_id, weight, height, gender, waist, workout_plan_in_days);
				boolean answer = UserDAO.insertuserToDB(u);
				if (answer) {
					System.out.println("SUCCESSFUL");
				} else {
					System.out.println("SOMETHING WRONG");
				}

				System.out.println(u);

			} else if (c == 2) {
				System.out.println("enter user_id to delete");
				int user_id = Integer.parseInt(br.readLine());
				boolean f = UserDAO.deleteuser(user_id);
				if (f) {
					System.out.println("DELETED");
				} else {
					System.out.println("SOMETHING WRONG..");
				}
			} else if (c == 3) {
				System.out.println("enter user_id to get height and weight");
				int user_id = Integer.parseInt(br.readLine());
				boolean f = UserDAO.getHtandWt(user_id);
				if (f) {
					System.out.println("selected");
				} else {
					System.out.println("SOMETHING WRONG..");
				}
			} else if (c == 4) {
				// exit
				break;
			} else {

			}

		}
	}

}
