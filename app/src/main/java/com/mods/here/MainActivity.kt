package com.mods.here

import android.graphics.drawable.Icon
import android.media.ImageReader
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon;
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.mods.here.ui.theme.ModsHereTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModsHereTheme {
                var selected by remember {
                    mutableStateOf(0)
                }
                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            bottomNavItems.forEachIndexed{ index, bottomNavItem ->
                                NavigationBarItem(
                                    selected = index == selected,
                                    onClick = {
                                        selected = index
                                    },
                                    icon = {
                                        BadgedBox(
                                            badge = {
                                                if (bottomNavItem.badges != 0) {
                                                    Badge {
                                                        Text(text = bottomNavItem.badges.toString())
                                                    }
                                                } else if (bottomNavItem.hasNews) {
                                                    Badge()
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector =
                                                if (index == selected)
                                                    bottomNavItem.selectedIcon
                                                else
                                                    bottomNavItem.unselectedIcon,
                                                contentDescription = bottomNavItem.title
                                            )
                                        }
                                    },
                                    label = {
                                        Text(text = bottomNavItem.title)
                                    }
                                )
                            }
                        }
                    }
                ) {
                    val padding = it
                }
            }
        }
    }
}

val bottomNavItems = listOf(
    BottomNavItem(
        "Home","home",Icons.Filled.Home,Icons.Outlined.Home,false,0
    ),
    BottomNavItem(
        "Posts","posts",Icons.Filled.List,Icons.Outlined.List,false,0
    ),
    BottomNavItem(
        "Notifications","notifications",Icons.Filled.Notifications,Icons.Outlined.Notifications,true,12
    ),
    BottomNavItem(
        "Profile","profile",Icons.Filled.Face,Icons.Outlined.Face,true,3
    )
)
data class BottomNavItem(
    val title : String,
    val route : String,
    val selectedIcon : ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews : Boolean,
    val badges : Int
)