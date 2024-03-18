package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends Clock implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    static final a f34896b = new a(ZoneOffset.UTC);
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f34897a;

    static {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ZoneId zoneId) {
        this.f34897a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.f34897a;
    }

    @Override // j$.time.Clock
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f34897a.equals(((a) obj).f34897a);
        }
        return false;
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.f34897a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + this.f34897a + "]";
    }
}
