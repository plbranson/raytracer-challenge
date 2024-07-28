/*
 * Copyright 2024 Patrick L. Branson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.patrickbranson.lib.tuples;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

// TODO: Add Comments

/**
 * Represents a Vector in the Raytracer-Challenge
 *
 * @see com.patrickbranson.lib.tuples.Tuple
 */
public final class Vector extends Tuple {

    /**
     * Default Constructor
     */
    public Vector() {
        super(0, 0, 0, 0);
    }

    /**
     * Constructor
     *
     * @param x the x-coordinate value
     * @param y the y-coordinate value
     * @param z the z-coordinate value
     */
    public Vector(double x, double y, double z) {
        super(x, y, z, 0);
    }

    @Contract(" -> new")
    public @NotNull Vector negation() {
        return new Vector(this.getX() * -1, this.getY() * -1, this.getZ() * -1);
    }

    @Contract("_ -> new")
    public @NotNull Vector addition(@NotNull Tuple tuple) {
        return new Vector(this.getX() + tuple.getX(), this.getY() + tuple.getY(), this.getZ() + tuple.getZ());
    }

    @Contract("_ -> new")
    public @NotNull Vector subtraction(@NotNull Tuple tuple) {
        return new Vector(this.getX() - tuple.getX(), this.getY() - tuple.getY(), this.getZ() - tuple.getZ());
    }

    @Contract("_ -> new")
    public @NotNull Vector multiplication(double value) {
        return new Vector(this.getX() * value, this.getY() * value, this.getZ() * value);
    }

    public @NotNull Vector division(double value) {
        assert value != 0 : "Assertion: Division By Zero!";
        return this.multiplication(1 / value);
    }

    public double length() {
        return Math.sqrt(this.dotProduct(this));
    }

    public double dotProduct(@NotNull Vector vector) {
        return (this.getX() * vector.getX()) + (this.getY() * vector.getY()) + (this.getZ() * vector.getZ());
    }

    @Contract("_ -> new")
    public @NotNull Vector crossProduct(@NotNull Vector vector) {
        var x = (this.getY() * vector.getZ()) - (this.getZ() * vector.getY());
        var y = (this.getZ() * vector.getX()) - (this.getX() * vector.getZ());
        var z = (this.getX() * vector.getY()) - (this.getY() * vector.getX());
        return new Vector(x, y, z);
    }

    public Vector normalize() {
        var length = this.length();
        if (length == 0 || length == 1) return this;
        return new Vector(this.getX() / length, this.getY() / length, this.getZ() / length);
    }


    @Contract("_ -> new")
    public @NotNull Vector reflection(@NotNull Vector vector) {
        return this.subtraction(vector.multiplication(this.dotProduct(vector) * 2));
    }

    /**
     * Overrides the {@link Object#toString()} function
     *
     * @return the String version of the Vector-Tuple
     */
    @Override
    public @NotNull String toString() {
        return "Vector[x=" + this.getX() + " y=" + this.getY() + " z=" + this.getZ() + "]";
    }
}
