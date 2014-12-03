Model(
    Section("Usability") has (
      Quality("UpdateStartview") has 
      Spec("Updating startview shall be possible with one buttonclick per time")
      ),
    Section("Efficiency") has (
      Quality("GPS-position") has 
      Spec("The system should give a GPS-position correct within a 50 m radius"), 
      Quality("Bytestid") has 
      Spec("The product will not have byten of less than 5 min?????"),
      Quality("requestCapacity") has 
      Spec("The system needs to be able to process at least 20000 update requests per minute") 
      ),
    Section("Reliability") has (
      Quality("Uptime-Reliability") has 
      Spec("The system should have an uptime of 99%")
      ),
    Section("Security") has (
      Quality("UserIntegrity") has (
        Spec("The system should not provide any statistics that could be used to track a single users travel routines or positions")
        )
    )
  )
