package o1;

import android.app.Notification;
import android.app.Person;

/* renamed from: o1.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4882F {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
        return builder.setSemanticAction(i10);
    }
}
