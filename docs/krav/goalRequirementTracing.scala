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
	Goal("AccessibleForEverybody") has (
		Feature("Language"),
		Feature("Android"),
		Feature("IOS"),
		Design("MobileApplication"),
		MockUp("SettingsMockup")
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
		Design("Widget"),
		Quality("GPS-position"),
		Feature("GeographicLocation")
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
	Goal("DoNotTieUpInformation") has (
		Feature("MultiAccessibleUserData"),
		Feature("KeepAcountPrivate"),
		Quality("UserIntegrity")
	),
	Goal("returnOnInvestment") has (
		Spec("The product needs to create enough value for the users for the product owner to get a return on their investment"),
		Quality("requestCapacity"),
		Quality("Uptime")
	),

	Goal("ReplaceCurrentSoftware") has (
		Feature("SupportBuses"),
		Feature("SupportTrains"),
		Feature("SupportFerries"),
		Feature("ExtractDataFromProviders")
	)
)