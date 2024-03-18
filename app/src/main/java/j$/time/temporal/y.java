package j$.time.temporal;

import android.gov.nist.core.Separators;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class y implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap f35155g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final u f35156h = j.f35126d;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.c f35157a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35158b;

    /* renamed from: c  reason: collision with root package name */
    private final transient r f35159c = x.e(this);

    /* renamed from: d  reason: collision with root package name */
    private final transient r f35160d = x.i(this);

    /* renamed from: e  reason: collision with root package name */
    private final transient r f35161e = x.j(this);

    /* renamed from: f  reason: collision with root package name */
    private final transient r f35162f = x.h(this);

    static {
        new y(j$.time.c.MONDAY, 4);
        g(j$.time.c.SUNDAY, 1);
    }

    private y(j$.time.c cVar, int i10) {
        b bVar = b.NANOS;
        Objects.requireNonNull(cVar, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f35157a = cVar;
        this.f35158b = i10;
    }

    public static y g(j$.time.c cVar, int i10) {
        String str = cVar.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f35155g;
        y yVar = (y) concurrentHashMap.get(str);
        if (yVar == null) {
            concurrentHashMap.putIfAbsent(str, new y(cVar, i10));
            return (y) concurrentHashMap.get(str);
        }
        return yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.f35157a != null) {
            int i10 = this.f35158b;
            if (i10 >= 1 && i10 <= 7) {
                return;
            }
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
        throw new InvalidObjectException("firstDayOfWeek is null");
    }

    private Object readResolve() {
        try {
            return g(this.f35157a, this.f35158b);
        } catch (IllegalArgumentException e10) {
            String message = e10.getMessage();
            throw new InvalidObjectException("Invalid serialized WeekFields: " + message);
        }
    }

    public final r d() {
        return this.f35159c;
    }

    public final j$.time.c e() {
        return this.f35157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && hashCode() == obj.hashCode();
    }

    public final int f() {
        return this.f35158b;
    }

    public final r h() {
        return this.f35162f;
    }

    public final int hashCode() {
        return (this.f35157a.ordinal() * 7) + this.f35158b;
    }

    public final r i() {
        return this.f35160d;
    }

    public final r j() {
        return this.f35161e;
    }

    public final String toString() {
        return "WeekFields[" + this.f35157a + Separators.COMMA + this.f35158b + "]";
    }
}
