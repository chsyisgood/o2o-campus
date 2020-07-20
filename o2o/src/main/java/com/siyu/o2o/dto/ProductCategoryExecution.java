package com.siyu.o2o.dto;

import com.siyu.o2o.enums.ProductCategoryStateEnum;
import java.util.List;

public class ProductCategoryExecution {

   private int state;
   private String stateInfo;
   private List productCategoryList;


   public ProductCategoryExecution() {}

   public ProductCategoryExecution(ProductCategoryStateEnum stateEnum) {
      this.state = stateEnum.getState();
      this.stateInfo = stateEnum.getStateInfo();
   }

   public ProductCategoryExecution(ProductCategoryStateEnum stateEnum, List productCategoryList) {
      this.state = stateEnum.getState();
      this.stateInfo = stateEnum.getStateInfo();
      this.productCategoryList = productCategoryList;
   }

   public int getState() {
      return this.state;
   }

   public void setState(int state) {
      this.state = state;
   }

   public String getStateInfo() {
      return this.stateInfo;
   }

   public void setStateInfo(String stateInfo) {
      this.stateInfo = stateInfo;
   }

   public List getProductCategoryList() {
      return this.productCategoryList;
   }

   public void setProductCategoryList(List productCategoryList) {
      this.productCategoryList = productCategoryList;
   }
}
