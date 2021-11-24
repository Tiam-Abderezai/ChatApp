package com.example.chatapp.presentation.chat

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
