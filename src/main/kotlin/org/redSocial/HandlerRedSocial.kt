package org.redSocial

import java.time.LocalDate

//Obtener la información básica (nombre, usuario, etc).
//Calcular la edad.
//Determinar si el e-mail registrado es de gmail.
//Obtener los seguidores que a la vez son seguidos por ese usuario.

fun basicInformationUser(nameUser: String) = users.find { it.userName == nameUser }
fun getUserAge(user: User) = user.age()
fun isSingUpWithGmail(user: User) = user.isSingUpWithGmail()
fun getFollowersUser(user: User) = user.getFollowersThatFollowing()

val users: MutableSet<User> = mutableSetOf()
fun addUser(user: User) { users.add(user) }

fun main() {
    var user1 = User("Pablo Troche", "ptroche", "pt@gmail.com",  LocalDate.of(1990, 8,23) )
    var user2 = User("Jessica Fajardo", "jfajardo", "jf@gmail.com",  LocalDate.of(1987, 10,3) )

    var user3 = User("Mauro Sanchez", "msanchez", "ms@gmail.com",  LocalDate.of(1990, 8,23) )
    var user4 = User("Mariano Fernandez", "mfernandez", "mf@gmail.com",  LocalDate.of(1987, 10,3) )

    addUser(user1)
    addUser(user2)
    addUser(user3)
    addUser(user4)

    //yo sigo a jessi
    user1.addFollowTo(user2)
    user1.addFollowTo(user4)

    user1.addFollowerTo(user2)    //jessi me sigue a mi
    user1.addFollowerTo(user3)    //mauro me sigue a mi
    user1.addFollowerTo(user4)    // mariano me sigue a mi

    println(getFollowersUser(user1)) // jessica unico resultado

}