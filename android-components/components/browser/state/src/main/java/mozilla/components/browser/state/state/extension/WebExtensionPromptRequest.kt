/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.browser.state.state.extension

import mozilla.components.concept.engine.webextension.WebExtension

sealed class WebExtensionPromptRequest(
    open val extension: WebExtension,
) {

    data class Permissions(
        override val extension: WebExtension,
        val onConfirm: (Boolean) -> Unit,
    ) : WebExtensionPromptRequest(extension)
}