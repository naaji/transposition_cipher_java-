/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication142;

import java.awt.event.*;
import java.util.*;
public class transpositionCipher
{

public static void main(String args[]) 
{
String key;
String message;
String encryptedMessage; 
// Letters in the x-axis
int x=6; 
// Letters in the y-axis
int y=6; 

key = "431265";
message = "ARAB ACADEMY FOR SCIENCE AND TECHNOLOGY";
encryptedMessage = "";

// To set the abdo as [x][y]
char[][] abdo=new char [key.length()][message.length()];
char[] msgg = message.toCharArray();
// To populate the array
x=0;
y=0;
// To convert the message into an array of char
for (int i=0; i< msgg.length;i++)
{
abdo[x][y]=msgg[i];
if (x==(key.length()-1)) 
{
x=0;
y=y+1;
} // Close if 
else 
{
x++;
}
} // Close for loop

// To sort the key
char t[]=new char [key.length()];
t=key.toCharArray();
Arrays.sort(t);

for (int j=0;j<y;j++)
{
for (int i=0;i<key.length();i++)
{
System.out.print(abdo[i][j]);
}
System.out.println();
}

System.out.println();

// To print out row by row (i.e. y)
for (int j=0;j<y;j++){ 
// To compare the the sorted Key with the key
// For char in the key
for (int i=0;i<key.length();i++){ 
int pos=0;
// To get the position of key.charAt(i) from sorted key
for (pos=0;pos<t.length;pos++){ 
if (key.charAt(i)==t[pos]){ 
// To break the for loop once the key is found
break;
}
}
System.out.print(abdo[pos][j]);
encryptedMessage+=abdo[pos][j];
}
System.out.println();
}

System.out.println(encryptedMessage);
System.exit(0);
}
}