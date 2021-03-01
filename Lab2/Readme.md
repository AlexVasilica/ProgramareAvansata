# ProgramareAvansata - Lab 2
Alex Vasilica 2A2
#The transportation problem

The Transportation Problem
An instance of the Transportation Problem consists of source and destinations.

Each source has a given capacity, i.e. how many units of a commodity it is able to supply to the destinations.
Each destination demands a certain amount of commodities.
The cost of transporting a unit of commodity from each source to each destination is given by a cost matrix (or function).
We consider the problem of determining the quantities to be transported from sources to destinations, in order to minimize the total transportation cost. The supply and demand constraints must be satisfied. (We may assume that all the values are integer).

Consider the following example.
D1	D2	D3	Supply
S1	2	3	1	10
S2	5	4	8	35
S3	5	6	8	25
Demand	20	25	25	
A solution may be something like that:

S1 -> D3: 10 units * cost 1 = 10
S2 -> D2: 25 units * cost 4 = 100
S2 -> D3: 10*8 = 80
S3 -> D1: 20*5 = 100
S3 -> D3: 5*8 = 40
Total cost: 330
