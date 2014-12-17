Model(
	Stakeholder("SwedishGovernment") has (
		Text("The Swedish government has set out to reduce the carbon dioxide emissions in Sweden. To accomplish this they have set out to sponsor this project"),
		Goal("MoreTravel") has (
			Spec("Increase the use of public transportation by making it a more effortless to find travel connections")
		),
		Goal("UserTravelStatistics") has (
			Spec("The government wants statistics relevant for research purposes, to improve future infrastructure")
		),
		Goal("AccessibleForEverybody") has (
			Spec("As the government is supporting the project it needs to be developed for all Swedish citizens and tourists in Sweden")
		)
	),

	Stakeholder("User") has (
		Text("The target user group of this product is people who have the possibility to use public transport but does not because the process is too inconvenient. This product is designed to solve that problem by making the process easy with a low amount of work"),
		Goal("TravelOverview") has (
			Spec("The user wants to have an overview over the fastest possible route to their frequently visited destinations")
		),
		Goal("MinimalUserMaintenance") has (
			Spec("The user wants to know the total time to get to a frequently visited destinations without having to manually insert information every time")
		),
		Goal("UserTiedInformation") has (
			Spec("The information should be connected to the user and not tied to the users device")
		)
	),

	Stakeholder("ProductOwner") has (
		Text("The product owner is a company that has been hired by the Swedish government to develop the solution to their goal of getting more people to use public transport. The product owner will also implement the system"),
		Goal("ReturnOnInvestment") has (
			Spec("The product needs to create enough value for the users for the product owner to get a return on their investment")
		),
		Goal("ReplaceCurrentSoftware") has (
			Spec("The product owner wants the system to support the functions that the users to use it as their main search tool for transports.")
		)
	),

	Stakeholder("RegionalPublicTransportationAdministrators") has (
		Text("The regional public transportation administrators will get more customers with this product on the market. This will bring them higher income and more maintenance work"),
		Goal("UserTravelStatistics") has (
			Spec("The system will provide data about the users' possible travels that can be analyzed to reveal flaws in the local transportation systems")
		)
	)
)
