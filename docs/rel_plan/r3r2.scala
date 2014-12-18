Model(
  Release("2") has (
    Feature("geographicalStartingPoint") has (Benefit(0), Cost(32)), 
    Feature("getTravelStatistics") has (Benefit(75), Cost(128)), 
    Feature("minWaitTime") has (Benefit(0), Cost(32)), 
    Feature("multipleDestinations") has (Benefit(23), Cost(8)), 
    Feature("removeDestination") has (Benefit(4), Cost(8)), 
    Feature("renameDestination") has (Benefit(2), Cost(8)), 
    Feature("searchLocations") has (Benefit(0), Cost(64)), 
    Feature("supportTrains") has (Benefit(0), Cost(128)), 
    Resource("TeamA") has (
      Feature("geographicalStartingPoint") has Cost(32), 
      Feature("getTravelStatistics") has Cost(128), 
      Feature("minWaitTime") has Cost(32), 
      Feature("multipleDestinations") has Cost(8), 
      Feature("removeDestination") has Cost(8), 
      Feature("renameDestination") has Cost(8), 
      Feature("searchLocations") has Cost(64), 
      Feature("supportTrains") has Cost(128), 
      Cost(408)), 
    Benefit(104), 
    Cost(408), 
    Order(2)))