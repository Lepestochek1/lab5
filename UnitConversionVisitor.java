public class UnitConversionVisitor implements ProjectVisitor {

    @Override
    public void visitDependentTask(DependentTask p) {
        // Завдання не мають довжини/маси
    }

    @Override
    public void visitDeliverable(Deliverable d) {
        double meters = d.getLengthM();
        double feet = meters * 3.28084;

        double kg = d.getWeightKg();
        double pounds = kg * 2.20462;

        System.out.println("Deliverable: " + d.getName());
        System.out.println("  Довжина: " + meters + " м = " + String.format("%.2f", feet) + " футів");
        System.out.println("  Маса: " + kg + " кг = " + String.format("%.2f", pounds) + " фунтів");
        System.out.println();
    }

    @Override
    public void visitTask(Task p) {
        // Немає довжини/маси
    }

    @Override
    public void visitProject(Project p) {
        // Немає довжини/маси
    }
}
