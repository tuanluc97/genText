package tuanluc.worker

import groovy.transform.CompileStatic

/**
 * @author tuanluc on 23/04/2020
 */
@CompileStatic
class GenText {

    final int numberLine = 6

    void generateText(String text, boolean isBorder) {
        StringBuilder result = new StringBuilder()
        int length = 8
        for (int i = 0; i < numberLine; i++) {
            if (isBorder)
                result.append('||  ')
            for (char ch : text.toCharArray()) {
                if (i == 0) {
                    length += checkChapter(ch).get(i).length()
                }
                result.append(checkChapter(ch).get(i))
            }
            if (isBorder)
                result.append('  ||')
            result.append("\n")
        }
        if (isBorder) {
            println(this.draw('=', length))
            println("|${this.draw(' ', length - 2)}|")
        }
        print(result)
        if (isBorder) {
            println("|${this.draw(' ', length - 2)}|")
            println(this.draw('=', length))
        }
    }

    List<String> checkChapter(Character character) {
        switch (character) {
            case 'a':
                this.chapA()
                break;
            case 'b':
                this.chapB()
                break;
            case 'c':
                this.chapC()
                break;
            case 'd':
                this.chapD()
                break;
            case 'e':
                this.chapE()
                break;
            case 'f':
                this.chapF()
                break;
            case 'g':
                this.chapG()
                break;
            case 'h':
                this.chapH()
                break;
            case 'i':
                this.chapI()
                break;
            case 'k':
                this.chapK()
                break;
            case 'l':
                this.chapL()
                break;
            case 'm':
                this.chapM()
                break
            case 'n':
                this.chapN()
                break
            case 'o':
                this.chapO()
                break
            case 'p':
                this.chapP()
                break
            case 'q':
                this.chapQ()
                break
            case 's':
                this.chapS()
                break
            case 'w':
                this.chapW()
                break
            case 'r':
                this.chapR()
                break
            case 'y':
                this.chapY()
                break
            case 'z':
                this.chapZ()
                break
            case 't':
                this.chapT()
                break
            case 'u':
                this.chapU()
                break
            case 'v':
                this.chapV()
                break
            case 'x':
                this.chapX()
                break
            case 'J':
                this.chapJ()
                break
            case '?':
                this.chapHoiCHam()
                break;
            case ':':
                this.chapHaiCHam()
                break;
            case '!':
                this.chapChamThan()
                break;
            case ' ':
                this.chapSpace()
                break;
            default:
                this.chapSpace()
        }

    }

    private StringBuilder draw(String c, int length) {
        StringBuilder a = new StringBuilder()
        for (int i = 0; i < length; i++) {
            a.append(c)
        }
        return a
    }

    private List<String> chapA() {
        return [
                "      AA       ",
                "     AA AA     ",
                "    AA   AA    ",
                "   AA AAA AA   ",
                "  AA       AA  ",
                " AA         AA ",
        ]
    }

    private List<String> chapB() {
        return [
                " BB BB     ",
                " BB    BB  ",
                " BB BB     ",
                " BB   BB   ",
                " BB     BB ",
                " BB B BB   ",
        ]
    }

    private List<String> chapC() {
        return [
                "    CC C CC ",
                "  CC        ",
                " CC         ",
                " CC         ",
                "  CC        ",
                "     CC CCC ",
        ]
    }

    private List<String> chapD() {
        return [
                " DD DD D    ",
                " DD     DD  ",
                " DD      DD ",
                " DD      DD ",
                " DD     DD  ",
                " DD DD D    ",
        ]
    }

    private List<String> chapE() {
        return [
                " EE EE EE E ",
                " EE         ",
                " EE EE EE   ",
                " EE         ",
                " EE         ",
                " EE EE EE E ",
        ]
    }

    private List<String> chapF() {
        return [
                " FFFFFFFF F ",
                " FF         ",
                " FF         ",
                " FFFFFFFF   ",
                " FF         ",
                " FF         ",
        ]
    }

    private List<String> chapG() {
        return [
                "     GF GG     ",
                "  GG     GG    ",
                " GG            ",
                " GG   GG GG GG ",
                "  GG     GG    ",
                "    G GG G     ",
        ]
    }

    private List<String> chapH() {
        return [
                " HH      HH ",
                " HH      HH ",
                " HH HH H HH ",
                " HH      HH ",
                " HH      HH ",
                " HH      HH ",
        ]
    }

    private List<String> chapI() {
        return [
                " I II I ",
                "   II   ",
                "   II   ",
                "   II   ",
                "   II   ",
                " I II I ",
        ]
    }

