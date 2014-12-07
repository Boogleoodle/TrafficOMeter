#!/bin/bash
#

if [[ -e $1 ]]
then
	echo "--- Executing build process ---"
else
	echo "input: $1"
	echo "Usage: ./build.sh <path to reqT.jar>"
	exit
fi

java -jar $1 -i build.scala
#pdflatex ~/Documents/ets170/project/trafficOMeter/docs/systemRequirements.tex
for f in docs/krav/*.tex;
do
	echo "Removing eventual chapter-shite from $f"
	sed '/chapter/d' $f | cat > $f.tmp
	cat $f.tmp > $f
	rm $f.tmp
done

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


