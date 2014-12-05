	Feature("GeographicLocation") has (
		Spec("The system should be able to get the current geographical position of the user"),
		Why("The position is used to be able to calculate the whole trip since the system is supposed to say 'to home in 20 minutes' "),
		Example("Use native GPS or WiFi-positioning feature of platforms"),
		Status(ELICITED),
		Stakeholder("Customer") has Prio(1)
	)
