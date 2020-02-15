package com.target.dealbrowserpoc.dealbrowser.deals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.target.dealbrowserpoc.dealbrowser.R;

public class DealContent {

    public static List<DealItem> ITEMS = new ArrayList<DealItem>();

    public static Map<String, DealItem> ITEM_MAP = new HashMap<String, DealItem>();

    /* Hard-coded array of products. I need to get these from the service. */
    static {
        addItem(new DealItem(0,"16776690", "I‘m With Cupid Graphic Tee", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis eget metus id arcu auctor consectetur. Donec vestibulum, justo ut bibendum blandit, tellus nisi laoreet dolor, eget tempor sapien est eu enim. Pellentesque finibus risus ut lacus tristique pulvinar.", "$12.99", "$9.99", R.drawable.image_16776690, "a1"));
        addItem(new DealItem(1,"16625608", "Lace Trim Tiered Cami Black - Xhilaration®", "Phasellus condimentum metus id lectus tempor faucibus. Curabitur bibendum est et sem pretium tempus. Sed posuere risus at faucibus eleifend.", "$17.99", "$10.99", R.drawable.image_16625608, "b2"));
        addItem(new DealItem(2,"16607030", "Pokémon Lightning Strike Throw - 46\" x 60\"", "Suspendisse potenti. Nulla sed massa vel velit ultricies tempus ac nec felis. Nulla urna urna, malesuada a ligula vel, molestie fringilla diam.", "$14.99", "$3.99", R.drawable.image_16607030, "c3"));
        addItem(new DealItem(3,"16250391", "Dickies® Men's Quilted Shirt Jacket - Black S", "Ut tincidunt justo sed malesuada ultrices. Cras posuere velit at sapien venenatis porta non vitae nibh. In dapibus cursus magna, sed commodo elit sollicitudin quis.", "$39.99", "$27.98", R.drawable.image_16250391, "d4"));
        addItem(new DealItem(4,"15629893", "Mustache Ice Cube Tray", "Curabitur est tortor, varius in est dapibus, pharetra iaculis leo. Sed auctor ut lorem sed tristique. Vestibulum ac pretium ligula. Fusce vel felis id turpis sodales iaculis sit amet at massa.", "$7.99", "$4.78", R.drawable.image_15629893, "e5"));
        addItem(new DealItem(5,"16185659", "Threshold™ Floral Stencil Decorative Pillow - Grey (Oblong)", "Morbi ut condimentum ante, vitae fermentum mi. Quisque vel dolor nulla. In id metus non eros venenatis rhoncus.", "$24.99", "$12.48", R.drawable.image_16185659, "f6"));
        addItem(new DealItem(6,"16710655", "Christmas Santa Cat Men's T-Shirt", "Quisque vehicula convallis metus, quis sollicitudin mauris ultricies nec. Quisque sollicitudin pellentesque massa vitae rutrum. Proin tincidunt magna eget dolor placerat, vitae placerat risus auctor.", "$14.99", "$7.98", R.drawable.image_16710655, "g7"));
        addItem(new DealItem(7,"15629906", "Men's Grooming Set", "Maecenas a mattis nunc. Phasellus commodo nibh at cursus elementum. Suspendisse eleifend est est, sit amet pulvinar dui efficitur eget. Mauris quis odio scelerisque ligula consectetur luctus id a nunc.", "$12.99", "$7.78", R.drawable.image_15629906, "h8"));
        addItem(new DealItem(8,"16710656", "Star Wars Darth Vader Men's Sweater", "Nam sit amet elit eget turpis gravida vestibulum. Nulla facilisi. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque consectetur, ex sollicitudin fermentum bibendum, risus turpis malesuada mi, sed vehicula neque leo a quam.", "$29.99", "$20.98", R.drawable.image_16710656, "i9"));
        addItem(new DealItem(9,"16200413", "Every Man Jack Cedarwood Grooming Kit", "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Quisque vel sem dapibus, pharetra tortor in, sodales leo. Aliquam erat volutpat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", "$14.99", "$12.74", R.drawable.image_16200413, "r2"));
    }

    private static void addItem(DealItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
}
