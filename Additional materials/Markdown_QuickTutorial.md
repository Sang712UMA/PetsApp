
# What is Markdown?
Markdown is a **lightweight markup language**. It's like HTML but easier. It's widely used in different places.
For example in Discord, Whatsapp, Github etc... You can export a Markdown text to different file formats as HTML

> MARKDOWN: `**Hello world!**` 
> HTML: `<strong>Hello world!</strong>`
> Output: **Hello world!**

You can even write piece of codes of other languages:
```java
// A Hello World! program in Java
public class HelloWorld {
	public static void main(String[] args){
		//Prints Hello World! to the terminal
		System.out.println("Hello World!");
	}
}
```
```c#
// A Hello World! program in C#.  
using System; 
namespace  HelloWorld 
{ 
	class  Hello 
	{ 
		static void Main() 
		{ 
			Console.WriteLine("Hello World!"); 
			// Keep the console window open in debug mode. 
			Console.WriteLine("Press any key to exit."); 
			Console.ReadKey(); 
		} 
	} 
}
```

## Useful Links:

-   [Wikipedia article](https://en.wikipedia.org/wiki/Markdown)
-   [Github: Basic writing and formatting syntax](https://help.github.com/en/articles/basic-writing-and-formatting-syntax)
-   [Github: Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
-   [Markdown Editor Stackedit](https://stackedit.io) <--- This is the one I use
-   [Markdown Editor Dillinger](https://dillinger.io/)

# Markdown Quick Tutorial

## Headers

### H3
#### H4
##### H5
##### H6
```
# Markdown Quick Tutorial (It has a underline)
## Headers (It has a underline)
### H3
#### H4
##### H5
###### H6
```
## Formats
_Italics_ `_Italics_ or *Italics*`
**Strong** `**Strong** or __Strong__`
_Italics __and Strong___ `_Italics **and Strong**_ (Combine them as you wish)`
~~Strikethorugh.~~ `~~Strikethorugh.~~`

## List
1. Order List First item 
2. Second item
```
1. Order List First item 
2. Second item
```
* Unorder item
* Second item
```
* Unorder item
* Second item
```
1. List
   * Sublist
     * Sub-sub list
        1. Sub-sub-sub list
```
1. List
   * Sublist
     * Sub-sub list
        1. Sub-sub-sub list
```
## Links
[Github: Petsapp](https://github.com/Sang712UMA/PetsApp) 

https://github.com/Sang712UMA/PetsApp
```
[Github: Petsapp] (https://github.com/Sang712UMA/PetsApp)

https://github.com/Sang712UMA/PetsApp
```
## Images
Image:  ![Alt text](https://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/dog-face.png "Dog Image")

```
Image: ![Alt text](https://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/dog-face.png "Dog Image")
```
## Code

You can write `inline code` if you want
```You can write `inline code` if you want```

Or you can write a block-code with a triple back-ticks ` ``` ` If you put in the first three back-ticks the language _(css in this case)_ the code will be highlighted in that language.
```css
body {
font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
background-color: #5D5C61;
background-size: cover;
}
```

```
.```css
body {
font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
background-color: #5D5C61;
background-size: cover;
}
.```
```

## Tables
| Device        | GPIO | Board Pins | I/O    |
|--------------:|:----:|:----------:|:-------|
| LED1 (red)    | 9    | 21         | Output |
| LED2 (red)    | 10   | 19         | Output |
| LED3 (yellow) | 11   | 23         | Output |
| LED4 (yellow) | 17   | 11         | Output |
| LED5 (green)  | 22   | 15         | Output |
| LED6 (green)  | 27   | 13         | Output |
| PUSH BUTTON1  | 2    | 3          | Input  |
| PUSH BUTTON2  | 3    | 5          | Input  |
| SPEAKER       | 4    | 7          | Output |
```
| Device        | GPIO | Board Pins | I/O    |
|--------------:|:----:|:----------:|:-------|
| LED1 (red)    | 9    | 21         | Output |
| LED2 (red)    | 10   | 19         | Output |
| LED3 (yellow) | 11   | 23         | Output |
| LED4 (yellow) | 17   | 11         | Output |
| LED5 (green)  | 22   | 15         | Output |
| LED6 (green)  | 27   | 13         | Output |
| PUSH BUTTON1  | 2    | 3          | Input  |
| PUSH BUTTON2  | 3    | 5          | Input  |
| SPEAKER       | 4    | 7          | Output |
```
## Quotes

> Without requirements or design, programming is the art of adding bugs
> to an empty text file.
> Louis Srygley
```
> Without requirements or design, programming is the art of adding bugs
> to an empty text file.
> Louis Srygley
```
> "Every great developer you know got there by solving problems they
> were unqualified to solve until they actually did it." 
> Patrick McKenzie
```
> "Every great developer you know got there by solving problems they
> were unqualified to solve until they actually did it." 
> Patrick McKenzie
```
### There are even more stuff...
You can create task lists, insert youtube videos etc etc etc...