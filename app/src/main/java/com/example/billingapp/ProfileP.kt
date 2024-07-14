package com.example.billingapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProfileP {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyProfile(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp, y = 80.dp)
                    .fillMaxWidth()
                    .requiredHeight(height = 178.dp)
                    .background(color = Color(0xDDFF6B00)) // Replace with your desired solid color
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 80.dp)
                    .background(color = Color(0xffff6b00)))

            val containerColor = Color(0xffc4c4c4)
            OutlinedTextField(
                value = "Divine",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = containerColor,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 379.dp
                    )
                    .requiredWidth(width = 318.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(8.dp)))
            val containerColor1 = Color(0xffc4c4c4)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor1,
                    unfocusedContainerColor = containerColor1,
                    disabledContainerColor = containerColor1,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 461.dp
                    )
                    .requiredWidth(width = 318.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(8.dp)))
            val containerColor2 = Color(0xffc4c4c4)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor2,
                    unfocusedContainerColor = containerColor2,
                    disabledContainerColor = containerColor2,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 543.dp
                    )
                    .requiredWidth(width = 318.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(8.dp)))
            val containerColor3 = Color(0xffc4c4c4)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor3,
                    unfocusedContainerColor = containerColor3,
                    disabledContainerColor = containerColor3,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 625.dp
                    )
                    .requiredWidth(width = 318.dp)
                    .requiredHeight(height = 50.dp)
                    .clip(shape = RoundedCornerShape(8.dp)))
            Text(
                text = "Username",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 356.dp
                    ))
            Text(
                text = "Email I’d",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 438.dp
                    ))
            Text(
                text = "Phone Number",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 517.dp
                    ))
            Text(
                text = "GSTn Number",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 602.dp
                    ))
           /////////////////////////

            Text(
                textAlign = TextAlign.Center,
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color.Black,
                        fontSize = 12.sp)) {append("Developed by ")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff0057ff),
                        fontSize = 12.sp)) {append("Innov8")}
                    withStyle(style = SpanStyle(
                        color = Color(0xffff8a00),
                        fontSize = 12.sp)) {append("Apps")}},
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 10.5.dp,
                        y = 834.dp
                    )
                    .requiredWidth(width = 319.dp)
                    .requiredHeight(height = 23.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            TextButton(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 21.dp,
                        y = 703.dp
                    )
                    .requiredWidth(width = 348.dp)
                    .requiredHeight(height = 56.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 348.dp)
                        .requiredHeight(height = 56.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 348.dp)
                            .requiredHeight(height = 56.dp)
                            .clip(shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
                            .background(
                                brush = Brush.radialGradient(
                                    0f to Color(0xffff8c00),
                                    1f to Color(0xffff723f),
                                    center = Offset(170.21f, 28f),
                                    radius = 170.21f
                                )
                            ))
                    Text(
                        text = "Save",
                        color = Color(0xff020202),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 153.dp,
                                y = 14.5185546875.dp
                            )
                            .requiredWidth(width = 41.dp)
                            .requiredHeight(height = 26.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }
            IconButton(
                onClick = {  /*Back work*/ },
                modifier = modifier
                    .offset(x = 5.dp, y = 5.dp)
                    .padding(top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow ),
                    contentDescription = "Back",
                    modifier = Modifier
                        .offset(x = 0.dp, y = 0.dp)
                        .size(30.dp) // Set size directly on the Icon
                )
            }
            Text(
                text = "My Profile",
                color = Color(0xff020202),
                style = TextStyle(
                    fontSize = 18.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 51.dp,
                        y = 28.dp
                    )
                    .requiredWidth(width = 87.dp)
                    .requiredHeight(height = 23.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(y = 169.dp)
                    .requiredSize(size = 142.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffc4c4c4))
                    .border(
                        border = BorderStroke(5.dp, Color.White),
                        shape = CircleShape
                    )){
                IconButton(onClick = { /*TODO*/ },
                    modifier.align(Alignment.BottomEnd)
                        .offset(y=-10.dp,x=-10.dp)
                    ) {
                    Image(painter = painterResource(id = R.drawable.camer),
                        contentDescription ="camer" ,
                        Modifier.size(80.dp))
                    
                }
            }
        }
    }

    @Preview(widthDp = 390, heightDp = 1008)
    @Composable
    private fun MyProfilePreview() {
        MyProfile(Modifier)
    }
}