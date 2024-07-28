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

package com.patrickbranson;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private Main() {
        super.setTitle("Raytracer-Challenge");
        super.setLocationRelativeTo(null);
        super.setPreferredSize(new Dimension(500, 500));
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
           var main = new Main();
           main.setVisible(true);
           main.pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}