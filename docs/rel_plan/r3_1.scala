Model(
  Section("First release") has (
    Benefit(68), 
    Cost(634), 
    Order(1), 
    Feature("fastestTrip") has (Benefit(19), Cost(2)), 
    Feature("multiAccessibleUserData") has (Benefit(10), Cost(64)), 
    Feature("saveLocation") has (Benefit(23), Cost(32)), 
    Feature("searchLocations") has (Benefit(0), Cost(64)), 
    Feature("showRouteToFirstStop") has (Benefit(12), Cost(16)), 
    Feature("specifyLocationByMap") has (Benefit(4), Cost(64)), 
    Feature("supportBuses") has (Benefit(0), Cost(128)), 
    Feature("supportFerries") has (Benefit(0), Cost(128)), 
    Feature("supportTrains") has (Benefit(0), Cost(128)), 
    Feature("viewNextOption") has (Benefit(0), Cost(8)), 
    Resource("TeamA") has (
      Feature("fastestTrip") has Cost(2), 
      Feature("multiAccessibleUserData") has Cost(64), 
      Feature("saveLocation") has Cost(32), 
      Feature("searchLocations") has Cost(64), 
      Feature("showRouteToFirstStop") has Cost(16), 
      Feature("specifyLocationByMap") has Cost(64), 
      Feature("supportBuses") has Cost(128), 
      Feature("supportFerries") has Cost(128), 
      Feature("supportTrains") has Cost(128), 
      Feature("viewNextOption") has Cost(8), 
      Cost(634))))