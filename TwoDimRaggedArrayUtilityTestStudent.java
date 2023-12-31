import static org.junit.Assert.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.*;



import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;



class TwoDimRaggedArrayUtilityTestStudent {

double[][] dataSet1 =

{{8,5,2,7,1},

{4,5},

{6,7,8,9}};

double[][] dataSet2 =

{{3,6,2},

{4,5,8,9},

{3,7, 3}};

File output = new File("writeDataSet.txt");



@BeforeEach

void setUp() throws Exception {

}



@AfterEach

void tearDown() throws Exception {

}

@Test

public void testReadFile() throws IOException

{

TwoDimRaggedArrayUtility.writeToFile(dataSet1, output);

double [][] arr = TwoDimRaggedArrayUtility.readFile(output);

assertArrayEquals("The data from both files should be equal", dataSet1, arr);

}

@Test

public void testWriteFile() throws IOException

{

TwoDimRaggedArrayUtility.writeToFile(dataSet2, output);

double [][] arr = TwoDimRaggedArrayUtility.readFile(output);

assertArrayEquals("The data from both files should be equal", dataSet2, arr);

}



@Test

void testGetTotal() {

assertEquals(TwoDimRaggedArrayUtility.getTotal(dataSet1), 62);

}



@Test

void testGetAverage() {

assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSet1), (62.0/11));

}



@Test

void testGetRowTotal() {

assertEquals(TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), 23);

}



@Test

void testGetColumnTotal() {

assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), 10);

}



@Test

void testGetHighestInRow() {

assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), 9);

}



@Test

void testGetHighestInRowIndex() {

assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2), 3);

}



@Test

void testGetLowestInRow() {

assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), 1);

}



@Test

void testGetLowestInRowIndex() {

assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0), 4);

}



@Test

void testGetHighestInColumn() {

assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 3), 9);

}



@Test

void testGetHighestInColumnIndex() {

assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 3), 2);

}



@Test

void testGetLowestInColumn() {

assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), 4);

}



@Test

void testGetLowestInColumnIndex() {

assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0), 1);

}



@Test

void testGetHighestInArray() {

assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 9);

}



@Test

void testGetLowestInArray() {

assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 1);

}



}