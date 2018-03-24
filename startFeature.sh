#!/bin/bash

source=Example
mainFile=Example.java

do_print_help() {
    echo
	echo Usage: startFeature [options] 
	echo "-f [branch_name] create a feature branch"
	echo -h show this help screen
	echo
	exit 1
}

do_setup_git() {
    git checkout -b feat/$1
    git push origin feat/$1
}

do_add_git() {
    git add .
    git commit -m "Started work on $1"
}

do_copy() {
    cp -R $source $1
    mv $1/$mainFile $1/$1.java
    sed -i -e 's/'$source'/'$1'/g' $1/$1.java
    sed -i -e 's/'$source'/'$1'/g' $1/readme.md
}

do_compile() {
    javac $1/$1.java
    java $1/$1
}

if [ $# -eq 0 ] || [ "$1" = "-h" ]; then
    do_print_help
fi

if [ $# -eq 2 ]; then
    if [ "$1" = "-f" ]; then
    echo
    echo "Going to create new feature with name $2"
    do_setup_git $2
    do_copy $2
    do_compile $2
    do_add_git $2
    echo
    exit 1
fi
else 
    do_print_help
fi

