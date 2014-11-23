Model(
  Product("Our Product") has (
    Feature("Visibility") has (
      Spec("The user has to have easy access to the travel information at all times"), 
      Why("The travel information provided by the solution is supposed to give the user a good overview of the possible travel opportunities at the current time. It is mainly a 'passive' information search (in contrast to todays 'active' search tools"), 
      Example("This could easily be achieved by using the 'widget' feature on the different mobile plattforms. Wearables are also a possibility")
    ),
    Feature("ViewNextOption") has (
    	Spec("There should be an option for the user to skip the current fastest route, and instead get the second best"),
    	Why("Basically a snooze button for the user"),
    	Example("Get the second best option by swiping the current option off the screen")
    ),
    Feature("GeographicLocation") has (
    	Spec("The system should be able to get the current geographical position of the user"),
    	Why("The position is used as the starting point when determining the route speeds"),
    	Example("Use native GPS or WiFi-positioning feature of plattforms")
    )
  )
)