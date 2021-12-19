package ru.netology.stats;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
  @Test
  void shouldCalculateSum() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 180;
    int actual = service.calculateSum(managerSales);
    assertEquals(expected, actual);
  }

  @Test
  void findAverage() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 15;
    int actual = service.findAverage(managerSales);
    assertEquals(expected, actual);
  }

  @Test
  void findMax() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 8;
    int actual = service.findMax(managerSales);
    assertEquals(expected, actual);
  }

  @Test
  void findMin() {
    StatsService service = new StatsService();
    long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 9;
    int actual = service.findMin(managerSales);
    assertEquals(expected, actual);

  }

  @Test
  void findLowerAverage() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 5;
    int actual = service.findLowerAverage(managerSales);
    assertEquals(expected, actual);
  }
  @Test
  void findUpperAverage() {
    StatsService service = new StatsService();
    int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 5;
    int actual = service.findUpperAverage(managerSales);
    assertEquals(expected, actual);
  }
}