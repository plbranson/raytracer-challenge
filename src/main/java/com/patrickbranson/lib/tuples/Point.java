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

public final class Point extends Tuple {

    public Point(double x, double y, double z) {
        super(x, y, z, 1.0);
    }

    public @NotNull String toString() {
        return "Point[x=" + this.getX() + " y=" + this.getY() + " z=" + this.getZ() + " w=" + this.getW() + "]";
    }
}
