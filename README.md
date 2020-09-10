
## Hot-reloading on Twirl file changes not working when PlayLayoutPlugin is Disabled

Example project to demonstrate a possible regression of this issue:
https://github.com/playframework/playframework/issues/4715

`build.sbt` defines two Play! projects `core` and `app` (`app` depends on `core`).
Both are using the default `sbt` layout structure.

### How to reproduce

Start the project in development mode:
```
sbt app/run 
```

Load the start page @ `http://127.0.0.1:9000/`.

Now make a change to the Twirl template file
`src/main/twirl/views/core.scala.html`.

The correct behaviour would be a recompile and restart of the application.
However neither recompile nor restart are performed.

Note that changing `src/main/scala/models/Constants.scala` triggers a
recompile and restart as expected.
