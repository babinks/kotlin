fun main() {
    print("choisis un nombre: ")

    var reponse = ""

    val nombre = readLine()!!

    println("le bon nombre est $nombre")


    while (reponse != nombre) {

        print("trouve le nombre : ")

        reponse = readLine()!!

        when {
            (nombre.equals(reponse)) -> System.out.println("Bravo");

            else -> println("raté  $reponse  tu t'es trompé");
        }

        if (reponse > nombre) {

            println("moins")
        }
        else if (reponse < nombre) {

            println("c'est plus")
        }
        else {

            println("bravo")
        }

    }

}