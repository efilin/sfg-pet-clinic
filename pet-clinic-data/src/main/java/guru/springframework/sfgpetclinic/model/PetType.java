package guru.springframework.sfgpetclinic.model;

/**
 * Created by efilin on 31.12.2020.
 */
public class  PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
