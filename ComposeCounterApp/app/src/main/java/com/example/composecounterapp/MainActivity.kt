package com.example.composecounterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


class MainActivity : ComponentActivity() 

{
    override fun onCreate(savedInstanceState: Bundle?) 
    
    {
        super.onCreate(savedInstanceState)
        setContent 
        {
            CounterAppTheme 
            
            {
                Surface(color = MaterialTheme.colors.background) 
                
                {
                    CounterApp()
                }
            }

        }
    }
}

@Composable
fun CounterApp() 
{
    var count by remember { mutableStateOf(0) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Count: $count", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = { count++ }) 
            
            {
                Text("Increment")
            }
            Button(onClick = { count-- }) 
            
            {
                Text("Decrement")
            }
        }
    }
}
