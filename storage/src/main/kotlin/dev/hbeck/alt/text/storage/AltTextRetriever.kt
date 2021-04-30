package dev.hbeck.alt.text.storage

import dev.hbeck.alt.text.proto.AltTextCoordinate
import dev.hbeck.alt.text.proto.InternalAltText
import dev.hbeck.alt.text.proto.RetrievedAltText
import dev.hbeck.alt.text.proto.UserAltText


interface AltTextRetriever {
    fun search(imageHash: String, language: String, matches: Int): List<InternalAltText>
    fun getTextsForUser(userHash: String): List<InternalAltText>
    fun getAltText(coordinate: AltTextCoordinate): InternalAltText?
}