/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonometrylab;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TrigonometryLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         
    // Problem 1:  Trigonometric Function Calculator
     
        System.out.println("\n---  Trigonometric Function Calculator --- ");
        Scanner input = new Scanner(System.in);
        
        // Get the angle in degrees and convert it to radians for Java's
        // trigonometric functions.
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        double radians = Math.toRadians(angle);

        // Ask the user to choose a function
        System.out.println("Choose a trigonometric function:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. All three");
        System.out.print("Enter your choice (1-4): ");
        
         int choice = input.nextInt();
         
        //For tangent, the program verifies whether the angle is close to 90° or 270°, 
        //where the tangent function is undefined.
        
        if (choice == 1){
        System.out.println("Sine = " + Math.sin(radians));}
        
        else if (choice ==2){
        System.out.println("Cosine = " + Math.cos(radians));}  
        
        else if (choice ==3){
        if ((angle >= 89 && angle <= 91)
        || (angle >=269 && angle <=271)) {
        System.out.println("Warning: Tangent value cannot be determined for an angle close to this.");}
        else {
        System.out.println("Tangent = " + Math.tan(radians));}
        
        } else if (choice ==4){
          System.out.println("Sine = " + Math.sin(radians));
          System.out.println("Cosine = " + Math.cos(radians));
          if ((angle >= 89 && angle <= 91)
          || (angle >=269 && angle <=271)) {
          System.out.println("Warning: Tangent value cannot be determined for an angle close to this.");}
          else {
          System.out.println("Tangent = " + Math.tan(radians));}
        }
        else {
        System.out.println("Invalid selection: Please select an option 1-4 ");}
          

    // Critical Thinking Questions:
    
    //1.Why do we need to convert angles from degrees to radians?
    //Answer:In Java, Math.sin(), Math.cos(), and Math.tan() use radians, 
    //so we convert degrees to radians before calculating.
    
    //2.What makes tangent undefined at certain angles?
    //Answer: Tangent becomes undefined at 90° and 270° because its formula, 
    //sin/cos, results in division by zero when cosine equals zero.
    
    //3.How could you modify this program to also calculate reciprocal functions 
    //(cosecant, secant, cotangent)?
    //Answer:Reciprocal functions can be added by taking 1/sin, 1/cos, and 1/tan
    //while using conditional checks to catch division by zero on boundary angles.

    
    //Problem 2: Angle Quadrant Detector
    
       System.out.println("\n--- Problem 2: Angle Quodrant Detector --- ");
       
       System.out.println("Enter an angle in degrees: ");
       double angle2 = input.nextDouble();
       
    // Normalize the angle to fall within 0° to 360° to identify the correct quadrant.
       double normalizedAngle = angle2 % 360;
       
       if (normalizedAngle < 0){
           normalizedAngle += 360;}
       System.out.println("Normalized angle: " + normalizedAngle);
       
    // QUADRANT DETECTOR
        // Quadrant I: 0° < angle < 90°
        // Quadrant II: 90° < angle < 180°
        // Quadrant III: 180° < angle < 270°
        // Quadrant IV: 270° < angle < 360°
        // + x-axis: angle = 0°
        // - x-axis: angle = 180°
        // + y-axis: angle = 90°
        // - y-axis: angle = 270°
       
       if (normalizedAngle ==0){
       System.out.println("The angle is on the positive x-axis.");}
       
       else if (normalizedAngle ==90){
       System.out.println("The angle is on the positive y-axis.");} 
       
       else if (normalizedAngle ==180){
       System.out.println("The angle is on the negative x-axis.");}
       
       else if (normalizedAngle ==270){
       System.out.println("The angle is on the negative y-axis.");}
       
       else if (normalizedAngle > 0 && normalizedAngle < 90){
       System.out.println("The angle is in Quadrant I.");}
       
       else if (normalizedAngle > 90 && normalizedAngle < 180){
       System.out.println("The angle is in Quadrant II.");}
       
       else if (normalizedAngle > 180 && normalizedAngle < 270){
       System.out.println("The angle is in Quadrant I.");}
       
       else if (normalizedAngle > 270 && normalizedAngle < 360){
       System.out.println("The angle is in Quadrant I.");}
       
       
    // SIGNS OF TRIGONOMETRIC FUNCTIONS
        // The signs of sine, cosine, tangent depend on the Quadrant.
            // Quadrant I: All identities are positive.
            // Quadrant II: Sine is only positive.
            // Quadrant III: Tangent is only positive.
            // Quadrant IV: Cosine is only positive.
        //Angles at 0°, 90°, 180°, and 270° are treated seperately
        //since they fall directly on the coordinate axis.
        System.out.println("\nSigns of trigonometry functions:");
        
        if (normalizedAngle == 0){ 
            System.out.println("Sine: Zero");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Zero");}
            
        else if (normalizedAngle == 90){ 
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Zero");
            System.out.println("Tangent: Undefined");} 
        
        else if (normalizedAngle == 180){ 
            System.out.println("Sine: Zero");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Zero");}
        
         else if (normalizedAngle == 270){ 
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Zero");
            System.out.println("Tangent: Undefined");}
        
         else if (normalizedAngle > 0 && normalizedAngle > 90){ 
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Positive");}
        
        else if (normalizedAngle > 90 && normalizedAngle > 180){ 
            System.out.println("Sine: Positive");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Negative");}
        
        else if (normalizedAngle > 180 && normalizedAngle > 270){ 
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Negative");
            System.out.println("Tangent: Positive");}
        
        else if (normalizedAngle > 270 && normalizedAngle > 360){ 
            System.out.println("Sine: Negative");
            System.out.println("Cosine: Positive");
            System.out.println("Tangent: Negative");}
    
        
    // Critical Thinking Questions:

    //1.Why is it important to normalize angles before determining their quadrant?
    //Answer:It makes the angle easier to work with by changing it to a value between 0° and 360°.
    
    //2.How does the sign of trigonometric functions change across different quadrants?
    //Answer:The signs change depending on the quadrant. Some functions are positive 
    //while others are negative.
    
    //3.What special considerations are needed for angles exactly on the axes?
    //Answer:Angles on the axes have values of 0, 90, 180, or 270 degrees. 
    //Some trigonometric functions may be 0 or undefined.
    
    
    // Problem 3: Right Triangle Solver
    
        System.out.println("\n--- Problem 3: Right Triangle Solver --- ");
    
        //The program will then calculate the missing side, the two missing 
        //angles, and the area. It will also validate the user's input to make 
        //sure that sides are positive and angles are between 0° and 90°.
        
    
        double a = 0;  // Side a
        double b = 0;  // Side b
        double c = 0;  // Hypotenuse
        double A = 0;  // Angle A
        double B = 0;  // Angle B
        double C = 0;  // Angle C
        double area;

        System.out.println("=== Right Triangle Solver ===");
        System.out.println("1. I know two sides");
        System.out.println("2. I know one side and one angle");
        System.out.print("Choose an option (1 or 2): ");

        int option = input.nextInt();

        // OPTION 1: User knows two sides
        if (option == 1) {

            System.out.println("\nWhich two sides do you know?");
            System.out.println("1. Two legs (a and b)");
            System.out.println("2. Leg a and hypotenuse c");
            System.out.println("3. Leg b and hypotenuse c");
            System.out.print("Choose an option (1-3): ");

            int sideOption = input.nextInt();

            // User knows a and b
            if (sideOption == 1) {

                System.out.print("Enter side a: ");
                a = input.nextDouble();

                System.out.print("Enter side b: ");
                b = input.nextDouble();

                if (a <= 0 || b <= 0) {
                    System.out.println("Error: Side lengths must be positive.");
                    input.close();
                    return;
                }

                // Pythagorean theorem
                c = Math.sqrt(a * a + b * b);
            }

            // User knows a and c
            else if (sideOption == 2) {

                System.out.print("Enter side a: ");
                a = input.nextDouble();

                System.out.print("Enter hypotenuse c: ");
                c = input.nextDouble();

                if (a <= 0 || c <= 0) {
                    System.out.println("Error: Side lengths must be positive.");
                    input.close();
                    return;
                }

                if (a >= c) {
                    System.out.println(
                        "Error: The hypotenuse must be longer than side a."
                    );
                    input.close();
                    return;
                }

                b = Math.sqrt(c * c - a * a);
            }

            // User knows b and c
            else if (sideOption == 3) {

                System.out.print("Enter side b: ");
                b = input.nextDouble();

                System.out.print("Enter hypotenuse c: ");
                c = input.nextDouble();

                if (b <= 0 || c <= 0) {
                    System.out.println("Error: Side lengths must be positive.");
                    input.close();
                    return;
                }

                if (b >= c) {
                    System.out.println(
                        "Error: The hypotenuse must be longer than side b."
                    );
                    input.close();
                    return;
                }

                a = Math.sqrt(c * c - b * b);
            }

            else {
                System.out.println("Invalid option.");
                input.close();
                return;
            }
        }

        // OPTION 2: User knows one side and one angle
        else if (option == 2) {

            System.out.println("\nWhat do you know?");
            System.out.println("1. Side a and angle A");
            System.out.println("2. Side a and angle B");
            System.out.println("3. Side b and angle A");
            System.out.println("4. Side b and angle B");
            System.out.println("5. Hypotenuse c and angle A");
            System.out.println("6. Hypotenuse c and angle B");
            System.out.print("Choose an option (1-6): ");

            int angleOption = input.nextInt();

            System.out.print("Enter the known side: ");
            double knownSide = input.nextDouble();

            System.out.print("Enter the known angle in degrees: ");
            double angle3 = input.nextDouble();

            // Validate the side
            if (knownSide <= 0) {
                System.out.println("Error: Side length must be positive.");
                input.close();
                return;
            }

            // Validate the angle
            if (angle <= 0 || angle >= 90) {
                System.out.println("Error: Angle must be greater than 0° and less than 90°.");}

            // Convert degrees to radians
            double radians2 = Math.toRadians(angle);

            // Side a and angle A
            if (angleOption == 1) {

                a = knownSide;
                A = angle3;

                c = a / Math.cos(radians2);
                b = a * Math.tan(radians2);
            }

            // Side a and angle B
            else if (angleOption == 2) {

                a = knownSide;
                B = angle3;

                c = a / Math.sin(radians2);
                b = a / Math.tan(radians2);
            }

            // Side b and angle A
            else if (angleOption == 3) {

                b = knownSide;
                A = angle3;

                c = b / Math.sin(radians2);
                a = b / Math.tan(radians2);
            }

            // Side b and angle B
            else if (angleOption == 4) {

                b = knownSide;
                B = angle3;

                c = b / Math.cos(radians2);
                a = b * Math.tan(radians2);
            }

            // Hypotenuse c and angle A
            else if (angleOption == 5) {

                c = knownSide;
                A = angle3;

                a = c * Math.cos(radians2);
                b = c * Math.sin(radians2);
            }

            // Hypotenuse c and angle B
            else if (angleOption == 6) {

                c = knownSide;
                B = angle3;

                b = c * Math.cos(radians2);
                a = c * Math.sin(radians2);
            }

            else {
                System.out.println("Invalid option.");
               }
        }

        else {
            System.out.println("Invalid option. Please choose 1 or 2.");}

        // Calculate the missing angles
        A = Math.toDegrees(Math.asin(a / c));
        B = Math.toDegrees(Math.asin(b / c));

        // Calculate the area
        area = 0.5 * a * b;

        // Display results
        System.out.println("\n=== Triangle Results ===");

        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Hypotenuse c: " + c);

        System.out.println("Angle A: " + A + "°");
        System.out.println("Angle B: " + B + "°");
        System.out.println("Angle C: " + C + "°");

        System.out.println("Area: " + area + " square units");


  
    //Critical Thinking Questions:
    
    //1.Why must we validate that angles in a right triangle are less than 90°?
    //Answer:Because the two other angles in a right triangle must be less than 90°.
    
    //2.How does your program handle the different cases of known values?
    //Answer:The program uses the known sides or angles to calculate the missing values.
    
    //3.What would happen if a user entered values that don't form a valid right triangle?
    //Answer:The program should show an error message because the values cannot form a 
    //valid right triangle.
    
    
    // Problem 4: Trigonometric Identity Verifier
    
        System.out.println("\n--- Problem 4: Trigonometric Identity Verifier --- ");
        
        // Ask the user for an angle
        System.out.print("Enter an angle in degrees: ");
        double degrees = input.nextDouble();

        // Convert degrees to radians
        double radians3 = Math.toRadians(degrees);

        // Tolerance for floating-point comparison
        double tolerance = 0.000001;

        // Calculate basic trigonometric values
        double sin = Math.sin(radians3);
        double cos = Math.cos(radians3);
        double tan = Math.tan(radians3);

        System.out.println("\n=== Trigonometric Identity Verification ===");
        System.out.println("Angle: " + degrees + "°");

        // -----------------------------------------
        // Identity 1: sin²θ + cos²θ = 1
        // -----------------------------------------
        
        double left1 = sin * sin + cos * cos;
        double right1 = 1;

        double difference1 = Math.abs(left1 - right1);

        System.out.println("\nIdentity 1:");
        System.out.println("sin²θ + cos²θ = 1");
        
         System.out.println("Left side: " + left1);
       System.out.println("Right side: " + right1);

        if (difference1 <= tolerance) {
            System.out.println("Result: TRUE");
        } else {
            System.out.println("Result: FALSE");
            System.out.println("Difference: " + difference1);
        }

        // -----------------------------------------
        // Identity 2: 1 + tan²θ = sec²θ
        // -----------------------------------------

        System.out.println("\nIdentity 2:");
        System.out.println("1 + tan²θ = sec²θ");

        // Check if cosine is too close to zero
        if (Math.abs(cos) < tolerance) {

        System.out.println("Cannot verify this identity because secant and tangent "
                + "are undefined at this angle.");

        } else {

        double sec = 1 / cos;

        double left2 = 1 + tan * tan;
        double right2 = sec * sec;

        double difference2 = Math.abs(left2 - right2);

       System.out.println("Left side: " + left2);
       System.out.println("Right side: " + right2);

        if (difference2 <= tolerance) {
                System.out.println("Result: TRUE");
        } else {
        System.out.println("Result: FALSE");
        System.out.println("Difference: " + difference2);}
        

        // -----------------------------------------
        // Identity 3: sin(2θ) = 2sinθcosθ
        // -----------------------------------------

        double left3 = Math.sin(2 * radians);
        double right3 = 2 * sin * cos;

        double difference3 = Math.abs(left3 - right3);

        System.out.println("\nIdentity 3:");
        System.out.println("sin(2θ) = 2sinθcosθ");

        System.out.println("Left side: " + left3);
        System.out.println("Right side: " + right3);;

        if (difference3 <= tolerance) {
        System.out.println("Result: TRUE");
        } else {
        System.out.println("Result: FALSE");
        System.out.println("Difference: " + difference3);}
        
        
    //Critical Thinking Questions:
    
    //1.Why do we need a tolerance when comparing floating-point values?
    //Answer: Floating-point numbers can have small rounding errors because 
    //computers store them with limited precision. A tolerance lets us consider 
    //two values equal when their difference is small enough.
    
    //2.Which identity might be most susceptible to floating-point precision issues and why?
    //Answer:Identities involving division, square roots, or trigonometric 
    //functions are often more susceptible because these operations can introduce 
    //rounding errors. For example, trigonometric identities may produce slightly 
    //different results due to limited floating-point precision.
    
    //3.How could you extend this program to verify more complex identities?
    //Answer:We could add more mathematical expressions and identities, 
    //including trigonometric, logarithmic, and exponential identities. 
    //The program could evaluate both sides using different input values 
    //and compare them using a chosen tolerance.
    
    
    
    // Problem 5: Wave Properties Analyzer
        
     System.out.println("\n--- Problem 5: Wave Properties Analyzer --- ");
    
    //The program will ask the user for:

    //Amplitude — how high or low the wave reaches.
    //Frequency — how many complete cycles occur per unit of time.
    //Phase shift — how much the wave is shifted horizontally.
    //Time — the specific time at which the wave should be analyzed.
    //The wave is represented by:

    //                      y(t)=Asin(2πft+ϕ)
   
    //where:

    //A = amplitude
    //f = frequency
    //t = time
    //ϕ = phase shift in radians

    //The program will determine the wave's value at the given time, 
    //whether it is at a peak, trough, or zero-crossing, and when the next peak will occur.    
    
    
        // Ask for amplitude
        System.out.print("Enter amplitude: ");
        double amplitude = input.nextDouble();

        // Ask for frequency
        System.out.print("Enter frequency: ");
        double frequency = input.nextDouble();

        // Ask for phase shift in degrees
        System.out.print("Enter phase shift in degrees: ");
        double phaseDegrees = input.nextDouble();

        // Ask for time
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        
        // Check amplitude
        if (amplitude < 0) {
            System.out.println("Error: Amplitude cannot be negative.");
            input.close();
            return;
        }

        // Check frequency
        if (frequency <= 0) {
            System.out.println("Error: Frequency must be greater than 0.");
            input.close();
            return;
        }

        // Convert phase shift from degrees to radians
        double phase = Math.toRadians(phaseDegrees);

        // Calculate angular frequency
        double omega = 2 * Math.PI * frequency;

        // Calculate the angle of the wave
        double angle4 = omega * time + phase;

        // Calculate instantaneous wave value
        double value = amplitude * Math.sin(angle);

        // Small tolerance for floating-point calculations
        double tolerance2 = 0.000001;

        System.out.println("\n=== Sinusoidal Wave Analysis ===");

        System.out.println("Amplitude: " + amplitude);
        System.out.println("Frequency: " + frequency);
        System.out.println("Phase shift: " + phaseDegrees + "°");
        System.out.println("Time: " + time);

        System.out.println("Instantaneous value: " + value);

        // Determine the position of the wave
        if (Math.abs(value - amplitude) <= tolerance2) {

            System.out.println("Wave position: PEAK");

        } else if (Math.abs(value + amplitude) <= tolerance2) {

            System.out.println("Wave position: TROUGH");

        } else if (Math.abs(value) <= tolerance2) {

            System.out.println("Wave position: ZERO-CROSSING");

        } else {

            System.out.println("Wave position: Between key points");
        }

        // Calculate the period
        double period = 1 / frequency;

        // Calculate the next peak
        // A peak occurs when:
        // omega * t + phase = PI/2 + 2PI*n

        double peakTime =
                (Math.PI / 2 - phase) / omega;

        // Move peakTime forward until it is after the current time
        while (peakTime <= time) {
            peakTime = peakTime + period;
        }
        System.out.println("Next peak time: " + peakTime);
        }
        
    //Critical Thinking Questions:
    
    //1.How did you determine if the wave is at a peak or trough?
    //Answer:I checked the value of the sine wave. A peak occurs when 
    //the wave reaches its maximum value, while a trough occurs when it 
    //reaches its minimum value.
    
    //2.What mathematical approach did you use to find the next peak?
    //Answer:I used the periodic nature of the sine function. Since a peak occurs 
    //at a specific phase, I calculated the next angle that corresponds to a 
    //maximum value using the wave’s period.
    
    //3.How would you modify this program to handle non-sinusoidal waves?
    //Answer: I would change the mathematical function used to represent the 
    //wave and add a method for detecting local maximum and minimum points.
    //This could allow the program to handle square, triangle, or other types of waves.
    
    
     
    }
         
}  

                 
                
    
            
            
          
    
   

