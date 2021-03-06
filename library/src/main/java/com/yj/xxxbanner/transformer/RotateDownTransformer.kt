/*
 * Copyright 2014 Toxic Bakery
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yj.xxxbanner.transformer

import android.view.View

class RotateDownTransformer : ABaseTransformer(true) {



    override fun onTransform(view: View, position: Float) {
        val width = view.width.toFloat()
        val height = view.height.toFloat()
        val rotation = ROT_MOD * position * -1.25f

        view.pivotX = width * 0.5f
        view.pivotY = height
        view.rotation = rotation
    }

    companion object {

        private val ROT_MOD = -15f
    }

}
