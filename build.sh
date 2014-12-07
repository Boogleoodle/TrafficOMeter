#!/bin/bash
#

if [[ -e $1 ]]
then
	echo "--- Executing build process ---"
else
	echo "input: $1"
	echo "Usage: ./build.sh <path to reqT.jar> <options>"
	echo "Options:"
	echo " -r	Rebuild tex from scala" 
	exit
fi
if [[$2 == "-r"]]
then
	java -jar $1 -i build.scala
	for f in docs/krav/*.tex;
	do
		echo "Removing eventual chapter-shite and changing section to subsubsection in $f"
		sed '/chapter/d' $f | cat > $f.tmp
		sed 's/section/subsubsection/g' $f.tmp | cat > $f
		rm $f.tmp
	done
fi

cd docs/
pdflatex systemRequirements.tex
pdflatex systemRequirements.tex
rm systemRequirements.toc
rm systemRequirements.aux
rm systemRequirements.out
rm systemRequirements.log

pdflatex checklist.tex
pdflatex checklist.tex
rm checklist.toc
rm checklist.aux
rm checklist.out
rm checklist.log

pdflatex projectExperiences.tex
pdflatex projectExperiences.tex
rm projectExperiences.toc
rm projectExperiences.aux
rm projectExperiences.out
rm projectExperiences.log


