Model (
	Req("visibility") has (Spec("The user has to have easy access to the travel information at all times")),
	Req("graphicalLocation") has (Spec("The system should be able to get the current geographical position of the user")),
	Req("fastestTrip") has (Spec("The system should show the total travel time of the fastest trip")),
	Req("addLocation") has (Spec("The user can add a location to its saved locations for easy access")),
	Req("locationByMap") has (Spec("The user can specify the location by using a map by moving a target")),
	Req("modeOfTransport") has (Spec("The user can specify what means of travel to use")),
	Req("renameSavedLocation") has (Spec("It shall be possible to change the name of a location")),
	Req("removeSavedLocation") has (Spec("It shall be possible for the user to remove a previously added location")),
	Req("multipleSavedLocations") has (Spec("The system shall have support for storing multiple locations")),
	Req("ShowRouteToFirstStop") has (Spec("When the user wants to use a specific travel option the route between the current position and the first stop will be accessable")),
	Req("systemUptimp") has (Spec("The system should have an uptime of 99%")),
	Req("gpsEff") has (Spec("The system should give a GPS-position correct within a 50 m radius")),
	Req("multiplePlatform") has (Spec("Support both Android and IOS")),
	Req("statExtraction") has (Spec("Extract statistics from system")),
	Req("viewSavedOnOtherDevice") has (Spec("Reach saved desitantions from other devices")),
	Stakeholder("Users"),
	Stakeholder("Staten")
	)
