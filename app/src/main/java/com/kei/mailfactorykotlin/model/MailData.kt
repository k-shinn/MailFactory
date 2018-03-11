package com.kei.mailfactorykotlin.model

data class MailData(val title: String,
                    val mailTitle: String,
                    val addressTo: String,
                    val addressCc: String,
                    val reason: String)