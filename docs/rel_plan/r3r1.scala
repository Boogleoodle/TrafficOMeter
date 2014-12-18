Model(
  Release("1") has (
    Feature("extractDataFromProviders") has (Benefit(0), Cost(256)), 
    Feature("fastestTrip") has (Benefit(48), Cost(2)), 
    Feature("keepAccountPrivate") has (Benefit(0), Cost(32)), 
    Feature("maxDistToStop") has (Benefit(0), Cost(32)), 
    Feature("saveLocation") has (Benefit(54), Cost(32)), 
    Feature("showRouteToFirstStop") has (Benefit(28), Cost(16)), 
    Feature("supportBuses") has (Benefit(0), Cost(128)), 
    Feature("supportFerries") has (Benefit(0), Cost(128)), 
    Resource("TeamA") has (
      Feature("extractDataFromProviders") has Cost(256), 
      Feature("fastestTrip") has Cost(2), 
      Feature("keepAccountPrivate") has Cost(32), 
      Feature("maxDistToStop") has Cost(32), 
      Feature("saveLocation") has Cost(32), 
      Feature("showRouteToFirstStop") has Cost(16), 
      Feature("supportBuses") has Cost(128), 
      Feature("supportFerries") has Cost(128), 
      Cost(626)), 
    Benefit(130), 
    Cost(626), 
    Order(1)))