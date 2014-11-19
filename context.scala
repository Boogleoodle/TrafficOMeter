Model(
	Product("TraficOMeter") interactsWith (
		User("Staten"),
		User("Slutanvändare") interactsWith (Product("TraficOMeter"))
	),
	System("GPS") interactsWith (Product("TraficOMeter")),
	System("Kollektivtrafiksystem") interactsWith (Product("TraficOMeter"))
)