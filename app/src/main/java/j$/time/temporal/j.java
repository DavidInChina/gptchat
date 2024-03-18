package j$.time.temporal;

import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.AbstractC3699b;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final r f35123a = h.QUARTER_OF_YEAR;

    /* renamed from: b  reason: collision with root package name */
    public static final r f35124b = h.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: c  reason: collision with root package name */
    public static final r f35125c = h.WEEK_BASED_YEAR;

    /* renamed from: d  reason: collision with root package name */
    public static final u f35126d = i.WEEK_BASED_YEARS;

    static {
        i iVar = i.WEEK_BASED_YEARS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(TemporalAccessor temporalAccessor) {
        return ((AbstractC3698a) AbstractC3699b.p(temporalAccessor)).equals(j$.time.chrono.r.f34946d);
    }
}
