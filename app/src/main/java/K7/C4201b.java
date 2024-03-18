package k7;

/* renamed from: k7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4201b {

    /* renamed from: a  reason: collision with root package name */
    public final long f37172a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.i f37173b;

    /* renamed from: c  reason: collision with root package name */
    public final e7.h f37174c;

    public C4201b(long j6, e7.i iVar, e7.h hVar) {
        this.f37172a = j6;
        if (iVar != null) {
            this.f37173b = iVar;
            this.f37174c = hVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4201b)) {
            return false;
        }
        C4201b c4201b = (C4201b) obj;
        if (this.f37172a == c4201b.f37172a && this.f37173b.equals(c4201b.f37173b) && this.f37174c.equals(c4201b.f37174c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f37172a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f37173b.hashCode()) * 1000003) ^ this.f37174c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f37172a + ", transportContext=" + this.f37173b + ", event=" + this.f37174c + "}";
    }
}
