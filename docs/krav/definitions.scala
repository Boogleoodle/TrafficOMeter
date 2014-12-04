Model(
    Term("Means of transportation") has (
      Spec("Type of vehicle in which the public transport takes place"),
      Example("Bus, train, and ferry.")
    ),
    Term("User") has (
      Spec("An individual who uses the system"),
      Example("Person A looks at A's mobile device and wants to see the fastest way home.")
    ),
   Term("Destination") has (
      Spec("A geographical location that has been saved and given a name by the user."),
      Example("User A want to go home but doesn't want to search for the location again")
    ),
    Term("Time") has (
      Spec("Time of departure"),
      Example("Means of transportation A departs at time B")
    ),
    Term("Line of Transportation") has (
      Spec("A set of 'stop's that is served by the same vehicle. There is one line for each direction between the stops."), 
      Example("Bus 6 between X and Y")
    ),
    Term("Geographical Location") has (
      Spec("Consists of GPS coordinates"),
      Example("lat: 55.71037075564825, lon: 13.208270072937012")
    ),
    Term("Trip") has (
      Spec("A specific travel between two geographical (GPS) points"), 
      Example("Between a users current position and one of its destinations")
    ),
    Term("Stop") has (
      Spec("Place where a public transportation vehicle stop to pick up and let off passengers."),
      Example("Bus A stops at stop X to let set of persons Z on and set of persons C off.")
    ),
    Term("Route") has (
      Spec("The path between two different stops. Consists of one or more 'sub-trip's")
    ),
    Term("Timetable") has(
      Spec("The predefined departure times for a specific means of transportation"),
      Example("Bus A departs at time X")
    ),
    Term("Sub-trip") has (
      Spec("A subset of a line that is part of a bigger 'trip'"), 
      Example("Bus 3, stop #4 to stop #9")
    )

)

