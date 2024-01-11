import java.util.Scanner;

public class PeriodicTable {
	public static void main(String[] args) {
		String[][] elements = {
				{"Hydrogen", "H", "1", "1", "1", "Gas"},
				{"Helium", "He", "2", "2", "2", "Gas"},
				{"Lithium", "Li", "3", "4", "4", "Solid"},
				{"Beryllium", "Be", "4", "5", "5","Solid"},
				{"Boron", "B", "5", "6","6", "Solid"},
				{"Carbon", "C", "6", "6", "6","Solid"},
				{"Nitrogen", "N", "7", "7", "7", "Gas"},
				{"Oxygen", "O", "8", "8","8", "Gas"},
				{"Fluorine", "F", "9", "10","10", "Gas"},
				{"Neon", "Ne", "10", "10","10", "Gas"},
				{"Sodium", "Na", "11", "11", "11", "Solid"},
				{"Magnesium", "Mg", "12", "12", "12", "Solid"},
				{"Aluminium", "Al", "13", "13", "13", "Solid"},
				{"Silicon", "Si", "14", "14", "14", "Solid"},
				{"Phosphorus", "P", "15", "15", "15", "Solid"},
				{"Sulfur", "S", "16", "16", "16", "Solid"},
				{"Chlorine", "Cl", "17", "17", "17", "Gas"},
				{"Argon", "Ar", "18", "18", "18", "Gas"},
				{"Potassium", "K", "19", "19", "19", "Solid"},
				{"Calcium", "Ca", "20", "20", "20", "Solid"},
				{"Scandium", "Sc", "21", "21", "21", "Solid"},
				{"Titanium", "Ti", "22", "22", "22", "Solid"},
				{"Vanadium", "V", "23", "23", "23", "Solid"},
				{"Chromium", "Cr", "24", "24", "24", "Solid"},
				{"Manganese", "Mn", "25", "25", "25", "Liquid"},
				{"Iron", "Fe", "26", "26", "26", "Solid"},
				{"Cobalt", "Co", "27", "27", "27", "Solid"},
				{"Nickel", "Ni", "28", "28", "28", "Solid"},
				{"Copper", "Cu", "29", "29", "29", "Solid"},
				{"Zinc", "Zn", "30", "30", "30", "Solid"},
				{"Gallium", "Ga", "31", "31", "31", "Solid"},
				{"Germanium", "Ge", "32", "32", "32", "Solid"},
				{"Arsenic", "As", "33", "33", "33", "Solid"},
				{"Selenium", "Se", "34", "34", "34", "Solid"},
				{"Bromine", "Br", "35", "35", "35", "Liquid"},
				{"Krypton", "Kr", "36", "36", "36", "Solid"},
				{"Rubidium", "Rb", "37", "37", "37", "Solid"},
				{"Strontium", "Sr", "38", "38", "38", "Solid"},
				{"Yttrium", "Y", "39", "39", "39", "Solid"},
				{"Zirconium", "Zr", "40", "40", "40", "Solid"},
				{"Niobium", "Nb", "41", "41", "41", "Solid"},
				{"Molybdenum", "Mo", "42", "42", "42", "Solid"},
				{"Technetium", "Tc", "43", "43", "43", "Solid"},
				{"Ruthenium", "Ru", "44", "44", "44", "Solid"},
				{"Rhodium", "Rh", "45", "45", "45", "Solid"},
				{"Palladium", "Pd", "46", "46", "46", "Solid"},
				{"Silver", "Ag", "47", "47", "47", "Solid"},
				{"Cadmium", "Cd", "48", "48", "48", "Solid"},
				{"Indium", "In", "49", "49", "49", "Solid"},
				{"Tin", "Sn", "50", "50", "50", "Solid"},
				{"Antimony", "Sb", "51", "51", "51", "Solid"},
				{"Tellurium", "Te", "52", "52", "52", "Solid"},
				{"Iodine", "I", "53", "53", "53", "Solid"},
				{"Xenon", "Xe", "54", "54", "54", "Gas"},
				{"Caesium", "Cs", "55", "55", "55", "Solid"},
				{"Barium", "Ba", "56", "56", "56", "Solid"},
				{"Lanthanum", "La", "57", "57", "57", "Solid"},
				{"Cerium", "Ce", "58", "58", "58", "Solid"},
				{"Praseodymium", "Pr", "59", "59", "59", "Solid"},
				{"Neodymium", "Nd", "60", "60", "60", "Solid"},
				{"Promethium", "Pm", "61", "61", "61", "Gas"},
				{"Samarium", "Sm", "62", "62", "62", "Solid"},
				{"Europium", "Eu", "63", "63", "63", "Solid"},
				{"Gadolinium", "Gd", "64", "64", "64", "Solid"},
				{"Terbium", "Tb", "65", "65", "65", "Solid"},
				{"Dysprosium", "Dy", "66", "66", "66", "Solid"},
				{"Holmium", "Ho", "67", "67", "67", "Solid"},
				{"Erbium", "Er", "68", "68", "68", "Solid"},
				{"Thulium", "Tm", "69", "69", "69", "Solid"},
				{"Ytterbium", "Yb", "70", "70", "70", "Solid"},
				{"Lutetium", "Lu", "71", "71", "71", "Solid"},
				{"Hafnium", "Hf", "72", "72", "72", "Gas"},
				{"Tantalum", "Ta", "73", "73", "73", "Solid"},
				{"Tungsten", "W", "74", "74", "74", "Solid"},
				{"Rhenium", "Re", "75", "75", "75", "Solid"},
				{"Osmium", "Os", "76", "76", "76", "Solid"},
				{"Iridium", "Ir", "77", "77", "77", "Gas"},
				{"Platinum", "Pt", "78", "78", "78", "Solid"},
				{"Gold", "Au", "79", "79", "79", "Solid"},
				{"Mercury", "Hg", "80", "80", "80", "Gas"},
				{"Thallium", "Tl", "81", "81", "81", "Solid"},
				{"Lead", "Pb", "82", "82", "82", "Solid"},
				{"Bismuth", "Bi", "83", "83", "83", "Solid"},
				{"Polonium", "Po", "84", "84", "84", "Solid"},
				{"Astatine", "At", "85", "85", "85", "Solid"},
				{"Radon", "Rn", "86", "86", "86", "Solid"},
				{"Francium", "Fr", "87", "87", "87", "Solid"},
				{"Radium", "Ra", "88", "88", "88", "Solid"},
				{"Actinium", "Ac", "89", "89", "89", "Solid"},
				{"Thorium", "Th", "90", "90", "90", "Solid"},
				{"Protactinium", "Pa", "91", "91", "91", "Solid"},
				{"Uranium", "U", "92", "92", "92", "Solid"},
				{"Neptunium", "Np", "93", "93", "93", "Gas"},
				{"Plutonium", "Pu", "94", "94", "94", "Solid"},
				{"Americium", "Am", "95", "95", "95", "Solid"},
				{"Curium", "Cm", "96", "96", "96", "Solid"},
				{"Berkelium", "Bk", "97", "97", "97", "Solid"},
				{"Californium", "Cf", "98", "98", "98", "Solid"},
				{"Einsteinium", "Es", "99", "99", "99", "Solid"},
				{"Fermium", "Fm", "100", "100", "100", "Gas"},
				{"Mendelevium", "Md", "101", "101", "101", "Solid"},
				{"Nobelium", "No", "102", "102", "102", "Solid"},
				{"Lawrencium", "Lr", "103", "103", "103", "Solid"},
				{"Rutherfordium", "Rf", "104", "104", "104", "Solid"},
				{"Dubnium", "Db", "105", "105", "105", "Solid"},
				{"Seaborgium", "Sg", "106", "106", "106", "Solid"},
				{"Bohrium", "Bh", "107", "107", "107", "Solid"},
				{"Hassium", "Hs", "108", "108", "108", "Solid"},
				{"Meitnerium", "Mt", "109", "109", "109", "Solid"},
				{"Darmstadtium", "Ds", "110", "110", "110", "Solid"},
				{"Roentgenium", "Rg", "111", "111", "111", "Solid"},
				{"Copernicium", "Cn", "112", "112", "112", "Solid"},
				{"Ununtrium", "Uut", "113", "113", "113", "Solid"},
				{"Flerovium", "Fl", "114", "114", "114", "Solid"},
				{"Ununpentium", "Uup", "115", "115", "115", "Solid"},
				{"Livermorium", "Lv", "116", "116", "116", "Solid"},
				{"Ununseptium", "Uus", "117", "117", "117", "Solid"},
				{"Ununoctium", "Uuo", "118", "118", "118", "Solid"}

		};

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Periodic Table program!");
		System.out.print("Please enter your name: ");
		String name = input.nextLine();

		while(name.isEmpty()) {
			System.out.print("Please enter your name: ");
			name = input.nextLine();
		}
		boolean running = true;
		while (running) {
			System.out.println("\nSelect an option:");
			System.out.println("1. Enter the name of the element:");
			System.out.println("2. Enter the Symbol of the element: ");
			System.out.println("3. Enter the atomic number of the element: ");
			System.out.println("4. Enter the amount of electrons of the element: ");
			System.out.println("5. Enter the amount of protons of the element: ");
			System.out.println("6. Search for elements by state (gas/solid)");
			System.out.println("7. Quit");
			System.out.print("Enter your choice (1-7): ");

			int choice = 0;
			try {
				choice = input.nextInt();
			} catch (Exception e) {

			}
			input.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter the name of the element: ");
				String nameQuery = input.nextLine();
				while(nameQuery.isEmpty()) {
					System.out.print("Enter the name of the element: ");
					nameQuery = input.nextLine();
				}
				getElementByName(elements, nameQuery);

				break;
			case 2:
				System.out.print("Enter the Symbol of the element: ");
				String elementSymbol = input.nextLine();
				while(elementSymbol.isEmpty()) {
					System.out.print("Enter the Symbol of the element: ");
					elementSymbol = input.nextLine();
				}
				getElementBySymbol(elements, elementSymbol);

			case 3:
				System.out.print("Enter the atomic number of the element: ");
				String atomicNumber = input.nextLine();
				while(atomicNumber.isEmpty()) {
					System.out.print("Enter the atomic number of the element: ");
					atomicNumber = input.nextLine();
				}
				getElementByAtomicNumber(elements, atomicNumber);

				break;
			case 4:
				System.out.print("Enter the amount of electrons of the element: ");
				String electronsNumber = input.nextLine();
				while(electronsNumber.isEmpty()) {
					System.out.print("Enter the amount of electrons of the element: ");
					electronsNumber = input.nextLine();
				}
				getElementByElectrons(elements, electronsNumber); 

				break;
			case 5:
				System.out.print("Enter the amount of protons of the element: ");
				String protonsNumber = input.nextLine();
				while(protonsNumber.isEmpty()) {
					System.out.print("Enter the amount of protons of the element: ");
					protonsNumber = input.nextLine();
				}
				getElementByProtons(elements, protonsNumber);

			case 6:
				System.out.print("Enter the state of the element (gas/solid): ");
				String elementState = input.nextLine();
				while(elementState.isEmpty()) {
					System.out.print("Enter the state of the element (gas/solid): ");
					elementState = input.nextLine();
				}
				getElementByState(elements, elementState);

			case 7:
				System.out.println("Bye " + name + " have a good day.");
				break;
			default:
				System.out.println("Please enter valid option"); 
				break;

			}
		}
	}

	private static void getElementByName(String[][] elements, String nameQuery) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][0].equalsIgnoreCase(nameQuery)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found.");

		}
	}

	private static void getElementBySymbol(String[][] elements, String elementSymbol) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][1].equals(elementSymbol)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found.");
		}

	}

	private static void getElementByAtomicNumber(String[][] elements, String atomicNumber) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][2].equals(atomicNumber)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found.");
		}

	}

	private static void getElementByElectrons(String[][] elements, String electronsNumber) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][3].equals(electronsNumber)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);    
				System.out.println("");
			}
		} 
		if (!found) {
			System.out.println("Element not found.");
		}

	}

	private static void getElementByProtons(String[][] elements, String protonsNumber) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][4].equals(protonsNumber)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);   
				System.out.println("");
			}
		}

		if (!found) {
			System.out.println("Element not found.");
		}


	}

	private static void getElementByState(String[][] elements, String elementState) {
		boolean found = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i][5].equals(elementState)) {
				found = true;
				System.out.println("Name: " + elements[i][0]);
				System.out.println("Symbol: " + elements[i][1]);
				System.out.println("Atomic Number: " + elements[i][2]);
				System.out.println("Electrons: " + elements[i][3]);
				System.out.println("Protons: " + elements[i][4]);
				System.out.println("State: " + elements[i][5]);
				System.out.println("");
			}
		}


		if (!found) {
			System.out.println("Element not found.");
		}


	}

}



