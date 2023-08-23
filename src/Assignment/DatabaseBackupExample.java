package Assignment;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class DatabaseBackupExample {

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        JobDetail jobDetail = JobBuilder.newJob(DatabaseBackupJob.class)
                .withIdentity("databaseBackupJob", "group1")
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("databaseBackupTrigger", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0 1 ? * MON")) // 매주 월요일 1시 실행
                .build();

        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}

class DatabaseBackupJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 데이터베이스 백업 작업 수행
        System.out.println("데이터베이스 백업 작업 실행");
    }
}