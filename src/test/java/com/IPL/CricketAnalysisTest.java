package com.IPL;

import org.junit.Assert;
import org.junit.Test;
import com.google.gson.Gson;
import model.*;

public class CricketAnalysisTest {
    CricketAnalysis cricketAnalysis;
    public static String PATH_OF_CSV_FILE = "C:\\Users\\abhij\\eclipse-workspace\\IPLLeagueAnalyser\\src\\main\\java\\resources\\MostRunsData.csv";
   
    @Test
    public void givenTheCSVFile_WhenNoOfRecordMatch_ShouldReturnTrue() {
        try {
            int noOfRecords = cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            Assert.assertEquals(100, noOfRecords);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnBestBattingAverage(){
       try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.getAverageWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            double runs = censusCsv[0].Avg;
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("MS Dhoni", name);
        } catch (Exception e) {
        }
    }
    
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnSortedStrikeRate() {
        try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.getStrikerateWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            double runs = censusCsv[0].SR;
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("Ishant Sharma", name);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnSortedFours() {
        try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.getFoursWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            String runs = censusCsv[0].fours;
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("Shikhar Dhawan", name);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnSortedSixes() {
        try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.getSixesWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            String runs = censusCsv[0].sixs;
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("Andre Russell", name);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnSortedStrikeRateWithFoursAndSixes() {
        try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.get4sn6sWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            double runs = censusCsv[0].SR;
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("Ishant Sharma", name);
        } catch (Exception e) {
        }
    }
    @Test
    public void givenCricketData_WhenSorted_ShouldReturnSortedAverageWithBestSR() {
        try {
            cricketAnalysis.loadData(PATH_OF_CSV_FILE);
            String sortedCensusData = cricketAnalysis.getAverageWithBestSRWiseSorted();
            IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
            String name = censusCsv[0].getPLAYER();
            Assert.assertEquals("MS Dhoni", name);
        } catch (Exception e) {
        }
    }
}
