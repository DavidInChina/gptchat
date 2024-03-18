package fh;

import N.C1025i;
import ah.AbstractC1991b;
import ah.C1992c;
import ah.C1999j;
import android.gov.nist.core.Separators;
import bh.C2222l;
import ch.AbstractC2430a;
import dh.AbstractC2691b;
import dh.C2723z;
import eh.AbstractC2904d;
import eh.AbstractC2910j;
import eh.C2909i;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: fh.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3068K extends AbstractC3557B implements AbstractC2910j {

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC2904d f30827h;

    /* renamed from: i  reason: collision with root package name */
    public final EnumC3073P f30828i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC3074a f30829j;

    /* renamed from: k  reason: collision with root package name */
    public final gh.d f30830k;

    /* renamed from: l  reason: collision with root package name */
    public int f30831l = -1;

    /* renamed from: m  reason: collision with root package name */
    public Q1.u f30832m;

    /* renamed from: n  reason: collision with root package name */
    public final C2909i f30833n;

    /* renamed from: o  reason: collision with root package name */
    public final C3093t f30834o;

    public C3068K(AbstractC2904d abstractC2904d, EnumC3073P enumC3073P, AbstractC3074a abstractC3074a, SerialDescriptor serialDescriptor, Q1.u uVar) {
        C3093t c3093t;
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("lexer", abstractC3074a);
        AbstractC3557B.c0("descriptor", serialDescriptor);
        this.f30827h = abstractC2904d;
        this.f30828i = enumC3073P;
        this.f30829j = abstractC3074a;
        this.f30830k = abstractC2904d.f29417b;
        this.f30832m = uVar;
        C2909i c2909i = abstractC2904d.f29416a;
        this.f30833n = c2909i;
        if (c2909i.f29446f) {
            c3093t = null;
        } else {
            c3093t = new C3093t(serialDescriptor);
        }
        this.f30834o = c3093t;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final short B() {
        AbstractC3074a abstractC3074a = this.f30829j;
        long i10 = abstractC3074a.i();
        short s10 = (short) i10;
        if (i10 == s10) {
            return s10;
        }
        AbstractC3074a.r(abstractC3074a, "Failed to parse short for input '" + i10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final float C() {
        AbstractC3074a abstractC3074a = this.f30829j;
        String l10 = abstractC3074a.l();
        try {
            float parseFloat = Float.parseFloat(l10);
            if (!this.f30827h.f29416a.f29451k && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                Bi.c.L1(abstractC3074a, Float.valueOf(parseFloat));
                throw null;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'float' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final double D() {
        AbstractC3074a abstractC3074a = this.f30829j;
        String l10 = abstractC3074a.l();
        try {
            double parseDouble = Double.parseDouble(l10);
            if (!this.f30827h.f29416a.f29451k && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                Bi.c.L1(abstractC3074a, Double.valueOf(parseDouble));
                throw null;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'double' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, ch.AbstractC2430a
    public final gh.d a() {
        return this.f30830k;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // id.AbstractC3557B, ch.AbstractC2430a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(SerialDescriptor serialDescriptor) {
        AbstractC3074a abstractC3074a;
        int i10;
        int[] iArr;
        int i11;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC2904d abstractC2904d = this.f30827h;
        if (abstractC2904d.f29416a.f29442b && serialDescriptor.f() == 0) {
            do {
            } while (t(serialDescriptor) != -1);
            abstractC3074a = this.f30829j;
            if (!abstractC3074a.B()) {
            }
            abstractC3074a.h(this.f30828i.f30854Z);
            C1025i c1025i = abstractC3074a.f30856b;
            i10 = c1025i.f12350Z;
            iArr = (int[]) c1025i.f12352i0;
            if (iArr[i10] == -2) {
            }
            i11 = c1025i.f12350Z;
            if (i11 == -1) {
            }
        } else {
            abstractC3074a = this.f30829j;
            if (!abstractC3074a.B() && !abstractC2904d.f29416a.f29455o) {
                Bi.c.a1(abstractC3074a, "");
                throw null;
            }
            abstractC3074a.h(this.f30828i.f30854Z);
            C1025i c1025i2 = abstractC3074a.f30856b;
            i10 = c1025i2.f12350Z;
            iArr = (int[]) c1025i2.f12352i0;
            if (iArr[i10] == -2) {
                iArr[i10] = -1;
                c1025i2.f12350Z = i10 - 1;
            }
            i11 = c1025i2.f12350Z;
            if (i11 == -1) {
                c1025i2.f12350Z = i11 - 1;
            }
        }
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final AbstractC2430a c(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC2904d abstractC2904d = this.f30827h;
        EnumC3073P f12 = Ad.l.f1(serialDescriptor, abstractC2904d);
        AbstractC3074a abstractC3074a = this.f30829j;
        C1025i c1025i = abstractC3074a.f30856b;
        c1025i.getClass();
        int i10 = c1025i.f12350Z + 1;
        c1025i.f12350Z = i10;
        if (i10 == ((Object[]) c1025i.f12351h0).length) {
            c1025i.o();
        }
        ((Object[]) c1025i.f12351h0)[i10] = serialDescriptor;
        abstractC3074a.h(f12.f30853Y);
        if (abstractC3074a.w() != 4) {
            int ordinal = f12.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f30828i == f12 && abstractC2904d.f29416a.f29446f) {
                    return this;
                }
                return new C3068K(this.f30827h, f12, this.f30829j, serialDescriptor, this.f30832m);
            }
            return new C3068K(this.f30827h, f12, this.f30829j, serialDescriptor, this.f30832m);
        }
        AbstractC3074a.r(abstractC3074a, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final boolean d() {
        boolean z10;
        boolean z11;
        AbstractC3074a abstractC3074a = this.f30829j;
        int z12 = abstractC3074a.z();
        if (z12 != abstractC3074a.u().length()) {
            if (abstractC3074a.u().charAt(z12) == '\"') {
                z12++;
                z10 = true;
            } else {
                z10 = false;
            }
            int y10 = abstractC3074a.y(z12);
            if (y10 < abstractC3074a.u().length() && y10 != -1) {
                int i10 = y10 + 1;
                int charAt = abstractC3074a.u().charAt(y10) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        abstractC3074a.d(i10, "rue");
                        z11 = true;
                    } else {
                        AbstractC3074a.r(abstractC3074a, "Expected valid boolean literal prefix, but had '" + abstractC3074a.l() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    abstractC3074a.d(i10, "alse");
                    z11 = false;
                }
                if (z10) {
                    if (abstractC3074a.f30855a != abstractC3074a.u().length()) {
                        if (abstractC3074a.u().charAt(abstractC3074a.f30855a) == '\"') {
                            abstractC3074a.f30855a++;
                        } else {
                            AbstractC3074a.r(abstractC3074a, "Expected closing quotation mark", 0, null, 6);
                            throw null;
                        }
                    } else {
                        AbstractC3074a.r(abstractC3074a, "EOF", 0, null, 6);
                        throw null;
                    }
                }
                return z11;
            }
            AbstractC3074a.r(abstractC3074a, "EOF", 0, null, 6);
            throw null;
        }
        AbstractC3074a.r(abstractC3074a, "EOF", 0, null, 6);
        throw null;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final char e() {
        AbstractC3074a abstractC3074a = this.f30829j;
        String l10 = abstractC3074a.l();
        if (l10.length() == 1) {
            return l10.charAt(0);
        }
        AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Expected single char, but got '", l10, '\''), 0, null, 6);
        throw null;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("enumDescriptor", serialDescriptor);
        return AbstractC3096w.e(serialDescriptor, this.f30827h, o(), " at path ".concat(this.f30829j.f30856b.g()));
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final Object g(AbstractC1991b abstractC1991b) {
        AbstractC3074a abstractC3074a = this.f30829j;
        AbstractC2904d abstractC2904d = this.f30827h;
        AbstractC3557B.c0("deserializer", abstractC1991b);
        try {
            if ((abstractC1991b instanceof AbstractC2691b) && !abstractC2904d.f29416a.f29449i) {
                String x10 = P4.a.x(abstractC1991b.getDescriptor(), abstractC2904d);
                String v10 = abstractC3074a.v(x10, this.f30833n.f29443c);
                if (v10 == null) {
                    return P4.a.H(this, abstractC1991b);
                }
                try {
                    AbstractC1991b y02 = R4.b.y0((AbstractC2691b) abstractC1991b, this, v10);
                    this.f30832m = new Q1.u(x10, 10, 0);
                    return y02.deserialize(this);
                } catch (C1999j e10) {
                    String message = e10.getMessage();
                    AbstractC3557B.Z(message);
                    String w22 = Lg.n.w2(Separators.DOT, Lg.n.R2(message, '\n'));
                    String message2 = e10.getMessage();
                    AbstractC3557B.Z(message2);
                    AbstractC3074a.r(abstractC3074a, w22, 0, Lg.n.N2('\n', message2, ""), 2);
                    throw null;
                }
            }
            return abstractC1991b.deserialize(this);
        } catch (C1992c e11) {
            String message3 = e11.getMessage();
            AbstractC3557B.Z(message3);
            if (Lg.n.Z1(message3, "at path", false)) {
                throw e11;
            }
            throw new C1992c(e11.getMessage() + " at path: " + abstractC3074a.f30856b.g(), e11, e11.f24196Y);
        }
    }

    @Override // eh.AbstractC2910j
    public final kotlinx.serialization.json.b k() {
        return new C3065H(this.f30827h.f29416a, this.f30829j).b();
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final int l() {
        AbstractC3074a abstractC3074a = this.f30829j;
        long i10 = abstractC3074a.i();
        int i11 = (int) i10;
        if (i10 == i11) {
            return i11;
        }
        AbstractC3074a.r(abstractC3074a, "Failed to parse int for input '" + i10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // id.AbstractC3557B, ch.AbstractC2430a
    public final Object n(SerialDescriptor serialDescriptor, int i10, AbstractC1991b abstractC1991b, Object obj) {
        boolean z10;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("deserializer", abstractC1991b);
        if (this.f30828i == EnumC3073P.f30849j0 && (i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC3074a abstractC3074a = this.f30829j;
        if (z10) {
            C1025i c1025i = abstractC3074a.f30856b;
            int i11 = c1025i.f12350Z;
            if (((int[]) c1025i.f12352i0)[i11] == -2) {
                ((Object[]) c1025i.f12351h0)[i11] = C3097x.f30901a;
            }
        }
        Object n10 = super.n(serialDescriptor, i10, abstractC1991b, obj);
        if (z10) {
            C1025i c1025i2 = abstractC3074a.f30856b;
            int i12 = c1025i2.f12350Z;
            if (((int[]) c1025i2.f12352i0)[i12] != -2) {
                int i13 = i12 + 1;
                c1025i2.f12350Z = i13;
                if (i13 == ((Object[]) c1025i2.f12351h0).length) {
                    c1025i2.o();
                }
            }
            int i14 = c1025i2.f12350Z;
            ((Object[]) c1025i2.f12351h0)[i14] = n10;
            ((int[]) c1025i2.f12352i0)[i14] = -2;
        }
        return n10;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final String o() {
        boolean z10 = this.f30833n.f29443c;
        AbstractC3074a abstractC3074a = this.f30829j;
        if (z10) {
            return abstractC3074a.m();
        }
        return abstractC3074a.j();
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final long p() {
        return this.f30829j.i();
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final boolean s() {
        C3093t c3093t = this.f30834o;
        if ((c3093t == null || !c3093t.f30893b) && !this.f30829j.C(true)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0112, code lost:
        r1 = r11.f30892a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
        if (r9 >= 64) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
        r1.f28511c |= 1 << r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0120, code lost:
        r3 = (r9 >>> 6) - 1;
        r1 = r1.f28512d;
        r1[r3] = (1 << (r9 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014b, code lost:
        r4.q(Lg.n.p2(r4.A(0, r4.f30855a), r12, 6), android.gov.nist.core.a.h("Encountered an unknown key '", r12, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0164, code lost:
        throw null;
     */
    @Override // ch.AbstractC2430a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(SerialDescriptor serialDescriptor) {
        wf.n nVar;
        int i10;
        int numberOfTrailingZeros;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        String x10;
        Object[] objArr;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        EnumC3073P enumC3073P = this.f30828i;
        int ordinal = enumC3073P.ordinal();
        AbstractC3074a abstractC3074a = this.f30829j;
        boolean z13 = true;
        int i11 = 0;
        r6 = false;
        boolean z14 = false;
        Throwable th2 = null;
        char c10 = ':';
        AbstractC2904d abstractC2904d = this.f30827h;
        int i12 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean B10 = abstractC3074a.B();
                if (abstractC3074a.c()) {
                    int i13 = this.f30831l;
                    if (i13 != -1 && !B10) {
                        AbstractC3074a.r(abstractC3074a, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i12 = i13 + 1;
                    this.f30831l = i12;
                } else if (B10 && !abstractC2904d.f29416a.f29455o) {
                    Bi.c.a1(abstractC3074a, "array");
                    throw null;
                }
            } else {
                int i14 = this.f30831l;
                if (i14 % 2 != 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (objArr != null) {
                    if (i14 != -1) {
                        z14 = abstractC3074a.B();
                    }
                } else {
                    abstractC3074a.h(':');
                }
                if (abstractC3074a.c()) {
                    if (objArr != null) {
                        if (this.f30831l == -1) {
                            boolean z15 = !z14;
                            int i15 = abstractC3074a.f30855a;
                            if (!z15) {
                                AbstractC3074a.r(abstractC3074a, "Unexpected leading comma", i15, null, 4);
                                throw null;
                            }
                        } else {
                            int i16 = abstractC3074a.f30855a;
                            if (!z14) {
                                AbstractC3074a.r(abstractC3074a, "Expected comma after the key-value pair", i16, null, 4);
                                throw null;
                            }
                        }
                    }
                    i12 = this.f30831l + 1;
                    this.f30831l = i12;
                } else if (z14 && !abstractC2904d.f29416a.f29455o) {
                    Bi.c.b1(abstractC3074a);
                    throw null;
                }
            }
        } else {
            boolean B11 = abstractC3074a.B();
            while (true) {
                boolean c11 = abstractC3074a.c();
                C3093t c3093t = this.f30834o;
                if (c11) {
                    C2909i c2909i = this.f30833n;
                    if (c2909i.f29443c) {
                        str = abstractC3074a.m();
                    } else {
                        str = abstractC3074a.e();
                    }
                    abstractC3074a.h(c10);
                    i10 = AbstractC3096w.d(serialDescriptor, abstractC2904d, str);
                    boolean z16 = c2909i.f29443c;
                    if (i10 != -3) {
                        if (!c2909i.f29448h || !serialDescriptor.j(i10)) {
                            break;
                        }
                        SerialDescriptor i17 = serialDescriptor.i(i10);
                        if (i17.c() || !abstractC3074a.C(z13)) {
                            if (!AbstractC3557B.K(i17.e(), C2222l.f26014a) || ((i17.c() && abstractC3074a.C(false)) || (x10 = abstractC3074a.x(z16)) == null || AbstractC3096w.d(i17, abstractC2904d, x10) != -3)) {
                                break;
                            }
                            abstractC3074a.j();
                        }
                        z11 = abstractC3074a.B();
                        z10 = false;
                    } else {
                        z11 = false;
                        z10 = true;
                    }
                    if (z10) {
                        if (!c2909i.f29442b) {
                            Q1.u uVar = this.f30832m;
                            if (uVar == null || !AbstractC3557B.K(uVar.f14350Z, str)) {
                                break;
                            }
                            uVar.f14350Z = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte w10 = abstractC3074a.w();
                        if (w10 == 8 || w10 == 6) {
                            while (true) {
                                byte w11 = abstractC3074a.w();
                                z12 = true;
                                if (w11 == 1) {
                                    if (z16) {
                                        abstractC3074a.l();
                                    } else {
                                        abstractC3074a.e();
                                    }
                                } else {
                                    if (w11 == 8 || w11 == 6) {
                                        arrayList.add(Byte.valueOf(w11));
                                    } else {
                                        C1025i c1025i = abstractC3074a.f30856b;
                                        if (w11 == 9) {
                                            if (((Number) kf.t.o2(arrayList)).byteValue() == 8) {
                                                kf.s.U1(arrayList);
                                            } else {
                                                throw Bi.c.n("found ] instead of } at path: " + c1025i, abstractC3074a.u(), abstractC3074a.f30855a);
                                            }
                                        } else if (w11 == 7) {
                                            if (((Number) kf.t.o2(arrayList)).byteValue() == 6) {
                                                kf.s.U1(arrayList);
                                            } else {
                                                throw Bi.c.n("found } instead of ] at path: " + c1025i, abstractC3074a.u(), abstractC3074a.f30855a);
                                            }
                                        } else if (w11 == 10) {
                                            AbstractC3074a.r(abstractC3074a, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                    }
                                    abstractC3074a.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            abstractC3074a.l();
                            z12 = true;
                        }
                        B11 = abstractC3074a.B();
                        z13 = z12;
                    } else {
                        B11 = z11;
                        z13 = true;
                    }
                    th2 = null;
                    c10 = ':';
                } else if (B11 && !abstractC2904d.f29416a.f29455o) {
                    Bi.c.b1(abstractC3074a);
                    throw th2;
                } else {
                    if (c3093t != null) {
                        C2723z c2723z = c3093t.f30892a;
                        SerialDescriptor serialDescriptor2 = c2723z.f28509a;
                        int f6 = serialDescriptor2.f();
                        do {
                            long j6 = c2723z.f28511c;
                            long j10 = -1;
                            int i18 = (j6 > (-1L) ? 1 : (j6 == (-1L) ? 0 : -1));
                            nVar = c2723z.f28510b;
                            if (i18 != 0) {
                                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j6);
                                c2723z.f28511c |= 1 << numberOfTrailingZeros;
                            } else if (f6 > 64) {
                                long[] jArr = c2723z.f28512d;
                                int length = jArr.length;
                                loop3: while (i11 < length) {
                                    int i19 = i11 + 1;
                                    int i20 = i19 * 64;
                                    long j11 = jArr[i11];
                                    while (j11 != j10) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << numberOfTrailingZeros2;
                                        i10 = numberOfTrailingZeros2 + i20;
                                        if (((Boolean) nVar.invoke(serialDescriptor2, Integer.valueOf(i10))).booleanValue()) {
                                            jArr[i11] = j11;
                                        } else {
                                            j10 = -1;
                                        }
                                    }
                                    jArr[i11] = j11;
                                    i11 = i19;
                                    j10 = -1;
                                }
                            }
                        } while (!((Boolean) nVar.invoke(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
                        i12 = numberOfTrailingZeros;
                    }
                    i12 = -1;
                }
            }
            i12 = i10;
            break loop3;
        }
        if (enumC3073P != EnumC3073P.f30849j0) {
            C1025i c1025i2 = abstractC3074a.f30856b;
            ((int[]) c1025i2.f12352i0)[c1025i2.f12350Z] = i12;
        }
        return i12;
    }

    @Override // eh.AbstractC2910j
    public final AbstractC2904d u() {
        return this.f30827h;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final Decoder w(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        if (AbstractC3070M.a(serialDescriptor)) {
            return new C3090q(this.f30829j, this.f30827h);
        }
        return this;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final byte z() {
        AbstractC3074a abstractC3074a = this.f30829j;
        long i10 = abstractC3074a.i();
        byte b10 = (byte) i10;
        if (i10 == b10) {
            return b10;
        }
        AbstractC3074a.r(abstractC3074a, "Failed to parse byte for input '" + i10 + '\'', 0, null, 6);
        throw null;
    }
}
