package org.redSocial

import java.time.LocalDate

class User(val fullName: String,
           val userName: String,
           private val email: String,
           private val bornDate:  LocalDate,
           private var followers: MutableSet<User> = mutableSetOf(),
           private var following: MutableSet<User> = mutableSetOf())
{
    fun addFollowerTo(user: User) { followers.add(user) }
    fun removeFollowerTo(user: User) { followers.remove(user) }
    fun addFollowTo(user: User) { following.add(user) }
    fun removeFollowTo(user: User) { following.remove(user) }
    fun age(): Int {
        val date = LocalDate.now()
        var age = date.year - bornDate.year
        if (date.dayOfMonth > bornDate.dayOfMonth && date.monthValue == bornDate.dayOfMonth) else age--
        return age
    }
    fun isSingUpWithGmail() = email.split('@').contains("gmail.com")
    fun getFollowersThatFollowing() = following.intersect(following)
}