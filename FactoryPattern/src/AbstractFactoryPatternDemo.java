
public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
		// get an object of shape rectangle
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		
		// call draw method of rectangle
		shape1.draw();
		
		// get an object of shape square
		Shape shape2 = shapeFactory.getShape("SQUARE");
		
		// call draw method of square
		shape2.draw();
		
		// get rounded shape factory
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		// get an object of rounded rectangle
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		
		// call draw method of rounded rectangle
		shape3.draw();
		
		// get an object of rounded square
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		
		// call draw method of rounded square
		shape4.draw();
	}
}
