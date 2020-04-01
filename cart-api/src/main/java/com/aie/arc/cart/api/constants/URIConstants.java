package com.aie.arc.cart.api.constants;

public class URIConstants {

    // Cart URI.
    public static final String CREATE_CART_URI = "/api/v1/carts";
    public static final String UPDATE_CART_URI = "/api/v1/carts/:cartId";
    public static final String UPDATE_SELECTED_ADDRESS_URI = "/api/v1/carts/:cartId/shipment";
    public static final String UPDATE_SHIPPING_METHOD_URI = "/api/v1/carts/:cartId/ship-methods";
    public static final String UPDATE_PAYMENT_URI = "/api/v1/carts/:cartId/payments";
    public static final String MERGE_CART_URI = "/api/v1/carts/merge";
    public static final String GET_CART_URI = "/api/v1/carts/:cartId";
    public static final String REVIEW_CART_URI = "/api/v1/carts/:cartId/review";

    // Line Item URI.
    public static final String ADD_LINE_ITEM_URI = "/api/v1/carts/:type/items";
    public static final String ADD_ANONYMOUS_LINE_ITEM_URI = "/api/v1/carts/anonymous-items";
    public static final String REMOVE_LINE_ITEM_URI = "/api/v1/carts/:cartId/items/:lineItemId";
    public static final String CHANGE_LINE_ITEM_QUANTITY_URI = "/api/v1/carts/:cartId/items/:itemId";
    public static final String GET_LINE_ITEM_URI = "/api/v1/carts/:cartId/items/:lineItemId";


    // BOPIS Line Item URI.
    public static final String ADD_BOPIS_LINE_ITEM_URI = "/api/v1/carts/:cartId/bopis-items";
    public static final String REMOVE_BOPIS_LINE_ITEM_URI = "/api/v1/carts/:cartId/bopis-items/:lineItemId";
    public static final String CHANGE_BOPIS_LINE_ITEM_QUANTITY_URI = "/api/v1/carts/:cartId/bopis-items/:itemId";
    public static final String GET_BOPIS_LINE_ITEM_URI = "/api/v1/carts/:cartId/bopis-items/:lineItemId";
    //public static final String ADD_BOPIS_ANONYMOUS_LINE_ITEM_URI = "/api/v1/carts/item";


    // Cart Type URI.
    public static final String CREATE_CART_TYPE_URI = "/api/v1/cart-types";
    public static final String UPDATE_CART_TYPE_URI = "/api/v1/cart-types/:cartTypeId";
    public static final String GET_CART_TYPE_URI = "/api/v1/cart-types/:cartTypeId";
    public static final String GET_ALL_CART_TYPES_URI = "/api/v1/cart-types";
    public static final String DELETE_CART_TYPE_URI = "/api/v1/cart-types";

    // Line Item URI.
    public static final String SET_LINE_ITEM_SHIPPING_DETAILS_URI = "/api/v1/carts/:cartId/multi-shipment";

    public static final String ADD_PAYMENT_METHOD_URI = "/api/v1/carts/:cartId/payments";
    public static final String UPDATE_PAYMENT_METHOD_URI = "/api/v1/carts/payments/:paymentMethodId";
    public static final String GET_ALL_PAYMENT_METHODS_URI = "/api/v1/carts/payment-methods";
    public static final String GET_PAYMENT_METHOD_URI = "/api/v1/carts/payments/:paymentMethodId";
    public static final String DELETE_PAYMENT_METHOD_URI = "/api/v1/carts/payments";

    public static final String GENERATE_PRODUCT_DISCOUNT_URI = "/api/v1/carts/product/discount";
    public static final String GENERATE_PRODUCT_PRICE_URI = "/api/v1/carts/product/price";
    public static final String DELETE_ROWS_PRICE_URI = "/api/v1/deleteRows";


    public static final String PRODUCT_DISCOUNT_CREATED_MESSAGE = "Product Discount table created!";
    public static final String PRODUCT_PRICE_CREATED_MESSAGE = "Product price table created!";
    public static final String ROWS_DELETED_MESSAGE = "Rows from finalPrice and discountedPrice table deleted!";

    public static final String CART_CREATED_MESSAGE = "Cart Created!";
    //public static final String CART_UPDATED_MESSAGE = "Cart Updated!";
    public static final String CART_MERGED_MESSAGE = "Cart Merged!";
    public static final String SELECTED_ADDRESS_UPDATED_MESSAGE = "Selected Address Updated!";
    public static final String SELECTED_PAYMENT_UPDATED_MESSAGE = "Selected Payment Updated!";
    public static final String SHIPPING_METHOD_UPDATED_MESSAGE = "Shipping Method Updated!";
    public static final String LOCALE_UPDATED_MESSAGE = "Locale Updated!";
    public static final String SELECTED_ADDRESS_FAILURE_MESSAGE = "Failed to set Selected Address in Cart!";
    public static final String SELECTED_PAYMENT_FAILURE_MESSAGE = "Failed to set Selected Payment in Cart!";
    public static final String SHIPPING_METHOD_FAILURE_MESSAGE = "Failed to add Shipping Method in Cart!";


    public static final String LINE_ITEM_ADDED_MESSAGE = "Line Item Added!";
    public static final String LINE_ITEM_FAILURE_MESSAGE = "Failed to add line item!";
    public static final String LINE_ITEM_REMOVED_MESSAGE = "Line Item Removed!";
    public static final String LINE_ITEM_QUANTITY_CHANGED_MESSAGE = "Line Item Quantity Changed!";
    public static final String LINE_ITEM_QUANTITY_CHANGE_FAILED_MESSAGE = "Failed to update line item quantity";

    public static final String CART_TYPE_CREATED_MESSAGE = "Cart Type Created!";
    public static final String CART_TYPE_UPDATED_MESSAGE = "Cart Type Updated!";
    public static final String CART_TYPE_DELETED_MESSAGE = "Cart Type Removed!";

    public static final String PAYMENT_METHOD_CREATED_MESSAGE = "Payment Method Created!";
    public static final String PAYMENT_METHOD_UPDATED_MESSAGE = "Payment Method Updated!";
    public static final String PAYMENT_METHOD_DELETED_MESSAGE = "Payment Method Removed!";

    public static final String LINE_ITEM_SHIPPING_DETAILS_CREATED_MESSAGE = "Line Item Shipping Details Created!";
    public static final String QUANTITY_SHIPPING_DETAILS_UPDATED_MESSAGE = "Quantity in Line Item Shipping Details Updated!";

}