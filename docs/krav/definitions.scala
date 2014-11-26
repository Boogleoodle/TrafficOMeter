Model(
  Product("Our Product") has (
    Term("Route") has 
      Spec("The path between two different stops. Consists of one or more 'sub-trip's"), 
    Term("Trip") has (
      Spec("A specific travel between two geographical (GPS) points"), 
      Example("Between a users current position and one of its saved destinations")), 
    Term("Line") has (
      Spec("A set of 'stop's that is served by the same vehicle"), 
      Example("Bus 6 between X and Y")), 
    Term("Sub-trip") has (
      Spec("A subset of a line that is part of a bigger 'trip'"), 
      Example("Bus 3, stop #4 to stop #9"))))