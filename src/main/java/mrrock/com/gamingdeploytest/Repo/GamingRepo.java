package mrrock.com.gamingdeploytest.Repo;


import mrrock.com.gamingdeploytest.Model.GamingPc;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GamingRepo {

    private List<GamingPc> gamingPcList;

    public GamingRepo() {
        this.gamingPcList = new ArrayList<GamingPc>();
        this.gamingPcList.add(new GamingPc("Lenovo",333,"RTX 4070"));
        this.gamingPcList.add(new GamingPc("OsteComputer",555,"RTX 4060"));
        this.gamingPcList.add(new GamingPc("Lort",33334,"RTX 2050"));
        this.gamingPcList.add(new GamingPc("Lefdfnovo",3343433,"RTX 44234070"));
    }

    public List<GamingPc> getGamingPcList() {
        return gamingPcList;
    }

    public void setGamingPcList(List<GamingPc> gamingPcList) {
        this.gamingPcList = gamingPcList;
    }
}
