package com.javarush.task.task13.task1328;

public final class BodyPart {
    static final BodyPart LEG = new BodyPart("нога");
    static final BodyPart HEAD = new BodyPart("голова");
    static final BodyPart ARM = new BodyPart("рука");
    static final BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
