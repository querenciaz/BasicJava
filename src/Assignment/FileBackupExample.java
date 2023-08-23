package Assignment;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class FileBackupExample {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            JobDetail job = JobBuilder.newJob(FileBackupJob.class)
                    .withIdentity("fileBackupJob", "group1")
                    .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("fileBackupTrigger", "group1")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                            .withIntervalInHours(24)
                            .repeatForever())
                    .build();

            scheduler.start();
            scheduler.scheduleJob(job, trigger);

            Thread.sleep(60000); // 잠시 대기

            scheduler.shutdown();

        } catch (SchedulerException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class FileBackupJob implements Job {
        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            // 파일 백업 작업 수행
            System.out.println("File backup job is running...");
        }
    }
}