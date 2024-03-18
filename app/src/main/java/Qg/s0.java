package Qg;

import Pg.EnumC1170c;
import Rg.AbstractC1282c;
import Rg.AbstractC1288i;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Q1.u f14917a = new Q1.u("NO_VALUE", 9, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Q1.u f14918b = new Q1.u("NONE", 9, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final Q1.u f14919c = new Q1.u("PENDING", 9, 0);

    public static final r0 a(int i10, int i11, EnumC1170c enumC1170c) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 <= 0 && i11 <= 0 && enumC1170c != EnumC1170c.f14192Y) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC1170c).toString());
                }
                int i12 = i11 + i10;
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                return new r0(i10, i12, enumC1170c);
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("replay cannot be negative, but was ", i10).toString());
    }

    public static /* synthetic */ r0 b(int i10, int i11, EnumC1170c enumC1170c, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC1170c = EnumC1170c.f14192Y;
        }
        return a(i10, i11, enumC1170c);
    }

    public static final F0 c(Object obj) {
        if (obj == null) {
            obj = AbstractC1282c.f15530b;
        }
        return new F0(obj);
    }

    public static final void d(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    public static final AbstractC1206i e(AbstractC1206i abstractC1206i, wf.k kVar) {
        C1222z c1222z = C1222z.f14954Y;
        if (abstractC1206i instanceof C1202g) {
            C1202g c1202g = (C1202g) abstractC1206i;
            if (c1202g.f14848Z == kVar && c1202g.f14849h0 == c1222z) {
                return abstractC1206i;
            }
        }
        return new C1202g(abstractC1206i, kVar);
    }

    public static final AbstractC1206i f(o0 o0Var, AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        if ((i10 == 0 || i10 == -3) && enumC1170c == EnumC1170c.f14192Y) {
            return o0Var;
        }
        return new AbstractC1288i(i10, abstractC4831k, enumC1170c, o0Var);
    }
}
