package sample;
import javafx.beans.property.SimpleStringProperty;

public class Heal
{
    private SimpleStringProperty name;
    private SimpleStringProperty vid;
    private SimpleStringProperty simp;
    private SimpleStringProperty instr;
    private SimpleStringProperty nalich;

    public Heal(){}
    public Heal(String name, String vid, String simp, String instr, String nalich)
    {
        this.name = new SimpleStringProperty(name);
        this.vid = new SimpleStringProperty(vid);
        this.simp = new SimpleStringProperty(simp);
        this.instr = new SimpleStringProperty(instr);
        this.nalich = new SimpleStringProperty(nalich);
    }
    public String getName()
    {
        return name.get();
    }

    public void setName(String name)
    {
        this.name = new SimpleStringProperty(name);
    }
    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getVid()
    {
        return vid.get();
    }

    public void setVid(String vid)
    {
        this.vid = new SimpleStringProperty(vid);
    }
    public SimpleStringProperty vidProperty() {
        return vid;
    }

    public String getSimp()
    {
        return simp.get();
    }

    public void setSimp(String simp)
    {
        this.simp = new SimpleStringProperty(simp);
    }
    public SimpleStringProperty simpProperty() {
        return simp;
    }

    public String getInstr()
    {
        return instr.get();
    }

    public void setInstr(String instr)
    {
        this.instr = new SimpleStringProperty(instr);
    }
    public SimpleStringProperty instrProperty() {
        return instr;
    }

    public String getNalich()
    {
        return nalich.get();
    }

    public void setNalich(String nalich)
    {
        this.nalich = new SimpleStringProperty(nalich);
    }
    public SimpleStringProperty nalichProperty() {
        return nalich;
    }


    @Override
    public String toString()
    {
        return "Heal: " + name + "\t" + vid + "\t" + simp + "\t" + instr + "\t" + nalich;
    }
}



