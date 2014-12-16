Model(
	Section("Structure") has (
		Design("Widget") has (
			Spec("There shall be a widget that displays information about the user's saved destinations"),
			Cost(64),
			Stakeholder("Customer") has (
				Benefit(5)
			),
			Stakeholder("User") has Benefit(13),
			Stakeholder("SwedishGovernment") has Benefit(7)
		),

		Design("MobileApplication") has (
			Spec("There shall be an app where the user can view more information about the user's saved destinations than in the widget and change settings"),
			Cost(128),
			Stakeholder("Customer") has (
				Benefit(3)
				)
			)
		),

	Section("Visual") has (

		Screen("Widget") has (
			MockUp("WidgetMockup") has (
				Image("reference to mockup image 'Widget'")
			 )
		),

		Screen("AddDestination") has (
			MockUp("AddDestinationMockup") has (
				Image("reference to mockup image 'AddDestination'")
			)
		),

		Screen("Application") has (
			MockUp("ApplicationMockup") has (
				Image("reference to mockup image 'Application'")
			)
		),

		Screen("Settings") has (
			MockUp("SettingsMockup") has (
				Image("reference to mockup image 'Settings'")
			)
		),

		Screen("TripInformation") has (
			MockUp("TripInformationMockup") has (
				Image("reference to mockup image 'TripInformation'")
			)
		)
	)
)
