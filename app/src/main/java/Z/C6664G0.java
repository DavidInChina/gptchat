package z;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;

/* renamed from: z.G0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6664G0 implements AbstractC6656C0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Map f51142Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f51143Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6726u f51144h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC6726u f51145i0;

    public C6664G0(int i10, LinkedHashMap linkedHashMap) {
        this.f51142Y = linkedHashMap;
        this.f51143Z = i10;
    }

    @Override // z.AbstractC6654B0
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        int q10 = (int) com.google.android.gms.internal.play_billing.N.q((j6 / 1000000) - 0, 0L, i());
        Integer valueOf = Integer.valueOf(q10);
        Map map = this.f51142Y;
        if (map.containsKey(valueOf)) {
            return (AbstractC6726u) ((C3959i) AbstractC4268D.Z0(Integer.valueOf(q10), map)).f36155Y;
        }
        int i10 = this.f51143Z;
        if (q10 >= i10) {
            return abstractC6726u2;
        }
        if (q10 <= 0) {
            return abstractC6726u;
        }
        AbstractC6653B abstractC6653B = AbstractC6657D.f51128d;
        AbstractC6726u abstractC6726u4 = abstractC6726u;
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            C3959i c3959i = (C3959i) entry.getValue();
            if (q10 > intValue && intValue >= i11) {
                abstractC6726u4 = (AbstractC6726u) c3959i.f36155Y;
                abstractC6653B = (AbstractC6653B) c3959i.f36156Z;
                i11 = intValue;
            } else if (q10 < intValue && intValue <= i10) {
                abstractC6726u2 = (AbstractC6726u) c3959i.f36155Y;
                i10 = intValue;
            }
        }
        float a5 = abstractC6653B.a((q10 - i11) / (i10 - i11));
        if (this.f51144h0 == null) {
            this.f51144h0 = abstractC6726u.c();
            this.f51145i0 = abstractC6726u.c();
        }
        int b10 = abstractC6726u4.b();
        for (int i12 = 0; i12 < b10; i12++) {
            AbstractC6726u abstractC6726u5 = this.f51144h0;
            if (abstractC6726u5 != null) {
                float a10 = abstractC6726u4.a(i12);
                float a11 = abstractC6726u2.a(i12);
                C6737z0 c6737z0 = AbstractC6652A0.f51116a;
                abstractC6726u5.e(i12, (a11 * a5) + ((1 - a5) * a10));
            } else {
                AbstractC3557B.C2("valueVector");
                throw null;
            }
        }
        AbstractC6726u abstractC6726u6 = this.f51144h0;
        if (abstractC6726u6 != null) {
            return abstractC6726u6;
        }
        AbstractC3557B.C2("valueVector");
        throw null;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return h(f(abstractC6726u, abstractC6726u2, abstractC6726u3), abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    @Override // z.AbstractC6654B0
    public final long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return i() * 1000000;
    }

    @Override // z.AbstractC6656C0
    public final int g() {
        return 0;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        long q10 = com.google.android.gms.internal.play_billing.N.q((j6 / 1000000) - 0, 0L, i());
        if (q10 <= 0) {
            return abstractC6726u3;
        }
        AbstractC6726u c10 = c((q10 - 1) * 1000000, abstractC6726u, abstractC6726u2, abstractC6726u3);
        AbstractC6726u c11 = c(q10 * 1000000, abstractC6726u, abstractC6726u2, abstractC6726u3);
        if (this.f51144h0 == null) {
            this.f51144h0 = abstractC6726u.c();
            this.f51145i0 = abstractC6726u.c();
        }
        int b10 = c10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            AbstractC6726u abstractC6726u4 = this.f51145i0;
            if (abstractC6726u4 != null) {
                abstractC6726u4.e(i10, (c10.a(i10) - c11.a(i10)) * 1000.0f);
            } else {
                AbstractC3557B.C2("velocityVector");
                throw null;
            }
        }
        AbstractC6726u abstractC6726u5 = this.f51145i0;
        if (abstractC6726u5 != null) {
            return abstractC6726u5;
        }
        AbstractC3557B.C2("velocityVector");
        throw null;
    }

    @Override // z.AbstractC6656C0
    public final int i() {
        return this.f51143Z;
    }
}
