package com.qure.domain.usecase

import com.qure.domain.model.News
import com.qure.domain.repository.BookmarkRepository
import javax.inject.Inject

class DeleteBookmarkUseCase @Inject constructor(
    private val bookmarkRepository: BookmarkRepository
) {

    suspend operator fun invoke(news: News) = bookmarkRepository.deleteBookmark(news)

}