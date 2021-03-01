# ProgramareAvansata - Lab 2
Alex Vasilica 2A2

# The transportation problem

An instance of the Transportation Problem consists of source and destinations.

- Each source has a given capacity, i.e. how many units of a commodity it is able to supply to the destinations.
- Each destination demands a certain amount of commodities.
- The cost of transporting a unit of commodity from each source to each destination is given by a cost matrix (or function).
We consider the problem of determining the quantities to be transported from sources to destinations, in order to minimize the total transportation cost. The supply and demand constraints must be satisfied. (We may assume that all the values are integer).

Consider the following example.

![tabel lab2](https://user-images.githubusercontent.com/48411835/109495836-7c106900-7a98-11eb-9f00-ac369a3a5ad7.png)

A solution may be something like that:

- S1 -> D3: 10 units * cost 1 = 10
- S2 -> D2: 25 units * cost 4 = 100
- S2 -> D3: 10*8 = 80
- S3 -> D1: 20*5 = 100
- S3 -> D3: 5*8 = 40
- Total cost: 330

# Compulsory

- Create an object-oriented model of the problem. You should have (at least) the following classes: Source, Destination, Problem.
The sources and the destinations have names. The sources will also have the property type. The available types will be implemented as an enum . For example:

```
public enum SourceType {
    WAREHOUSE, FACTORY;
}
```
Assume S1 is a factory and S2, S3 are warehouses.
- Each class should have appropriate constructors, getters and setters.
Use the IDE features for code generation, such as generating getters and setters.
- The toString method form the Object class must be properly overridden for all the classes.
Use the IDE features for code generation, for example (in NetBeans) press Alt+Ins or invoke the context menu, select "Insert Code" and then "toString()" (or simply start typing "toString" and then press Ctrl+Space).
- Create and print on the screen the instance of the problem described in the example.

