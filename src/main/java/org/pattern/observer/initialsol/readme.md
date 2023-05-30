INITIAL REQUIREMENTS

We need to create a Weather Monitoring Application. The system has 3 major components - 

i. the weather station(the physical device that acquires the actual weather data)

ii. the WeatherData object (that tracks the data coming from the weather station and updates the displays)

iii. the displays that shows users the current weather conditions.

*OUR JOB*: is to create an application that uses the weatherData object to update three displays for current condition, weather stats abd a forecast.

![](https://github.com/chandan13tiwari/design-patterns/blob/master/src/main/resources/observer-pattern-diagrams/1.jpg)


|   WeatherData         |
<br /> <br />
|   getTemp()           | <br />
|   getHumidity()       | <br />
|   getPressure()       | <br />
|                       | <br /> <br />
|  measurementChanged() | <br />



*STRETCH - GOAL*: Expandability -> other developers can also create a custom displays as well.



Now, What are the problems with the above approach - 

When we are writing like this

``currentConditionDisplay.update(temp, humidity, pressure);`` <br />
``statisticsDisplay.update(temp, humidity, pressure);``  <br />
``forecastDisplay.update(temp, humidity, pressure);``

i. We are coding to a concrete implementation. No Scope to add/remove new display at runtime. or in another words, No scope to add/remove new display without making changes to the code.

ii. We can encapsulate the update() method calling

