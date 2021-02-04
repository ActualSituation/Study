package org.hdcd.mapper;

import org.apache.ibatis.annotations.Param;
import org.hdcd.domain.Item;

import java.util.List;

public interface ItemMapper {

    public void create(Item item) throws Exception;

    public Item read(Integer itemId) throws Exception;

    public void update(Item item) throws Exception;

    public void delete(Integer itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Integer itemId) throws Exception;

    public void addAttach(String fullName) throws Exception;

    public List<String> getAttach(Integer itemId) throws Exception;

    public void deleteAttach(Integer itemId) throws Exception;

    public void replaceAttach(@Param("fullName") String fullName, @Param("itemId") Integer itemId) throws Exception;

}
