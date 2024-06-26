/**
 * Backpack for Android - Skyscanner's Design System
 *
 * Copyright 2018 Skyscanner Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.skyscanner.backpack.compose.sectionheader

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import net.skyscanner.backpack.compose.BpkSnapshotTest
import net.skyscanner.backpack.compose.theme.BpkTheme
import net.skyscanner.backpack.demo.R
import org.junit.Test

class BpkSectionHeaderTest : BpkSnapshotTest() {

    @Test
    fun default() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.canvas),
            title = stringResource(R.string.section_header_title),
        )
    }

    @Test
    fun defaultWithDescription() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.canvas),
            title = stringResource(R.string.section_header_title),
            description = stringResource(R.string.section_header_description),
        )
    }

    @Test
    fun defaultWithButton() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.canvas),
            title = stringResource(R.string.section_header_title),
            button = BpkSectionHeaderButton(
                text = stringResource(R.string.section_header_button_text),
                onClick = {},
            ),
        )
    }

    @Test
    fun defaultWithDescriptionAndButton() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.canvas),
            title = stringResource(R.string.section_header_title),
            description = stringResource(R.string.section_header_description),
            button = BpkSectionHeaderButton(
                text = stringResource(R.string.section_header_button_text),
                onClick = {},
            ),
        )
    }

    @Test
    fun onDark() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.surfaceContrast),
            title = stringResource(R.string.section_header_title),
            type = BpkSectionHeaderType.OnDark,
        )
    }

    @Test
    fun onDarkWithDescription() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.surfaceContrast),
            title = stringResource(R.string.section_header_title),
            description = stringResource(R.string.section_header_description),
            type = BpkSectionHeaderType.OnDark,
        )
    }

    @Test
    fun onDarkWithButton() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.surfaceContrast),
            title = stringResource(R.string.section_header_title),
            button = BpkSectionHeaderButton(
                text = stringResource(R.string.section_header_button_text),
                onClick = {},
            ),
            type = BpkSectionHeaderType.OnDark,
        )
    }

    @Test
    fun onDarkWithDescriptionAndButton() = snap {
        BpkSectionHeader(
            modifier = Modifier.background(BpkTheme.colors.surfaceContrast),
            title = stringResource(R.string.section_header_title),
            description = stringResource(R.string.section_header_description),
            button = BpkSectionHeaderButton(
                text = stringResource(R.string.section_header_button_text),
                onClick = {},
            ),
            type = BpkSectionHeaderType.OnDark,
        )
    }
}