    private List<String> chapJ() {
        return [
                "     JJJ  ",
                "      JJ  ",
                "      JJ  ",
                "      JJ  ",
                " JJ   JJ  ",
                "  JJ JJ   ",
        ]
    }

    private List<String> chapK() {
        return [
                " KK   KK  ",
                " KK  K    ",
                " KKK      ",
                " KK K     ",
                " KK  KK   ",
                " KK    KK ",
        ]
    }

    private List<String> chapL() {
        return [
                " LL       ",
                " LL       ",
                " LL       ",
                " LL       ",
                " LL       ",
                " LLLLLLLL ",
        ]
    }

    private List<String> chapM() {
        return [
                " MM        MM ",
                " MM M    M MM ",
                " MM  MM M  MM ",
                " MM   MM   MM ",
                " MM        MM ",
                " MM        MM ",
        ]
    }

    private List<String> chapN() {
        return [
                " NNN      NN ",
                " NN NN    NN ",
                " NN  NN   NN ",
                " NN   NN  NN ",
                " NN    NN NN ",
                " NN      NNN ",
        ]
    }

    private List<String> chapO() {
        return [
                "    OO OO    ",
                "  OO     OO  ",
                " OO       OO ",
                " OO       OO ",
                "  OO     OO  ",
                "    OO OO    ",
        ]
    }

    private List<String> chapP() {
        return [
                " PP PP P   ",
                " PP     PP ",
                " PP    PP  ",
                " PP PPP    ",
                " PP        ",
                " PP        ",
        ]
    }

    private List<String> chapQ() {
        return [
                "    QQ QQ     ",
                "  QQ     QQ   ",
                " QQ       QQ  ",
                " QQ   QQ  QQ  ",
                "  QQ     QQ   ",
                "    QQ QQ  QQ ",
        ]
    }

    private List<String> chapR() {
        return [
                " RR RR R    ",
                " RR     RR  ",
                " RR    RR   ",
                " RR RRR     ",
                " RR    RR   ",
                " RR      RR ",
        ]
    }

    private List<String> chapS() {
        return [
                "  SS S SS  ",
                " SS        ",
                "   SSS     ",
                "       SS  ",
                "        SS ",
                " SS SS S   ",
        ]
    }

    private List<String> chapT() {
        return [
                " TTTTTTTTTTT ",
                "     TT      ",
                "     TT      ",
                "     TT      ",
                "     TT      ",
                "     TT      ",
        ]
    }

    private List<String> chapU() {
        return [
                " UU       UU ",
                " UU       UU ",
                " UU       UU ",
                "  U       U  ",
                "  UU     UU  ",
                "    UU UU    ",
        ]
    }

    private List<String> chapV() {
        return [
                " V           V ",
                "  V         V  ",
                "   V       V   ",
                "    V     V    ",
                "     V   V     ",
                "       V       ",
        ]
    }

    private List<String> chapW() {
        return [
                " WW              WW ",
                "  WW            WW  ",
                "   WW     W    WW   ",
                "    WW   WW   WW    ",
                "     WW W  W WW     ",
                "      WW    WW      ",
        ]
    }

    private List<String> chapX() {
        return [
                " XX       XX ",
                "  XX    XX   ",
                "    XX X     ",
                "     XX      ",
                "   XX  XX    ",
                " XX      XX  ",
        ]
    }

    private List<String> chapY() {
        return [
                " YY      YY ",
                "   YY  YY   ",
                "     YY     ",
                "     YY     ",
                "     YY     ",
                "     YY     ",
        ]
    }

    private List<String> chapZ() {
        return [
                " ZZ ZZ ZZ ZZ ",
                "       ZZ    ",
                "     ZZ      ",
                "    ZZ       ",
                "  ZZ         ",
                " ZZ ZZ ZZ Z  ",
        ]
    }

    private List<String> chapHoiCHam() {
        return [
                "     ?? ??   ",
                "   ??     ?? ",
                "        ??   ",
                "       ??    ",
                "             ",
                "       ??    ",
        ]
    }

    private List<String> chapChamThan() {
        return [
                "  !! ",
                "  !! ",
                "  !! ",
                "  !! ",
                "     ",
                "  !! ",
        ]
    }

    private List<String> chapHaiCHam() {
        return [
                "     ",
                "  :: ",
                "     ",
                "     ",
                "  :: ",
                "     ",
        ]
    }

    private List<String> chapSpace() {
        return [
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
        ]
    }
}
