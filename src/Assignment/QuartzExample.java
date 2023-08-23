package Assignment;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzExample {

    public static void main(String[] args) {

//        루트 로거의 로깅 레벨을 Off 로 설정하여 모든 로그 메시지를 출력하지 않도록 하는 것
        Logger.getRootLogger().setLevel(Level.OFF);

        try {
//         1. 스케줄러 생성
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

//         2. 작업(Job) 생성
//            "Hello" 클래스를 사용하여 실행될 작업을 생성
//            작업에는 고유한 식별자와 작업을 할당한 그룹을 부여할 수 있음
            JobDetail job = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("helloJob", "group1")
                    .build();

//         3. 트리거(Trigger) 생성
//            트리거를 생성하여 작업이 언제 실행될지 설정
//            이 예제에서는 5초 간격으로 무한 반복되는 트리거를 생성
//            TriggerBuilder 중에 SimpleScheduleBuilder 사용
//            특정 간격 또는 반복 횟수에 따라 실행을 트리거하는 가장 기본적인 트리거
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("helloTrigger", "group1")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                            .withIntervalInSeconds(5)
                            .repeatForever())
                    .build();

//         4. 스케줄러 시작 및 작업과 트리거 스케줄링
//            스케줄러를 시작하고 작업과 트리거를 스케줄에 등록
//            등록된 작업과 트리거는 스케줄러에 의해 관리되며 정해진 시간에 실행
            scheduler.start();
            scheduler.scheduleJob(job, trigger);

//         5. 프로그램 실행을 위해 잠시 대기
//            작업이 실행되는 동안 프로그램을 대기시킴
//            이 예제에서는 20초 동안 프로그램 실행을 유지한 후 스케줄러 종료
            Thread.sleep(50000);

//         6. 스케줄러 종료
//            스케줄러를 종료하여 스케줄링 된 작업 및 트리거를 정리
            scheduler.shutdown();

        } catch (SchedulerException | InterruptedException e) {
            e.printStackTrace();
        }
    }

 //       7. HelloJob 클래스
//           스케줄러에 의해 실행되는 작업을 정의하는 클래스
//           Job 인터페이스를 구현하여 execute 메서드를 오버라이딩하고, 해당 메서드 내에서 작업 수행
//           이 예제에서는 Quartz 라이브러리를 사용하여 스케줄링 작업을 구성하고 실행하는 예제이다.
    public static class HelloJob implements Job {
        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            System.out.println("Hello, Quartz!");
        }
    }
}