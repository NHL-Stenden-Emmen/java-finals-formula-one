# Formule 1

## Globale omschrijving

Dit programma registreert de resultaten van de races van een Formule 1 seizoen.
Een seizoen heeft een variabel aantal races. Races worden gereden op een circuit: straat of baan.
Er doet een variabel aantal teams mee. Elk team heeft twee autos met daarbij behorende coureurs.

In het programma worden **alle** raceresultaten geregistreerd. De coureur die de snelste ronde rijdt krijgt een extra punt
als hij/zij bij de eerste tien eindigt.

Een race bestaat uit een aantal rondjes. Per ronde wordt per rijder de tijd geregistreerd. Ook wordt er 
geregistreerd of er per ronde een pitstop wordt gedaan.

De banden

* medium
* soft
* hard
* wet
* intermediate 

van de auto worden ook geregistreerd.

Ook wordt er het constructeurskampioenschap geregistreerd: de punten van beide coureurs worden opgeteld.

# Puntentoekenning

* Plek 1: 25
* Plek 2: 18
* Plek 3: 15
* Plek 4: 12
* Plek 5: 10
* Plek 6: 8
* Plek 7: 6
* Plek 8: 4
* Plek 9: 2
* Plek 10: 1

Bonuspunt snelste ronde.

# Berekeningen / Output

* Per seizoen en race
* Punten totaal per rijder. (int)
* Punten totaal per team. (int)
* Top 3 op dit moment. (string)
* Puntenoverzicht (gesorteerd) voor rijder / team (string)

# Testdata

Wat gebeurt er als de 11e auto crasht.