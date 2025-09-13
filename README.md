Library Management System
What the Program Is About

This is a simple Library Management System in Java.
It lets users:

Add new books with title, author, and ISBN.

Borrow (issue) and return books.

Check if a book is available.

Display all books in the library along with their status.

It uses classes, inheritance, and interfaces to organize the code neatly.

 What Should Be Installed

To run this program, you need:

Java JDK (version 8 or above) → for compiling and running Java programs.

Eclipse IDE (or any Java IDE) → for editing, compiling, and running the project.

Optional: You can also use other IDEs like IntelliJ IDEA or NetBeans.

 How to Run

Open Eclipse IDE.

Create a new Java project:

File → New → Java Project → Name: LibrarySystemProject

Right-click src → New → Package → Name: mylibrary

Create 5 classes inside the package:

Borrowable.java

LibraryThing.java

BookItem.java

BookShelf.java

LibraryDemo.java

Copy-paste the code for each file into its respective class.

Make sure all files start with:

package mylibrary;


Clean the project: Project → Clean…

Right-click LibraryDemo.java → Run As → Java Application.

Use the menu in the console to add, borrow, return, or display books.

 Features

Add new books with title, author, and ISBN.

Borrow books (if not already borrowed).

Return books.

Display all books with their availability status.

User-friendly console menu.

Sample Console Output
--- Library Menu ---
1. Add new book
2. Borrow a book
3. Return a book
4. Show all books
5. Exit
Choose option: 1
Enter title: Harry Potter
Enter author: J.K. Rowling
Enter ISBN: H101
Book added.

Choose option: 2
Enter ISBN to borrow: H101
Book borrowed successfully.

Choose option: 4
Wings of Fire by A.P.J. Abdul Kalam (ISBN: X101) -> Available
Rich Dad Poor Dad by Robert Kiyosaki (ISBN: X102) -> Available
Java for Beginners by James Gosling (ISBN: X103) -> Available
Harry Potter by J.K. Rowling (ISBN: H101) -> Borrowed

Choose option: 3
Enter ISBN to return: H101
Book returned successfully.

Choose option: 5
Exiting Library...


This version is simple, direct, and answers all four of Kashvi’s questions:

What the program is about

What should be installed

How to run it

Features
