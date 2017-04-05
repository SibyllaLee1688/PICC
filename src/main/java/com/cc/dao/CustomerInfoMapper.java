package com.cc.dao;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.CustomerInfoExample;

import java.util.HashMap;
import java.util.List;

import com.cc.pojo.Page;
import com.cc.pojo.UseridAndPageInfo;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoMapper {
    int countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(CustomerInfo record);
    CustomerInfo getOneCustomer(Integer id);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);
    List<CustomerInfo> getCustomerList(Page page);
    List<CustomerInfo> getCustomer20();
    List<CustomerInfo> getAllCustomerList();
    void updateCustomerStatus(Integer status,String customer_id);
    List<CustomerInfo> getAllCustomerListFromStatusTable(String user_id);
    List<CustomerInfo> getCustomerListFromStatusTable(UseridAndPageInfo useridAndPageInfo);

    CustomerInfo selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}