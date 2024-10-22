import java.util.Objects;
/**
 * PetRock is a class based on an ancient fad.
 * <p></p>
 * The purpose is to practice equals and hashCode
 */
public class PetRock {
  private final String name;
  private boolean happiness;
  private final double mass;

  /**
   * Pet Rocks are created with a name and mass
   * <p></p>
   * @param name is a String
   * @param mass is a double
   * Both are final and cannot be changed
   * There is also a boolean field for happiness
   * Pet Rocks are born unhappy but become happy
   * once they have been petted.
   */
  public PetRock(String name, double mass) {
    this.name = name;
    this.happiness = false;
    this.mass = mass;
  }

  public String getName() {
    return name;
  }

  public boolean getHappiness() {
    return happiness;
  }

  public void petTheRock() {
    this.happiness = true;
  }

  public double getMass() {
    return mass;
  }

  /**
   * Checks if this PetRock is equal to another object.
   * Two PetRocks are considered equal if their name, happiness, and mass (within three decimal places) are equal.
   *
   * @param obj the object to compare with this PetRock
   * @return true if the given object is equal to this PetRock, false otherwise
   */
  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    PetRock petRock = (PetRock) obj;
    return petRock.hashCode() == this.hashCode();
  }

  /**
   * Returns a hash code value for this PetRock.
   * The hash code is computed based on the name, happiness, and mass fields.
   *
   * @return a hash code value for this PetRock
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.happiness, Math.round(this.mass * 1000));
  }
}
