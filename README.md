# DRMS Prototyp
Der DRMS Prototyp ist ein Prototyp einer Verarbeitung von ODRL Lizenzen für ein Digitales Rechte Management für TOSCA.
Der Prototyp ist Teil der Bachelorarbeit "Digital Rights Management für TOSCA" an der Universität Stuttgart (Institut IAAS). 

Der gesamte Protoyp besteht aus drei einzelnen Services:

1. DRM Contentprovider (zur Erstellung von ODRL Lizenzen) (**aktuelles Repository**)
2. OpenTOSCA Upload Mock (Mock zum Hochladen der Lizenzen)
3. DRM Controller (zur Verarbeitung der im OpenTOSCA Upload Mock hochgeladenen Lizenzen)

#####Für eine vollständige Funktion des Systems müssen alle drei genannten Services gleichzeitig ausgeführt sein! ####

### Nutzungshinweis
Für einen vollständigen Ablauf des Systems muss eine Lizenz im DRM Contentprovider erstellt und heruntergeladen werden. 
Diese Lizenz und seine entsprechende CSAR Datei muss dann über den OpenTOSCA Upload Mock hochgeladen werden. 
Der OpenTOSCA Upload Mock sendet beim Hochladen die Lizenz an den DRM Controller zur Verarbeitung und Auslesen der Rechte, welcher die ausgelesenen Lizenzen an den OpenTOSCA Upload Mock als JSON zurücksendet. 
Der OpenTOSCA Upload Mock zeigt dieses JSON zur Kontrolle des richtigen Mapping der Lizenz auf der Uploadseite an.

## DRM Contentprovider
Der DRM Contentprovider ermöglicht die Erstellung einer ODRL Lizenz mit Hilfe einer Weboberfläche.
Es wird eine ODRL Version 1.1 konforme XML-Datei erstellt. Der DRM Contentprovider basiert auf Spring MVC und wird auf einem integrierten Tomcat Server ausgeführt.

Zum Aufsetzen und Benutzen des DRM Contentprovider werden die folgenden Schritte benötigt:

1. Checkout des Repository.
2. `gradle bootRun` ausführen (wenn Gradle nicht im PATH oder nicht installiert ist, Nutzung des gradle-wrapper `./gradlew bootRun`)
3. [Startseite](http://localhost:9090/ "Startseite des DRM Contentprovider") (http://localhost:9090/) aufrufen
4. Default BasicAuth Nutzername: `admin` Passwort: `admin`
5. Eingabe der gewünschten Rechtedefinitionen (CSAR UID entspricht im Prototyp dem Namen der CSAR Datei)

Weitere Informationen zu den Prototypen und der Architektur finden sich in der schriftlichen Ausarbeitung der Bachelorarbeit "Digital Rights Management für TOSCA" an der Universität Stuttgart.

## License

Copyright (c) 2017 University of Stuttgart.

All rights reserved. This program and the accompanying materials
are made available under the terms of the [Eclipse Public License v2.0]
and the [Apache License v2.0] which both accompany this distribution,
and are available at http://www.eclipse.org/legal/epl-v20.html
and http://www.apache.org/licenses/LICENSE-2.0

[Apache License v2.0]: http://www.apache.org/licenses/LICENSE-2.0.html
[Eclipse Public License v2.0]: http://www.eclipse.org/legal/epl-v20.html
