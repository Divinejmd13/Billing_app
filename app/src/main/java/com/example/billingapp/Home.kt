package com.example.billingapp

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class Home {
    @Composable
    fun HomeScreen(modifier: Modifier = Modifier,drawerState: DrawerState, drawerScope: CoroutineScope) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.background)
              )
         {


            Box(
                modifier = Modifier
                    .fillMaxSize()

            ) { var isDrawerOpen by remember { mutableStateOf(false) }
                var drawerContent by remember { mutableStateOf(0) }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape= RoundedCornerShape(10.dp))
                        .shadow(1000.dp, shape = RectangleShape)
                        .requiredHeight(height = 80.dp)
                        .statusBarsPadding()
                        .background(
                            brush = Brush.radialGradient(
                                0f to Color(0xffff8c00),
                                1f to Color(0xffff723f),
                                center = Offset(200f, 80f),
                                radius = 195f
                            )
                        )
                        )
                IconButton(
                    onClick = {   drawerScope.launch { drawerState.open() } },
                    modifier = modifier
                        .offset(x = 5.dp, y = 5.dp)
                        .padding(top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.frame ),
                        contentDescription = "Menu",
                        modifier = Modifier
                            .offset(x = 0.dp, y = 0.dp)
                            .size(40.dp) // Set size directly on the Icon
                    )
                }

                Text(
                    text = "22AAAAA0000A1Z5",
                    color = Color(0xffd1dfa8),
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .statusBarsPadding()
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 64.dp,
                            y = 43.dp
                        )
                        .wrapContentHeight(align = Alignment.CenterVertically))

                Icon(
                    painter = painterResource(id = R.drawable.property1newnotif1),
                    contentDescription = "Notification Bell",
                    modifier = Modifier
                        .align(alignment = Alignment.TopEnd)
                        .offset(x = (-16).dp, y = 26.dp)
                        .requiredSize(size = 25.dp)
                        .clickable { /* notification */ }
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.itim))
                           )
                        ) {append("SATGURU")}
                        withStyle(style = SpanStyle(
                            color = Color(0xff515151),
                            fontSize = 32.sp,
                            fontFamily = FontFamily(Font(R.font.itim)))
                        ) {append(" ")}
                        withStyle(style = SpanStyle(
                            color = Color(0xff424242),
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.itim)))
                        ) {append("TELECOM")}},
                    modifier = Modifier
                        .statusBarsPadding()
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 64.dp,
                            y = 8.dp
                        )
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .offset(
                            x = 0.dp,
                            y = -60.dp
                        )
                        .requiredWidth(width = 365.dp)
                        .requiredHeight(height = 400.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(
                                x = 0.dp,
                                y = 5.dp
                            )
                            .fillMaxWidth()
                            .requiredHeight(height = 400.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color(0xfffff0dd)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 9.dp,
                                y = 49.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 100.dp)
                                .requiredHeight(height = 130.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .border(
                                    border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable { /* Handle */ }
                        )
                        Text(
                            text = "Inventory",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            fontFamily = FontFamily(Font(R.font.itim)),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 22.dp,
                                    y = 101.dp
                                )
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.management1),
                            contentDescription = "management 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 25.dp,
                                    y = 36.dp
                                )
                                .requiredSize(size = 51.dp))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 255.dp,
                                y = 49.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    ) {
                        Box( modifier = Modifier
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color.White)
                            .border(
                                border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .clickable { /* Handle */ })
                        Text(
                            text = "Reports",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 30.dp,
                                    y = 101.dp
                                )
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.businessreport1),
                            contentDescription = "business-report 1",
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(
                                    x = 0.5.dp,
                                    y = (-3.3148040771484375).dp
                                )
                                .requiredSize(size = 51.dp))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 132.dp,
                                y = 49.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 100.dp)
                                .requiredHeight(height = 130.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .border(
                                    border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable { /* Handle */ })
                        Text(
                            text = "Bills",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 38.dp,
                                    y = 101.dp
                                )
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.bill),
                            contentDescription = "bill 1",
                            modifier = Modifier
                                .align(alignment = Alignment.Center)
                                .offset(
                                    x = (-0.2784423828125).dp,
                                    y = (-6.0932464599609375).dp
                                )
                                .requiredSize(size = 51.dp))
                    }

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 9.dp,
                                y = 215.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 100.dp)
                                .requiredHeight(height = 130.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .border(
                                    border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable { /* Handle */ }
                        )
                        Text(
                            text = "Loan",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            fontFamily = FontFamily(Font(R.font.itim)),
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .offset(y=-15.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.management1),
                            contentDescription = "management 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 25.dp,
                                    y = 36.dp
                                )
                                .requiredSize(size = 51.dp))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 135.dp,
                                y = 215.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 100.dp)
                                .requiredHeight(height = 130.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .border(
                                    border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable { /* Handle */ }
                        )
                        Text(
                            text = "Credits",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            fontFamily = FontFamily(Font(R.font.itim)),
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .offset(y=-15.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.credit),
                            contentDescription = "management 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 25.dp,
                                    y = 36.dp
                                )
                                .requiredSize(size = 51.dp))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 255.dp,
                                y = 215.dp
                            )
                            .requiredWidth(width = 100.dp)
                            .requiredHeight(height = 130.dp)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 100.dp)
                                .requiredHeight(height = 130.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .border(
                                    border = BorderStroke(1.dp, Color(0xffa5a5a5)),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable { /* Handle */ }
                        )
                        Text(
                            text = "Sell Product",
                            color = Color(0xffa3695c),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            fontFamily = FontFamily(Font(R.font.itim)),
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .offset(y=-15.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Image(
                            painter = painterResource(id = R.drawable.management1),
                            contentDescription = "management 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 25.dp,
                                    y = 36.dp
                                )
                                .requiredSize(size = 51.dp))
                    }
                }

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(
                            x = 0.dp,
                            y = 595.dp
                        )
                        .requiredWidth(width = 346.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .background(MaterialTheme.colorScheme.background)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .offset(
                                    x = 0.dp,
                                    y = 0.dp
                                )
                                .requiredWidth(width = 346.dp)
                                .requiredHeight(height = 43.dp)
                                .clip(shape = RoundedCornerShape(5.dp))
                                .background(color = Color(0xfffcfcfc))
                                .border(
                                    border = BorderStroke(2.dp, Color(0xff009638)),
                                    shape = RoundedCornerShape(5.dp)
                                )
                                .clickable { /* Handle */ })
                        Text(
                            text = "Facing issue? Contact Us",
                            color = Color(0xff009638),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.BottomCenter)
                                .offset(
                                    x = 4.dp,
                                    y = (-14).dp
                                )
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp),
                        contentDescription = "whatsapp 1",
                        modifier = Modifier
                            .align(alignment = Alignment.BottomCenter)
                            .offset(
                                x = (-86).dp,
                                y = (-11).dp
                            )
                            .requiredSize(size = 20.dp))
                }
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
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Italic

                        )
                        ) {append("Apps")}},
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .offset(
                            x = 0.5.dp,
                            y = 365.5.dp
                        )
                        .requiredWidth(width = 319.dp)
                        .requiredHeight(height = 23.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))}
        }
    }



    @Composable
    fun dropdown() {
        val listItems = arrayOf("This Week", "This Month")
        val disabledItem = 2
        val contextForToast = LocalContext.current.applicationContext

        // State of the selected item and the menu
        var selectedItem by remember { mutableStateOf(listItems[0]) }
        var expanded by remember { mutableStateOf(false) }

        Box(
            modifier = Modifier
                .requiredWidth(width = 86.dp)
                .requiredHeight(height = 24.dp),
            contentAlignment = Alignment.BottomEnd
        ) {

            // 3 vertical dots icon
            IconButton(onClick = {
                expanded = true
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Open Options"
                )
            }

            // Drop down menu
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {
                // Adding items
                listItems.forEachIndexed { itemIndex, itemValue ->
                    DropdownMenuItem(
                        onClick = {
                            // Update the selected item
                            selectedItem = itemValue
                            expanded = false

                            // Perform actions or updates based on the selected item
                            when (itemValue) {
                                "This Week" -> {
                                    // Handle the "This Week" selection
                                    // Update your UI accordingly
                                }
                                "This Month" -> {
                                    // Handle the "This Month" selection
                                    // Update your UI accordingly
                                }
                            }

                            Toast.makeText(contextForToast, itemValue, Toast.LENGTH_SHORT)
                                .show()
                        },
                        enabled = (itemIndex != disabledItem)
                    ) {
                        Text(text = itemValue)
                    }
                }
            }

            // Conditionally render components based on the selected item
            when (selectedItem) {
                "This Week" -> {
                    // Render components for "This Week" selection
                }
                "This Month" -> {
                    // Render components for "This Month" selection
                }
            }
        }


    }
    @Composable
    fun NavDra(modifier: Modifier) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
            val drawerScope = rememberCoroutineScope()

            // Use the provided drawerState and drawerScope
            ModalNavigationDrawer(
                drawerState = drawerState,
                drawerContent = {

                    NavigationTypeFullScreenThemeLight(Modifier)

                }
            ) {
                // Your main screen content
                HomeScreen(modifier, drawerState, drawerScope)
            }
        }
    }
    @Composable
    fun NavigationTypeFullScreenThemeLight(modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.spacedBy(141.dp, Alignment.Top),
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .fillMaxHeight()
                .background(color = Color.White)
                .padding(all = 22.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y=20.dp)
                    .requiredHeight(height = 769.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(48.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color(0xD7F0DDE3))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .weight(weight = 1f)
                            .offset(x=3.dp)
                            .requiredHeight(60.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                                .clip(shape = RoundedCornerShape(48.dp))

                                .background(color = Color(0xFFFFFFFF))
                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.img_81),
//                                contentDescription = "81",
//                                modifier = Modifier
//                                    .fillMaxSize()
//                                    .clip(shape = RoundedCornerShape(256.9054260253906.dp)))
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Satguru",
                                color = Color(0xff1a1b2d),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                            Text(
                                text = "Email@gmail.com",
                                color = Color(0xff535763),
                                lineHeight = 1.em,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.End),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start)
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.filled),
//                                contentDescription = "UI icon/close/filled",
//                                tint = Color(0xff535763))
                        }
                    }
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .weight(weight = 1f)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(0.05f)
                                    .clickable {  }
                            ) {
//                                Icon(
//                                    painter = painterResource(id = R.drawable.icontypelighticonnamebadgesize24px),
//                                    contentDescription = "Icon- Outline")
                                Text(
                                    text = "Employee",
                                    color = Color(0xff535763),
                                    lineHeight = 1.6.em,
                                    style = TextStyle(
                                        fontSize = 15.sp),
                                    modifier = Modifier
                                        .fillMaxWidth())
                            }
                        }
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 20.dp)
                                .clip(shape = MaterialTheme.shapes.small)
                                .background(color = Color(0xfffb9b9b))
                        ) {
                            Text(
                                text = "2",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 10.sp),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 6.71728515625.dp,
                                        y = 4.dp))
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth().fillMaxHeight(0.05f)
                                .clickable {  }
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.iconlistaddressiconcolorgreyicontypestrokesize24),
//                                contentDescription = "Icon/Menu icon")
                            Text(
                                text = "Edit profile",
                                color = Color(0xff535763),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }

                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth().fillMaxHeight(0.05f)
                                .clickable {  }
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.iconlistwalleticoncolorgreyicontypestrokesize24),
//                                contentDescription = "Icon/Menu icon",
//                                tint = Color(0xff535763))
                            Text(
                                text = "Change Pin",
                                color = Color(0xff535763),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }

                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .weight(weight = 1f).fillMaxHeight(0.05f)
                                .clickable {  }
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.iconlistoffersiconcolorgreyicontypestrokesize24),
//                                contentDescription = "Icon/Menu icon")
                            Text(
                                text = "About",
                                color = Color(0xff535763),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }

                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth().fillMaxHeight(0.05f)
                                .clickable {  }
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.iconlistreferafriendiconcolorgreyicontypestrokesize24),
//                                contentDescription = "Icon/Menu icon")
                            Text(
                                text = "Help",
                                color = Color(0xff535763),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .padding(all = 12.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth().fillMaxHeight(0.05f)
                                .clickable {  }
                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.iconlistsupporticoncolorgreyicontypestrokesize24),
//                                contentDescription = "Icon/Menu icon",
//                                tint = Color(0xff535763))
                            Text(
                                text = "Log out",
                                color = Color(0xff535763),
                                lineHeight = 1.6.em,
                                style = TextStyle(
                                    fontSize = 15.sp),
                                modifier = Modifier
                                    .fillMaxWidth())
                        }
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    private fun NavigationTypeFullScreenThemeLightPreview() {
        NavigationTypeFullScreenThemeLight(Modifier)
    }

    @Preview
    @Composable
    fun HomeScreenPreview() {
        NavDra(Modifier) // Assuming you want to preview the HomeScreen with the Navigation Drawer
    }
}