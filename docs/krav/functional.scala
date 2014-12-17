Model(
	Req("GeographicLocation") has (
		Spec("The system shall be able to get the current geographical position of the user"),
		Why("The position is used to be able to calculate the whole trip since the system is supposed to say 'to home in 20 minutes' "),
		Cost(128),
		Example("Use native GPS or WiFi-positioning feature of platforms"),
		Stakeholder("Customer") has Benefit(5)
	),
	Req("ExtractingFormat") has (
		Spec("When extracting statistics from the system it shall be extracted to a semi-colon separated document"),
		Why("Semi-colon separated documents are quite versatile and has support in a wide variety of editors. The format can also easily be converted into spreadsheets.")
	)
)
