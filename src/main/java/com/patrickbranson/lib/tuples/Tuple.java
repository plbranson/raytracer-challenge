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

import com.patrickbranson.lib.Utilities;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * The Tuple for the Raytracer Challenge Project
 */
public abstract sealed class Tuple permits Color, Point, Vector {

    /**
     * The array of components
     */
    private final double[] components;

    /**
     * Constructor
     *
     * @param x the x-coordinate value
     * @param y the y-coordinate value
     * @param z the z-coordinate value
     * @param w the w-coordinate value
     */
    public Tuple(double x, double y, double z, double w) {
        this.components = new double[]{x, y, z, w};
    }

    /**
     * Overrides the {@link Object#toString()} function
     *
     * @return the String version of the Tuple
     */
    public abstract String toString();

    /**
     * Overrides the {@link Object#equals(Object)} function
     *
     * @param object the generic Object being compared
     * @return {@code true}  if the values are equal; otherwise, {@code false}
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Tuple tuple)) {
            return false;
        }

        return this.equals(tuple);
    }

    /**
     * Overrides the {@link Object#hashCode()} function
     *
     * @return the new hash code value
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(components);
    }

    /**
     * Determines if this Tuple and the secondary Tuple are equal
     *
     * @param tuple the secondary
     * @return {@code true}  if the values are equal; otherwise, {@code false}
     */
    private boolean equals(@NotNull Tuple tuple) {
        boolean x = Utilities.isAlmostEqual(this.components[0], tuple.getX());
        boolean y = Utilities.isAlmostEqual(this.components[1], tuple.getY());
        boolean z = Utilities.isAlmostEqual(this.components[2], tuple.getZ());
        boolean w = Utilities.isAlmostEqual(this.components[3], tuple.getW());
        return x && y && z && w;
    }

    /**
     * Gets the x-coordinate value
     *
     * @return the x-coordinate value
     */
    public final double getX() {
        return this.components[0];
    }

    /**
     * Sets the x-coordinate value
     *
     * @param x the x-coordinate value to set
     */
    public final void setX(double x) {
        this.components[0] = x;
    }

    /**
     * Gets the y-coordinate value
     *
     * @return the y-coordinate value
     */
    public final double getY() {
        return this.components[1];
    }

    /**
     * Sets the y-coordinate value
     *
     * @param y the y-coordinate value to set
     */
    public final void setY(double y) {
        this.components[1] = y;
    }

    /**
     * Gets the z-coordinate value
     *
     * @return the z-coordinate value
     */
    public final double getZ() {
        return this.components[2];
    }

    /**
     * Sets the z-coordinate value
     *
     * @param z the z-coordinate value to set
     */
    public final void setZ(double z) {
        this.components[2] = z;
    }

    /**
     * Gets the w-coordinate value
     *
     * @return the w-coordinate value
     */
    public final double getW() {
        return this.components[3];
    }

    /**
     * Sets the w-coordinate value
     *
     * @param w the w-coordinate value to set
     */
    public final void setW(double w) {
        this.components[3] = w;
    }
}
