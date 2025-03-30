/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Caius Marsh-Wetere
 * GitHub Repo:    https://github.com/waimea-cmmarshwetere/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

const val NUMBOXES = 20
const val EMPTY = " "

fun main() {
    println()
    println("OLD GOLD!")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println(" Welcome to Old Gold this is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println()

    val coins = setupBoxes()

    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Gold Coin")






    println("Enter Player 1 Name: ")
    val player1 = readln()
    println("Welcome Player 1: $player1")

    println("")

    println("Enter Player 2 Name: ")
    val player2 = readln()
    println("Welcome Player 2: $player2")

    println("")

    println("Player 1: $player1")
    println("Player 2: $player2")

    println("")
    println("Welcome $player1 and $player2 to Old Gold!")
    println("")

    val boxes = setupBoxes()

    showCoinBoxes(boxes)
    println()





}
fun setupBoxes(): MutableList<String> {
    val boxList = mutableListOf<String>()
    for (i in 1..NUMBOXES - 6) boxList.add(EMPTY)
    return boxList

}

fun placeCoinsInBoxes(boxList: MutableList<String>, boxNum: Int, name: String) {
    println("+++ Putting $name into cage $boxNum")
    boxList[boxNum - 1] = name

}

fun showCoinBoxes(boxList: List<String>) {
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+")
    for (i in 0..boxList.size -1) {
        print("|  ${i + 1} ".padEnd(9))
    }
    println("|")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+")
    for (i in 0..boxList.size -1) {
        print("| ${boxList[i]} ".padEnd(9))
    }
    println("|")
    println("+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+--------+")

}




