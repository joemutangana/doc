#!/bin/bash

#Semester Directory Setup (SDS) is a script for helping me setup my semester files container gracefully and faster, it enteracts with me, it is less time consuming because, some repeatedly directories I have been creating manual, now they can be created under few seconds by just accepting it. I have used different linux commands, such as, echo, mkdir, cd, pwd, cat, du. Those helped to successfully complete the SDS. I also used control structure such as while loop, if, and for loop, while loop used to ensure that directories aren't already exist in current directory, if used to make decisions like create directories or not, for used to iterate through the number of courses user will enter to ask user provide name of the courses. I also append redirection operator to generate the report of the semester. 


echo -e "\n\n======================================================";
echo "       WELCOME TO SEMESTER DIRECTORY SETUP (SDS)";
echo -e "======================================================\n\n";

echo -n "Enter your name: ";
read name;

echo -n "Enter your semester, e.g Fall2026: ";
read semester;


#This while loop is most important in this, script for handling user inputs similar to existing directories. If user/me enters existing directory, the SDS does not create that directory, unless user retyped different directory name

while [[ -d "$semester" ]]; do
     echo -n "The directory '$semester' semester already exist, Enter different semester name: ";
     read semester;
done


echo -e "Success!\n";
mkdir "$semester";
cd "$semester";

#The variable to hold the semester path
path="$(pwd)";

semesterDir=("Tables" "Payments");

i=1;
for dir in "${semesterDir[@]}"; do
    echo "$i. $dir";
    (( i++ ));
done

echo -ne "\nCan SDS create above directories in $semester? Y/N: ";
read response;

#Validating user choice to decide whether SDS can create directories for the user if the user chose yes or y the SDS instantly creates the directories for the user

if [[ "$response" == "yes" || "$response" == "y" || "$response" == "Y" ]]; then

    for dir in "${semesterDir[@]}"; do
        mkdir "$dir";
        
    done

#Display success message to the screen after directories successfully created.
echo -e "Success!\n";
else
echo -e "\n";
fi




echo -n "How many courses for this semester?: ";
read num_courses;

#Validate the user input check if entered values is actual number or invalid number number like less than 1

while [[ ! "$num_courses" =~ ^[0-9]+$ ]] || (( num_courses <1 )); do
    echo -n "ERROR: Number can't be less than 0 or be letter. Try again: ";
    read num_courses;
done

#Creating an array of most directories appear in each course

courseDir=("Notes" "Assignments" "Solutions" "Revisions");

echo -e "\n";
for (( i=1; i<=num_courses; i++)); do
    echo -n "Enter a name for course $i: ";
    read course_name;
    
    #Telling user that provided course directory exist so user can provide different directory name
    while [[ -d "$course_name" ]]; do
        echo -n "You have already created '$course_name' course directory, Enter different course name: ";
        read course_name;
    done
    mkdir "$course_name";
    cd "$course_name";
    echo -e "\n";
    j=1;
    for dir in "${courseDir[@]}"; do
        echo "$j. $dir";
        ((j++));
    done

    #Validating user choice to decide whether SDS can create directories for the user if the user chose yes or y the SDS instantly creates the directories for the user

    echo -ne "\nCan SDS create above directories in $course_name? Y/N: ";
    read response;
    if [[ "$response" == "yes" || "$response" == "y" || "$response" == "Y" ]]; then

        for dir in "${courseDir[@]}"; do
            mkdir "$dir";
            
        done
    #Display success message to the screen after directories successfully created.
    echo -e "Success!\n";
    else
    echo -e "\n";
    fi
    
    cd ../;
done

#Using append operator to generate report of the directory in file called info

echo -e "\n\n***********************************************************************" >> info;
echo "      Your $semester semester directory setup processed successfully" >> info;
echo -e "***********************************************************************\n" >> info;

echo "Student Name: $name">> info;
echo "Semester name: $semester" >> info;
echo "Number of courses: $num_courses" >> info;
echo "Disk usage: $(du -sh)" >> info;
echo "Directory path: $path" >> info;
echo "Created on: $(date)" >> info;
echo -e "\n\n" >> info;
cat info;

#End of the scripts
