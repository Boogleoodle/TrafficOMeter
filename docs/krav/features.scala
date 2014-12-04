Model(
	Section("Usage") has (
		Feature("Visibility") has (
			Spec("The user shall have easy access to the travel information at all times"),	
			Why("The travel information provided by the solution is supposed to give the user a good overview of the possible travel opportunities at the current time. It is mainly a 'passive' information search (in contrast to todays 'active' search tools"), 
			Example("This could easily be achieved by using the 'widget' feature on the different mobile platforms. Wearables are also a possibility"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
<<<<<<< HEAD
		),
		Feature("ViewNextOption") has (
			 Spec("The user shall be able to choose to discard the displayed route to a destination and instead get the route of the next departure to the same desination"),
			 Why("Because the time to the fastest alternative may not be enough for the user to get ready to leave"),
			 Example("Get the second fastest option by swiping the current option for the destination off the screen"),
			 Status(ELICITED),
			Stakeholder("Customer") has Prio(2)
		),
		Feature("FastestOption") has (
			Spec("The system should automatically show the total travel time of the fastest trip"),
			Why("So the user can see how long time it takes to travel to the saved destinations"), 
			Example("Show a list of saved destinations and in this list show the time it takes to get to the different locations"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
		),
		Feature("GeographicStartingPoint") has (
			Spec("The system shall be able to use the user's geographical location as a starting point for a trip"),
			Why("The position should be used as the starting point when determining the route"),
			Example("Use native GPS or WiFi-positioning feature of platforms"),	
			Status(ELICITED),
			Stakeholder("Customer") has Prio(3)
		),
		Feature("ShowRouteToFirstStop") has (
			Spec("When the user selects a specific travel option the route between the current position and the first stop shall be accessible"),
			Why("The user might not find its way in the current area, and should be able to get to the first stop quickly"),
			Example("Show the route between current position and first stop on a map."),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(3)
		)
	),
	Section("Maintenance") has (
		Feature("GeographicLocation") has (
			Spec("The system should be able to get the current geographical position of the user"),
			Why("The position is used to calculate the whole trip since the system is supposed to say 'to home in 20 minutes' "),
			Example("Use native GPS or WiFi-positioning feature of platforms"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
		), 
		Feature("SaveLocation") has (
			Spec("The user can add a location to its saved locations for easy access"),
			Why("To populate the list of saved locations"),
			Example("Add button in the application"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
		),
		Feature("SpecifyByMap") has (
			Spec("The user can specify the location by by moving a target on a map"),
			Why("A map gives more information to the user and makes is easier for the user to communicate its wishes"),
			Example("Use third party map software"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(4)
		),
		Feature("SpecifyMeansOfTravel") has (
			Spec("The User shall be able to specify which of the supported means of transportation it would like to use and then the system shall use the selected means of transportation"),
			Why("Not all users want to use the same means of travel"),
			Example("This can be implemented using a settings dialog"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(2)
		),
		Feature("SearchDestination") has (
			Spec("The user shall be able to search for destinations"),
			Why("To find a destination to travel to"),
			Example("Add an button for opening a search field"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
		),
		Feature("ChangeNameOnSavedLocation") has (
			Spec("It shall be possible to change the name of a location"),
			Why("To make it easier to tell the different location apart"),
			Example("An EDIT button besides the field for the name of the location"),
			Status(ELICITED)
		),
		Feature("RemoveLocation") has (
			Spec("It shall be possible for the user to remove a previously added location"),
			Why("If that location no longer is in the interest of the user it should be possible to remove it"),
			Example("An Delete button besides the name of the location"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(2)
		),
		Feature("MultipleLocations") has (
			Spec("The system shall have support for storing multiple locations"),
			Why("It is useless if one can have only one location at a time"),
			Example("Multiple fields of locations"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(2)	
		),
		Feature("OrderDestinations") has (
			Spec("It shall be possible for the user to order its destinations in a priority order"),
			Why("Since the display window in the widget will only fit a few destinations, the user needs to be able to prioritize its destinations to chose which ones are displayed"),
			Example("If the latest added destination is the most frequently used, the user might want to set the top priority for this destination so that it is always visible"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(1)
		)
	),
	Section("ServerToClientCommunication") has (
		Feature("MultiAccessibleUserData") has (
			Spec("A single user shall be able to access its information from multiple devices automatically"),
			Why("User might want to use multiple devices, or have obtained a new device"),
			Example("The system could support a user profile and a server storage solution"),
			Status(ELICITED)
		),
		Feature("KeepAcountPrivate") has (
			Spec("A user can only access its own destinations"),
			Why("The data is private and should not be possible view or change by someone else"),
			Example("The system could provide a login system that protects the data")
		)
	),
	Section("Statistics") has (
		Feature("ExtractStatistics") has (
			Spec("It shall be possible for [WHO] to extract statistics from the system"),
			Why("The statistics are used to get useful information for planning future infrastructure"),
			Example("The statistics could be extracted using a web interface"),
			Status(ELICITED),
			Stakeholder("Customer") has Prio(4)
		),
		Feature("GetPopularDestinationsStatistics") has (
			Spec("The system should be able to provide statistics about which 'GeographicLocation':s are popular"),
			Why("The Swedish government hopes to be able to use this and other statistics as decision basis when planning infrastructure"),
			Example("?"),		 
			Status(ELICITED),
			Stakeholder("Customer") has Prio(4)
		),
		Feature("GetRoutesStatistics") has (
			Spec("The system should be able to provide statistics about which routes that all users has at a specific time"),
			Why("This information could be used to extract information about the quality of the infrastructure (?) in a specific city. From the information things like number of transfers, the given time it takes relative to the distance covered etc. could be useful"),
			Example("?"),		 
			Status(ELICITED)
		)
	),
	Section("Interfaces") has (
		Feature("ExtractDataFromProviders") has (
			Spec("Extract travel data from regional public transportation administrators"),
			Why("Obtaining travel data from this source is a vital part of our system, since it is used in all calculations"),
			Example("If the user wants to know the fastest trip to its home, the system will need the timetables of all the transportation means involved"),
			Status(ELICITED)
		)
	),
	Section("Support") has (
		Feature("Language") has (
			Spec("The system shall have support for both Swedish and English"),
			Why("To make the product available for more people"),
			Example("A setting where one can use the language to be used"), 
			Status(ELICITED)
		)
=======
          ),
      Feature("ViewNextOption") has (
       Spec("The user shall be able to choose to discard the displayed route to a destination and instead get the trip of the next departure to the same desination"),
       Why("Because the time to the fastest alternative may not be enough for the user to get ready to leave"),
       Example("Get the second fastest option by swiping the current option for the destination off the screen"),
       Status(ELICITED),
		Stakeholder("Customer") has Prio(2)
       ),
      Feature("FastestOption") has (
        Spec("The system should automatically show the total travel time of the fastest trip"),
        Why("So the user can see how long time it takes to travel to the saved destinations"), 
        Example("Show a list of saved destinations and in this list show the time it takes to get to the different locations"),
        Status(ELICITED),
		Stakeholder("Customer") has Prio(1)
        ),
      Feature("GeographicStartingPoint") has (
        Spec("The system shall be able to use the user's geographical location as a starting point for a trip"),
        Why("The position should be used as the starting point when determining the route"),
        Example("Use native GPS or WiFi-positioning feature of platforms"),  
        Status(ELICITED),
		Stakeholder("Customer") has Prio(3)
        ),

      Feature("ShowRouteToFirstStop") has (
        Spec("When the user selects a specific travel option the route between the current position and the first stop shall be accessible"),
        Why("The user might not find its way in the current area, and should be able to get to the first stop quickly"),
        Example("Show the route between current position and first stop on a map."),
        Status(ELICITED),
		Stakeholder("Customer") has Prio(3)
		
        )
      ),
Section("Maintenance") has (
  Feature("GeographicLocation") has (
   Spec("The system should be able to get the current geographical position of the user"),
   Why("The position is used to calculate the whole trip since the system is supposed to say 'to home in 20 minutes' "),
   Example("Use native GPS or WiFi-positioning feature of platforms"),
   Status(ELICITED),
	Stakeholder("Customer") has Prio(1)
   ), 

  Feature("SaveLocation") has (
    Spec("The user can add a location to its saved locations for easy access"),
    Why("To populate the list of saved locations"),
    Example("Add button in the application"),
    Status(ELICITED),
	Stakeholder("Customer") has Prio(1)
    ),
  Feature("SpecifyByMap") has (
    Spec("The user can specify the location by by moving a target on a map"),
    Why("A map gives more information to the user and makes is easier for the user to communicate its wishes"),
    Example("Use third party map software (google maps)"),
    Status(ELICITED),
	Stakeholder("Customer") has Prio(4)
    ),
  Feature("SpecifyMeansOfTravel") has (
    Spec("The User shall be able to specify which of the supported means of transportation it would like to use and then the system shall use the selected means of transportation"),
    Why("Not all users want to use the same means of travel"),
    Example("This can be implemented using a settings dialog"),
    Status(ELICITED),
	Stakeholder("Customer") has Prio(2)
    ),
  Feature("SearchDestination") has (
    Spec("The user shall be able to search for destinations"),
    Why("To find a destination to travel to"),
    Example("Add an button for opening a search field"),
    Status(ELICITED),
	Stakeholder("Customer") has Prio(1)
    ),
  Feature("ChangeNameOnSavedLocation") has (
    Spec("It shall be possible to change the name of a location"),
    Why("To make it easier to tell the different location apart"),
    Example("An EDIT button besides the field for the name of the location"),
    Status(ELICITED)
    ),
  Feature("RemoveLocation") has (
    Spec("It shall be possible for the user to remove a previously added location"),
    Why("If that location no longer is in the interest of the user it should be possible to remove it"),
    Example("An Delete button besides the name of the location"),
    Status(ELICITED),
Stakeholder("Customer") has Prio(2)
    ),
  Feature("MultipleLocations") has (
    Spec("The system shall have support for storing multiple locations"),
    Why("It is useless if one can have only one location at a time"),
    Example("Multiple fields of locations"),
    Status(ELICITED),
Stakeholder("Customer") has Prio(2)	
    ),
  Feature("OrderDestinations") has (
    Spec("It shall be possible for the user to order its destinations in a priority order"),
    Why("Since the display window in the widget will only fit a few destinations, the user needs to be able to prioritize its destinations to chose which ones are displayed"),
    Example("If the latest added destination is the most frequently used, the user might want to set the top priority for this destination so that it is always visible"),
    Status(ELICITED),
Stakeholder("Customer") has Prio(1)
    )
  ),
Section("ServerToClientCommunication") has (
  Feature("MultiAccessibleUserData") has (
    Spec("A single user shall be able to access its information from multiple devices automatically"),
    Why("User might want to use multiple devices, or have obtained a new device"),
    Example("The system could support a user profile and a server storage solution"),
    Status(ELICITED)
    ),
	Feature("KeepAcountPrivate") has (
		Spec("A user can only access its own destinations"),
		Why("The data is private and should not be possible view or change by someone else"),
		Example("The system could provide a login system that protects the data")
>>>>>>> b99a0eee7d26257aac5b7e3ef3e635114e9e830e
	)
)

