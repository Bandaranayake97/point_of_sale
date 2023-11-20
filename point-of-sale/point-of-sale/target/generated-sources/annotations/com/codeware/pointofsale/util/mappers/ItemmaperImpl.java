package com.codeware.pointofsale.util.mappers;

import com.codeware.pointofsale.Dto.Responce.ItemsResponce;
import com.codeware.pointofsale.Entity.Items;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-06T07:03:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ItemmaperImpl implements Itemmaper {

    @Override
    public List<ItemsResponce> entityListToDtoList(List<Items> items) {
        if ( items == null ) {
            return null;
        }

        List<ItemsResponce> list = new ArrayList<ItemsResponce>( items.size() );
        for ( Items items1 : items ) {
            list.add( itemsToItemsResponce( items1 ) );
        }

        return list;
    }

    protected ItemsResponce itemsToItemsResponce(Items items) {
        if ( items == null ) {
            return null;
        }

        ItemsResponce itemsResponce = new ItemsResponce();

        itemsResponce.setItemId( items.getItemId() );
        itemsResponce.setItemsName( items.getItemsName() );
        itemsResponce.setBalanceQty( items.getBalanceQty() );
        itemsResponce.setSellingPrice( items.getSellingPrice() );
        itemsResponce.setActive( items.isActive() );

        return itemsResponce;
    }
}
