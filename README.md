# How to use

1. [Meet prerequisites](#prerequisites)
2. Open folder `rollenspiel` in preferred code editor
3. Switch to Main.java
4. Run the Main.java and have fun!

# Rollenspiel Projekt Requirements

## Creating classes

- specific attributes
- getters & setters
- constructors

## Optimising these classes

- identifying shared attributes
- eliminating redundancies
- refactoring these redundancies into a shared parent-class

## Implementing fight methods
    
- scaling damage dependent on specific class attributes
- using the other specific attribute in some way

## Goal
- creating a program that simulates fighting between two `Charakter`
- the combat should be turn-based
- the combat should end, if a `Charakter` has no more `gesundheit`

### Criterias for the submission

- a working implementation of `angreifen(Charakter charakter)`
- testing of different scenarios  
(with attacks, crits and exhaustion of ressources)
- visual representation of the fight in form of showing attributes of the fighters
- well documentated, clear code that also explains the logic behind `angreifen(Charakter charakter)`

# Additional notes

Everything that's not noted down above was optional.

The database integration for example was not necessary and is not useful, it could've been solved with only java code, but I wanted to practice how to integrate a db into the program.

There are some little eastereggs, maybe, while playing, you smile as much as I did while coding. 

#### Prerequisites 

- have a working editor / IDE with integrated jdk
- have internet access to download missing dependencies on first start