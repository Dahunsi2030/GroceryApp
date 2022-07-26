/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session_2.groceryapp;

/**
 *
 * @author USER
 */
public class GroceryApp {

    // DECLARING MEMBER VARIABLES
    double riceQty;
    double spaQty;
    double psQty;
    double padQty;
    double bevQty;
    double lapQty;

    double riceUP;
    double spaUP;
    double psUP;
    double padUP;
    double bevUP;
    double lapUP;

    // GENERATING CONSTRUCTOR
    public GroceryApp(double riceQty, double spaQty, double psQty, double padQty, double bevQty, double lapQty, double riceUP, double spaUP, double psUP, double padUP, double bevUP, double lapUP) {
        this.riceQty = riceQty;
        this.spaQty = spaQty;
        this.psQty = psQty;
        this.padQty = padQty;
        this.bevQty = bevQty;
        this.lapQty = lapQty;
        this.riceUP = riceUP;
        this.spaUP = spaUP;
        this.psUP = psUP;
        this.padUP = padUP;
        this.bevUP = bevUP;
        this.lapUP = lapUP;
    }

    // GETTERS
    public double getRiceQty() {
        return riceQty;
    }

    public double getSpaQty() {
        return spaQty;
    }

    public double getPsQty() {
        return psQty;
    }

    public double getPadQty() {
        return padQty;
    }

    public double getBevQty() {
        return bevQty;
    }

    public double getLapQty() {
        return lapQty;
    }

    public double getRiceUP() {
        return riceUP;
    }

    public double getSpaUP() {
        return spaUP;
    }

    public double getPsUP() {
        return psUP;
    }

    public double getPadUP() {
        return padUP;
    }

    public double getBevUP() {
        return bevUP;
    }

    public double getLapUP() {
        return lapUP;
    }

    // SETTERS
    public void setRiceQty(double riceQty) {
        this.riceQty = riceQty;
    }

    public void setSpaQty(double spaQty) {
        this.spaQty = spaQty;
    }

    public void setPsQty(double psQty) {
        this.psQty = psQty;
    }

    public void setPadQty(double padQty) {
        this.padQty = padQty;
    }

    public void setBevQty(double bevQty) {
        this.bevQty = bevQty;
    }

    public void setLapQty(double lapQty) {
        this.lapQty = lapQty;
    }

    public void setRiceUP(double riceUP) {
        this.riceUP = riceUP;
    }

    public void setSpaUP(double spaUP) {
        this.spaUP = spaUP;
    }

    public void setPsUP(double psUP) {
        this.psUP = psUP;
    }

    public void setPadUP(double padUP) {
        this.padUP = padUP;
    }

    public void setBevUP(double bevUP) {
        this.bevUP = bevUP;
    }

    public void setLapUP(double lapUP) {
        this.lapUP = lapUP;
    }

    public double riceAmount() {
        return getRiceQty() * getRiceUP();
    }

    public double spaAmount() {
        return getSpaQty() * getSpaUP();
    }

    public double psAmount() {
        return getPsQty() * getPsUP();
    }

    public double padAmount() {
        return getPadQty() * getPadUP();
    }

    public double bevAmount() {
        return getBevQty() * getBevUP();
    }

    public double lapAmount() {
        return getLapQty() * getLapUP();
    }

}
