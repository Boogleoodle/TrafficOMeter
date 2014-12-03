Model(
    Section("Usability") has (
      Quality("UpdateStartView") has (
      Spec("Updating start view shall be possible with one press of a button per time"),
		Stakeholder("Customer") has Prio(2)
		)
      ),
    Section("Efficiency") has (
      Quality("GPS-position") has (
      Spec("The system shall give a GPS-position correct within a 50 meter radius"),
		Stakeholder("Customer") has Prio(4)
		),	
      Quality("TransferTime") has (
      Spec("The product will not have transfers of less than 5 minutes"),
		Stakeholder("Customer") has Prio(3)
		),
      Quality("requestCapacity") has (
      Spec("The system needs to be able to process at least 20000 update requests per minute")
		) 
      ),
    Section("Reliability") has (
      Quality("Uptime-Reliability") has 
      Spec("The system should have an uptime of 99%")
      ),
    Section("Security") has (
      Quality("UserIntegrity") has (
        Spec("The system should not provide any statistics that could be used to track a single users travel habits or specific user positions")
			Stakeholder("Customer") has Prio(5)
        )
    )
  )
