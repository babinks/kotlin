interface Animal {
    fun parler()

    fun quiSuisJe()
}


class Animalerie {
    var list = mutableListOf<autre.Animal>()

    fun nouvelAnimal(animal: autre.Animal){
        list.add(animal)
    }


}


class Chat:Animal {
    override fun parler() { println("Meow")
    }

    override fun quiSuisJe() { println("Hola soy le H, le chat")
    }
}

class Chien: autre.Animal {
    override fun parler() { println("wouaf wouaf")
    }

    override fun quiSuisJe() { println("yo soy un simple chien")
    }

}

class Perroquet: autre.Animal {
    override fun parler() { println("wesh bien!")
    }

    override fun quiSuisJe() { println("yo soy un perroquet")
    }
}

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
