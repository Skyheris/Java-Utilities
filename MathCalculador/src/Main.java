import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    private static final String POSITIVE = "A tua parábola não apresenta raízes reais! É sempre positiva";
    private static final String NEGATIVE = "A tua parábola não apresenta raízes reais! É sempre negativa";
    private static final String ROOTS = "As raízes reais da tua parábola são: X = %.1f e X = %.1f\n";
    private static final String INVALID = "Número inválidos!\n";
    private static final String ROOT = "O resultado da tua raiz é %.1f\n";
    private static final String CANT_SOLVE = "Não podemos realizar esse cálculo!\n";
    private static final String POWER = "O resultado da tua potência é %.1f\n";
    private static final String MULTI = "O resultado da tua multiplicação é %.1f\n";
    private static final String CANT_ZERO = "Não é possível dividir por zero!";
    private static final String DIVISION = "O resultado da tua divisão é %.1f\n";
    private static final String SUBTRACT = "O resultado da tua subtração é %.1f\n";
    private static final String ADDER = "O resultado da tua soma é %.1f\n";
    private static final String SQUARE = "A área do teu quadrado é %.1f\n";
    private static final String RECTANGLE = "A área do teu retângulo é %.1f\n";
    private static final String CIRCLE = "A área do teu círculo é %.1f\n";
    private static final String TRAPEZIO = "A área do teu trapézio é %.1f\n";
    private static final String LOZANGO = "A área do teu lozango é %.1f\n";
    private static final String PENTAGON = "A área do teu pentágono é %.1f\n";
    private static final String HEXAGON = "A área do teu hexágono é %.1f\n";
    private static final String TRIANGLE = "A área do teu triângulo é %.1f\n";
    private static final String CUBE = "O volume do teu cubo é %.1f\n";
    private static final String PARALEL = "O volume do teu paralalogramo é %.1f\n";
    private static final String SPHERE = "O volume da tua esfera é %.1f\n";
    private static final String PIRAMIDE = "O volume da tua pirâmide é %.1f\n";
    private static final String SENO = "O seno do teu ângulo é %.2f\n";
    private static final String COSSENO = "O seno do teu ângulo é %.2f\n";
    private static final String TANGENTE = "O seno do teu ângulo é %.2f\n";
    private static final String ARCOSIN = "O arco-seno do teu ângulo é %.2f\n";
    private static final String ARCOCOS = "O arco-cosseno do teu ângulo é %.2f\n";
    private static final String ARCOTAN = "O arco-tangente do teu ângulo é %.2f\n";
    private static final String PYTAGORAS = "A hipotenusa do teu triângulo é %.1f\n";
    private static final String INVALID_OPTION = "Opção inválida";
    private static final String EXCEDED_TIME = "Tempo excedido!";
    private static final String LINE = "------------------------------";
    private static final String TITULO = "Alo! Aqui tens uma calculadora 100% feita por mim :)";
    private static final String CALCS = "1 - Cálculos";
    private static final String AREAS = "2 - Áreas";
    private static final String VOLUMES = "3 - Volumes";
    private static final String TRIGONOMETRIA = "4 - Trigonometria";
    private static final String SAIR = "5 - Sair";
    private static final int SMALL_CALCS = 1;
    private static final int AREA = 2;
    private static final int VOLUME = 3;
    private static final int TRIGONOMETRY = 4;
    private static final int OUT = 5;
    private static final String SUM_SUB_MULT = "1 - Somar  2 - Subtrair  3 - Multiplicar";
    private static final String DIV_POW_ROOT = "4 - Dividir  5 - Potência  6 - Raiz Quadrada";
    private static final String DIFFROOT_SOLV = "7 - Raiz personalizada  8 - Fórmula Resolvente";
    private static final String SQR_RECT_CRC = "1 - Quadrado  2 - Retângulo  3 - Círculo  4 - Lozango";
    private static final String LZG_TRPZ_PENT_HXG = "5 - Trapézio  6 - Pentágono  7 - Hexágono  8 - Triângulo";
    private static final String CUBE_PARAL = "1 - Cubo  2 - Paralelogramo";
    private static final String SPHERE_PIRAM = "3 - Esfera  4 - Pirâmide";
    private static final String TRIGO1 = "1 - Seno  2 - Cosseno  3 - Tangente";
    private static final String TRIGO2 = "4 - Arcoseno  5 - Arcocosseno  6 - Arcotangente  7 - Pitágoras";
    private static final String OPÇAO = "Digita a opção(Escolhe um número): ";
    private static final String FIRST = "Digita o 1º número: ";
    private static final String SECOND = "Digita o 2º número: ";
    private static final String THIRD = "Digita o 3º número: ";
    private static final String DIVIDEND = "Digita o número que será dividido: ";
    private static final String DIVISOR = "Digita o divisor: ";
    private static final String NUMBER = "Digita um número: ";
    private static final String POWER_NUMB = "Digita o expoente: ";
    private static final String ROOT_NUMB = "Digita o grau da raiz: ";
    private static final String SIDE = "Digita o comprimento do lado: ";
    private static final String LENGHT = "Digita o comprimento: ";
    private static final String WIDTH = "Digita a largura: ";
    private static final String HEIGHT = "Digita a altura: ";
    private static final String BASE = "Digita o comprimento da base: ";
    private static final String APOTHEMA = "Digita o comprimento da apótema: ";
    private static final String MIN_BASE = "Digita o comprimento da base menor: ";
    private static final String MAJ_BASE = "Digita o comprimento da base maior: ";
    private static final String DIAG1 = "Digita a diagonal principal: ";
    private static final String DIAG2 = "Digita a diagonal secundária: ";
    private static final String RADIUS = "Digita o raio: ";
    private static final String ANGLE = "Digita o ângulo: ";
    private static final String SEN = "Digita o seno: ";
    private static final String COSS = "Digita o cosseno: ";
    private static final String TANG = "Digita o tangente: ";
    private static final int SQR = 1;
    private static final int RECT = 2;
    private static final int CRC = 3;
    private static final int LZG = 4;
    private static final int TRPZ = 5;
    private static final int PENT = 6;
    private static final int HXG = 7;
    private static final int TRI = 8;
    private static final int SUM = 1;
    private static final int SUB = 2;
    private static final int MULT = 3;
    private static final int DIV = 4;
    private static final int POW = 5;
    private static final int ROOT2 = 6;
    private static final int DIFFROOT = 7;
    private static final int SOLV = 8;
    private static final int CUB = 1;
    private static final int PARAL = 2;
    private static final int SPH = 3;
    private static final int PIRAM = 4;
    private static final int SIN = 1;
    private static final int COS = 2;
    private static final int TAN = 3;
    private static final int ARCSIN = 4;
    private static final int ARCCOS= 5;
    private static final int ARCTAN = 6;
    private static final int PITAGORAS = 7;

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int choose;
            Calculator machine = new Calculator();
            Numerics calculator = machine.createCalc();
            System.out.println(TITULO);
            do {
                choose = menu(in);
                in.nextLine();
                processChoose(choose, in, calculator);
                TimeUnit.SECONDS.sleep(1);
            } while (choose != OUT);
            System.out.println("Adeus!");
            in.close();
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
    }

    private static int menu(Scanner in){
        try{
            TimeUnit.SECONDS.sleep(1);
            System.out.println("MENU");
            System.out.println(CALCS);
            System.out.println(AREAS);
            System.out.println(VOLUMES);
            System.out.println(TRIGONOMETRIA);
            System.out.println(SAIR);
            System.out.print(OPÇAO);
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
        return in.nextInt();
    }

    private static void menuSmallCalcs(){
        try{
            System.out.println(LINE);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("V <<<<<<Cálculos>>>>>> V");
            System.out.println(SUM_SUB_MULT);
            System.out.println(DIV_POW_ROOT);
            System.out.println(DIFFROOT_SOLV);
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
    }
    private static void menuAreas(){
        try{
            System.out.println(LINE);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("V <<<<<<ÁREAS>>>>>> V");
            System.out.println(SQR_RECT_CRC);
            System.out.println(LZG_TRPZ_PENT_HXG);
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
    }
    private static void menuVols(){
        try{
            System.out.println(LINE);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("V <<<<<<VOLUMES>>>>>> V");
            System.out.println(CUBE_PARAL);
            System.out.println(SPHERE_PIRAM);
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
    }
    private static void menuTrigo(){
        try {
            System.out.println(LINE);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("V <<<<<TRIGONOMETRIA>>>>> V");
            System.out.println(TRIGO1);
            System.out.println(TRIGO2);
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println(EXCEDED_TIME);
        }
    }
    private static void processChoose(int choose, Scanner in, Numerics calculator){
        switch (choose){
            case SMALL_CALCS -> smallCalcs(in, calculator);
            case AREA -> areas(in, calculator);
            case VOLUME -> volums(in, calculator);
            case TRIGONOMETRY -> trigo(in, calculator);
            default -> {
                if (choose != OUT)
                    System.out.println(INVALID_OPTION);
            }
        }
    }

    private static void smallCalcs(Scanner in, Numerics calculator){
        boolean stop;
        do{
            stop = true;
            menuSmallCalcs();
            System.out.print(OPÇAO);
            int option = in.nextInt();
            in.nextLine();
            switch (option) {
                case SUM -> processAdder(in, calculator);
                case SUB -> processSub(in, calculator);
                case MULT -> processMult(in, calculator);
                case DIV -> processDiv(in, calculator);
                case POW -> processPow(in, calculator);
                case ROOT2 -> processSqrt(in, calculator);
                case DIFFROOT -> processDiffRoot(in, calculator);
                case SOLV -> processSolv(in, calculator);
                default -> {System.out.println(INVALID_OPTION);
                    stop = false;
                }
            }
        }while (!stop);
    }

    private static void areas(Scanner in, Numerics calculator){
        boolean stop;
        do {
            stop = true;
            menuAreas();
            System.out.print(OPÇAO);
            int option = in.nextInt();
            in.nextLine();
            switch (option){
                case SQR -> processSqr(in, calculator);
                case RECT -> processRect(in, calculator);
                case CRC -> processCrc(in, calculator);
                case TRPZ -> processTrpz(in, calculator);
                case LZG -> processLzg(in, calculator);
                case PENT -> processPent(in, calculator);
                case HXG -> processHex(in, calculator);
                case TRI -> processTri(in, calculator);
                default -> {System.out.println(INVALID_OPTION);
                    stop = false;
                }
            }
        }while (!stop);
    }

    private static void volums(Scanner in, Numerics calculator){
        boolean stop;
        do{
            stop = true;
            menuVols();
            System.out.print(OPÇAO);
            int option = in.nextInt();
            in.nextLine();
            switch (option){
                case CUB -> processCube(in, calculator);
                case PARAL -> processParal(in, calculator);
                case SPH -> processSphere(in, calculator);
                case PIRAM -> processPiram(in, calculator);
                default -> {
                    System.out.println(INVALID_OPTION);
                    stop = false;
                }
            }
        }
        while (!stop);
    }

    private static void trigo(Scanner in, Numerics calculator){
        boolean stop;
        do {
            stop = true;
            menuTrigo();
            System.out.print(OPÇAO);
            int option = in.nextInt();
            in.nextLine();
            switch (option){
                case SIN -> processSin(in, calculator);
                case COS -> processCos(in, calculator);
                case TAN -> processTan(in, calculator);
                case ARCSIN -> processArcSin(in, calculator);
                case ARCCOS -> processArcCos(in, calculator);
                case ARCTAN -> processArcTan(in, calculator);
                case PITAGORAS -> processPITA(in, calculator);
                default -> {
                    System.out.println(INVALID_OPTION);
                    stop = false;
                }

            }
        }while (!stop);
    }
        public static double digitNumber(Scanner in) {
            double number = 0;
            boolean valid = false;
            do {
                String numb = in.next();
                try {
                    number = Double.parseDouble(numb);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Por favor, digita um número: ");
                }
            } while (!valid);
            return number;
        }

    private static void processAdder(Scanner in, Numerics calculator) {
        System.out.println("<<<SOMADOR DE NÚMEROS>>>");
        System.out.println(LINE);
        System.out.print(FIRST);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(SECOND);
        double numb2 = digitNumber(in);
        in.nextLine();
        double result = calculator.adder(numb1, numb2);
        System.out.printf(ADDER, result);
        System.out.println(LINE);
    }

    private static void processSub(Scanner in, Numerics calculator) {
        System.out.println("<<<SUBTRATOR DE NÚMEROS>>>");
        System.out.println(LINE);
        System.out.print(FIRST);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(SECOND);
        double numb2 = digitNumber(in);
        in.nextLine();
        double result = calculator.takeOff(numb1, numb2);
        System.out.printf(SUBTRACT, result);
        System.out.println(LINE);
    }

    private static void processDiv(Scanner in, Numerics calculator) {
        System.out.println("<<<DIVISOR DE NÚMEROS>>>");
        System.out.println(LINE);
        System.out.print(DIVIDEND);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(DIVISOR);
        double numb2 = digitNumber(in);
        in.nextLine();
        if (numb2 != 0) {
            double result = calculator.divide(numb1, numb2);
            System.out.printf(DIVISION, result);
            System.out.println(LINE);
        } else {
            System.out.println(CANT_ZERO);
            System.out.println(LINE);
        }
    }

    private static void processMult(Scanner in, Numerics calculator) {
        System.out.println("<<<MULTIPLICADOR DE NÚMEROS>>>");
        System.out.println(LINE);
        System.out.print(FIRST);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(SECOND);
        double numb2 = digitNumber(in);
        in.nextLine();
        double result = calculator.multiply(numb1, numb2);
        System.out.printf(MULTI, result);
        System.out.println(LINE);
    }

    private static void processPow(Scanner in, Numerics calculator) {
        System.out.println("<<<POTÊNCIAS>>>");
        System.out.println(LINE);
        System.out.print(NUMBER);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(POWER_NUMB);
        double numb2 = digitNumber(in);
        in.nextLine();
        double result = calculator.power(numb1, numb2);
        System.out.printf(POWER, result);
        System.out.println(LINE);
    }

    private static void processSqrt(Scanner in, Numerics calculator) {
        System.out.println("<<<RAÍZES QUADRADAS>>>");
        System.out.println(LINE);
        System.out.print(NUMBER);
        double numb = digitNumber(in);
        in.nextLine();
        if (numb >= 0) {
            double result = calculator.sqrRoot(numb);
            System.out.printf(ROOT, result);
            System.out.println(LINE);
        } else {
            System.out.print(CANT_SOLVE);
            System.out.println(LINE);
        }
    }

    private static void processDiffRoot(Scanner in, Numerics calculator) {
        System.out.println("<<<RAÍZES>>>");
        System.out.println(LINE);
        System.out.print(NUMBER);
        double number = digitNumber(in);
        in.nextLine();
        System.out.print(ROOT_NUMB);
        double root = digitNumber(in);
        in.nextLine();
        double result;
        if (number >= 0 && root != 0) {
            result = calculator.diffRoot(number, root);
            System.out.printf(ROOT, result);
            System.out.println(LINE);
        } else if (number < 0 && root % 2 != 0) {
            result = calculator.diffRoot(number, root);
            System.out.printf(ROOT, result);
            System.out.println(LINE);
        } else {
            System.out.println(INVALID);
        }
    }

    private static void processSolv(Scanner in, Numerics calculator) {
        System.out.println("<<<FÓRMULA RESOLVENTE>>>");
        System.out.println(LINE);
        System.out.print(FIRST);
        double numb1 = digitNumber(in);
        in.nextLine();
        System.out.print(SECOND);
        double numb2 = digitNumber(in);
        in.nextLine();
        System.out.print(THIRD);
        double numb3 = digitNumber(in);
        in.nextLine();
        if (numb1 != 0) {
            double[] result = calculator.solving(numb1, numb2, numb3);
            if (Math.pow(numb2, 2) - (4 * numb1 * numb3) >= 0){
                System.out.printf(ROOTS, result[0], result[1]);
            }else if (numb1 > 0){
                System.out.println(POSITIVE);
                System.out.println(LINE);
            }else{
                System.out.println(NEGATIVE);
                System.out.println(LINE);
            }
        }
    }
    private static void processSqr(Scanner in, Numerics calculator){
        System.out.println("<<<QUADRADO>>>");
        System.out.println(LINE);
        System.out.print(SIDE);
        double side = digitNumber(in);
        in.nextLine();
        double result = calculator.sqrArea(side);
        System.out.printf(SQUARE, result);
        System.out.println(LINE);
    }
    private static void processRect(Scanner in, Numerics calculator){
        System.out.println("<<<RETÂNGULO>>>");
        System.out.println(LINE);
        System.out.print(LENGHT);
        double height = digitNumber(in);
        in.nextLine();
        System.out.print(WIDTH);
        double width = digitNumber(in);
        in.nextLine();
        double result = calculator.rectArea(height, width);
        System.out.printf(RECTANGLE, result);
        System.out.println(LINE);
    }
    private static void processCrc(Scanner in, Numerics calculator){
        System.out.println("<<<CÍRCULO>>>");
        System.out.println(LINE);
        System.out.print(RADIUS);
        double radius = digitNumber(in);
        in.nextLine();
        double result = calculator.circleArea(radius);
        System.out.printf(CIRCLE, result);
        System.out.println(LINE);
    }
    private static void processTrpz(Scanner in, Numerics calculator){
        System.out.println("<<<TRAPÉZIO>>>");
        System.out.println(LINE);
        System.out.print(MIN_BASE);
        double minorBase = digitNumber(in);
        in.nextLine();
        System.out.print(MAJ_BASE);
        double majorBase = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.trpzArea(minorBase, majorBase, height);
        System.out.printf(TRAPEZIO, result);
        System.out.println(LINE);
    }
    private static void processLzg(Scanner in, Numerics calculator){
        System.out.println("<<<LOZANGO>>>");
        System.out.println(LINE);
        System.out.print(DIAG1);
        double D = digitNumber(in);
        in.nextLine();
        System.out.print(DIAG2);
        double d = digitNumber(in);
        in.nextLine();
        double result = calculator.lszArea(D, d);
        System.out.printf(LOZANGO, result);
        System.out.println(LINE);
    }
    private static void processPent(Scanner in, Numerics calculator){
        System.out.println("<<<PENTÁGONO>>>");
        System.out.println(LINE);
        System.out.print(SIDE);
        double side = digitNumber(in);
        in.nextLine();
        System.out.print(APOTHEMA);
        double apothema = digitNumber(in);
        in.nextLine();
        double result = calculator.pntgArea(side*5, apothema);
        System.out.printf(PENTAGON, result);
        System.out.println(LINE);
    }
    private static void processHex(Scanner in, Numerics calculator){
        System.out.println("<<<HEXÁGONO>>>");
        System.out.println(LINE);
        System.out.print(BASE);
        double base = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.hxgArea(base, height);
        System.out.printf(HEXAGON, result);
        System.out.println(LINE);
    }
    private static void processTri(Scanner in, Numerics calculator){
        System.out.println("<<<TRIÂNGULO>>>");
        System.out.println(LINE);
        System.out.print(BASE);
        double base = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.triArea(base, height);
        System.out.printf(TRIANGLE, result);
        System.out.println(LINE);
    }
    private static void processCube(Scanner in, Numerics calculator){
        System.out.println("<<<CUBO>>>");
        System.out.println(LINE);
        System.out.print(SIDE);
        double side = digitNumber(in);
        in.nextLine();
        double result = calculator.cubeVol(side);
        System.out.printf(CUBE, result);
        System.out.println(LINE);
    }
    private static void processParal(Scanner in, Numerics calculator){
        System.out.println("<<<PARALELOGRAMO>>>");
        System.out.println(LINE);
        System.out.print(SIDE);
        double side = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.paralVol(side, height);
        System.out.printf(PARALEL, result);
        System.out.println(LINE);
    }
    private static void processSphere(Scanner in, Numerics calculator){
        System.out.println("<<<ESFERA>>>");
        System.out.println(LINE);
        System.out.print(RADIUS);
        double radius = digitNumber(in);
        in.nextLine();
        double result = calculator.spheVol(radius);
        System.out.printf(SPHERE, result);
        System.out.println(LINE);
    }
    private static void processPiram(Scanner in, Numerics calculator){
        System.out.println("<<<PIRÂMIDE>>>");
        System.out.println(LINE);
        System.out.print(SIDE);
        double side = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.piramVol(side, height);
        System.out.printf(PIRAMIDE, result);
        System.out.println(LINE);
    }

    private static void processSin(Scanner in, Numerics calculator){
        System.out.println("<<<SENO>>>");
        System.out.println(LINE);
        System.out.print(ANGLE);
        double angle = digitNumber(in);
        in.nextLine();
        double result = calculator.sin(angle);
        System.out.printf(SENO, result);
        System.out.println(LINE);
    }

    private static void processCos(Scanner in, Numerics calculator){
        System.out.println("<<<COSSENO>>>");
        System.out.println(LINE);
        System.out.print(ANGLE);
        double angle = digitNumber(in);
        in.nextLine();
        double result = calculator.cos(angle);
        System.out.printf(COSSENO, result);
        System.out.println(LINE);
    }

    private static void processTan(Scanner in, Numerics calculator){
        System.out.println("<<<TANGENTE>>>");
        System.out.println(LINE);
        System.out.print(ANGLE);
        double angle = digitNumber(in);
        in.nextLine();
        double result = calculator.tan(angle);
        System.out.printf(TANGENTE, result);
        System.out.println(LINE);
    }

    private static void processArcSin(Scanner in, Numerics calculator){
        System.out.println("<<<ARCOSENO>>>");
        System.out.println(LINE);
        System.out.print(SEN);
        double sin = digitNumber(in);
        in.nextLine();
        double result = calculator.sinh(sin);
        System.out.printf(ARCOSIN, result);
        System.out.println(LINE);
    }

    private static void processArcCos(Scanner in, Numerics calculator){
        System.out.println("<<<ARCOCOSSENO>>>");
        System.out.println(LINE);
        System.out.print(COSS);
        double cos = digitNumber(in);
        in.nextLine();
        double result = calculator.cosh(cos);
        System.out.printf(ARCOCOS, result);
        System.out.println(LINE);
    }

    private static void processArcTan(Scanner in, Numerics calculator){
        System.out.println("<<<ARCOTANGENTE>>>");
        System.out.println(LINE);
        System.out.print(TANG);
        double tan = digitNumber(in);
        in.nextLine();
        double result = calculator.tanh(tan);
        System.out.printf(ARCOTAN, result);
        System.out.println(LINE);
    }

    private static void processPITA(Scanner in, Numerics calculator){
        System.out.println("<<<PITÁGORAS>>>");
        System.out.println(LINE);
        System.out.print(BASE);
        double base = digitNumber(in);
        in.nextLine();
        System.out.print(HEIGHT);
        double height = digitNumber(in);
        in.nextLine();
        double result = calculator.pytaghoras(base, height);
        System.out.printf(PYTAGORAS, result);
        System.out.println(LINE);
    }
}