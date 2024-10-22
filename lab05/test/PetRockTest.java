import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PetRockTest {
  PetRock rock1;
  PetRock rock2;

  @BeforeEach
  void setUp() {
    rock1 = new PetRock("Rocky", 1.234);
    rock2 = new PetRock("Rocky", 1.234);
  }
  @Test
  void testEquals_SameAttributes_ShouldBeEqual() {
    assertEquals(rock1, rock2);
  }

  @Test
  void testNotEqual_DifferentName() {
    rock2 = new PetRock("Boulder", 1.234);
    assertNotEquals(rock1, rock2);
  }

  @Test
  void testHashCode_EqualObjects_ShouldHaveSameHashCode() {
    assertEquals(rock1.hashCode(), rock2.hashCode());
  }

  @Test
  public void testHashCode_UnequalObjects_ShouldHaveDifferentHashCode() {
    PetRock rock1 = new PetRock("Rocky", 1.234);
    PetRock rock2 = new PetRock("Boulder", 1.234);
    assertNotEquals(rock1.hashCode(), rock2.hashCode());
  }
}