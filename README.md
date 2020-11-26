![SortManager-transparent](https://user-images.githubusercontent.com/15944458/96385054-3b6b1f80-1189-11eb-9469-35e9bf33a148.png)

*Created: Oct 18, 2020 8:40 PM*

*Updated: Oct 18, 2020 9:27 PM*

## Table of contents

- [Requirements](#requirements)
- [Introduction](#introduction)
- [Built with](#built-with)
- [Getting started](#getting-started)
- [Usage](#usage)
- [Future Work](#future-work)

## Requirements

- This project would demonstrate sorting of arrays using different algorithms.  
- It should be a MAVEN project. 
- User should be given the option to select which algorithm they want to choose for the sorting of their arrays. 
- You have the flexibility to randomly generate the array or take it from the user (developer preference).
- Different packages need to be used.
- Design Patterns - Factory - need to create a class which basically creates the sort at runtime as per user requirements. 
- You should use logger to debug/trace your code and also adding the exceptions in that. 
- Make sure to adhere to all SOLID principles and good coding conventions.

## Introduction

SortManager is the product of the first two weeks of my training at [Sparta Global](https://www.spartaglobal.com/), in the Java Dev team. It encompasses concepts such as:

- Exceptions

    Both from `java.lang` and two custom built ones

- Interfaces

    In our case two interfaces are used: `Sorter` and `BinaryTree`

- Industry level design

    The project aims to follow **SOLID** design principles

- The four pillars of OOP

    Abstraction, Inheritance, Encapsulation, Polymorphism

- Nested Classes

    The `Node` class inside the binary tree.

It also makes use of **Maven** as the dependency management and build tool, **JUnit-Jupiter** for unit testing, **log4j2** for logging throughout the program.

It's main focus is around sorting algorithms and in particular:

1. Bubble sort
2. Merge sort
3. Tree sort

Another thing that is explored is how each algorithm performs next to each other. Performance tests happen withing the testing section of the solution.

## Built with

The project was built entirely using [IntelliJ](https://www.jetbrains.com/idea/). 

## Getting started

You need to have downloaded IntelliJ on your computer, either the [community version](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC) or the [ultimate](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows) one.

Then you need to clone the repo. For windows users, run the following command in Git:

`git clone https://github.com/waLLxAck/Sparta-Global-SortManager/tree/master`

*Note: You can use IntelliJ for cloning, too.*

Once you've done that, all you have to do is open up the project in the IntelliJ.

## Usage

You can use the system to either learn from the design and/or coding conventions/implementation or to sort custom and randomly generated array of numbers. 

# Future work

- Add more sorting algorithms
- Add a user interface
