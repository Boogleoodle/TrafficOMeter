//kommentar
//to run:
//	scala -classpath "/usr/m4tt3/Documents/ets170/reqT/reqT-jar" build.scala


for(file <- new java.io.File("docs/krav").listFiles.filter(_.getName.endsWith(".scala"))) {
	println("processing file: " + file.toString())
	val m = load(file.toString()).toModel
	println("File: " + file.toString() + " interpreted, exporting to latex...")
//	m.pp
	m.toLatexBody.save(file.toString().substring(0,file.toString().length - 6) + ".tex")
}

sys.exit
