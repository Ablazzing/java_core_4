package org.javaacademy.core.homework.homework2.office.worker;

public class Secretary {
    public static final String SPEECH_PATTERN = "%s не волнуйтесь, %s все успеет. %s - подождите!";

    public void keepCalm(Boss boss, Manager manager, Guard guard) {
        String secretarySpeech = SPEECH_PATTERN
                .formatted(boss.getName(), manager.getName(), guard.getName());
        System.out.println(secretarySpeech);
    }
}
