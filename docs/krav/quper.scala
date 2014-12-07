Model(
  Quality("Refresh time") has (
    Gist("Mean time between refresh start and received information"),
    Spec("Measured in milliseconds"),
    Breakpoint("Utility") has Value(10000), 
    Breakpoint("Differentiation") has Value(4000), 
    Breakpoint("Saturation") has Value(500),
    Target("Caching travel times and routes on server") has (
        Value(4000),
        Comment("Requires storage on server")),
    Target("Predicting user patterns") has (
        Value(400),
        Comment("By predicting user behaviour the system could prepare the most frequently used routes before the user needs it")),
    Barrier("first") has Value(6000),
    Barrier("second") has Value(1000),
    Product("Skånetrafiken") has Value(6000)
  ),
  Test("startup???? ska vi skriva test?") verifies Quality("mtts???"),
  Test("startup???") has (  
    Spec("Calculate average time in milliseconds of the startup time over 10  executions from start button is pressed to logon screen is shown.????"),
    Target("stretch")
  )
)