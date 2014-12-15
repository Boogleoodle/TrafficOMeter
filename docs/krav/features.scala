Model(

	Section("Support") has (
		Feature("Language") has (
			Spec("The system shall have support for both Swedish and English"),
			Why("To make the product available for more people"),
			Example("A setting where one can use the language to be used"),
			Cost(64) 
		),
		Feature("Android") has (
			Spec("The system shall support Android"),
			Why("A big share of the smart phone and tablet market uses the Android operating system"),
			Cost(64),
			Stakeholder("User") has Benefit(5)
		),

		Feature("IOS") has (
			Spec("The system shall support IOS"),
			Why("A big share of the smart phone and tablet market uses the IOS operating system"),
			Cost(64),
			Stakeholder("User") has Benefit(5)
		)
	),

	Section("Usage") has (
		Feature("ViewNextOption") has (
			Spec("The user shall be able to choose to discard the displayed trip to a destination and instead get the next trip to the same destination"),
			Why("Because the time to the fastest alternative may not be enough for the user to get ready to leave"),
			Example("Get the second fastest option by swiping the current option for the destination off the screen"),
			Cost(8),
			Stakeholder("Customer") has Benefit(4)
		),

		Feature("FastestTrip") has (
			Spec("The system shall automatically show the total travel time of the fastest trip"),
			Why("So the user can see how long time it takes to travel to the destinations"), 
			Example("Show a list of destinations and in this list show the time it takes to get to the different alternatives"),
			Cost(2),
			Stakeholder("Customer") has Benefit(5),
			Stakeholder("User") has Benefit(9),
			Stakeholder("SwedishGovernment") has Benefit(10)
		),

		Feature("GeographicalStartingPoint") has (
			Spec("The system shall be able to use the user's geographical location as a starting point for a trip"),
			Why("The position shall be used as the starting point when determining the route"),
			Example("Use native GPS or WiFi-positioning feature of platforms"),
			Cost(32),
			Stakeholder("Customer") has Benefit(3)
		),

		Feature("ShowRouteToFirstStop") has (
			Spec("When the user selects a specific travel option the route between the current position and the first stop shall be accessible"),
			Why("The user might not find its way in the current area, and shall be able to get to the first stop quickly"),
			Example("Show the route between current position and first stop on a map."),
			Cost(16),
			Stakeholder("Customer") has Benefit(3),
			Stakeholder("User") has Benefit(8),
			Stakeholder("SwedishGovernment") has Benefit(4)
		),

		Feature("MaxDistToStop") has ( 
			Spec("The user shall be able to specify the maximum distance in a transfer between two adjacent stops."),
			Cost(32),
			Stakeholder("Customer") has Benefit(4)
		),

		Feature("MinWaitTime") has (
			Spec("The user shall be able to specify the minimum waiting time in a transfer between two adjacent stops."),
			Cost(32),
			Stakeholder("Customer") has Benefit(4)
		)
	),

	Section("Means of transportation") has (
		Feature("SupportBuses") has (
			Spec("The System shall support all bus lines in all the commuting services in Sweden"),
			Cost(128),
			Stakeholder("Customer") has Benefit(5)
		),

		Feature("SupportTrains") has (
			Spec("The System shall support all train lines in all the commuting services in Sweden"),
			Cost(128),
			Stakeholder("Customer") has Benefit(5)
		),

		Feature("SupportFerries") has (
			Spec("The System shall support all ferry lines in all the commuting services in Sweden"),
			Cost(128),
			Stakeholder("Customer") has Benefit(5)
		)
	),

	Section("Maintenance") has (
		Feature("SaveLocation") has (
			Spec("The user can save a location to its destinations for easy access"),
			Why("To populate the list of destinations"),
			Example("Add button in the application"),
			Cost(32),
			Stakeholder("Customer") has Benefit(5),
			Stakeholder("User") has Benefit(15),
			Stakeholder("SwedishGovernment") has Benefit(8)
		),

		Feature("SpecifyLocationByMap") has (
			Spec("The user can specify the location by moving a target pin on a map"),
			Why("A map gives more information to the user and makes is easier for the user to communicate its wishes"),
			Example("Use third party map software"),
			Cost(64),
			Stakeholder("Customer") has Benefit(2),
			Stakeholder("User") has Benefit(3),
			Stakeholder("SwedishGovernment") has Benefit(1)
		),
		Feature("SpecifyMeansOfTravel") has (
			Spec("The User shall be able to specify which of the supported means of transportation it would like to use and then the system shall use the selected means of transportation"),
			Why("Not all users want to use the same means of travel"),
			Example("This can be implemented using a settings dialog"),
			Cost(4),
			Stakeholder("Customer") has Benefit(4),
			Stakeholder("User") has Benefit(9),
			Stakeholder("SwedishGovernment") has Benefit(4)
		),
		Feature("SearchLocations") has (
			Spec("The user shall be able to search for locations"),
			Why("To find a location to travel to"),
			Example("Add an button for opening a search field"),
			Cost(64),
			Stakeholder("Customer") has Benefit(5)
		),
		Feature("ChangeNameOnDestination") has (
			Spec("It shall be possible to change the name of a destination"),
			Why("To make it easier to tell the different destinations apart"),
			Example("An EDIT button besides the field for the name of the destination"),
			Cost(8),
			Stakeholder("User") has Benefit(1),
			Stakeholder("SwedishGovernment") has Benefit(0)

		),
		Feature("RemoveDestination") has (
			Spec("It shall be possible for the user to remove a previously saved destination"),
			Why("If that destination no longer is in the interest of the user it shall be possible to remove it"),
			Example("An Delete button besides the name of the destination"),
			Cost(8),
			Stakeholder("Customer") has Benefit(4),
			Stakeholder("User") has Benefit(2),
			Stakeholder("SwedishGovernment") has Benefit(0)
		),
		Feature("MultipleDestinations") has (
			Spec("The user shall be able to store multiple destinations"),
			Why("It is very useful that the user can store several destinations at the same time without having to do a new search every time he or she wants to go somewere"),
			Example("Multiple fields of destinations"),
			Cost(8),
			Stakeholder("Customer") has Benefit(4),
			Stakeholder("User") has Benefit(7),
			Stakeholder("SwedishGovernment") has Benefit(3)
		),
		Feature("OrderDestinations") has (
			Spec("It shall be possible for the user to order its destinations in an priority order"),
			Why("The screen of a smart phone might not be big enough to display all	of a users destinations. Therefore it would be convenient for the user to order its destination in an priority order"),
			Example("The user creates a new destination and would lie to see it on the widget. The user prioritizes the newly added destination so that the destination has a higher priority relative the other destinations. The newly added destination is displayed frist of all the destination, from the top of the screen"),
			Cost(16),
			Stakeholder("Customer") has Benefit(5)

		)
	),

	Section("ServerToClientCommunication") has (
		Feature("MultiAccessibleUserData") has (
			Spec("A single user shall be able to access its information from multiple devices automatically"),
			Why("User might want to use multiple devices, or have obtained a new device"),
			Example("The system could support a user profile and a server storage solution"),
			Stakeholder("User") has Benefit(7),
			Cost(64),
			Stakeholder("SwedishGovernment") has Benefit(3)
		),

		Feature("KeepAcountPrivate") has (
			Spec("A user can only access its own destinations"),
			Why("The data is private and shall not be possible view or change by someone else"),
			Cost(32),
			Example("The system could provide a login system that protects the data")
		)
	),

	Section("Statistics") has (
		Feature("ExtractStatistics") has (
			Spec("It shall be possible for the system supervisor(s) to extract statistics from the system"),
			Why("The statistics are used to get useful information for planning future infrastructure"),
			Example("The statistics could be extracted using a web interface"),
			Cost(256),
			Stakeholder("Customer") has Benefit(2),
			Stakeholder("User") has Benefit(0),
			Stakeholder("SwedishGovernment") has Benefit(25)
		),

		Feature("GetPopularStatistics") has (
			Spec("The system shall be able to provide statistics about which geographical locations are popular"),
			Why("The Swedish government hopes to be able to use this and other statistics as decision basis when planning infrastructure"),
			Cost(128),
			Example("The system supervisor(s) provides the Swedish government with the extracted statistics"),		
			Stakeholder("Customer") has Benefit(2)
		),

		Feature("GetRoutesStatistics") has (
			Spec("The system shall be able to provide statistics about which routes that all users has at a specific time"),
			Why("This information could be used to extract information about the infrastructure in a specific city. From the information things like number of transfers, the given time it takes relative to the distance covered etc. could be useful"),
			Cost(128),
			Example("The system supervisor(s) checks the current traffic information in a given city")
		)
	),

	Section("Interfaces") has (
		Feature("ExtractDataFromProviders") has (
			Spec("Extract travel data from regional public transportation administrators"),
			Why("Obtaining travel data from this source is a vital part of our system, since it is used in all calculations"),
			Cost(256),
			Example("If the user wants to know the fastest trip to its home, the system will need the time tables of all the transportation means involved")
		)
	)
)
