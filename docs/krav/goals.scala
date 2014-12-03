Model(
		Stakeholder("SwedishGovernment") has (
			Goal("moreTravel") has (
				Spec("Increase the use of public transportation by making it a more effortless to find travel connections")
				),
			Goal("userTravelStatistics") has (
				Spec("The government wants statistics relevant for research purposes, to improve future infrastructure")
				)
			),
		Stakeholder("User") has (
			Goal("travelOverview") has (
				Spec("The user wants to have an overview over the shortest possible trips to their frequently visited destinations")
				),
			Goal("minimalUserMaintenance") has (
				Spec("The user wants to know the total time to get to a frequently visited destinations without having to manually insert information every time")
				)
			),
		Stakeholder("ProductOwner") has (
			Goal("returnOnInvestment") has (
				Spec("The product needs to be create enough value for the users for the product owner to get a return on their investment")
				)

		),
		Stakeholder("regionalPublicTransportationAdministrators") has (
			
				
			Goal("userTravelStatistics") has (
				Spec("The system will provide data about the users possible travels that can be analysed to reveal flaws in the local transportation system")
				)
			)
)
