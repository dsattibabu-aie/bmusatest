package com.aie.arc.cart.impl.constants;

public interface DbTable {
    interface CartType {
        String NAME = "cart_type";

        interface Column {
            String CODE = "code";
            String NAME = "name";
            String ACTIVE = "active";

        }
    }

    interface PaymentMethod {
        String NAME = "payment_method";

        interface Column {
            String ID = "id";
            String CART_ID = "cart_id";
            String PAYMENT_TYPE_ID = "payment_type_id";
            String CVV = "cvv";
            String ACTIVE = "active";

        }
    }

    interface PaymentType {
        String NAME = "payment_type";

        interface Column {
            String ID = "id";
            String CARD_NAME = "card_name";
            String CARD_NUMBER = "card_number";
            String BILLING_ADDRESS_ID = "billing_address_id";
            String CUSTOMER_ID = "customer_id";
            String EXPIRY_DATE = "expiry_date";


        }
    }

    interface ProductDiscount {
        String NAME = "product_discount";

        interface Column {
            String ID = "id";
            String CODE = "code";
            String NAME = "name";
            String DESCRIPTION = "description";
            String PRODUCT_VARIANT_IDS = "product_variant_ids";
            String DISCOUNT_VALUE = "discount_value";
            String ACTIVE = "active";
            String VALID_FROM = "valid_from";
            String VALID_TO = "valid_to";


        }
    }
}
