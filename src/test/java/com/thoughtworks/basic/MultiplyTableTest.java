package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTableTest {
    @Test
    public void should_generate_multiply_expression_given_multiplicand_and_multiplier() {
        //given
        int multiplicand = 1;
        int multiplier = 2;

        //when
        String expression = new MultiplyTable().generateExpression(multiplicand, multiplier);

        //then
        assertEquals("1*2=2\t", expression);
    }

    @Test
    public void should_generate_one_line_expression_given_line_start_and_end() {
        //given
        int start = 1;
        int end = 2;

        //when
        String line = new MultiplyTable().generateLine(start, end);

        //then
        assertEquals("1*2=2\t2*2=4", line);
    }

    @Test
    public void should_generate_all_lines_expression_given_multiply_table_start_and_end() {
        //given
        int start = 1;
        int end = 2;

        //when
        String lines = new MultiplyTable().generateAllLines(start, end);

        //then
        assertEquals("1*1=1\n1*2=2\t2*2=4", lines);
    }

    @Test
    public void should_return_true_given_start_and_end_which_are_in_range_and_start_smaller_than_end() {
        //given
        int start = 1;
        int end = 2;

        //when
        Boolean result = new MultiplyTable().isValid(start, end);

        //then
        assertTrue(result);
    }

    @Test
    public void should_return_false_given_start_and_end_which_are_in_range_and_start_greater_than_end() {
        //given
        int start = 2;
        int end = 1;

        //when
        Boolean result = new MultiplyTable().isValid(start, end);

        //then
        assertFalse(result);
    }

    @Test
    public void should_return_false_given_start_is_in_range_and_end_is_out_of_range() {
        //given
        int start = 1;
        int end = 1001;

        //when
        Boolean result = new MultiplyTable().isValid(start, end);

        //then
        assertFalse(result);
    }

    @Test
    public void should_return_false_given_both_start_and_end_are_out_of_range() {
        //given
        int start = -1;
        int end = 1001;

        //when
        Boolean result = new MultiplyTable().isValid(start, end);

        //then
        assertFalse(result);
    }
}
