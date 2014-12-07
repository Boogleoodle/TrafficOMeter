Model(
	Section("Usability") has (
		Quality("UpdateStartView") has (
		Spec("Updating start view shall be possible with one press of a button per time"),
	Stakeholder("Customer") has Benefit(4)
	)
		),
	Section("Efficiency") has (
		Quality("GPS-position") has (
			Spec("The system shall give a GPS-position correct within a 50 meter radius"),
			Stakeholder("Customer") has Benefit(2),
			Stakeholder("User") has Benefit(7),
			Stakeholder("SwedishGovernment") has Benefit(5)
		),	
		
		Quality("requestCapacity") has (
			Spec("The system needs to be able to process at least 20000 update requests per minute")
		) 
	),
	Section("Reliability") has (
		Quality("Uptime") has 
			Spec("The system should have an uptime of 99%"),
			Stakeholder("User") has Benefit(5),
			Stakeholder("SwedishGovernment") has Benefit(14)
	),
	Section("Security") has (
		Quality("UserIntegrity") has (
			Spec("The system should not provide any statistics that could be used to track a single users travel habits or specific user positions"),
			Stakeholder("Customer") has Benefit(1)
		)
	)
)
