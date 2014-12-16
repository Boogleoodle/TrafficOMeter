Model(
	Goal("moreTravel") has (
		Spec("Increase the use of public transportation by making it a more effortless to find travel connections")
		),
	Goal("userTravelStatistics") has (
		Spec("The government wants statistics relevant for research purposes, to improve future infrastructure"),
		Feature("ExtractStatistics"),
		Feature("GetPopularStatistics"),
		Feature("GetRoutesStatistics")
	
	),
	Goal("travelOverview") has (
		Spec("The user wants to have an overview over the fastest possible route to their frequently visited destinations"),
		Feature("SpecifyMeansOfTravel"),
		Feature("OrderDestinations"),
		Feature("ViewNextOption"),
		Feature("FastestTrip"),
		Feature("GeographicalStartingPoint"),
		Feature("ShowRouteToFirstStop"),
		Feature("MaxDistToStop"),
		Feature("MinWaitTime"),
		Task("chooseTransportationMeans"),
		MockUp("WidgetMockup"),
		MockUp("ApplicationMockup"),
		MockUp("TripInformationMockup"),
		Quality("UpdateStartView"),
		Design("Widget")
	),
	Goal("minimalUserMaintenance") has (
		Spec("The user wants to know the total time to get to a frequently visited destinations without having to manually insert information every time"),
		Feature("SearchDestination"),
		Feature("ChangeNameOnDestination"),
		Feature("RemoveDestination"),
		Feature("MultipleDestinations"),
		Feature("SaveLocation"),
		Feature("SpecifyLocationByMap"),
		Task("addDestination"),
		Task("removeDestination"),
		Quality("Refresh time"),
		MockUp("AddDestinationMockup")
	),
	Goal("returnOnInvestment") has (
		Spec("The product needs to create enough value for the users for the product owner to get a return on their investment"),
		Quality("requestCapacity"),
		Quality("Uptime")
	),
	Goal("noGoal") has (
		Feature("Language") has (
			Spec("The system shall have support for both Swedish and English"),
			Why("To make the product available for more people"),
			Example("A setting where one can use the language to be used")
		),
		Feature("Android") has (
			Spec("The system shall support Android"),
			Why("A big share of the smart phone and tablet market uses the Android operating system")
		),

		Feature("IOS") has (
			Spec("The system shall support IOS"),
			Why("A big share of the smart phone and tablet market uses the IOS operating system")
		),

	Section("Means of transportation") has (
		Feature("SupportBuses") has (
			Spec("The System shall retrieve information for all bus lines in Sweden that has an accesible API")
		),

		Feature("SupportTrains") has (
			Spec("The System shall retrieve information for all train lines in Sweden that has an accesible API")
		),

		Feature("SupportFerries") has (
			Spec("The System shall retrieve information for all ferry lines in Sweden that has an accesible API")
		)
	),

	Section("ServerToClientCommunication") has (
		Feature("MultiAccessibleUserData") has (
			Spec("A single user shall be able to access its information from multiple devices automatically"),
			Why("User might want to use multiple devices, or have obtained a new device"),
			Example("The system could support a user profile and a server storage solution")
		),

		Feature("KeepAcountPrivate") has (
			Spec("A user can only access its own destinations"),
			Why("The data is private and shall not be possible view or change by someone else")
		)
	),

		Feature("ExtractDataFromProviders") has (
			Spec("Extract travel data from regional public transportation administrators"),
			Why("Obtaining travel data from this source is a vital part of our system, since it is used in all calculations")
	), 

		Feature("GeographicLocation") has (
		Spec("The system shall be able to get the current geographical position of the user"),
		Why("The position is used to be able to calculate the whole trip since the system is supposed to say 'to home in 20 minutes' "),
		Example("Use native GPS or WiFi-positioning feature of platforms")
	),

		Quality("GPS-position") has (
			Spec("The system shall give a GPS-position correct within a 50 meter radius")
	),

		Quality("UserIntegrity") has (
			Spec("The system shall not provide any statistics that could be used to track a single users travel habits or specific user positions")
	),


		Design("MobileApplication") has (
			Spec("There shall be an app where the user can view more information about the user's saved destinations than in the widget and change settings")
		),
			MockUp("SettingsMockup") has (
				Image("reference to mockup image \ref{pic:Settings}")
		)

	)
)
