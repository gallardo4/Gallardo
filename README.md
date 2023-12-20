# Volkswagen Grand California
## Descripció del projecte
Aquest projecte serveix per, a partir d'una sèrie de preguntes, denominar el preu base i el preu actual de la furgoneta de l'usuari segons unes variants.
## Funcionalitats
El projecte disposa de tres cinc pàgines. Quatre d'elles contenen diferents funcions i l'última conté constants que serveixen per a afegir color als comentaris que es mostren a la consola.
### Main.kt - Primera pàgina
Aquesta pàgina és la que conté la funció principal, la que s'executa. Conté també cinc funcions més.
#### Funció menu()
Una simple funció que dona la benvinguda a l'usuari amb AsciiArt.
#### Funció pedirVersionFurgo()
Demana al client la versió de la seva furgoneta.
#### Funció pedirTienePortaBicis()
Demana al client si la seva furgoneta disposa de portabicis.
#### Funció depreciacionEstadoNeumaticos()
Segons l'estat dels pneumàtics, restarà o no el preu de la seva furgoneta.
#### Funció porcentajeKM()
Segons els km recorreguts amb la furgoneta, se li donarà un valor per km diferent a l'hora d'actualitzar el preu actual de la mateixa.
### FuncionsVW.kt - Segona pàgina
Aquesta pàgina conté dos funcions.
#### Funció calcularPreuBase()
Serveix per a calcular el preu base de la furgoneta de l'usuari segons el seu model.
#### Funció calcularPreuActual()
Serveix per a calcular el preu actual de la furgoneta de l'usuari segons els km recorreguts.
### FuncionsEntrada.kt - Tercera pàgina
Aquesta pàgina conté tres funcions de lectura.
#### Funció llegirInt()
Serveix per a llegir un nombre enter.
#### Funció llegirLong()
Serveix per a llegir un nombre llarg.
#### Funció llegirDouble()
Serveix per a llegir un nombre decimal.
### Utilities.kt - Quarta pàgina
Aquesta pàgina és semblant a l'anterior. Conté diferents funcions de lectura creades pel meu tutor, Raimon Izard.
### ConsoleColors.kt - Quinta pàgina
Aquesta pàgina conté constants que serveixen per a afegir color al text que mostra la consola.
