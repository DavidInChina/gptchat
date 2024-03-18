package z;

import id.AbstractC3557B;

/* renamed from: z.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6719q0 implements AbstractC6717p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f51352a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f51353b;

    public C6719q0(Object obj, Object obj2) {
        this.f51352a = obj;
        this.f51353b = obj2;
    }

    @Override // z.AbstractC6717p0
    public final Object a() {
        return this.f51352a;
    }

    @Override // z.AbstractC6717p0
    public final boolean b(Object obj, Object obj2) {
        if (AbstractC3557B.K(obj, a()) && AbstractC3557B.K(obj2, c())) {
            return true;
        }
        return false;
    }

    @Override // z.AbstractC6717p0
    public final Object c() {
        return this.f51353b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC6717p0) {
            AbstractC6717p0 abstractC6717p0 = (AbstractC6717p0) obj;
            if (AbstractC3557B.K(this.f51352a, abstractC6717p0.a())) {
                if (AbstractC3557B.K(this.f51353b, abstractC6717p0.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f51352a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Object obj2 = this.f51353b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }
}
