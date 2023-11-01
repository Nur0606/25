import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------1
//        int[] msiv = {2, -4, 5, 7, 1, 9, -10};
//
//        for (int i = 0; i < msiv.length; i++) {
//            if (msiv[i] < 0) {
//                System.out.println("Первый отрицательный элемент: " + msiv[i]);
//                System.out.println("Порядковый номер: " + i);
//                break;
//            }
//        }
        //------------------------------------------------------2
//        int[] msiv = {2, 15, 7, 20, 5, 12, 30};
//        for (int i = 0; i < msiv.length; i++) {
//            if (msiv[i] >= 10) {
//                System.out.println("Номер элемента: " + i);
//            }
//        }
        //--------------------------------------------------------3
//        int[] temperatura = {-2, 3, -1, 5, 0, -4, 2};
//        int num = 0;
//        int tem = 0;
//        for (int i = 0; i < temperatura.length; i++) {
//            num += temperatura[i];
//            if (temperatura[i] < 0) {
//                tem++;
//            }
//        }
//        double srtem = (double) num / temperatura.length;
//        System.out.println("Средняя температура за неделю: " + srtem);
//        System.out.println("Количество дней с отрицательной температурой: " + tem);
        //---------------------------------------------------------4
//        int N = 7;
//        int[] masiv = {2, 3, 6, 7, 10, 11, 14};
//        int count = 0;
//        for (int i = 0; i < N; i += 2) {
//            if (masiv[i] % 2 != 0) {
//                count++;
//            }
//        }
//        System.out.println(": " + count);
        //-----------------------------------------------------------5
//        int[] masiv = {10, 8, 6, 4, 2};
//        boolean sravnivanie = true;
//        for (int i = 1; i < masiv.length; i++) {
//            if (masiv[i] >= masiv[i - 1]) {
//                sravnivanie = false;
//                break;
//            }
//        }
//        if (sravnivanie) {
//            System.out.println("является убывающей.");
//        } else {
//            System.out.println("не является убывающей.");
//        }
        //---------------------------------------------------------6
//        int[] masiv = {2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 8, 8, 9};
//        int kolpar = 0;
//        for (int i = 1; i < masiv.length; i++) {
//            if (masiv[i] == masiv[i - 1]) {
//                kolpar++;
//                i++;
//            }
//        }
//        System.out.println("kolichestvo sosednih par: " + kolpar);
        //-----------------------------------------------------------7
//        int[] masiv = {7, 2, 9, 4, 12, 5, 1};
//        int bolele = masiv[0];
//        int inbolele = 0;
//        for (int i = 1; i < masiv.length; i++) {
//            if (masiv[i] > bolele) {
//                bolele = masiv[i];
//                inbolele = i;
//            }
//        }
//        if (inbolele != 0) {
//            int mun = masiv[0];
//            masiv[0] = bolele;
//            masiv[inbolele] = mun;
//        }
//        for (int element : masiv) {
//            System.out.print(element + " ");
//        }
        //-----------------------------------------------8
//        int[][] array = {
//                {10, 5, 17, 8},
//                {9, 22, 6, 12},
//                {4, 18, 15, 7}};
//        int makcelement = array[0][0];
//        int stroka = 0;
//        int ctolba = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > makcelement) {
//                    makcelement = array[i][j];
//                    stroka = i;
//                    ctolba = j;
//                }
//            }
//        }
//        System.out.println("Наибольший элемент: " + makcelement);
//        System.out.println("Номер строки: " + stroka);
//        System.out.println("Номер столбца: " + ctolba);
//-----------------------------------------------------------9
//         int [][] masiv = {
//                {7,-2,-3,-4,-5,-6},
//                {-7,-8,-9,-7,-4,-22},
//                {-1,-2,-3,-5,12,-6}};
//        int fseg = 0;
//        int zah = 0;
//        for (int i = 0; i < masiv.length; i++) {
//            for (int j = 0; j < masiv[i].length; j++) {
//                if (masiv[i][j]>0){
//                    zah += masiv[i][j];
//                }
//                if (masiv[i][j] > 0) {
//                    fseg++;
//                }
//            }
//        }
//        int ks = zah/fseg;
//        System.out.println(fseg);
//        System.out.println(ks);
//        System.out.println(zah);
        //-----------------------------------10
        // несмог

       //-----------------------------------------11
//        int[][] maisv = {
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5}
//        };
//        for (int i = 0; i < maisv.length; i++) {
//            for (int j = 0; j < maisv[i].length; j++) {
//                if (i<=j){
//                    maisv[i][j]= 0;
//                }
//            }
//        }
//        for (int i = 0; i < maisv.length; i++) {
//            for (int j = 0; j < maisv[i].length; j++) {
//                System.out.print(maisv[i][j] +" ");
//            }
//            System.out.println();
//        }
       //------------------------------------------------- 12
