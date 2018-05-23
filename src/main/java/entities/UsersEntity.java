package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "sampleshop", catalog = "")
public class UsersEntity {
    private String username;
    private String password;
    private byte enabled;

    public UsersEntity(String username, String password, byte enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    @Id
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return enabled == that.enabled &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, enabled);
    }
}
