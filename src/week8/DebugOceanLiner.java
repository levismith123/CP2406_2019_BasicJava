package week8;
public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("Ocean Liner");
      setPassengers();
      setPower();
   }

   @Override
   public void setPower() {
      super.power = "engines";
   }

   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "four engines";
   }
}
