package Assignment;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class OrderNotificationExample {

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        JobDetail jobDetail = JobBuilder.newJob(OrderNotificationJob.class)
                .withIdentity("orderNotificationJob", "group2")
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("orderNotificationTrigger", "group2")
                .withSchedule(DailyTimeIntervalScheduleBuilder.dailyTimeIntervalSchedule()
                        .startingDailyAt(TimeOfDay.hourAndMinuteOfDay(10, 0)) // 오전 10시부터
                        .endingDailyAt(TimeOfDay.hourAndMinuteOfDay(18, 0))   // 오후 6시까지
                        .withIntervalInHours(1))                              // 1시간마다 실행
                .build();

        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}

class OrderNotificationJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 주문 처리 알림 작업 수행
        System.out.println("주문 처리 알림 작업 실행");
    }
}