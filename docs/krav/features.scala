Model(
  Product("Our Product") has (
    Feature("Visibility") has (
      Spec("The user has to have easy access to the travel information at all times"), 
      Why("The travel information provided by the solution is supposed to give the user a good overview of the possible travel opportunities at the current time. It is mainly a 'passive' information search (in contrast to todays 'active' search tools"), 
      Example("This could easily be achieved by using the 'widget' feature on the different mobile plattforms. Wearables are also a possibility"),
      Status(ELICITED)
    ),
    Feature("ViewNextOption") has (
    	Spec("There should be an option for the user to skip the current fastest route, and instead get the second best"),
    	Why("Basically a snooze button for the user"),
    	Example("Get the second best option by swiping the current option off the screen"),
      Status(ELICITED)
    ),
    Feature("GeographicLocation") has (
    	Spec("The system should be able to get the current geographical position of the user"),
    	Why("The position is used as the starting point when determining the route speeds"),
    	Example("Use native GPS or WiFi-positioning feature of plattforms"),
      Status(ELICITED)
    ), 
  	Feature("FastestOption") has (
  		Spec("The system should show the total travel time of the fastest trip"),
  		Why("So the user can see how long time it takes to travel to the saved destinations"), 
  		Example("Show a list of saved destinations and in this list show the time it takes to get to the different locations"),
      Status(ELICITED)
  	),
    Feature("SaveLocation") has (
      Spec("The user can add a location to its saved locations for easy access"),
      Why("To populate the list of saved locations"),
      Example("Add button in the application"),
      Status(ELICITED)
    ),
    Feature("SpecifyByMap") has (
      Spec("The user can specify the location by using a map by moving a target"),
      Why("A map gives more information to the user and makes is easier to communicate its wishes"),
      Example("Use third party map software (google maps)"),
      Status(ELICITED)
    ),
    Feature("SpecifyMeansOfTravel") has (
      Spec("The user can specify what means of travel it wants to use"),
      Why("Not all users want to use the same means of travel"),
      Example("This can be implemented using a settings dialog"),
      Status(ELICITED)
    ),
    Feature("SearchDestination") has (
      Spec("The user skall be able to search for destinations"),
      Why("To find a destination to travel to"),
      Example("Add an button for opening a search field"),
      Status(ELICITED)
    ),
    Feature("ChangeNameOnSavedLocation") has (
      Spec("It shall be possible to change the name of a location"),
      Why("To make it easier to tell the different location appart"),
      Example("An EDIT button besides the field the name of the location"),
      Status(ELICITED)
    ),
    Feature("GuideME") has (
      Spec("It shall be possible to see ones current location and a route to the next transport"),
      Why("If one does not know exacly where the next transport is located"),
      Example("When the location in pusched, a new window appears that contains a map and a guided route"),
      Status(ELICITED)
    ),
    Feature("RemoveLocation") has (
      Spec("It shall be possible for the user to remove a previously added location"),
      Why("It that location no longer is in the intress of the user"),
      Example("An EDIT button besides the field the name of the location"),
      Status(ELICITED)
    ),
    Feature("MultipleLocations") has (
      Spec("The system shall have support for storing multiple locations"),
      Why("It is useless if one can have only one location at a time"),
      Example("Multiple fields of locations"),
      Status(ELICITED)
    )
    
    
  )
)
