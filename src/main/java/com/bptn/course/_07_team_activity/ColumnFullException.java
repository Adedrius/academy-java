package com.bptn.course._07_team_activity;

/* 
 * A custom exception for when a column is full.
 * This can help with handling erroneous behaviour.
 */
 
 public class ColumnFullException extends ArrayIndexOutOfBoundsException {

    public ColumnFullException(String errMessage) {
        super(errMessage);
    }
}