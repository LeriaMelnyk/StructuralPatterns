import composite.ListVampires;
import composite.LordVampire;
import composite.Vampire;
import adapter.AdapterForWizard;
import adapter.Communication;
import adapter.VampireCommunication;
import adapter.WizardCommunication;
import bridge.*;
import decorator.BasicSpeed;
import decorator.ShadowMode;
import facade.ClanFacade;
import flyweight.VampireFactory;
import flyweight.VampireType;
import proxy.ProxyVampireCommander;
import proxy.RealVampireCommander;
import proxy.VampireCommander;

public class Main {
    public static void main(String[] args) {

        Communication vampire = new VampireCommunication();
        Communication wizard = new AdapterForWizard(new WizardCommunication());

        vampire.sendMessage("Атака опівночі!");
        wizard.sendMessage("Захист фортеці!");

        VampireAbility speed = new Speed(new BloodMagic());
        VampireAbility blood = new Blood(new DarkEnergy());

        speed.useAbility();
        blood.useAbility();

        Vampire lord = new LordVampire("Дракула");
        Vampire lord2 = new LordVampire("Владіс");

        ListVampires clan = new ListVampires();
        clan.addVampire(lord);
        clan.addVampire(lord2);

        clan.showName();

        decorator.VampireAbility speed1 = new BasicSpeed();
        decorator.VampireAbility shadowSpeed = new ShadowMode(speed1);

        shadowSpeed.useAbility();

        ClanFacade clanFacade = new ClanFacade();
        clanFacade.manageClan();

        VampireType minion1 = VampireFactory.getVampireType("Слуга");
        VampireType minion2 = VampireFactory.getVampireType("Слуга");
        minion1.showType();
        minion2.showType();
        System.out.println("Перевірка пам'яті: однакові об'єкти -> " + (minion1 == minion2));


        RealVampireCommander realCommander = new RealVampireCommander();
        VampireCommander proxyCommander = new ProxyVampireCommander(realCommander);
        proxyCommander.giveOrder("Знайти нову жертву");

    }
}
