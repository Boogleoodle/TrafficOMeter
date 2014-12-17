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

echo "OPTION: $2"
if [[ $2 == "-r" ]]
then
	java -jar $1 -i build.scala
	echo "reformating the tex files to suit our project better than what reqT's standard does"
	for f in docs/krav/*.tex;
	do
#		echo "$f"
		sed '/chapter/d' $f | cat > $f.tmp
		if [[ $f = "docs/krav/features.tex" ]]
		then 
			sed 's/section/paragraph/g' $f.tmp | cat > $f.tmp.tmp
		else
			sed 's/section/subsubsection/g' $f.tmp | cat > $f.tmp.tmp
		fi
		sed 's/\ \ /\t/g' $f.tmp.tmp | cat > $f
		rm $f.*
	done
fi


cd docs/
files=("systemRequirements" "checklist" "projectExperiences")
for f in ${files[@]};
do
	echo "Building: $f"
	pdflatex $f.tex | cat > $f.cat
	echo "Rebuilding $f to ensure that references are correct."
	pdflatex $f.tex | cat > $f.cat
	echo "Cleaning up the mess after pdflatex..."
	rm $f.toc
	rm $f.aux
	rm $f.out
	rm $f.log
	echo "$f built"
	echo " "
done

echo "--- the cats keeps track of the errors ---"

