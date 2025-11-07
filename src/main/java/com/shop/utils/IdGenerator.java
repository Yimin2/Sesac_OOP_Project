package com.shop.utils;

public class IdGenerator {
  private static IdGenerator instance;  // 싱글톤 인스턴스
  private int productIdCounter;         // 상품 ID 카운터
  private int orderIdCounter;            // 주문 ID 카운터


  private IdGenerator() {
    this.productIdCounter = 1;
    this.orderIdCounter = 1;
  }
  //싱글톤 인스턴스 반환
  //instance가 null이면 새로 생성
  public static IdGenerator getInstance() {
    if(instance == null) {
      instance = new IdGenerator();

    }
    return instance;
  }


  //"P1", "P2", "P3" 형식으로 생성
  // return "P" + productIdCounter++;
  public String generateProductId(){
    return "P" + productIdCounter++;
  }


  //"O1", "O2", "O3" 형식으로 생성
  //return "O" + orderIdCounter++;
  public String generateOrderId(){
    return "O" + orderIdCounter++;
  }
}
