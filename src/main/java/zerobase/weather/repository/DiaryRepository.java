package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer>{
    // 날짜로 일기 찾기
    List<Diary> findAllByDate(LocalDate date);

    // 날짜 구간으로 일기 찾기
    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    // 날짜로 찾은 일기 중 첫번째 일기 가져옴
    Diary getFirstByDate(LocalDate date);

    // 날짜로 일기 지움
    @Transactional
    void deleteAllByDate(LocalDate date);
}
