package fh;

import bh.AbstractC2223m;
import bh.C2224n;
import ch.AbstractC2431b;
import dh.AbstractC2691b;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import eh.AbstractC2916p;
import eh.C2909i;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l8.AbstractC4344b;

/* renamed from: fh.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3069L extends AbstractC4344b implements AbstractC2916p {

    /* renamed from: l  reason: collision with root package name */
    public final C3085l f30835l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2904d f30836m;

    /* renamed from: n  reason: collision with root package name */
    public final EnumC3073P f30837n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC2916p[] f30838o;

    /* renamed from: p  reason: collision with root package name */
    public final gh.d f30839p;

    /* renamed from: q  reason: collision with root package name */
    public final C2909i f30840q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f30841r;

    /* renamed from: s  reason: collision with root package name */
    public String f30842s;

    public C3069L(C3085l c3085l, AbstractC2904d abstractC2904d, EnumC3073P enumC3073P, AbstractC2916p[] abstractC2916pArr) {
        AbstractC3557B.c0("composer", c3085l);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("mode", enumC3073P);
        this.f30835l = c3085l;
        this.f30836m = abstractC2904d;
        this.f30837n = enumC3073P;
        this.f30838o = abstractC2916pArr;
        this.f30839p = abstractC2904d.f29417b;
        this.f30840q = abstractC2904d.f29416a;
        int ordinal = enumC3073P.ordinal();
        if (abstractC2916pArr != null) {
            AbstractC2916p abstractC2916p = abstractC2916pArr[ordinal];
            if (abstractC2916p != null || abstractC2916p != this) {
                abstractC2916pArr[ordinal] = this;
            }
        }
    }

    @Override // l8.AbstractC4344b, ch.AbstractC2431b
    public final boolean C(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return this.f30840q.f29441a;
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        AbstractC3557B.c0("value", str);
        this.f30835l.j(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final gh.d a() {
        return this.f30839p;
    }

    @Override // l8.AbstractC4344b, ch.AbstractC2431b
    public final void b(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        EnumC3073P enumC3073P = this.f30837n;
        char c10 = enumC3073P.f30854Z;
        C3085l c3085l = this.f30835l;
        c3085l.l();
        c3085l.c();
        c3085l.e(enumC3073P.f30854Z);
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final AbstractC2431b c(SerialDescriptor serialDescriptor) {
        AbstractC2916p abstractC2916p;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC2904d abstractC2904d = this.f30836m;
        EnumC3073P f12 = Ad.l.f1(serialDescriptor, abstractC2904d);
        char c10 = f12.f30853Y;
        C3085l c3085l = this.f30835l;
        c3085l.e(c10);
        c3085l.a();
        if (this.f30842s != null) {
            c3085l.b();
            String str = this.f30842s;
            AbstractC3557B.Z(str);
            D(str);
            c3085l.e(':');
            c3085l.k();
            D(serialDescriptor.a());
            this.f30842s = null;
        }
        if (this.f30837n == f12) {
            return this;
        }
        AbstractC2916p[] abstractC2916pArr = this.f30838o;
        if (abstractC2916pArr == null || (abstractC2916p = abstractC2916pArr[f12.ordinal()]) == null) {
            return new C3069L(c3085l, abstractC2904d, f12, abstractC2916pArr);
        }
        return abstractC2916p;
    }

    @Override // l8.AbstractC4344b
    public final void d0(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        int ordinal = this.f30837n.ordinal();
        boolean z10 = true;
        C3085l c3085l = this.f30835l;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!c3085l.f30884b) {
                        c3085l.e(',');
                    }
                    c3085l.b();
                    D(AbstractC3096w.c(serialDescriptor, this.f30836m, i10));
                    c3085l.e(':');
                    c3085l.k();
                    return;
                }
                if (i10 == 0) {
                    this.f30841r = true;
                }
                if (i10 == 1) {
                    c3085l.e(',');
                    c3085l.k();
                    this.f30841r = false;
                    return;
                }
                return;
            } else if (!c3085l.f30884b) {
                if (i10 % 2 == 0) {
                    c3085l.e(',');
                    c3085l.b();
                } else {
                    c3085l.e(':');
                    c3085l.k();
                    z10 = false;
                }
                this.f30841r = z10;
                return;
            } else {
                this.f30841r = true;
                c3085l.b();
                return;
            }
        }
        if (!c3085l.f30884b) {
            c3085l.e(',');
        }
        c3085l.b();
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void e() {
        this.f30835l.h("null");
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void g(double d10) {
        boolean z10 = this.f30841r;
        C3085l c3085l = this.f30835l;
        if (z10) {
            D(String.valueOf(d10));
        } else {
            c3085l.f30883a.c(String.valueOf(d10));
        }
        if (!this.f30840q.f29451k) {
            if (Double.isInfinite(d10) || Double.isNaN(d10)) {
                throw Bi.c.k(Double.valueOf(d10), c3085l.f30883a.toString());
            }
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void h(short s10) {
        if (this.f30841r) {
            D(String.valueOf((int) s10));
        } else {
            this.f30835l.i(s10);
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void j(byte b10) {
        if (this.f30841r) {
            D(String.valueOf((int) b10));
        } else {
            this.f30835l.d(b10);
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void k(boolean z10) {
        if (this.f30841r) {
            D(String.valueOf(z10));
        } else {
            this.f30835l.f30883a.c(String.valueOf(z10));
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void n(float f6) {
        boolean z10 = this.f30841r;
        C3085l c3085l = this.f30835l;
        if (z10) {
            D(String.valueOf(f6));
        } else {
            c3085l.f30883a.c(String.valueOf(f6));
        }
        if (!this.f30840q.f29451k) {
            if (Float.isInfinite(f6) || Float.isNaN(f6)) {
                throw Bi.c.k(Float.valueOf(f6), c3085l.f30883a.toString());
            }
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void o(char c10) {
        D(String.valueOf(c10));
    }

    @Override // l8.AbstractC4344b, ch.AbstractC2431b
    public final void q(SerialDescriptor serialDescriptor, int i10, KSerializer kSerializer, Object obj) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("serializer", kSerializer);
        if (obj != null || this.f30840q.f29446f) {
            super.q(serialDescriptor, i10, kSerializer, obj);
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i10) {
        AbstractC3557B.c0("enumDescriptor", serialDescriptor);
        D(serialDescriptor.g(i10));
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void u(int i10) {
        if (this.f30841r) {
            D(String.valueOf(i10));
        } else {
            this.f30835l.f(i10);
        }
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        boolean a5 = AbstractC3070M.a(serialDescriptor);
        EnumC3073P enumC3073P = this.f30837n;
        AbstractC2904d abstractC2904d = this.f30836m;
        C3085l c3085l = this.f30835l;
        if (a5) {
            if (!(c3085l instanceof C3087n)) {
                c3085l = new C3087n(c3085l.f30883a, this.f30841r);
            }
            return new C3069L(c3085l, abstractC2904d, enumC3073P, null);
        } else if (serialDescriptor.isInline() && AbstractC3557B.K(serialDescriptor, AbstractC2911k.f29457a)) {
            if (!(c3085l instanceof C3086m)) {
                c3085l = new C3086m(c3085l.f30883a, this.f30841r);
            }
            return new C3069L(c3085l, abstractC2904d, enumC3073P, null);
        } else {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (id.AbstractC3557B.K(r1, bh.C2224n.f26018d) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1.f29456p != eh.EnumC2901a.f29409Y) goto L21;
     */
    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(KSerializer kSerializer, Object obj) {
        String str;
        AbstractC3557B.c0("serializer", kSerializer);
        AbstractC2904d abstractC2904d = this.f30836m;
        C2909i c2909i = abstractC2904d.f29416a;
        if (c2909i.f29449i) {
            kSerializer.serialize(this, obj);
            return;
        }
        boolean z10 = kSerializer instanceof AbstractC2691b;
        if (!z10) {
            int ordinal = c2909i.f29456p.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    AbstractC2223m e10 = kSerializer.getDescriptor().e();
                    if (!AbstractC3557B.K(e10, C2224n.f26015a)) {
                    }
                    str = P4.a.x(kSerializer.getDescriptor(), abstractC2904d);
                }
            }
            str = null;
        }
        if (z10) {
            AbstractC2691b abstractC2691b = (AbstractC2691b) kSerializer;
            if (obj != null) {
                KSerializer z02 = R4.b.z0(abstractC2691b, this, obj);
                if (str != null) {
                    P4.a.l(kSerializer, z02, str);
                }
                P4.a.t(z02.getDescriptor().e());
                kSerializer = z02;
            } else {
                throw new IllegalArgumentException(("Value for serializer " + kSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
        }
        if (str != null) {
            this.f30842s = str;
        }
        kSerializer.serialize(this, obj);
    }

    @Override // l8.AbstractC4344b, kotlinx.serialization.encoding.Encoder
    public final void y(long j6) {
        if (this.f30841r) {
            D(String.valueOf(j6));
        } else {
            this.f30835l.g(j6);
        }
    }
}
