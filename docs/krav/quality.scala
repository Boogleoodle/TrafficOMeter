Model(
  Product("Our Product") has (
    Quality("requestCapacity") has 
      Spec("The system needs to be able to process at least 20000 update requests per minute"), 
    Quality("UpdateStartview-Usability") has 
      Spec("Updating startview shall be possible with one buttonclick per time"), 
    Quality("Uptime-Reliability") has 
      Spec("The system should have an uptime of 99%"), 
    Quality("GPS-position-Efficiency") has 
      Spec("The system should give a GPS-position correct within a 50 m radius"), 
    Quality("Bytestid-Efficiency") has Spec("The product will not have byten of less than 5 min?????"), 
    Quality("personal-Security") has Spec("The system will not connect position with person")))