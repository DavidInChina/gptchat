package lg;

/* renamed from: lg.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4463h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38393b;

    public C4463h(int i10, AbstractC4456a abstractC4456a) {
        this.f38392a = abstractC4456a;
        this.f38393b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4463h)) {
            return false;
        }
        C4463h c4463h = (C4463h) obj;
        if (this.f38392a != c4463h.f38392a || this.f38393b != c4463h.f38393b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f38392a) * 65535) + this.f38393b;
    }
}
