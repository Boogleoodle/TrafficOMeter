Model(
	Task("AddDestination") has (
		Spec("User saves a geographical location\nTrigger: User want another destination to travel to"),
		Task("FindGeographicalLocation") has (
			Spec("Locate a geographical location to travel to"),
			Variant("Select current GPS-coordinates as geographical location"),
			Variant("Desired geographical location does not exist"),
			Variant("Multiple matches for geographical location query"),
			Frequency(5)
		),

		Task("NameGeographicalLocation") has (
			Spec("Give a name to a geographical location"),
			Frequency(1)
		),

		Task("SaveGeographicalLocation") has (
			Spec("Save a geographical location to the device and database"),
			Frequency(1)
		),

		Why("The user shall not have to search for a geographical location that the user might visit multiple times."),
		Frequency(3)
	),

	Task("ChooseTransportationMeans") has (
		Spec("User specifies which means of transportation(s) that the system shall use for calculating the fastest trip"),
		Frequency(1)
	),

	Task("RemoveDestination") has (
		Spec("Remove a previously added destination"),
		Task("SelectDestination") has (
			Spec("Select a destination from a list of destinations"),
			Frequency(1)
		),

		Task("DeleteSelectedDestination") has (
			Spec("Remove a selected destination"),
			Frequency(1)
		),
		Frequency(1)
 	)
)
