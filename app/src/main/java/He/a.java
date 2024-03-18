package He;

import id.AbstractC3557B;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f7667a = DesugarTimeZone.getTimeZone("GMT");

    public static final b a(int i10, int i11, int i12, int i13, e eVar, int i14) {
        AbstractC3557B.c0("month", eVar);
        Calendar calendar = Calendar.getInstance(f7667a, Locale.ROOT);
        AbstractC3557B.Z(calendar);
        calendar.set(1, i14);
        calendar.set(2, eVar.ordinal());
        calendar.set(5, i13);
        calendar.set(11, i12);
        calendar.set(12, i11);
        calendar.set(13, i10);
        calendar.set(14, 0);
        return b(calendar, null);
    }

    public static final b b(Calendar calendar, Long l10) {
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(16) + calendar.get(15);
        return new b(calendar.get(13), calendar.get(12), calendar.get(11), AbstractC6708l.h(7)[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), e.values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis() + i10);
    }
}
