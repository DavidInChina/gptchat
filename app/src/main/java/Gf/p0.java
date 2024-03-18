package Gf;

import hg.AbstractC3428g;
import id.AbstractC3557B;
import ig.C3577c;
import ig.C3579e;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kg.C4290b;
import kotlin.jvm.internal.AbstractC4305d;

/* loaded from: classes.dex */
public abstract class p0 extends AbstractC0644s implements Df.v {

    /* renamed from: r0  reason: collision with root package name */
    public static final Object f6447r0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public final H f6448l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f6449m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f6450n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Object f6451o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AbstractC3957g f6452p0;

    /* renamed from: q0  reason: collision with root package name */
    public final v0 f6453q0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(H h10, Mf.P p10) {
        this(h10, r3, y0.b(p10).i(), p10, AbstractC4305d.NO_RECEIVER);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("descriptor", p10);
        String b10 = p10.getName().b();
        AbstractC3557B.b0("asString(...)", b10);
    }

    public final boolean equals(Object obj) {
        p0 c10 = A0.c(obj);
        if (c10 == null || !AbstractC3557B.K(this.f6448l0, c10.f6448l0) || !AbstractC3557B.K(this.f6449m0, c10.f6449m0) || !AbstractC3557B.K(this.f6450n0, c10.f6450n0) || !AbstractC3557B.K(this.f6451o0, c10.f6451o0)) {
            return false;
        }
        return true;
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g g() {
        return y().g();
    }

    @Override // Df.AbstractC0404c
    public final String getName() {
        return this.f6449m0;
    }

    public final int hashCode() {
        return this.f6450n0.hashCode() + E9.f.v(this.f6449m0, this.f6448l0.hashCode() * 31, 31);
    }

    @Override // Df.AbstractC0404c
    public final boolean isSuspend() {
        return false;
    }

    @Override // Gf.AbstractC0644s
    public final H j() {
        return this.f6448l0;
    }

    @Override // Gf.AbstractC0644s
    public final Hf.g m() {
        y().getClass();
        return null;
    }

    public final String toString() {
        mg.m mVar = x0.f6498a;
        return x0.c(s());
    }

    @Override // Gf.AbstractC0644s
    public final boolean v() {
        return !AbstractC3557B.K(this.f6451o0, AbstractC4305d.NO_RECEIVER);
    }

    public final Member w() {
        if (!s().K()) {
            return null;
        }
        C4290b c4290b = y0.f6500a;
        U3.f b10 = y0.b(s());
        if (b10 instanceof C0641o) {
            C0641o c0641o = (C0641o) b10;
            C3579e c3579e = c0641o.f6439i;
            if ((c3579e.f33187Z & 16) == 16) {
                C3577c c3577c = c3579e.f33192l0;
                int i10 = c3577c.f33173Z;
                if ((i10 & 1) != 1 || (i10 & 2) != 2) {
                    return null;
                }
                int i11 = c3577c.f33174h0;
                AbstractC3428g abstractC3428g = c0641o.f6440j;
                return this.f6448l0.h(abstractC3428g.b(i11), abstractC3428g.b(c3577c.f33175i0));
            }
        }
        return (Field) this.f6452p0.getValue();
    }

    /* renamed from: x */
    public final Mf.P s() {
        Object mo122invoke = this.f6453q0.mo122invoke();
        AbstractC3557B.b0("invoke(...)", mo122invoke);
        return (Mf.P) mo122invoke;
    }

    public abstract l0 y();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(H h10, String str, String str2, Object obj) {
        this(h10, str, str2, null, obj);
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("signature", str2);
    }

    public p0(H h10, String str, String str2, Mf.P p10, Object obj) {
        this.f6448l0 = h10;
        this.f6449m0 = str;
        this.f6450n0 = str2;
        this.f6451o0 = obj;
        this.f6452p0 = R4.b.C1(EnumC3958h.f36152Y, new o0(this, 1));
        this.f6453q0 = new v0(p10, new o0(this, 0));
    }
}
