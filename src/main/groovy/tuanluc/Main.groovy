package tuanluc

import tuanluc.worker.GenText

/**
 * @author tuanluc on 23/04/2020
 */
class Main {
    static void main(String[] args) {
        while (true) {
            println "Enter words? "
            String name = System.in.newReader().readLine()
            GenText gen = new GenText()
            println "Co khung hay khong?(y/n) "
            boolean isBorder = System.in.newReader().readLine() == 'y'
            gen.generateText(name, isBorder)
        }
    }
}
