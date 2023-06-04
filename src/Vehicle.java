public abstract class Vehicle implements Transport{
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
            System.out.println("   Меняем покрышку");
    }

    public void separator() {
        System.out.println("------");
    }
 
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName + ":");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
