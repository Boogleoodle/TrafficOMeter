Model(
		Req("ApplicationPresentation") has (
			Spec("The data of the main screen of the application shall be represented as in the virtual window --ref{pic:vwApp}")
		),
		Req("EditingDestinations") has (
			Spec("The data of the screen that handles the editing of destinations shall be represented as in the virtual window --ref{pic:vwEdit}")
		),
		Req("RouteInformation") has (
			Spec("The data of the screen that shows the route information shall be represented as in the virtual window --ref{pic:vwRoute}")
		),
		Req("Traveling Settings") has (
			Spec("The data of the screen that handles the editing of traveling settings shall be represented as in the virtual window --ref{pic:vwSettings}")
		),
		Req("WidgetPresentation") has (
			Spec("The data of the widget shall be represented as in the virtual window --ref{pic:vwWidget}")
		)

)
