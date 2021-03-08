# Lab 3
The Tourist Trip Planning Problem
A tourist is about to visit a city. In this city, there are various locations such as tourism sites, hotels and restaurants, parks, etc. Locations have names and may have other common properties (such as a description, an image, coordinates, etc). Depending on its type, each location has various specific properties. However, if the location is a visitable, it must have opening hours. If the location is payable, it must have the entry fee (the price of the ticket). If the location is classifiable, it must have a classification (a rank).
The time (in minutes) required to go from one location to another is known. The tourist has also preferences regarding the order in which he (or she) would like to visit some locations.

Example: locations are: v1 (Hotel) v2 (Museum A) v3 (Museum B) v4 (Church A) v5 (Church B) v6 (Restaurant).

![lab3](https://user-images.githubusercontent.com/48411835/110334356-5ac8f300-802b-11eb-91d0-4ddc67cf8b5c.png)

The main specifications of the application are:

# Compulsory

- Create an object-oriented model of the problem. You should have at least the following classes City, Hotel, Museum, Church, Restaurant. The natural ordering of their objects is given by their names.
- Create the interfaces Visitable, Payable, Classifiable. The classes above must implement these interfaces accordingly.
- The City class will contain a List of locations.
- Each location will contain a Map representing the times required to go from this location to others.
- Create all the objects given in the example.
