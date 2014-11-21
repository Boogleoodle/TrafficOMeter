Model(
  Task("AddDestination") has (
    Why("User wants to have another destination for future trip alternatives"), 
    Spec("1.Find location, 2.give the place a name, 3.save destination. Variants: 1a) Take current position, 1b) Searched for place does not exist, 1c) Multiple place matches search. Purpose: To add a new destination so that trips to that destination are shown in the future. Trigger: User want another destination to travel to. Frequency: Frequent when downloading app, or moving, otherwise not frequent")))