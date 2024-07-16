#Write a program to find the frequency of a character [which will be selected by the user] from 
a given string.
string = input("Enter the string ");
freq = [None] * len(string);

for i in range(0, len(string)):
    freq[i] = 1;
    for j in range(i + 1, len(string)):
        if (string[i] == string[j]):
            freq[i] = freq[i] + 1;

            
            string = string[: j] + '0' + string[j + 1:];

    
print("Characters and their corresponding frequencies");
for i in range(0, len(freq)):
    if (string[i] != ' ' and string[i] != '0'):
        print(string[i] + "-" + str(freq[i]));