Model(
  Product("Our Product") has (
    Section("Usage") has (
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
      Feature("FastestOption") has (
        Spec("The system should show the total travel time of the fastest trip"),
        Why("So the user can see how long time it takes to travel to the saved destinations"), 
        Example("Show a list of saved destinations and in this list show the time it takes to get to the different locations"),
        Status(ELICITED)
        ),
      Feature("GeographicStartingPoint") has (
        Spec("The user shall be able to use its geographical location as a starting point for a trip"),
        Why("The position is used as the starting point when determining the route"),
        Example("Use native GPS or WiFi-positioning feature of plattforms"),
        Status(ELICITED)
        ),

      Feature("ShowRouteToFirstStop") has (
        Spec("When the user wants to use a specific travel option the route between the current position and the first stop will be accessable"),
        Why("The user might not find its way in the current area, and still should be able to get to the first stop quickly"),
        Example("Show the route between current position and first stop ion a map."),
        Status(ELICITED)
        )
      ),
Section("Maintenance") has (
  Feature("GeographicLocation") has (
   Spec("The system should be able to get the current geographical position of the user"),
   Why("The position is used to calculate the whole trip since the system is suppose to say "to home 20 minutes" "),
   Example("Use native GPS or WiFi-positioning feature of plattforms"),
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
    Spec("The user can specify what means of travel to use"),
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
  Feature("RemoveLocation") has (
    Spec("It shall be possible for the user to remove a previously added location"),
    Why("If that location no longer is in the interest of the user"),
    Example("An EDIT button besides the field the name of the location"),
    Status(ELICITED)
    ),
  Feature("MultipleLocations") has (
    Spec("The system shall have support for storing multiple locations"),
    Why("It is useless if one can have only one location at a time"),
    Example("Multiple fields of locations"),
    Status(ELICITED)
    ),
  Feature("OrderDestinations") has (
    Spec("It shall be possible for the user to order it's destinations in a priority order"),
    Why("Since the display window in the widget will only fit a few destinations, the user needs to be able to prioritize its destinations to chose which ones are displayer"),
    Example("If the latest added destination is the most frequently used, the user might want to set the top priority for this destination so that it is always visible"),
    Status(ELICITED)
    )
  ),
Section("ServerToClientCommunication") has (
  Feature("MultiAccessibleUserData") has (
    Spec("A single user shall be able to access its information from multiple devices automaticly"),
    Why("User might want to use multiple devies, or have obtained a new device"),
    Example("The system could support a user profile and a server storage solution"),
    Status(ELICITED)
    )
  ),
Section("Interfaces") has (
  Feature("ExtractDataFromProviders") has (
    Spec("Extract travel data from regional public transportation administrators"),
    Why("Obtaining travel data from this source is a vital part of our system, since it is used in all calculations"),
    Example("If the user wants toknow the fastest trip to it's home, the system will need the timetables of all the transportation means involved"),
    Status(ELICITED)
    )
  )

)
)

