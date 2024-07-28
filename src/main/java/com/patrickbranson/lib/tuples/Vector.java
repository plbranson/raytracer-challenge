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

import org.jetbrains.annotations.NotNull;

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

    /**
     * Overrides the {@link Object#toString()} function
     *
     * @return the String version of the Vector-Tuple
     */
    public @NotNull String toString() {
        return "Vector[x=" + this.getX() + " y=" + this.getY() + " z=" + this.getZ() + "]";
    }
}
