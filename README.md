# AirAsiaAssignment

1. clone this repository
2. install JDK 1.8
3. install MS SQL 2012
4. Create a database with the name "airasiadb"
5. Create a user with name "sameer" and grant access to "airasiadb"

API Call:
/Booking/create
Data Required:
	Long customerId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	Long hotelId;
	String hotelName;
	Long roomId;
	String roomName;
	int numberOfGuests;
	Date from;
	Date to;

Assumption(s):
1. Hotels are already available in the database for query to successfully append booking to the database.
2. If user with existing ID is not in the database, it will be added.
3. Not considered the room type during booking.