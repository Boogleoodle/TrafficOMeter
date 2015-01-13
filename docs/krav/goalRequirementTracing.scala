Model(
	Goal("MoreTravel") has (
		Quality("UpdateStartView")
	),
	Goal("UserTravelStatistics") has (
		Feature("GetPopularMeansOfTransportStatistics"),
		Feature("GetPopularLocationStatistics"),
		Feature("GetUserStatistics"),
		Feature("GetTravelStatistics"),
		Feature("GetRoutesStatistics")
	),
	Goal("AccessibleForEverybody") has (
		Feature("Language"),
		Feature("Android"),
		Feature("IOS")
	),
	Goal("TravelOverview") has (
		Feature("SpecifyMeansOfTravel"),
		Feature("OrderDestinations"),
		Feature("ViewNextOption"),
		Feature("FastestTrip"),
		Feature("GeographicalStartingPoint"),
		Feature("ShowRouteToFirstStop"),
		Feature("MaxDistToStop"),
		Feature("MinWaitTime"),
		Task("ChooseTransportationMeans"),
		Quality("GPSPosition"),
		Quality("MeanTimeToCalculateTrip")
	),
	Goal("MinimalUserMaintenance") has (
		Feature("SpecifyLocationByAddress"),
		Feature("ChangeNameOnDestination"),
		Feature("DeleteDestination"),
		Feature("MultipleDestinations"),
		Feature("SaveDestination"),
		Feature("SpecifyLocationByMap"),
		Task("AddDestination"),
		Task("RemoveDestination"),
		Quality("MeanTimeToRefreshTrips")
	),
	Goal("UserTiedInformation") has (
		Feature("MultiAccessibleUserData"),
		Feature("KeepAcountPrivate"),
		Quality("UserIntegrity")
	),
	Goal("ReturnOnInvestment") has (
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