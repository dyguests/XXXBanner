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

class FlipVerticalTransformer : ABaseTransformer(false) {

    override fun onTransform(view: View, position: Float) {
        val rotation = -180f * position

        view.alpha = if (rotation > 90f || rotation < -90f) 0f else 1f
        view.pivotX = view.width * 0.5f
        view.pivotY = view.height * 0.5f
        view.rotationX = rotation
    }

    override fun onPostTransform(page: View, position: Float) {
        super.onPostTransform(page, position)

        if (position > -0.5f && position < 0.5f) {
            page.visibility = View.VISIBLE
        } else {
            page.visibility = View.INVISIBLE
        }
    }
}
