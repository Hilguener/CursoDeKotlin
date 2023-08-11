class Pessoa(protected var name: String, protected var sexo: String, protected var age: Int) {


    fun getNome(): String {
        return name
    }

   fun getSexo(){
       println(sexo)
       return
    }

    fun getIdade(): Int{
        return age
    }

    fun setNome(newName: String){
        name = newName
        println(newName)
    }

    fun podeDirigir(){
        if (age >= 18) println("Pode dirigir") else println("Não pode dirigir")
    }

}