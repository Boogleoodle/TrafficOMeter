Model(
	Section("Structure") has (
                Feature("Widget") has (
                    Spec("There shall be a widget that displays information about the user's saved destinations"),
                    Status(ELICITED)
                ),
                Feature("MobileApplication") has (
                    Spec("There should be an app where the user can view more information about the user's saved destinations than in the widget and change settings"),
                    Status(ELICITED)
                )
            ),

        Section("Visual") has (

        	Section("Widget") has (
        		Feature("Appearance") has (
        			Spec("The product shall look like the screen pictures named widget shown in appendix ??"),
        			Why("The screen pictures display the way that the product shall look like"),
        			Status(ELICITED)
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
		
    
)