package cf.darkdrogan.apps.englTrainer.Execute;

import cf.darkdrogan.apps.englTrainer.Execute.AdditionalVerbs;
import cf.darkdrogan.apps.englTrainer.Variables;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by Drogan on 03.01.2016.
 */
public class TestAdditionalVerbs implements Variables {
    AdditionalVerbs addVerb;

    @Before
    public void action(){
        addVerb = new AdditionalVerbs();
    }

    @After
    public void despose(){
        addVerb = null;
    }

    @Test
    public void testGetHave(){
        String had = addVerb.getHave(PAST, HE, ASK, ACTIVE);
        String have = addVerb.getHave((byte)1, (byte)2,(byte)0, (byte)0);
        String has1 = addVerb.getHave((byte)1, (byte)3,(byte)0, (byte)0);
        String has2 = addVerb.getHave((byte)1, (byte)4,(byte)0, (byte)0);
        String has3 = addVerb.getHave((byte)1, (byte)5,(byte)0, (byte)0);
        assertEquals("had failed", "had", had);
        assertEquals("have failed", "have", have);
        assertEquals("has failed", "has", has1);
        assertEquals("has failed", "has", has2);
        assertEquals("has failed", "has", has3);
    }


    @Test
    public void testGetDo(){
        String aDo = addVerb.getDo((byte)1, (byte)0,(byte)0, (byte)0);
        String aDont = addVerb.getDo((byte)1, (byte)2,(byte)2, (byte)0);
        String aDoes = addVerb.getDo((byte)1, (byte)5,(byte)0, (byte)0);
        String aDoesnt = addVerb.getDo((byte)1, (byte)5,(byte)2, (byte)0);
        String aDid = addVerb.getDo((byte)0, (byte)5,(byte)0, (byte)0);
        String aDidnt = addVerb.getDo((byte)0, (byte)5,(byte)2, (byte)0);
        assertEquals("do failed", "Do", aDo);
        assertEquals("don't failed", "Don't", aDont);
        assertEquals("does failed", "Does", aDoes);
        assertEquals("doesn't failed", "Doesn't", aDoesnt);
        assertEquals("didn't failed", "Didn't", aDidnt);
        assertEquals("did failed", "Did", aDid);
    }

    @Test
    public void testGetBe(){
        String was = addVerb.getBe((byte)0, (byte)0,(byte)1, (byte)0);
        String wasnt = addVerb.getBe((byte)0, (byte)0,(byte)2, (byte)0);
        String were = addVerb.getBe((byte)0, (byte)2,(byte)1, (byte)0);
        String werent = addVerb.getBe((byte)0, (byte)2,(byte)2, (byte)0);
        String am = addVerb.getBe((byte)1, (byte)0,(byte)1, (byte)0);
        String amNot = addVerb.getBe((byte)1, (byte)0,(byte)2, (byte)0);
        String are = addVerb.getBe((byte)1, (byte)1,(byte)0, (byte)0);
        String arent = addVerb.getBe((byte)1, (byte)1,(byte)2, (byte)0);
        String is = addVerb.getBe((byte)1, (byte)3,(byte)0, (byte)0);
        String isnt = addVerb.getBe((byte)1, (byte)3,(byte)2, (byte)0);
        assertEquals("was failed", "was", was);
        assertEquals("wasn't failed", "wasn't", wasnt);
        assertEquals("were failed", "were", were);
        assertEquals("weren't failed", "weren't", werent);
        assertEquals("am failed", "am", am);
        assertEquals("am not failed", "am not", amNot);
        assertEquals("are failed", "are", are);
        assertEquals("aren't failed", "aren't", arent);
        assertEquals("is failed", "is", is);
        assertEquals("isn't failed", "isn't", isnt);
    }
}