//        int [] masiv = {1,2,3,4,5,6,7,8};
//        for (int i = 0; i < masiv.length; i++) {
//            for (int j = 0; j < 8; j++){
//                System.out.print(masiv[j]+ " " );
//            }
//            System.out.println();
//        }
//------------------------------------------------13
//        int[][] masiv = {
//                {234,52,2,52,25},
//                {32,735,36,856,3,6},
//                {52,59,825,84,34},
//        };
//        for (int i = 0; i < masiv.length - 1; i++) {
//            for (int j = 0; j < masiv.length - i - 1; j++) {
//                if (masiv[j][2] > masiv[j + 1][2]) {
//                    int[] sh = masiv[j];
//                    masiv[j] = masiv[j + 1];
//                    masiv[j + 1] = sh;
//                }
//            }
//        }
//        for (int[] trv : masiv) {
//            System.out.print(trv[2] + " ");
//        }
        //----------------------------------------14
//        int[][] masiv= {
//                {62,-98},
//                {25,26},
//                {53,66},
//                {99,100},
//                {9876,87}
//        };
//        for (int i = 0; i < masiv.length - 1; i++) {
//            for (int j = 0; j < masiv.length - i - 1; j++) {
//                if (masiv[j][1] > masiv[j + 1][1]) {
//                    int[] temp = masiv[j];
//                    masiv[j] = masiv[j + 1];
//                    masiv[j + 1] = temp;
//                }
//            }
//        }
//        for (int[] row : masiv) {
//            System.out.print(row[1] + " ");
//        }
        //------------------------------------------15
//        int[] a = {1, 2, 3};
//        int[][] b = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                b[i][j] = a[i] + a[j];
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }
        //----------------------------------------16

//непонятно
        //----------------------------------------17
//        int[][] matrix = {
//                {6,4,2,7},
//                {9,2,9,5},
//                {8,38,75,67},
//                {1, 2, 3, 4}
//        };
//        int maxElement = matrix[0][0];
//        int maxRow = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            if (matrix[i][i] > maxElement) {
//                maxElement = matrix[i][i];
//                maxRow = i;
//            }
//        }
//        System.out.println("Наибольший элемент на главной диагонали: " + maxElement);
//        System.out.print("Строка с наибольшим элементом: ");
//        for (int j = 0; j < matrix[maxRow].length; j++) {
//            System.out.print(matrix[maxRow][j] + " ");
//        }
        //---------------------------------18
//тоже

//-----------------------------------------19
//        Random random = new Random();
//        int[] masiv = new int[20];
//        for (int i = 0; i < 20; i++) {
//            masiv[i] = random.nextInt(0,99);
//        }
//        int hww = random.nextInt(0,99);
//        System.out.println("рандомное число");
//        for (int pdo:masiv) {
//            if (pdo%hww == 0) {
//                System.out.println(pdo);
//            }
//        }
//        System.out.println(Arrays.toString(masiv));
// =-------------------------------20
//        int min = 50;
//        int max = -50;
//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            int randomValue = random.nextInt(101) - 50;
//            if (randomValue < min) {
//                min = randomValue;
//            }
//            if (randomValue > max) {
//                max = randomValue;
//            }
//            System.out.println("Случайное число: " + randomValue);
//        }
//        System.out.println("Наименьшее число: " + min);
//        System.out.println("Наибольшее число: " + max);

//----------------------------------------21
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое положительное число a: ");
//        int a = scanner.nextInt();
//        while (a >= 0) {
//            System.out.print("Введите число для вычитания: ");
//            int number = scanner.nextInt();
//            a -= number;
//            if (a >= 0) {
//                System.out.println("Текущее значение a: " + a);
//            } else {
//                System.out.println("a стало отрицательным. Программа завершена.");
//            }
       // }
        //--------------------------------22
//        int [] masive = {3,8,2,5,8,4,2,6,9};
//        int max = masive[0];
//        for (int i = 0; i < masive.length-1; i++) {
//            if (masive[i] > max){
//            max = masive[i];            }}
//        System.out.println("Наибольшой Элемент:"+max);
        //-------------------------------------23
//        int [] masiv1 = {2,6,6,9,5,2,4,6,7};
//        int [] masiv2 = {8,5,3,6,8,7,4,4,7};
//        int [] masiv3 = new int[masiv1.length+masiv2.length];
//        int counter=0;
//        for (int i = 0; i < masiv1.length; i++) {
//            masiv3[i]=masiv1[i];
//            counter++;
//        }
//        for (int i = 0; i <masiv2.length ; i++) {
//            masiv3[counter++]=masiv2[i];
//        }
//        System.out.println(Arrays.toString(masiv3));
        //--------------------------------------24
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = (int) (Math.random() * 90) + 10;
//        }
//        int min = array[0];
//        for (int i = 1; i < size; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальное значение в массиве: " + min);
//        int half = size / 2;
//        System.out.println("Первая половина массива:");
//        for (int i = 0; i < half; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("\nВторая половина массива:");
//        for (int i = half; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
        //-----------------------------------25
//        int[] masiv = {1, 2, 3, 4, 5};
//        int newelementu = 6;
//        int[] itog = Arrays.copyOf(masiv, masiv.length + 1);
//        itog[itog.length - 1] = newelementu;
//        System.out.println("Исходный массив: " + Arrays.toString(masiv));
//        System.out.println("Новый массив: " + Arrays.toString(itog));

    }
    }
