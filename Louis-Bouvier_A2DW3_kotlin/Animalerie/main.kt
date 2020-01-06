package autre

fun main() {
    val animalerie = Animalerie()

    animalerie.nouvelAnimal(Chat())
    animalerie.nouvelAnimal(Chien())
    animalerie.nouvelAnimal(Perroquet())

    for (animal in animalerie.list){
        animal.quiSuisJe()
        animal.parler()
    }
}


import autre.Animalerie
import autre.Chat
import autre.Chien
import autre.Perroquet