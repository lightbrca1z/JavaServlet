package equalsMethod;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class bank2 {
    String name;
    String address;

    public bank2(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }
}