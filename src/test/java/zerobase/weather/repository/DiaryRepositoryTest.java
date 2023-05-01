package zerobase.weather.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class DiaryRepositoryTest {

    @Autowired
    DiaryRepository diaryRepository;

    @Test
    void insertDiaryTest() {
        // given
        Diary diary = new Diary();

        // when
        diaryRepository.save(diary);

        // then


    }
}