/*
 * Copyright (c) Facebook, Inc. and its affiliates.
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

package com.facebook.testing.screenshot.sample

import com.facebook.litho.Border
import com.facebook.litho.Column
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge

@LayoutSpec
object ExampleSpec {
  @OnCreateLayout
  fun onCreateLayout(c: ComponentContext): Component =
      Column.create(c)
          .child(ImageRow.create(c))
          .child(
              Text.create(c)
                  .textRes(R.string.large_text))
          .paddingDip(YogaEdge.ALL, 16f)
          .border(
              Border.create(c)
                  .colorRes(YogaEdge.ALL, R.color.colorPrimary)
                  .widthDip(YogaEdge.ALL, 8f)
                  .build())
          .build()
}
