package Rg;

import Pg.EnumC1170c;
import Qg.D0;
import Qg.r0;
import id.AbstractC3557B;
import java.util.Arrays;
import nf.AbstractC4825e;

/* renamed from: Rg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1281b {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC1283d[] f15525Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f15526Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f15527h0;

    /* renamed from: i0  reason: collision with root package name */
    public H f15528i0;

    public final AbstractC1283d d() {
        AbstractC1283d abstractC1283d;
        H h10;
        synchronized (this) {
            try {
                AbstractC1283d[] abstractC1283dArr = this.f15525Y;
                if (abstractC1283dArr == null) {
                    abstractC1283dArr = j();
                    this.f15525Y = abstractC1283dArr;
                } else if (this.f15526Z >= abstractC1283dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC1283dArr, abstractC1283dArr.length * 2);
                    AbstractC3557B.b0("copyOf(...)", copyOf);
                    this.f15525Y = (AbstractC1283d[]) copyOf;
                    abstractC1283dArr = (AbstractC1283d[]) copyOf;
                }
                int i10 = this.f15527h0;
                do {
                    abstractC1283d = abstractC1283dArr[i10];
                    if (abstractC1283d == null) {
                        abstractC1283d = h();
                        abstractC1283dArr[i10] = abstractC1283d;
                    }
                    i10++;
                    if (i10 >= abstractC1283dArr.length) {
                        i10 = 0;
                    }
                } while (!abstractC1283d.a(this));
                this.f15527h0 = i10;
                this.f15526Z++;
                h10 = this.f15528i0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (h10 != null) {
            h10.y(1);
        }
        return abstractC1283d;
    }

    public abstract AbstractC1283d h();

    /* JADX WARN: Type inference failed for: r0v3, types: [Qg.r0, Rg.H] */
    public final D0 i() {
        H h10;
        synchronized (this) {
            H h11 = this.f15528i0;
            h10 = h11;
            if (h11 == null) {
                int i10 = this.f15526Z;
                ?? r0Var = new r0(1, Integer.MAX_VALUE, EnumC1170c.f14193Z);
                r0Var.g(Integer.valueOf(i10));
                this.f15528i0 = r0Var;
                h10 = r0Var;
            }
        }
        return h10;
    }

    public abstract AbstractC1283d[] j();

    public final void k(AbstractC1283d abstractC1283d) {
        H h10;
        int i10;
        AbstractC4825e[] b10;
        synchronized (this) {
            try {
                int i11 = this.f15526Z - 1;
                this.f15526Z = i11;
                h10 = this.f15528i0;
                if (i11 == 0) {
                    this.f15527h0 = 0;
                }
                AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>", abstractC1283d);
                b10 = abstractC1283d.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (AbstractC4825e abstractC4825e : b10) {
            if (abstractC4825e != null) {
                abstractC4825e.resumeWith(jf.y.f36177a);
            }
        }
        if (h10 != null) {
            h10.y(-1);
        }
    }
}
