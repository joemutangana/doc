#!/bin/bash
echo -e "\n\nWelcome to your semester directory setup script!\n\n";
echo -n "Please enter your name: ";
read name;
echo -n "Please enter your semester (e.g., Fall2023): ";
read semester;
mkdir "$semester";
echo "$(pwd)";
folderPath = echo "$(pwd)";
cd "$semester";
echo -e "\n$semester: Directory created successfully!";

echo -n "\nHow many courses are you taking this semester? ";
read num_courses;
for ((i=1; i<=num_courses; i++)); do
    echo -n "Enter the name of course $i: ";
    read course_name;
    mkdir "$course_name";
    cd "$course_name";
    echo -n "Do you want to get default directories for this course? (yes/no): ";
    read response;
    if [[ "$response" == "yes" || "$response" == "y" ]]; then
        mkdir "Assignments" "Tables" "Exams" "Projects" "Marks" "Solutions" "Notes" "Revision" ;
        echo "Process successfully!";
    else
        echo -e "No default directories created for $course_name.\n";
        echo -n "Do you want to create custom directories for this course? (yes/no): ";
        read custom_response;
        if [[ "$custom_response" == "yes" || "$custom_response" == "y" ]]; then
            echo -n "How many custom directories do you want to create? ";
            read num_custom_dirs;
            for ((j=1; j<=num_custom_dirs; j++)); do
                echo -n "Enter the name of custom directory $j: ";
                read custom_dir;
                mkdir "$custom_dir";
            done
            cd ..;
        else
            echo -e "\nNo custom directories created for $course_name.";
        fi

    fi
    
done
cd ..;

echo "=========================================================================";
echo -e "\nAll courses processed successfully!\n";
echo "=========================================================================";

echo "Student Name: $name" >> info.txt;
echo "Semester: $semester" >> info.txt;
echo "Directory name: $semester" >> info.txt;
echo "Directory path: $path" >> info.txt;
echo "Disk space used: $(du -sh . | cut -f1)" >> info.txt;
cat info.txt;
