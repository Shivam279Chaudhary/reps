import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.reps.manage.User;
import com.reps.manage.UserDAO;

public class Start {
	public static void main(String[] args) throws IOException {
		// System.out.println("hello");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to add");
			System.out.println("PRESS 2 to delete");
			System.out.println("PRESS 3 to get user details");
			System.out.println("PRESS 4 to exit");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				System.out.println("enter user_id");
				int userid = Integer.parseInt(br.readLine());

				System.out.println("enter username");
				String username = br.readLine();

				System.out.println("enter password");
				String userpass = br.readLine();

				System.out.println("enter address");
				String useradd = br.readLine();

				System.out.println("enter role");
				int userrole = Integer.parseInt(br.readLine());

				System.out.println("enter badge");
				String userbadge = br.readLine();

				User user = new User(userid, username, userpass, useradd, userrole, userbadge);
				boolean answer = UserDAO.insertUser(user);
				if (answer) {
					System.out.println("SUCCESSFUL");
				} else {
					System.out.println("SOMETHING WRONG");
				}

				System.out.println(user);

			} else if (c == 2) {
				System.out.println("enter user_id to delete");
				int userid = Integer.parseInt(br.readLine());
				boolean f = UserDAO.deleteUser(userid);
				if (f) {
					System.out.println("DELETED");
				} else {
					System.out.println("SOMETHING WRONG..");
				}
			} else if (c == 3) {
				System.out.println("enter user_id to get details of user");
				int userid = Integer.parseInt(br.readLine());
				boolean f = UserDAO.selectUser(userid);
				if (f) {
					System.out.println("SELECTED");
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
