package mavenlesson1;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Econom economLevel = new Econom();
        EconomLevel annotationEconom = economLevel.getClass().getAnnotation(EconomLevel.class);
        System.out.println(annotationEconom.income());

        Vip vipLevel = new Vip();
        Annotation annotationVip = vipLevel.getClass().getAnnotation(VipLevel.class);
        System.out.println(((VipLevel) annotationVip).placeOfWork());
        int i = 0;
        String name = "Andrew";
    }
}
