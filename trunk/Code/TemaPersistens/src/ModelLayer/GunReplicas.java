/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLayer;

/**
 *
 * @author Kristian Byrialsen
 */
public class GunReplicas {

private String fabric;
private String calibre;

    public GunReplicas(String fabric, String calibre)
    {
        this.fabric = fabric;
        this.calibre = calibre;
    }

    public String getCalibre()
    {
        return calibre;
    }

    public void setCalibre(String calibre)
    {
        this.calibre = calibre;
    }

    public String getFabric()
    {
        return fabric;
    }

    public void setFabric(String fabric)
    {
        this.fabric = fabric;
    }



}
