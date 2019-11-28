package components;

public class CreateRide {

	private int trip_id;
	private int status;
	private int remaining_seats;
	private int user_id[];
	
	CreateRide(int t, int s, int r, int u){
		trip_id = t;
		status = s;
		remaining_seats = r;
		user_id = new int[u];
	}
	
//	int generateTripId(){
//		
//		return ;
//	}
}
