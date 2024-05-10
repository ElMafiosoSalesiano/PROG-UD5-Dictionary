#Welcome to our programm called "Dictionary".

##-Indroduction.
##-How can the program run.

#The introduction
So we have here the program that can help you to save words as you want to learn and remember better with the pass of the time.

#How is it function?.
The program have the following package structure;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/262f28ae-e3f1-4577-a26d-383247c7f386)
In this package structure the most important archives are two, "Main" that is te executable class and the "SortOut" class that is the background of the program with all
the important methods and functions that allowed the program to run. 

###"SoutOut" class.
##The pilar of the programm.
The "SoutOut" class is composed by the following structure, "atributes" of the class and the static methods that give functions to the "Main" class.
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/77d30761-39f1-44b0-87e8-3432faa9d6fb)
For start, I put sets one by letter of the alphabet starting with set "wordA" to finish with the set "wordZ", because the intention 
is storage and sorter a word with an initial that corresponds it and next, save it on the "Map" "sortWord", but we still not arrived at this point yet.
#-method sortWordAdd()
Console;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/cd692760-22ae-4b3f-af75-86bad0d8c019)
Code;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/d8ff3c6e-3db4-4d2f-adfd-f59a7718b14a)
This is an static method that as the name said, the method add a word that you write in the console. First i put a "String" variable called "word" that you write in 
console with an "SCANNER.nextLine()" with "tolowerCase()" for have a lower case always and comparing with other String with not showing errors. I passed the variable 
"String word" for the method. This variable that before you writed a word it is storaged in a variable type "char" called "firstCharacter" and just separated the
first letter with "word.charAt(0)" zero because the first letter is 0. Next I tryed to change the type char to String and we can choosing an option with a Switch, 
this solution can fix that you can put a number or something that can crash the program and just caught the words that the first letters are on the alphabet.
Now when the programs run the option for example the letter "a", the programm ask if the value of the variable "word" is empty for avoid saving spaces on the set,
and show the message "You dont introduced nothing", if it false it will add the word at the set with the initial that corresponds. Also the programm put
the first letter with a variable on the key and saving the set on the map, when the method ends show a message like the programm added this word. The other part 
of the method is exactly but with the other letters of the alphabet.

#-method eraseWord()
Console;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/410af0b5-7d31-4752-bfe0-a9967a36bba5)
Code;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/c9f29555-5a0f-46e7-b75a-cda421929e6c)
This is an static method that as the name said, the method erase a word that you writed in the console. First i put a "String" variable called "word" that you write in 
console with an "SCANNER.nextLine()" with "tolowerCase()" for have a lower case always and comparing with other String with not showing errors. I passed the variable 
"String word" for the method. This variable that before you writed a word it is storaged in a variable type "char" called "firstCharacter" and just separated the
first letter with "word.charAt(0)" zero because the first letter is 0. Next I tryed to change the type char to String and we can choosing an option with a Switch, 
this solution can fix that you can put a number or something that can crash the program and just erase the words that the first letters are on the alphabet. When we
are in the option for example "a". The program ask to the Map "SortWord if contains the first letter of the word that you want to delete, if there arent initials like the first of the 
word that you writed before the program said "there arent words by this initial". If it contains it, the program do a loop for find if the word that you are looking for in the set 
is equal to the word that you writed, if it equal, it will delete with ".remove()", the next part of the method is identical but with all the alphabet.

#-method findWord()
Console;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/d4780e0d-1b54-471e-87e9-b6785c74105e)
Code;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/bac2dc85-c199-4ede-990d-71d6e3f8fe7e)
This is an static method that as the name said, the method erase a word that you writed in the console. First i put a "String" variable called "word" that you write in 
console with an "SCANNER.nextLine()" with "tolowerCase()" for have a lower case always and comparing with other String with not showing errors. I passed the variable 
"String word" for the method. This variable that before you writed a word it is storaged in a variable type "char" called "firstCharacter" and just separated the
first letter with "word.charAt(0)" zero because the first letter is 0. For find the word the program with a switch again ask if the word that you introduced is equal with a foreach, if any 
is equal, sais; doesnt exist.

#-method showInitials()
This method first of all probe that all sets are empty and shows "any initials have nothing to show", if it false start to show if the initials have words with else-if.

#-method wordsByInitials()
Console;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/255f5bd8-bd92-4dd4-9508-545bbc3ba8ad)
Code;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/be0ea373-0a24-48dc-82fa-6ff7859f9996)
This method proves that you introduced a letter with one character, next if it not empty, and if it false proceeds to show all set of this initial.

##Executable class Main
Console;
![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/afa80e4c-e755-47e7-97f5-05e14ac9d1a6)

Code;

![image](https://github.com/MarcoElPibeJava/PROG-UD5-Dictionary/assets/159430116/06fc4f83-ff33-4b37-ae79-006ce25cb742)






