Projekt je napravljen u java verziji 8, te je ta verzija potrebna za rad.

Testni zadatak:

Znamo da je nastava organizirana u nastavne sate između kojih su odmori. Školski sati traju po 45 minuta, 
a prvi počinje u 8:00 sati. Svi odmori traju po N minuta, osim jednog 'velikog' koji traje M minuta. 
Veliki odmor dolazi iza sata s rednim brojem K.

Nastava traje 10 nastavnih sati i iza zadnjeg nastavnog sata nema odmora. 
Neka su zadane vrijednosti N, M, i K te jedan trenutak tijekom nastave opisan satom (A) i minutom (B) u kojem se dogodio. 
Napiši program koji određuje kojem periodu nastavnog dana pripada zadani trenutak.

 

Ulazni podaci

U prvom je retku prirodan broj N (1 <= N <= 30), trajanje običnog odmora u minutama.

U drugom je retku prirodan broj M (1 <= M <= 30, N <= M), trajanje velikog odmor u minutama.

U trećem je retku prirodan broj K (1 <= K <= 9), redni broj sata iza kojeg dolazi veliki odmor.

U četvrtom je retku prirodan broj A (8 <= A <= 20), sat iz teksta zadatka.

U petom je retku prirodan broj B (0 <= B <= 59), minuta iz teksta zadatke.


Izlazni podaci

Ako u zadanom trenutku traje nastavni sati, ispiši 'x. sat' (bez navodnika) gdje x zamijeni rednim brojem nastavnog sata koji traje. 
Inače ispiši 'x. odmor' (bez navodnika) gdje x zamijeni rednim brijem odmora koji traje.


U projektu je .jar file. Može ga se pokrenuti iz komandne linije uz poziv 'java -jar Zadatak.jar [parametriS]'