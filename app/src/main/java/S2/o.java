package s2;

import Z.C1745x0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f45169a;

    /* renamed from: b  reason: collision with root package name */
    public C1745x0 f45170b = new C1745x0(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f45171c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45172d;

    public o(Object obj) {
        this.f45169a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return this.f45169a.equals(((o) obj).f45169a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45169a.hashCode();
    }
}
