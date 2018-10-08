[<img src="https://img.shields.io/travis/playframework/play-java-starter-example.svg"/>](https://travis-ci.org/playframework/play-java-starter-example)

# KenpoTech-The Stephens School of Self Defense Business Portal

This application/program is designed to assist the Martial Arts School owner in the day to day running of their business.
It is intended to allow an owner to control his student assignments among instructors, list all students, give them the ability to
adjust and change student information, and add a new student that signs up.  I intend to augment it further with the following:
1. Billing Inquiries and systems-the ability to set up autopay and bankdraft systems through a third party billing service/API.
2. Scheduling- the ability to set and alter private lesson and group training schedules from student to student, as well as to send
email reminders to the students/instructors involved.
3. A technical database/quick reference system- allowing instructors to look up the next few techniques they are to teach in their
next lesson.


## Running

Run this using [sbt](http://www.scala-sbt.org/).  If you downloaded this project from http://www.playframework.com/download then you'll find a prepackaged version of sbt in the project directory:

```
sbt run
```

And then go to http://localhost:9000 to see the running web application.

## Controllers

There are several demonstration files available in this template.

- HomeController.java:

  Shows how to handle simple HTTP requests.

- AsyncController.java:

  Shows how to do asynchronous programming when handling a request.

- CountController.java:

  Shows how to inject a component into a controller and use the component when
  handling requests.

## Components

- Module.java:

  Shows how to use Guice to bind all the components needed by your application.

- Counter.java:

  An example of a component that contains state, in this case a simple counter.

- ApplicationTimer.java:

  An example of a component that starts when the application starts and stops
  when the application stops.

## Filters

- ExampleFilter.java

  A simple filter that adds a header to every response.