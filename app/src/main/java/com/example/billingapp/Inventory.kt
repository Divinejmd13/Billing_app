package com.example.billingapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.billingapp.ui.theme.orange_main

class Inventory {

    @Composable
    fun Iventory(modifier: Modifier = Modifier) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.background)

            )
        { Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(100.dp)

                .offset(x = 0.dp,
                    y = 80.dp)
                ) {
            Property1Group17(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.TopStart)
                    .padding(10.dp)
            )
        }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 80.dp)
                    .background(color = Color(0xffff6b00)))
            Text(
                textAlign = TextAlign.Center,
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color.Black,
                        fontSize = 12.sp)
                    ) {append("Developed by ")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff0057ff),
                        fontSize = 12.sp)
                    ) {append("Innov8")}
                    withStyle(style = SpanStyle(
                        color = Color(0xffff8a00),
                        fontSize = 12.sp)
                    ) {append("Apps")}},
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = (-0.5).dp,
                        y = 813.dp
                    )
                    .requiredWidth(width = 319.dp)
                    .requiredHeight(height = 23.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Inventory",
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
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 6.dp,
                        y = 14.dp
                    )
                    .requiredWidth(width = 50.dp)
                    .requiredHeight(height = 51.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "bill_made",
                    modifier = Modifier
                        .requiredSize(30.dp)
                        .offset(x = 0.dp, y = 12.dp))

            }


            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 0.dp,
                        y = 190.dp
                    )
                    .requiredWidth(width = 359.dp)
                    .requiredHeight(height = 331.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xfffff0dd)))
            {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 15.dp,
                            y = 20.dp
                        )
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                        ){Box(
                    modifier = Modifier
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                        .border(
                            border = BorderStroke(1.dp, Color(0xffff753b)),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable { })
                    Image(
                        painter = painterResource(id = R.drawable.mobile),
                        contentDescription = "Vector",
                        modifier = Modifier
                            .requiredSize(50.dp)
                            .align(Alignment.Center)
                            .offset(x = 0.dp, y = -5.dp))
                    Text(
                        text = "Mobiles",
                        color = Color(0xffff753b),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 27.dp,
                                y = 101.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 130.dp,
                            y = 20.dp
                        )
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                ){Box(
                    modifier = Modifier
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)

                        .border(
                            border = BorderStroke(1.dp, Color(0xffff753b)),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable { }) {
                    Image(
                        painter = painterResource(id = R.drawable.pana),
                        contentDescription = "Vector",
                        modifier = Modifier
                            .requiredSize(50.dp)
                            .align(Alignment.Center)
                            .offset(x = 0.dp, y = -5.dp)
                    )
                    Text(
                        text = "Repair Parts",
                        color = Color(0xffff753b),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 15.dp,
                                y = 101.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 245.dp,
                            y = 20.dp
                        )
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                ){Box(
                    modifier = Modifier
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)

                        .border(
                            border = BorderStroke(1.dp, Color(0xffff753b)),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable { }) {
                    Image(
                        painter = painterResource(id = R.drawable.ass),
                        contentDescription = "Vector",
                        modifier = Modifier
                            .requiredSize(50.dp)
                            .align(Alignment.Center)
                            .offset(x = 0.dp, y = -5.dp))

                    Text(
                        text = "Accesssories",
                        color = Color(0xffff753b),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 13.dp,
                                y = 101.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }

                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 65.dp,
                            y = 170.dp
                        )
                        .requiredWidth(width = 0.dp)
                        .requiredHeight(height = 115.dp)
                ){Box(
                    modifier = Modifier
                        .requiredWidth(width = 100.dp)
                        .requiredHeight(height = 130.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)

                        .border(
                            border = BorderStroke(1.dp, Color(0xffff753b)),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable { }) {
                    Image(
                        painter = painterResource(id = R.drawable.kamaldawad),
                        contentDescription = "Vector",
                        modifier = Modifier
                            .requiredSize(50.dp)
                            .align(Alignment.Center)
                            .offset(x = 0.dp, y = -5.dp))

                    Text(
                        text = "Add Category",
                        color = Color(0xffa3695c),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 11.dp,
                                y = 101.dp
                            )
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }

                }

            }
            Divider(
                color = Color(0xffdcdcdc),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 0.dp,
                        y = 538.dp
                    )
                    .requiredWidth(width = 338.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 0.dp,
                        y = 566.dp
                    )
                    .requiredWidth(width = 359.dp)
                    .requiredHeight(height = 69.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffff811d))
                    .border(
                        border = BorderStroke(1.dp, Color(0xffd7d7d7)),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .clickable { }){
                Text(
                    text = "Inventory History",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 18.sp),
                    modifier = Modifier
                        .requiredWidth(width = 359.dp)
                        .requiredHeight(height = 70.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))

            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Property1Group17(modifier: Modifier) {
        var text by remember { mutableStateOf("") }

        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = { Text("Available Items") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            },
            trailingIcon = {
                if (text.isNotEmpty()) {
                    IconButton(
                        onClick = {
                            text = ""
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Clear"
                        )
                    }
                }
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLabelColor= orange_main,
                unfocusedLabelColor= Color.Gray,
                focusedBorderColor = orange_main,
                unfocusedBorderColor = Color.Gray,
            )

        )
    }


    @Preview
    @Composable
    private fun IventoryPreview() {
        Iventory(Modifier)
    }
}