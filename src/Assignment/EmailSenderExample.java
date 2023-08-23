package Assignment;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class EmailSenderExample {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            JobDetail job = JobBuilder.newJob(EmailSenderJob.class)
                    .withIdentity("emailSenderJob", "group1")
                    .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("emailSenderTrigger", "group1")
                    .startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 0 8 * * ?")) // 매일 아침 8시에 실행
                    .build();

            scheduler.start();
            scheduler.scheduleJob(job, trigger);

            Thread.sleep(60000); // 잠시 대기

            scheduler.shutdown();

        } catch (SchedulerException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class EmailSenderJob implements Job {
        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            // 이메일 발송 작업 수행
            System.out.println("Email sender job is running...");
        }
    }
}