# Aufgabe zu Woche 2

Willkommen bei Programmieren 2 und bei github classroom! Das hier ist die erste Aufgabe zum Aufwärmen.

Lesen Sie sich, am besten nachdem Sie die drei Einführungsvideos:
 * zu [IDEA allgemein](https://mediathek.htw-berlin.de/video/Programmieren-2-IDEA-und-gradle/e473c99c6c4ace5ca0211ea9c6ddbdff)
 * zu [JavaDoc, Tests und Debugging](https://mediathek.htw-berlin.de/video/Programmieren-2-JavaDoc-Tests-Debugging/b8517e720b92ee8f4fd0253da4003b60) und
 * zum [Arbeiten mit github classroom und zu github actions](https://mediathek.htw-berlin.de/video/Programmieren-2-Github-und-github-classroom/036e3b2487ed69492f4f31320e79fa3a)

angesehen haben, die JavaDoc zum Test für ```calculateBabylonianRoot``` durch und implementieren Sie ```calculateBabylonianRoot``` entsprechend. 
Die Grundstruktur können Sie den Einführungsvideos entnehmen, aber es sind ein paar neue Bedingungen hinzugekommen, die überprüft werden.

Es ist in dem Projekt in build.gradle bereits eine Laufkonfiguration definiert, mit der Sie direkt über gradle das Projekt starten können. Relevant ist dafür die Zeile ```id 'application'```) im plugins-Bereich sowie dies Zeile:

```
mainClassName = 'org.htw.prog2.aufgabe0.MyProject'
```

Um den gradle-Task zum Ausführen zu starten, wählen Sie auf der rechten Seite "Gradle" aus, dann Rechtsklick auf Tasks->application->run und die erste Option ("Run as") auswählen. Unten sehen Sie dann den output (rot eingerahmte Bereiche in der Abbildung):

![gradle-run](Bilder/beispielcode.png)

Beachten Sie bitte: Falls es einen Fehler gibt, sehen Sie diesen nicht direkt im gradle-output, da standardmäßig die gradle-Details (und nicht die Informationen der Programmausführung) ausgewählt sind. Um die Exception aus Ihrem Code zu sehen, klicken Sie unten links auf den blau umrandeten Bereich statt auf den standardmäßig ausgewählten rot umrandeten Bereich:

![gradle-errors](Bilder/gradleerror.png)


Viel Erfolg!
