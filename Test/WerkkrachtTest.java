import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkkrachtTest {

//    @Test
//    void checkPerson();
//
//        String naam = "Faissal";
//        int code = 43233;
//        int bsn = 98763235;
//        Assertions.assertEquals(false , persoon.checknaamArray(naam)); // naam
    //  is niet opgeslagen dus false klopt
//        Assertions.assertEquals(false, persoon.checkCodeRegel(code)); // false want code bevat meer dan 4 cijfers
//        Assertions.assertEquals(false, persoon.checkbsn(bsn)); // false want bsn < 9
    //    Nog geen code in de methode
    //      TDD


    @Test
    void ModifiedDecisionCoverage() {
        Werkkracht person = new Werkkracht("Fais", 987877976, 1987);
        Werkkracht.personen.add(person);

        Assertions.assertEquals("Je staat in ons systeem", person.checknaamArray());
        Assertions.assertEquals("Je bsn klopt geweldig!", person.checkbsn());
        Assertions.assertEquals("Je code klopt", person.checkCodeRegel());
        //Condition coverage/Decision 1-1-1

        Werkkracht person2 = new Werkkracht("Chantal", 987654568, 98765);
        Assertions.assertEquals("Sorry je staat niet in ons systeem", person2.checknaamArray());
        Assertions.assertEquals("Je bsn klopt geweldig!", person2.checkbsn());
        Assertions.assertEquals("Je code klopt niet", person2.checkCodeRegel());
        // 0-1-0

        Werkkracht person3 = new Werkkracht("Mohammed", 87654, 9876);
        Werkkracht.personen.add(person3);

        Assertions.assertEquals("Je staat in ons systeem", person3.checknaamArray());
        Assertions.assertEquals("Sorry je bsn nummer klopt niet", person3.checkbsn());
        Assertions.assertEquals("Je code klopt", person3.checkCodeRegel());
        // 1-0-1

        Werkkracht person4 = new Werkkracht("Lisa", 9876654, 9872);
        Assertions.assertEquals("Sorry je staat niet in ons systeem", person4.checknaamArray());
        Assertions.assertEquals("Sorry je bsn nummer klopt niet", person4.checkbsn());
        Assertions.assertEquals("Je code klopt", person4.checkCodeRegel());
        // 0-0-1


    }

//    @Test
//    void EquavalentieklassenRandwaarden(){
//       // Werkkracht functie = new Werkkracht();
//        int code = 2098;
//        boolean receptiemedewerker = code > 2000;
//        Assertions.assertEquals(true, functie.checkReceptiemedewerker(receptiemedewerker));
//
//        Werkkracht functie3 = new Werkkracht();
//        int code3 = 1900;
//        boolean receptiemedewerker3 = code > 2000;
//        Assertions.assertEquals(false, functie.checkReceptiemedewerker(receptiemedewerker));
//        //foutmelding omdat code niet gemaakt is. Andere tests werken gewoon omdat true verwacht word in methode.
//
//        Werkkracht functie1 = new Werkkracht();
//        int code1 = 3098;
//        boolean doktersAssistent = code > 3000;
//        Assertions.assertEquals(true, functie.checkDoktersAssistend(doktersAssistent));
//
//        Werkkracht functie2 = new Werkkracht();
//        int code2 = 4098;
//        boolean dokter = code > 3000;
//        Assertions.assertEquals(true, functie.checkDokter(dokter));

    @Test
    void Equavalentie(){
        Werkkracht persoonA = new Werkkracht("Ismail", 765432456, 1160);
        Assertions.assertEquals(true, persoonA.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonA.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonA.checkDokter());

        Werkkracht persoonB = new Werkkracht("Jaap", 765432456, 1500);
        Assertions.assertEquals(true, persoonB.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonB.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonB.checkDokter());

        Werkkracht persoonC = new Werkkracht("Jaap", 765432456, 1900);
        Assertions.assertEquals(true, persoonC.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonC.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonC.checkDokter());

        Werkkracht persoonD = new Werkkracht("Jaap", 765432456, 2100);
        Assertions.assertEquals(false, persoonD.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonD.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonD.checkDokter());

        Werkkracht persoonE = new Werkkracht("Jaap", 765439456, 2500);
        Assertions.assertEquals(false, persoonE.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonE.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonE.checkDokter());

        Werkkracht persoonF = new Werkkracht("Jaap", 765434456, 2800);
        Assertions.assertEquals(false, persoonF.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonF.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonF.checkDokter());

        Werkkracht persoonG = new Werkkracht("Jaap", 765433456, 3100);
        Assertions.assertEquals(false, persoonG.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonG.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonG.checkDokter());

        Werkkracht persoonH = new Werkkracht("Jaap", 765431456, 3400);
        Assertions.assertEquals(false, persoonH.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonH.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonH.checkDokter());

        Werkkracht persoonI = new Werkkracht("Jaap", 765432456, 3800);
        Assertions.assertEquals(false, persoonI.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonI.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonI.checkDokter());
    }


}



