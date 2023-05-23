====== Initial requirements ====== <br />
Clients need a Duck Application, where we can see all the Ducks we have with us and all the properties related to the Ducks.


====== New Requirement ======= <br />
Now, Client wants that Duck can fly. So Joe thinks that we just need to add **fly()** method in Duck class, then all Ducks can inherit that property.


> BUT SOMETHING GOES TERRIBLY WRONG ...

Now, all Ducks have the ability to fly. And if we add a Rubber Duck or a Decoy Duck, they can now also able to fly but actually they won't fly.. also they have ability to quack.. but rubber duckies can only *squeaks*.
<br />
<br />
Joe thinks of inheritance here, so that he can reuse the code, but that becomes a maintenance nightmare for him.

<br />
<br />

Now, Joe is thinking of using an Interface for the behaviours. <br />
We can make a **Flyable** and **Quackable** interface with *fly()* and *quack()* respectively, and those ducks who want to fly and quack can implement those behaviours (interfaces).

> Is this a great Idea?? NOOOOOO


For now it seems a promising design to use interfaces like this, but thats NOT a great idea..
<br />
Let say if we have 50 types of Duck that will fly and quack, so we will implement those behaviours 50 times and there is no code reuse.
and when there is a small change in one behaviour, we need to do that in all 50.

*So, Inheritance isn't a good idea because Duck behaviour keeps changing across the sub classes.*

Here comes our 1st Design Principle -
> *Identify the aspects of your application that vary and seperate them from what stays the same.*

In simple words, take what varies and encapsulate it so that it won't affect the rest of your code and it brings more flexibility to our code.

So, now we know that *fly()* and *quack()* are the parts of the Duck class that vary across Ducks. To seperate these behaviour from the duck class we'll pull both methods out of the Duck class and create a new set of classes to represent each behaviour.


##### How to achieve flexibility?
So, now we know that we want to assign behaviours to the instances of Duck. Means, we might want to instantitate  new Mallard Duck with a specific type of flying behaviour and when we are doing so, then why not set this behaviour at the runtime.

Here comes the 2nd Design principle -
> *Program to an interface, not an implementation.*

which means, we'll use an interface to represent each behaviour *(not a class).*
because using class can lead us on writing more code because we are locked to use the specific implementation and there is no room for change.