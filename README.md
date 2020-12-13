# School

Interface Trimester with method totalExamInTrimester(int trimester) -> return int 

----------------------------------------------------------------------------
Student class

Attributes
static final countName,countId
int[] grades
String name
int id;

This class is the most simple one(Methods CTOR empty where i set manuaaly the name and the id, Getters/Setters, toString)

---------------------------------------------------------------------------------------------------------

Subject class implements Trimester with method totalExamByTrimester(int trimester)
Each subject can have different number of exams by trimester, so when the user user choose the trimester we return the totalNumberOfExams ,switching by trimester (1,2,3)

Attributes 
static final int MIN_STUDENTS = 1;
static final int MAX_STUDENTS = 30;
String subjectName;
Student[] students;

Methods
2 CTORS one empty one with only subjectName
totalExamByTrimester(int trimester();
toString();
Getters/Setters
populateDefaultGrades()-> it fills the studentGradeArray with 0;
getGradesByTrimester(int trimester) -> return int [] stududentGrades....Use the method you have already overrided totalExamsByTrimeter(int trimester) and save the value in a new variable.
addRandomStudent()-> return Student[] 
Note: we use the max and min to add total student to 1 subject and we had the grades from the method getGradesByTrimester(here you put your trimester [1,2,3]) and add the student to the array

---------------------------------------------------------------------------------

School class

Attributes
String name
Subject[] subjects
static int countSchool = 0; 

Methods
CTOR empty where i set mannualy the name of "School"+ countSchool
addRandmonSubjects()->return Subject[] we want at least 1 Subject and no more than 5(you can change and it can be update)
Getters/Setters

----------------------------------------------------------------------------------------------------------------
MainTest class

Methods
main method where you cretaed your school and you populate it with subjects
ststaic printTotalStudentsInSchool(school)
static printAvgGradesInSchool(school)
