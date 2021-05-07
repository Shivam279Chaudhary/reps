import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.reps.manage.UserDAO;
import com.reps.manage.Workout;

/*import com.repsDB.user;
import com.repsDB.userDao;*/

public class workout {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to user workout");
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to add");
			System.out.println("PRESS 2 to exit");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("enter workoutId");
				String workoutId = br.readLine();

				System.out.println("enter userId");
				String userId = br.readLine();

				System.out.println("enter day");
				int day = Integer.parseInt(br.readLine());

				System.out.println("enter time");
				String time = br.readLine();

				System.out.println("enter sets");
				int sets = Integer.parseInt(br.readLine());

				System.out.println("enter reps_per_set");
				int reps_per_set = Integer.parseInt(br.readLine());

				System.out.println("enter description");
				String description = br.readLine();

				Workout w = new Workout(workoutId, userId, day, time, sets, reps_per_set, description);
				boolean answer = UserDAO.insertuserToDB(w);
				if (answer) {
					System.out.println("SUCCESSFUL");
				} else {
					System.out.println("SOMETHING WRONG");
				}

				System.out.println(w);

			}
			/*
			 * else if(c==2) { System.out.println("enter user_id to delete"); int user_id =
			 * Integer.parseInt(br.readLine()); boolean f=userDao.deleteuser(user_id); if(f)
			 * { System.out.println("DELETED"); }else {
			 * System.out.println("SOMETHING WRONG.."); } }
			 */

			else if (c == 2) {
				// exit
				break;
			} else {

			}

		}

	}

}
