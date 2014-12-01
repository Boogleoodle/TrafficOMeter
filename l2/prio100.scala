Model(
	Stakeholder("user") has (
		Prio(1),
		Req("visibility") has Benefit(13),
		Req("viewOnOtherDevice") Benefit(2),
		Req("geographicalLocation") has Benefit(9),
		Req("fastestTrip") has Benefit(9),
		Req("saveLocation") has Benefit(15),
		Req("locationByMap") has Benefit(3),
		Req("modeOfTransport") has Benefit(9),
		Req("multiplePlatform") has Benefit(10),
		Req("removeSavedLocation") has Benefit(2)
		Req("multipleSavedLocations") has Benefit(7),
		Req("renameSavedLocation") has Benefit(1),
		Req("showRoutetoFirstStop") has Benefit(8),
		Req("statExtraction") has Benefit(0),
		Req("uptime") has Benefit(5),
		Req("gpsAcc") has Benefit(7)
	),
	Stakeholder("Staten") has (
		Prio(2),
		Req("visibility") has Benefit(7),
                Req("viewOnOtherDevice") Benefit(2),
                Req("geographicalLocation") has Benefit(4),
                Req("fastestTrip") has Benefit(10),
                Req("saveLocation") has Benefit(7),
                Req("locationByMap") has Benefit(1),
                Req("modeOfTransport") has Benefit(4),
                Req("multiplePlatform") has Benefit(14),
                Req("removeSavedLocation") has Benefit(0)
                Req("multipleSavedLocations") has Benefit(3),
                Req("renameSavedLocation") has Benefit(0),
                Req("showRoutetoFirstStop") has Benefit(4),
                Req("statExtraction") has Benefit(25),
                Req("uptime") has Benefit(14),
                Req("gpsAcc") has Benefit(5)
	),
)
