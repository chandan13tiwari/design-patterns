====== Initial requirements ====== <br />
Clients need a Duck Application, where we can see all the Ducks we have with us and all the properties related to the Ducks.

![Initial requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/strategy-pattern-diagrams/1.jpg)


====== New Requirement ======= <br />
Now, Client wants that Duck can fly. So Joe thinks that we just need to add **fly()** method in Duck class, then all Ducks can inherit that property.

![New requirement](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/strategy-pattern-diagrams/2.jpg)

> BUT SOMETHING GOES TERRIBLY WRONG ... 
> check this package *org.pattern.strategy.secondsol*