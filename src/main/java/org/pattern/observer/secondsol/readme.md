INITIAL REQUIREMENTS

We need to create a Weather Monitoring Application. The system has 3 major components - 

i. the weather station(the physical device that acquires the actual weather data)

ii. the WeatherData object (that tracks the data coming from the weather station and updates the displays)

iii. the displays that shows users the current weather conditions.

*OUR JOB*: is to create an application that uses the weatherData object to update three displays for current condition, weather stats abd a forecast.

*STRETCH - GOAL*: Expandability -> other developers can also create a custom displays as well.



Now, What are the problems with the above approach - 

When we are writing like this

``currentConditionDisplay.update(temp, humidity, pressure);`` <br />
``statisticsDisplay.update(temp, humidity, pressure);``  <br />
``forecastDisplay.update(temp, humidity, pressure);``

i. We are coding to a concrete implementation. No Scope to add/remove new display at runtime. or in another words, No scope to add/remove new display without making changes to the code.

ii. We can encapsulate the update() method calling


So, to fix the above issues, we can use Observer Pattern

> **Observer Pattern** = Publishers + Subscribers

*Observer Pattern:* it defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

Here, Observer Pattern uses a new design principle which is based on loose coupling - 

> Strive for loosely coupled designs between objects that interacts.

Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
