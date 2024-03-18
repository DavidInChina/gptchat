package j7;

import java.util.Map;
import m7.AbstractC4565a;
import m7.C4567c;

/* renamed from: j7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3912b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4565a f36032a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f36033b;

    public C3912b(AbstractC4565a abstractC4565a, Map map) {
        if (abstractC4565a != null) {
            this.f36032a = abstractC4565a;
            if (map != null) {
                this.f36033b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final long a(b7.c cVar, long j6, int i10) {
        long j10;
        long a5 = j6 - ((C4567c) this.f36032a).a();
        C3913c c3913c = (C3913c) this.f36033b.get(cVar);
        long j11 = c3913c.f36034a;
        int i11 = i10 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i11))), a5), c3913c.f36035b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3912b)) {
            return false;
        }
        C3912b c3912b = (C3912b) obj;
        if (this.f36032a.equals(c3912b.f36032a) && this.f36033b.equals(c3912b.f36033b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36032a.hashCode() ^ 1000003) * 1000003) ^ this.f36033b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f36032a + ", values=" + this.f36033b + "}";
    }
}
