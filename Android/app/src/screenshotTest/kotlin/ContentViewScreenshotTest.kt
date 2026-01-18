package my.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest
import skip.ui.Binding
import skip.ui.ComposeContext
import androidx.compose.ui.platform.LocalContext
import skip.foundation.ProcessInfo

/**
 * Screenshot tests for ContentView composables.
 *
 * These tests use the Compose Preview Screenshot Testing tool to verify UI appearance.
 * See: https://developer.android.com/studio/preview/compose-screenshot-testing
 *
 * To generate reference images, run:
 *   gradle -Pandroid.experimental.enableScreenshotTest=true updateDebugScreenshotTest
 *
 * To validate screenshots against references, run:
 *   gradle -Pandroid.experimental.enableScreenshotTest=true validateDebugScreenshotTest
 *
 * WelcomeView is a SwiftUI view transpiled by Skip. It is rendered from Compose using
 * the same pattern as Main.kt: view.Compose(context = ComposeContext()).
 * See: https://skip.tools/docs/modules/skip-ui/#composeview
 */
@PreviewTest
@Preview(showBackground = true)
@Composable
fun WelcomeViewPreview() {
    ProcessInfo.launch(LocalContext.current)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        WelcomeView(welcomeName = Binding.constant("Skipper"))
            .Compose(context = ComposeContext())
    }
}
