package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC3699b;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final long f35183a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDateTime f35184b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f35185c;

    /* renamed from: d  reason: collision with root package name */
    private final ZoneOffset f35186d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j6, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f35183a = j6;
        this.f35184b = LocalDateTime.W(j6, 0, zoneOffset);
        this.f35185c = zoneOffset;
        this.f35186d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f35183a = AbstractC3699b.n(localDateTime, zoneOffset);
        this.f35184b = localDateTime;
        this.f35185c = zoneOffset;
        this.f35186d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean A() {
        return this.f35186d.T() > this.f35185c.T();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(DataOutput dataOutput) {
        a.c(this.f35183a, dataOutput);
        a.d(this.f35185c, dataOutput);
        a.d(this.f35186d, dataOutput);
    }

    public final long N() {
        return this.f35183a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f35183a, ((b) obj).f35183a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35183a == bVar.f35183a && this.f35185c.equals(bVar.f35185c) && this.f35186d.equals(bVar.f35186d);
    }

    public final LocalDateTime g() {
        return this.f35184b.Z(this.f35186d.T() - this.f35185c.T());
    }

    public final int hashCode() {
        return (this.f35184b.hashCode() ^ this.f35185c.hashCode()) ^ Integer.rotateLeft(this.f35186d.hashCode(), 16);
    }

    public final LocalDateTime p() {
        return this.f35184b;
    }

    public final Duration r() {
        return Duration.s(this.f35186d.T() - this.f35185c.T());
    }

    public final ZoneOffset s() {
        return this.f35186d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(A() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f35184b);
        sb2.append(this.f35185c);
        sb2.append(" to ");
        sb2.append(this.f35186d);
        sb2.append(']');
        return sb2.toString();
    }

    public final ZoneOffset w() {
        return this.f35185c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List z() {
        return A() ? Collections.emptyList() : j$.com.android.tools.r8.a.m(new Object[]{this.f35185c, this.f35186d});
    }
}
