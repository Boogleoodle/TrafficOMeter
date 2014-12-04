Model(
	Task("addDestination") has (
		Spec("User saves a location\nTrigger: User want another destination to travel to"),
		Task("Find Location") has (
			Spec("Locate a location to travel to"),
			Variant("Select current GPS-coordinates as location"),
			Variant("Desired location does not exist"),
			Variant("Multiple matches for location query"),
			Frequency(5)
		),
		Task("Name Location") has (
			Spec("Give a name to a location"),
			Frequency(1)
		),
		Task("Save Location") has (
			Spec("Save a location to the device and database"),
			Frequency(1)
		),
		Why("The user shall not have to search for a destination he/she might visit multiple times."),
		Frequency(3)
	),
	Task("chooseTransportationMeans") has (
		Spec("User specifies what/which means of transportation/-s he/she wants to use.and then the system uses it"),
		Task("toggleTrain") has (
			Spec("Toggles whether or not the user wants to go by train."),
			Frequency(2)
		),
		Task("toggleBus") has (
			Spec("Toggles whether or not the user wants to go by bus."),
			Frequency(2)
		),
		Task("toggleFerry") has (
			Spec("Toggles whether or not the user wants to go by ferry."),
			Frequency(1)
		),
		Frequency(1)
	),
	Task("removeDestination") has (
		Spec("Remove a previously saved location"),
		Task("SelectSavedLocation") has (
			Spec("Select a location from a list of saved locations"),
			Frequency(1)
		),
		Task("deleteSelectedLocation") has (
			Spec("Remove a selected location"),
			Frequency(1)
		),
		Frequency(1)
 	)
)
