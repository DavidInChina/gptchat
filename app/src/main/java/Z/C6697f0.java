package z;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: z.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6697f0 implements AbstractC6659E {

    /* renamed from: a  reason: collision with root package name */
    public final float f51255a;

    /* renamed from: b  reason: collision with root package name */
    public final float f51256b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f51257c;

    public /* synthetic */ C6697f0(Object obj, int i10) {
        this(1.0f, 1500.0f, (i10 & 4) != 0 ? null : obj);
    }

    @Override // z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6654B0 mo121a(C6737z0 c6737z0) {
        AbstractC6726u abstractC6726u;
        Object obj = this.f51257c;
        if (obj == null) {
            abstractC6726u = null;
        } else {
            abstractC6726u = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
        }
        return new C6666H0(this.f51255a, this.f51256b, abstractC6726u);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6697f0)) {
            return false;
        }
        C6697f0 c6697f0 = (C6697f0) obj;
        if (c6697f0.f51255a != this.f51255a || c6697f0.f51256b != this.f51256b || !AbstractC3557B.K(c6697f0.f51257c, this.f51257c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f51257c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return Float.floatToIntBits(this.f51256b) + AbstractC6463a.e(this.f51255a, i10 * 31, 31);
    }

    public C6697f0(float f6, float f10, Object obj) {
        this.f51255a = f6;
        this.f51256b = f10;
        this.f51257c = obj;
    }
}
