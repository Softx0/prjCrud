package com.mycompany.prjcrud.entities;

import com.mycompany.prjcrud.entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-17T23:43:48")
@StaticMetamodel(ProductCode.class)
public class ProductCode_ { 

    public static volatile SingularAttribute<ProductCode, String> prodCode;
    public static volatile SingularAttribute<ProductCode, Character> discountCode;
    public static volatile SingularAttribute<ProductCode, String> description;
    public static volatile ListAttribute<ProductCode, Product> productList;

}