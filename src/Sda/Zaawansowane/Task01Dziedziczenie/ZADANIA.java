package Sda.Zaawansowane.Task01Dziedziczenie;

public class ZADANIA {

    /*1. Stwórz klasę Toy (zabawka). W klasie mamy pola price, minAge (od jakiego wieku nadaje się zabawka). Dodaj konstruktor, gettery.
2. Utwórz klasę TeddyBear (miś), która rozszerza klasę Toy. Klasa posiada dodatkowo pole name (imię). Dodaj getter dla pola. Utwórz obiekt klasy TeddyBear, następnie wypisz w konsoli wartości jego pól z wykorzystaniem getterów (również tych odziedziczonych). Przypisz następnie tego misia do zmiennej typu Toy. Spróbuj wywołać te same gettery - przeanalizuj, które możemy wywołać, a których nie (i dlaczego tak jest).
3. Stworzyć klasę Vehicle, która będzie miała pola speed (aktualna prędkość) oraz maxSpeed (prędkość maksymalna) typu int, konstruktor ustawiający wartość tych pól oraz gettery.
4. Stworzyć klasę Car oraz klasę Bicycle, które będą rozszerzały klasę Vehicle. Do obydwu klas należy dodać pole, które będzie unikatowe dla danej klasy (np. rozmiar kół/liczba przerzutek, pojemność silnika/liczba drzwi/coś innego opisującego dany pojazd). Dodaj konstruktory ustawiające wartości nowych pól oraz ustawiające wartość pól speed oraz maxSpeed korzystając z konstruktora klasy Vehicle (przy użyciu słówka super).
5. W klasie Vehicle nadpisz metodę toString odziedziczoną z klasy Object w taki sposób, aby jej wynik opisywał wartości wszystkich pól.
6. Nadpisz metodę toString także w klasach Bicycle oraz Car w taki sposób, aby zwracały to, co zwracane jest dla pojazdów, z dodatkową informacją o wartościach pól zdefiniowanych w tych klasach.
7. Dodaj do klasy Vehicle pole typu int o nazwie wheelCount. Spraw, aby tworząc rower z marszu było ustawiane 2, a tworząc samochód było to pole inicjalizowane wartością 4. Uwzględnij informację o liczbie kół w metodzie toString().
8. Stwórz klasy reprezentujące kręgowce i bezkręgowce, następnie klasy reprezentujące ssaki, gady, płazy i ptaki. Dodaj po klasie, która będzie dziedziczyła po każdej z tych klas. Utwórz nowe klasy, niezależne od tych tworzonych w ramach zajęć. Ciała klas mają być puste (brak pól, konstruktorów, metod). Nie musisz tworzyć obiektów tych typów.
9. Stwórz typ Person, reprezentujący osobę. Niech klasa posiada pola firstName, lastName. Stwórz klasę Student - uczeń jest osobą, która ma dodatkowo pole grades - tablica ocen. Stwórz typ Teacher - nauczyciel jest osobą, która ma dodatkowo pole subject.
10. Stwórz typ School. Szkoła ma pola: nauczyciele (tablica) i uczniowie (tablica). Szkoła oferuje metodę getStudentsAndTeachers, która zwraca tablicę zarówno nauczycieli, jak i uczniów.
11. Wybierz z serwisu allegro kategorię Biżuteria i Zegarki (https://allegro.pl/kategoria/bizuteria-i-zegarki). Podejrzyj pola, które mogą taką klasę opisywać (przejrzyj filtry: cena, stan itp.). Następnie podejrzyj podkategorię: Biżuteria damska. Przejrzyj filtry - pojawiły się rodzaj, materiał. Następnie Bransoletki - przejrzyj filtry (pojawiło się między innymi kamień, kolor dominujący) oraz kolczyki (rodzaj bigla, motyw). Stwórz klasy, które reprezentują te typy (Jewellery, WomanJewellery, Bracelet, Earrings).
12. Nadpisz w typach z zadania 11 metodę toString tak, aby w każdym były uwzględnione wszystkie właściwości.
13. Stwórz metodę, która przyjmuje jako parametr tablicę biżuterii, a która w wyniku zwraca łączną cenę elementów - niech to będzie metoda statyczna w klasie Jewellery.
14. Stwórz metodę, która przyjmuje parametr - tablicę biżuterii. Metoda zwróci stan biżuterii, który występuje najczęściej.

     */
}
