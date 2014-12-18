Model(
	Goal("MoreTravel") has (
		Spec("Increase the use of public transportation by making it a more effortless to find travel connections")
		),
	Goal("UserTravelStatistics") has (
		Spec("The government wants statistics relevant for research purposes, to improve future infrastructure"),
		Feature("ExtractStatistics"),
		Feature("GetPopularStatistics"),
		Feature("GetRoutesStatistics")
	),
	Goal("AccessibleForEverybody") has (
		Feature("Language"),
		Feature("Android"),
		Feature("IOS")
	),
	Goal("TravelOverview") has (
		Spec("The user wants to have an overview over the fastest possible route to their frequently visited destinations"),
		Feature("SpecifyMeansOfTravel"),
		Feature("OrderDestinations"),
		Feature("ViewNextOption"),
		Feature("FastestTrip"),
		Feature("GeographicalStartingPoint"),
		Feature("ShowRouteToFirstStop"),
		Feature("MaxDistToStop"),
		Feature("MinWaitTime"),
		Feature("GeographicLocation"),
		Task("ChooseTransportationMeans"),
		Quality("UpdateStartView"),
		Quality("GPSPosition")
	),
	Goal("MinimalUserMaintenance") has (
		Spec("The user wants to know the total time to get to a frequently visited destinations without having to manually insert information every time"),
		Feature("SearchDestination"),
		Feature("ChangeNameOnDestination"),
		Feature("DeleteDestination"),
		Feature("MultipleDestinations"),
		Feature("SaveDestination"),
		Feature("SpecifyLocationByMap"),
		Task("AddDestination"),
		Task("RemoveDestination"),
		Quality("RefreshTime")
	),
	Goal("UserTiedInformation") has (
		Feature("MultiAccessibleUserData"),
		Feature("KeepAcountPrivate"),
		Quality("UserIntegrity")
	),
	Goal("ReturnOnInvestment") has (
		Spec("The product needs to create enough value for the users for the product owner to get a return on their investment"),
		Quality("RequestCapacity"),
		Quality("Uptime")
	),

	Goal("ReplaceCurrentSoftware") has (
		Feature("SupportBuses"),
		Feature("SupportTrains"),
		Feature("SupportFerries"),
		Feature("ExtractDataFromProviders")
	)
)