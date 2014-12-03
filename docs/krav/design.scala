Model(
	Product("Design") has (

        Section("Visual") has (

        	Section("Widget") has (
        		Feature("Appearance") has (
        			Spec("The product shall look like the screen pictures named widget?? shown in appendix ??"),
        			Why("The screen pictures display the way that the product shall look like"),
        			Status(ELICITED)
        		),
                Feature("Language") has (
                    Spec("The system shall have support for both Swedish and English"),
                    Why("To make the product available for more people"),
                    Example("A setting where one can use the language to be used"), //Detta är väl inget exempel, utan snarare ett till krav. Är inte själva kravet dessutom ett functional eller feature requiremnt?
                    Status(ELICITED)
                )
    		),
    		
    		Section("Application") has (
        		Feature("Appearance") has (
                    Spec("The product shall look like the screen pictures named app?? shown in appendix ??"),
                    Why("The screen pictures display the way that the product shall look like"),
                    Status(ELICITED)
                ),
                Feature("Language") has (
                    Spec("The system shall have support for both Swedish and English"),
                    Why("To make the product available for more people"),
                    Example("A setting where one can use the language to be used"),
                    Status(ELICITED)
                )
    		),

    		Section("RouteInformation") has (
        		Feature("Appearance") has (
                    Spec("The product shall look like the screen pictures named info?? shown in appendix ??"),
                    Why("The screen pictures display the way that the product shall look like"),
                    Status(ELICITED)
                ),
                Feature("Language") has (
                    Spec("The system shall have support for both Swedish and English"),
                    Why("To make the product available for more people"),
                    Example("A setting where one can use the language to be used"),
                    Status(ELICITED)
                )
    		)
    	)
		
    )
)