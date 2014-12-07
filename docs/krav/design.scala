Model(
	Section("Structure") has (
                Design("Widget") has (
                    Spec("There shall be a widget that displays information about the user's saved destinations"),
                    Status(ELICITED),
					Stakeholder("Customer") has (
						Prio(1)
					)
                ),
                Design("MobileApplication") has (
                    Spec("There should be an app where the user can view more information about the user's saved destinations than in the widget and change settings"),
                    Status(ELICITED),
					Stakeholder("Customer") has (
						Prio(3)
					)
                )
            ),

        Section("Visual") has (

        	Screen("Widget") has (
        		MockUp("WidgetMockup") has (
        			Image("reference to mockup image")
        		)
    		),
            Screen("AddDestination") has (
                MockUp("AddDestinationMockup") has (
                    Image("reference to mockup image")
                )
            ),
            Screen("Application") has (
                MockUp("ApplicationMockup") has (
                    Image("reference to mockup image")
                )
            ),
            Screen("Settings") has (
                MockUp("SettingsMockup") has (
                    Image("reference to mockup image")
                )
            ),
            Screen("TripInformation") has (
                MockUp("TripInformationMockup") has (
                    Image("reference to mockup image")
                )
            )
        ),
    		
    		Section("Application") has (
        		Feature("Appearance") has (
                    Spec("The product shall look like the screen pictures named Application shown in appendix ??"),
                    Why("The screen pictures display the way that the product shall look like"),
                    Status(ELICITED)
                )
    		),

            Section("Settings") has (
                Feature("Appearance") has (
                    Spec("The product shall look like the screen pictures named Settings shown in appendix ??"),
                    Why("The screen pictures display the way that the product shall look like"),
                    Status(ELICITED)
                )
            ),

    		Section("RouteInformation") has (
        		Feature("Appearance") has (
                    Spec("The product shall look like the screen pictures named Trip Information shown in appendix ??"),
                    Why("The screen pictures display the way that the product shall look like"),
                    Status(ELICITED)
                )
    		)
    	)
		
    

