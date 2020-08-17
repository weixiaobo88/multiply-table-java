package com.thoughtworks.basic;

class MultiplyTable {
    String generateExpression(int multiplicand, int multiplier) {
        String separator = multiplicand == multiplier ? "" : "\t";

        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier + separator;
    }

    String generateLine(int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int index = start; index <= end; index++) {
            result.append(generateExpression(index, end));
        }

        return result.toString();
    }

    String generateAllLines(int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int index = start; index <= end; index++) {
            String lineSeparator = index == end ? "" : "\n";

            result.append(generateLine(start, index))
                    .append(lineSeparator);
        }

        return result.toString();
    }

    Boolean isValid(int start, int end) {
        int MIN = 1;
        int MAX = 1000;
        return start <= end && start >= MIN && end <= MAX;
    }
}
