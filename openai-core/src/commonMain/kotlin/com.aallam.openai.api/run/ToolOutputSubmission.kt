package com.aallam.openai.api.run

import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.ToolCall
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details on the tool outputs needed for this run to continue.
 */
@BetaOpenAI
@Serializable
public data class ToolOutputSubmission(
    /**
     * A list of the relevant tool calls
     */
    @SerialName("tool_outputs") val toolOutputs: List<ToolOutput>,

    /**
     * Whether to stream the response
     */
    @SerialName("stream") val stream: Boolean
)
