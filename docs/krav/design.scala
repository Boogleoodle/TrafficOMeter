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
				Spec("The layout of the widget can be designed as in:"),
				Image("Figure 12: Widget")
			 )
		),

		Screen("AddDestination") has (
			MockUp("AddDestinationMockup") has (
				Spec("The graphical interface for adding a destination can be designed as in:"),
				Image("Figure 11: AddDestination")
			)
		),

		Screen("Application") has (
			MockUp("ApplicationMockup") has (
				Spec("The main window of the application can be designed as in:"),
				Image("Figure 8: Application")
			)
		),

		Screen("Settings") has (
			MockUp("SettingsMockup") has (
				Spec("The graphical interface for the settings of the application can be designed as in:"),
				Image("Figure 10: Settings")
			)
		),

		Screen("TripInformation") has (
			MockUp("TripInformationMockup") has (
				Spec("The view of detailed information about a trip can be designed as in:"),
				Image("Figure 9: TripInformation")
			)
		)
	)
)
