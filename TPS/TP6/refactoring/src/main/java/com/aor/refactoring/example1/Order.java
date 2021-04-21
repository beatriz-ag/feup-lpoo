package com.aor.refactoring.example1;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;
    private double totalPrice;

    public Order() {
        lines = new ArrayList<>();
        totalPrice = 0;
    }

    public void add(Product product, int quantity) {
        OrderLine order = new OrderLine(product,quantity);
        lines.add(order);
        totalPrice += order.getPrice();
    }

    public boolean isElegibleForFreeDelivery() {
        return (totalPrice > 100);
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line);


        printBuffer.append("Total: " + totalPrice);

        return printBuffer.toString();
    }
}