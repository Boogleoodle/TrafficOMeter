Model(
	Term("MeansOfTransportation") has (
		Spec("Type of vehicle in which the public transport takes place."),
		Example("Bus, train, or ferry, or a combination of them")
	),
	Term("User") has (
		Spec("An individual who uses the system. The user consists of a number of saved destinations, a current Geographical Location and a set of selected Means of Transportation. Note: The user is not necessarily an explicit object (user account with login) it could be implicit (Information stored on the user's phone). This is specification is independent from that decision. See Feature 'MultiAccessibleUserData'"),
		Example("An individual that wants to travel between pre-set destinations")
	),

	Term("Destination") has (
		Spec("A geographical location that has been saved and given a name by the user."),
		Example("Destination A = Name: Home, lat: 55.7112325, lon: 13.1867275. Destination B = Name: School, lat: 55.71037075564825, lon: 13.208270072937012")
	),

	Term("Time") has (
		Spec("Time of departure"),
		Example("Means of transportation A departs at time B")
	),

	Term("LineOfTransportation") has (
		Spec("A set of 'stop's that is served by the same vehicle. There is one line for each direction between the stops."), 
		Example("Bus 6 in Lund towards S:t Lars, Bus 171 between Malmoe and Lund")
	),

	Term("GeographicalLocation") has (
		Spec("Consists of GPS coordinates to determine a location"),
		Example("lat: 55.71037075564825, lon: 13.208270072937012")
	),

	Term("Trip") has (
		Spec("A specific travel between two geographical (GPS) location"), 
		Example("Between a user's current position and one of its destinations")
	),

	Term("Stop") has (
		Spec("Place where a public transportation vehicle stop to pick up and let off passengers."),
		Example("Bus A stops at stop X to let set of persons P on and set of persons Q off.")
	),

	Term("Route") has (
		Spec("The path between two different stops. Consists of one or more 'sub-line's"),
		Example("From bus stop X to bus stop Z, (change at bus stop Y e.g X->Y, Y->Z)")
	),

	Term("Timetable") has(
		Spec("The predefined departure times set by the regional public transport office for a specific means of transportation for every line of transportation"),
		Example("Bus A departs at time X hours and Y minutes direction Z")
	),

	Term("Sub-line") has (
		Spec("A subset of a line of transportation that is part of a bigger 'route'"), 
		Example("Bus 3, from Lund C to Universitetssjukhuset")
	)
)
