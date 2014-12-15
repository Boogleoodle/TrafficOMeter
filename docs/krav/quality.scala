Model(
	Section("Usability") has (
		Quality("UpdateStartView") has (
			Spec("Updating start view shall be possible with one press of a button per time"),
			Cost(8),
			Stakeholder("Customer") has Benefit(4)
		)
	),

	Section("Efficiency") has (
		Quality("GPS-position") has (
			Spec("The system shall give a GPS-position correct within a 50 meter radius"),
			Cost(64),
			Stakeholder("Customer") has Benefit(2),
			Stakeholder("User") has Benefit(7),
			Stakeholder("SwedishGovernment") has Benefit(5)
		),

		Quality("requestCapacity") has (
			Spec("The system needs to be able to process at least 20000 update requests per minute"),
			Cost(128)
		),

		Quality("Refresh time") has (
			Gist("Mean time between refresh start and information received"),
			Spec("Measured in milliseconds"),
			Breakpoint("Utility") has Value(10000), 
			Breakpoint("Differentiation") has Value(4000), 
			Breakpoint("Saturation") has Value(500),
			Target("Caching travel times and routes on server") has (
				Value(4000),
				Comment("Requires storage on server")
			),
			Target("Predicting user patterns") has (
				Value(400),
				Comment("By predicting user behaviour the system could prepare the most frequently used trips before the user needs it")
			),
			Barrier("first") has Value(6000),
			Barrier("second") has Value(1000),
			Product("Skanetrafiken") has Value(6000)
		)
	),

	Section("Reliability") has (
		Quality("Uptime") has 
			Spec("The system shall have an uptime of 99%"),
			Cost(256),
			Stakeholder("User") has Benefit(5),
			Stakeholder("SwedishGovernment") has Benefit(14)
	),

	Section("Security") has (
		Quality("UserIntegrity") has (
			Spec("The system shall not provide any statistics that could be used to track a single users travel habits or specific user positions"),
			Cost(32),
			Stakeholder("Customer") has Benefit(1)
		)
	)
)
