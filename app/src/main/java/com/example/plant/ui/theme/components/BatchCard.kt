import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plant.R
import com.example.plant.data.model.GardenModel
import com.example.plant.ui.theme.components.CustomSpacer
import com.example.plant.ui.theme.containerColor
import com.example.plant.ui.theme.danger
import com.example.plant.ui.theme.lighter
import com.example.plant.ui.theme.primary
import com.example.plant.ui.theme.secondaryDarkOnLight
import com.example.plant.ui.theme.textColor

@Composable
fun BatchCard(
    batch: GardenModel,
    modifier: Modifier = Modifier
) {
    val bitmap = remember(batch.plant.photoUrl) {
        batch.plant.photoUrl?.let { base64ToBitmap(it) }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(containerColor)
            .padding(10.dp),
    ) {
        if (bitmap != null) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Plant Image",
                modifier = Modifier.size(100.dp)
            )
        } else {
            Image(
                painter = painterResource(R.drawable.image_2),
                contentDescription = "Default Plant Image",
                modifier = Modifier.size(125.dp)
            )
        }

        Text(
            text = batch.id.toString(),
            fontWeight = FontWeight.Bold
        )

        InfoRow("Plant:", batch.plant.name)
        InfoRow("Substrate:", batch.substrate)
        InfoRow("Status:", batch.status, statusColor(batch.status))
    }
}

@Composable
fun InfoRow(label: String, value: String, color: Color = textColor) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(text = label, fontSize = 14.sp, color = secondaryDarkOnLight)
        Text(text = value, fontSize = 14.sp, color = color)
    }
}

fun statusColor(status: String): Color {
    return when (status) {
        "Growing" -> primary
        "Issued" -> danger
        "Ready" -> lighter
        else -> textColor
    }
}

fun base64ToBitmap(base64String: String): Bitmap? {
    return try {
        val decodedBytes = Base64.decode(base64String, Base64.DEFAULT)
        BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
    } catch (e: IllegalArgumentException) {
        null
    }
}

