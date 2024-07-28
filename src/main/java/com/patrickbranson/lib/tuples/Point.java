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

/**
 * Represents a Point in the Raytracer-Challenge
 *
 * @see com.patrickbranson.lib.tuples.Tuple
 */
public final class Point extends Tuple {

    /**
     * Default Constructor
     */
    public Point() {
        super(0, 0, 0, 1);
    }

    /**
     * Constructor
     *
     * @param x the x-coordinate value
     * @param y the y-coordinate value
     * @param z the z-coordinate value
     */
    public Point(double x, double y, double z) {
        super(x, y, z, 1);
    }

    /**
     * Calculates the sum of a Point and another Tuple
     *
     * @param tuple the secondary Tuple
     * @return the sum Point-Tuple
     */
    @Contract("_ -> new")
    public @NotNull Point addition(@NotNull Tuple tuple) {
        return new Point(this.getX() + tuple.getX(), this.getY() + tuple.getY(), this.getZ() + tuple.getZ());
    }

    /**
     * Calculates the difference between a Point and another Tuple
     *
     * @param tuple the secondary Tuple
     * @return the difference Vector-Tuple
     */
    @Contract("_ -> new")
    public @NotNull Vector subtraction(@NotNull Tuple tuple) {
        return new Vector(this.getX() - tuple.getX(), this.getY() - tuple.getY(), this.getZ() - tuple.getZ());
    }

    /**
     * Overrides the {@link Object#toString()} function
     *
     * @return the String version of the Point-Tuple
     */
    @Override
    public @NotNull String toString() {
        return "Point[x=" + this.getX() + " y=" + this.getY() + " z=" + this.getZ() + "]";
    }
}
