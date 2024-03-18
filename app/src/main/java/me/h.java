package Me;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import oe.C4992a;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public abstract class h implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Oe.g f12033Y;

    /* renamed from: Z  reason: collision with root package name */
    public Ne.c f12034Z;

    /* renamed from: h0  reason: collision with root package name */
    public ByteBuffer f12035h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f12036i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f12037j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f12038k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f12039l0;

    public h(Ne.c cVar, long j6, Oe.g gVar) {
        AbstractC3557B.c0("head", cVar);
        AbstractC3557B.c0("pool", gVar);
        this.f12033Y = gVar;
        this.f12034Z = cVar;
        this.f12035h0 = cVar.f12021a;
        int i10 = cVar.f12022b;
        this.f12036i0 = i10;
        int i11 = cVar.f12023c;
        this.f12037j0 = i11;
        this.f12038k0 = j6 - (i11 - i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a2, code lost:
        throw new oe.C4992a("Expected " + r8 + " more character bytes", 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x032c, code lost:
        r10 = 1;
        id.AbstractC3557B.h2(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0331, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r(h hVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        Throwable th2;
        int i13;
        Throwable th3;
        ByteBuffer byteBuffer;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b10;
        int i19;
        ByteBuffer byteBuffer2;
        int i20;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Ne.c c10;
        char c11;
        int i21;
        boolean z15;
        Throwable th4;
        boolean z16;
        boolean z17;
        boolean z18;
        int i22;
        boolean z19;
        boolean z20;
        Throwable th5;
        Ne.c c12;
        boolean z21;
        boolean z22;
        if (hVar.j()) {
            return "";
        }
        long m10 = hVar.m();
        int i23 = 1;
        if (m10 > 0 && Integer.MAX_VALUE >= m10) {
            int i24 = (int) m10;
            Charset charset = Lg.a.f11131a;
            AbstractC3557B.c0("charset", charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            AbstractC3557B.b0("charset.newDecoder()", newDecoder);
            CharBuffer charBuffer = Le.a.f11059a;
            if (i24 == 0) {
                return "";
            }
            if (hVar.f12037j0 - hVar.f12036i0 >= i24) {
                if (hVar.f12035h0.hasArray()) {
                    ByteBuffer byteBuffer3 = hVar.f12035h0;
                    byte[] array = byteBuffer3.array();
                    AbstractC3557B.b0("bb.array()", array);
                    int arrayOffset = byteBuffer3.arrayOffset();
                    Charset charset2 = newDecoder.charset();
                    AbstractC3557B.b0("charset()", charset2);
                    String str = new String(array, byteBuffer3.position() + arrayOffset + hVar.k().f12022b, i24, charset2);
                    hVar.a(i24);
                    return str;
                }
                CharBuffer allocate = CharBuffer.allocate(i24);
                ByteBuffer byteBuffer4 = hVar.f12035h0;
                int i25 = hVar.k().f12022b;
                ByteBuffer byteBuffer5 = Ke.c.f9786a;
                ByteBuffer W6 = r.f.W(byteBuffer4, i25, i24);
                CoderResult decode = newDecoder.decode(W6, allocate, true);
                if (decode.isMalformed() || decode.isUnmappable()) {
                    Le.a.e(decode);
                }
                allocate.flip();
                hVar.a(W6.position());
                String charBuffer2 = allocate.toString();
                AbstractC3557B.b0("cb.toString()", charBuffer2);
                return charBuffer2;
            }
            CharBuffer allocate2 = CharBuffer.allocate(i24);
            Ne.c b11 = Ne.d.b(hVar, 1);
            if (b11 == null) {
                i22 = i24;
                z19 = false;
            } else {
                i22 = i24;
                int i26 = 1;
                int i27 = 1;
                boolean z23 = false;
                while (true) {
                    try {
                        int i28 = b11.f12023c - b11.f12022b;
                        if (i28 >= i26) {
                            if (allocate2.hasRemaining() && i22 != 0) {
                                ByteBuffer byteBuffer6 = b11.f12021a;
                                int i29 = b11.f12022b;
                                int i30 = b11.f12023c - i29;
                                ByteBuffer byteBuffer7 = Ke.c.f9786a;
                                ByteBuffer W10 = r.f.W(byteBuffer6, i29, i30);
                                int limit = W10.limit();
                                int position = W10.position();
                                if (limit - position >= i22) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (z22) {
                                    W10.limit(position + i22);
                                }
                                CoderResult decode2 = newDecoder.decode(W10, allocate2, z22);
                                if (decode2.isMalformed() || decode2.isUnmappable()) {
                                    Le.a.e(decode2);
                                }
                                if (decode2.isUnderflow() && W10.hasRemaining()) {
                                    i27++;
                                } else {
                                    i27 = 1;
                                }
                                W10.limit(limit);
                                i22 -= W10.position() - position;
                                if (W10.limit() != i30) {
                                    break;
                                }
                                b11.c(W10.position());
                                i26 = i27;
                                z23 = z22;
                                i28 = b11.f12023c - b11.f12022b;
                            }
                            i26 = 0;
                            i28 = b11.f12023c - b11.f12022b;
                        }
                        if (i28 == 0) {
                            try {
                                c12 = Ne.d.c(hVar, b11);
                            } catch (Throwable th6) {
                                th5 = th6;
                                z20 = false;
                                if (z20) {
                                    Ne.d.a(hVar, b11);
                                }
                                throw th5;
                            }
                        } else {
                            if (i28 >= i26 && b11.f12026f - b11.f12025e >= 8) {
                                c12 = b11;
                            }
                            Ne.d.a(hVar, b11);
                            c12 = Ne.d.b(hVar, i26);
                        }
                        if (c12 == null) {
                            z21 = false;
                            break;
                        }
                        b11 = c12;
                        if (i26 <= 0) {
                            z21 = true;
                            break;
                        }
                    } catch (Throwable th7) {
                        th5 = th7;
                        z20 = true;
                    }
                }
                if (z21) {
                    Ne.d.a(hVar, b11);
                }
                z19 = z23;
            }
            if (allocate2.hasRemaining() && !z19) {
                CoderResult decode3 = newDecoder.decode(Le.a.f11060b, allocate2, true);
                if (decode3.isMalformed() || decode3.isUnmappable()) {
                    Le.a.e(decode3);
                }
            }
            if (i22 <= 0) {
                if (i22 >= 0) {
                    allocate2.flip();
                    String charBuffer3 = allocate2.toString();
                    AbstractC3557B.b0("cb.toString()", charBuffer3);
                    return charBuffer3;
                }
                throw new AssertionError("remainingInputBytes < 0");
            }
            throw new EOFException("Not enough bytes available: had only " + (i24 - i22) + " instead of " + i24);
        }
        StringBuilder sb2 = new StringBuilder(16);
        if (!hVar.j()) {
            Ne.c b12 = Ne.d.b(hVar, 1);
            if (b12 == null) {
                i10 = 0;
                z10 = false;
            } else {
                i10 = 0;
                z10 = false;
                while (true) {
                    try {
                        ByteBuffer byteBuffer8 = b12.f12021a;
                        int i31 = b12.f12022b;
                        int i32 = b12.f12023c;
                        for (int i33 = i31; i33 < i32; i33++) {
                            try {
                                byte b13 = byteBuffer8.get(i33);
                                int i34 = b13 & 255;
                                if ((b13 & 128) != 128) {
                                    char c13 = (char) i34;
                                    if (i10 == Integer.MAX_VALUE) {
                                        z17 = false;
                                    } else {
                                        sb2.append(c13);
                                        i10++;
                                        z17 = true;
                                    }
                                    if (z17) {
                                    }
                                }
                                b12.c(i33 - i31);
                                z16 = false;
                                break;
                            } catch (Throwable th8) {
                                th4 = th8;
                                z15 = true;
                                if (z15) {
                                    Ne.d.a(hVar, b12);
                                }
                                throw th4;
                            }
                        }
                        b12.c(i32 - i31);
                        z16 = true;
                        if (z16) {
                            z18 = true;
                        } else {
                            if (i10 != Integer.MAX_VALUE) {
                                z10 = true;
                            }
                            z18 = false;
                        }
                        if (!z18) {
                            Ne.d.a(hVar, b12);
                            break;
                        }
                        try {
                            b12 = Ne.d.c(hVar, b12);
                            if (b12 == null) {
                                break;
                            }
                        } catch (Throwable th9) {
                            th4 = th9;
                            z15 = false;
                            if (z15) {
                            }
                            throw th4;
                        }
                    } catch (Throwable th10) {
                        th4 = th10;
                        z15 = true;
                    }
                }
            }
            if (z10) {
                int i35 = 0 - i10;
                int i36 = Integer.MAX_VALUE - i10;
                Ne.c b14 = Ne.d.b(hVar, 1);
                if (b14 == null) {
                    i11 = 0;
                } else {
                    int i37 = 1;
                    i11 = 0;
                    loop3: while (true) {
                        try {
                            int i38 = b14.f12023c;
                            int i39 = b14.f12022b;
                            int i40 = i38 - i39;
                            if (i40 >= i37) {
                                try {
                                    byteBuffer = b14.f12021a;
                                    i14 = i39;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                } catch (Throwable th11) {
                                    th3 = th11;
                                    i13 = i23;
                                }
                                while (i14 < i38) {
                                    try {
                                        b10 = byteBuffer.get(i14);
                                        i19 = b10 & 255;
                                        byteBuffer2 = byteBuffer;
                                        i18 = -1;
                                    } catch (Throwable th12) {
                                        th3 = th12;
                                        i13 = 1;
                                    }
                                    if ((b10 & 128) == 0) {
                                        if (i15 != 0) {
                                            break loop3;
                                        }
                                        char c14 = (char) i19;
                                        if (i11 == i36) {
                                            z14 = false;
                                        } else {
                                            sb2.append(c14);
                                            i11++;
                                            z14 = true;
                                        }
                                        if (!z14) {
                                            b14.c(i14 - i39);
                                            i13 = 1;
                                            break;
                                        }
                                        i20 = 1;
                                        i14++;
                                        i23 = i20;
                                        byteBuffer = byteBuffer2;
                                    } else if (i15 == 0) {
                                        i16 = i19;
                                        int i41 = 128;
                                        for (int i42 = 1; i42 < 7 && (i16 & i41) != 0; i42++) {
                                            i16 &= ~i41;
                                            i41 >>= 1;
                                            i15++;
                                        }
                                        int i43 = i15 - 1;
                                        if (i15 > i38 - i14) {
                                            b14.c(i14 - i39);
                                            i18 = i15;
                                            i13 = 1;
                                            break;
                                        }
                                        i17 = i15;
                                        i20 = 1;
                                        i15 = i43;
                                        i14++;
                                        i23 = i20;
                                        byteBuffer = byteBuffer2;
                                    } else {
                                        int i44 = (b10 & Byte.MAX_VALUE) | (i16 << 6);
                                        i15--;
                                        if (i15 == 0) {
                                            if ((i44 >>> 16) == 0) {
                                                char c15 = (char) i44;
                                                if (i11 == i36) {
                                                    z13 = false;
                                                } else {
                                                    sb2.append(c15);
                                                    i11++;
                                                    z13 = true;
                                                }
                                                if (!z13) {
                                                    b14.c(((i14 - i39) - i17) + 1);
                                                    i13 = 1;
                                                    break;
                                                }
                                            } else {
                                                if (i44 > 1114111) {
                                                    break loop3;
                                                }
                                                char c16 = (char) ((i44 >>> 10) + 55232);
                                                if (i11 == i36) {
                                                    z11 = false;
                                                } else {
                                                    sb2.append(c16);
                                                    i11++;
                                                    z11 = true;
                                                }
                                                if (z11) {
                                                    char c17 = (char) ((i44 & 1023) + 56320);
                                                    if (i11 == i36) {
                                                        z12 = false;
                                                    } else {
                                                        sb2.append(c17);
                                                        i11++;
                                                        z12 = true;
                                                    }
                                                    if (!z12) {
                                                    }
                                                }
                                                i13 = 1;
                                                try {
                                                    b14.c(((i14 - i39) - i17) + 1);
                                                    break;
                                                } catch (Throwable th13) {
                                                    th3 = th13;
                                                }
                                                th3 = th13;
                                                throw th3;
                                            }
                                            i20 = 1;
                                            i16 = 0;
                                        } else {
                                            i20 = 1;
                                            i16 = i44;
                                        }
                                        i14++;
                                        i23 = i20;
                                        byteBuffer = byteBuffer2;
                                    }
                                }
                                i13 = i23;
                                b14.c(i40);
                                i18 = 0;
                                if (i18 == 0) {
                                    i37 = i13;
                                } else if (i18 > 0) {
                                    i37 = i18;
                                } else {
                                    i37 = 0;
                                }
                                try {
                                    i40 = b14.f12023c - b14.f12022b;
                                } catch (Throwable th14) {
                                    th2 = th14;
                                    i12 = i13;
                                    if (i12 != 0) {
                                    }
                                    throw th2;
                                }
                            } else {
                                i13 = i23;
                            }
                            if (i40 == 0) {
                                try {
                                    c10 = Ne.d.c(hVar, b14);
                                    c11 = '\b';
                                } catch (Throwable th15) {
                                    th2 = th15;
                                    i12 = 0;
                                    if (i12 != 0) {
                                        Ne.d.a(hVar, b14);
                                    }
                                    throw th2;
                                }
                            } else {
                                if (i40 >= i37) {
                                    c11 = '\b';
                                    if (b14.f12026f - b14.f12025e >= 8) {
                                        c10 = b14;
                                    }
                                } else {
                                    c11 = '\b';
                                }
                                Ne.d.a(hVar, b14);
                                c10 = Ne.d.b(hVar, i37);
                            }
                            if (c10 == null) {
                                i21 = 0;
                                break;
                            }
                            b14 = c10;
                            if (i37 <= 0) {
                                i21 = i13;
                                break;
                            }
                            i23 = i13;
                        } catch (Throwable th16) {
                            th2 = th16;
                            i13 = i23;
                        }
                    }
                    if (i21 != 0) {
                        Ne.d.a(hVar, b14);
                    }
                }
                if (i11 < i35) {
                    throw new C4992a(AbstractC2469q0.i("Premature end of stream: expected at least ", i35, " chars but had only ", i11), 4);
                }
            } else if (i10 < 0) {
                throw new C4992a(AbstractC2469q0.i("Premature end of stream: expected at least ", 0, " chars but had only ", i10), 4);
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder(capacity).\u2026builderAction).toString()", sb3);
        return sb3;
    }

    public final void F() {
        Ne.c k10 = k();
        Ne.c cVar = Ne.c.f12798l;
        if (k10 != cVar) {
            S(cVar);
            P(0L);
            Oe.g gVar = this.f12033Y;
            AbstractC3557B.c0("pool", gVar);
            while (k10 != null) {
                Ne.c g10 = k10.g();
                k10.k(gVar);
                k10 = g10;
            }
        }
    }

    public final void O(Ne.c cVar) {
        Ne.c g10 = cVar.g();
        if (g10 == null) {
            g10 = Ne.c.f12798l;
        }
        S(g10);
        P(this.f12038k0 - (g10.f12023c - g10.f12022b));
        cVar.k(this.f12033Y);
    }

    public final void P(long j6) {
        if (j6 >= 0) {
            this.f12038k0 = j6;
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("tailRemaining shouldn't be negative: ", j6).toString());
    }

    public final void S(Ne.c cVar) {
        this.f12034Z = cVar;
        this.f12035h0 = cVar.f12021a;
        this.f12036i0 = cVar.f12022b;
        this.f12037j0 = cVar.f12023c;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            int i11 = 0;
            int i12 = i10;
            while (i12 != 0) {
                Ne.c k10 = k();
                if (this.f12037j0 - this.f12036i0 < 1) {
                    k10 = p(1, k10);
                }
                if (k10 == null) {
                    break;
                }
                int min = Math.min(k10.f12023c - k10.f12022b, i12);
                k10.c(min);
                this.f12036i0 += min;
                if (k10.f12023c - k10.f12022b == 0) {
                    O(k10);
                }
                i12 -= min;
                i11 += min;
            }
            if (i11 == i10) {
                return;
            }
            throw new EOFException(AbstractC4194d.v("Unable to discard ", i10, " bytes due to end of packet"));
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Negative discard is not allowed: ", i10).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        F();
        if (!this.f12039l0) {
            this.f12039l0 = true;
        }
    }

    public final Ne.c h(Ne.c cVar) {
        Ne.c cVar2 = Ne.c.f12798l;
        while (cVar != cVar2) {
            Ne.c g10 = cVar.g();
            cVar.k(this.f12033Y);
            if (g10 == null) {
                S(cVar2);
                P(0L);
                cVar = cVar2;
            } else if (g10.f12023c > g10.f12022b) {
                S(g10);
                P(this.f12038k0 - (g10.f12023c - g10.f12022b));
                return g10;
            } else {
                cVar = g10;
            }
        }
        if (!this.f12039l0) {
            this.f12039l0 = true;
        }
        return null;
    }

    public final void i(Ne.c cVar) {
        long j6 = 0;
        if (this.f12039l0 && cVar.i() == null) {
            this.f12036i0 = cVar.f12022b;
            this.f12037j0 = cVar.f12023c;
            P(0L);
            return;
        }
        int i10 = cVar.f12023c - cVar.f12022b;
        int min = Math.min(i10, 8 - (cVar.f12026f - cVar.f12025e));
        Oe.g gVar = this.f12033Y;
        if (i10 > min) {
            Ne.c cVar2 = (Ne.c) gVar.C();
            Ne.c cVar3 = (Ne.c) gVar.C();
            cVar2.e();
            cVar3.e();
            cVar2.m(cVar3);
            cVar3.m(cVar.g());
            AbstractC4344b.w1(cVar2, cVar, i10 - min);
            AbstractC4344b.w1(cVar3, cVar, min);
            S(cVar2);
            do {
                j6 += cVar3.f12023c - cVar3.f12022b;
                cVar3 = cVar3.i();
            } while (cVar3 != null);
            P(j6);
        } else {
            Ne.c cVar4 = (Ne.c) gVar.C();
            cVar4.e();
            cVar4.m(cVar.g());
            AbstractC4344b.w1(cVar4, cVar, i10);
            S(cVar4);
        }
        cVar.k(gVar);
    }

    public final boolean j() {
        if (this.f12037j0 - this.f12036i0 == 0 && this.f12038k0 == 0) {
            boolean z10 = this.f12039l0;
            if (z10 || z10) {
                return true;
            }
            this.f12039l0 = true;
            return true;
        }
        return false;
    }

    public final Ne.c k() {
        Ne.c cVar = this.f12034Z;
        int i10 = this.f12036i0;
        if (i10 >= 0 && i10 <= cVar.f12023c) {
            if (cVar.f12022b != i10) {
                cVar.f12022b = i10;
            }
            return cVar;
        }
        int i11 = cVar.f12022b;
        AbstractC5260f.o(i10 - i11, cVar.f12023c - i11);
        throw null;
    }

    public final long m() {
        return (this.f12037j0 - this.f12036i0) + this.f12038k0;
    }

    public final Ne.c p(int i10, Ne.c cVar) {
        while (true) {
            int i11 = this.f12037j0 - this.f12036i0;
            if (i11 >= i10) {
                return cVar;
            }
            Ne.c i12 = cVar.i();
            if (i12 == null) {
                if (!this.f12039l0) {
                    this.f12039l0 = true;
                }
                return null;
            } else if (i11 == 0) {
                if (cVar != Ne.c.f12798l) {
                    O(cVar);
                }
                cVar = i12;
            } else {
                int w12 = AbstractC4344b.w1(cVar, i12, i10 - i11);
                this.f12037j0 = cVar.f12023c;
                P(this.f12038k0 - w12);
                int i13 = i12.f12023c;
                int i14 = i12.f12022b;
                if (i13 > i14) {
                    if (w12 >= 0) {
                        if (i14 >= w12) {
                            i12.f12024d = w12;
                        } else if (i14 == i13) {
                            if (w12 > i12.f12025e) {
                                int i15 = i12.f12026f;
                                if (w12 > i15) {
                                    throw new IllegalArgumentException(AbstractC2469q0.i("Start gap ", w12, " is bigger than the capacity ", i15));
                                }
                                StringBuilder q10 = android.gov.nist.core.a.q("Unable to reserve ", w12, " start gap: there are already ");
                                q10.append(i15 - i12.f12025e);
                                q10.append(" bytes reserved in the end");
                                throw new IllegalStateException(q10.toString());
                            }
                            i12.f12023c = w12;
                            i12.f12022b = w12;
                            i12.f12024d = w12;
                        } else {
                            StringBuilder q11 = android.gov.nist.core.a.q("Unable to reserve ", w12, " start gap: there are already ");
                            q11.append(i12.f12023c - i12.f12022b);
                            q11.append(" content bytes starting at offset ");
                            q11.append(i12.f12022b);
                            throw new IllegalStateException(q11.toString());
                        }
                    } else {
                        throw new IllegalArgumentException(android.gov.nist.core.a.e("startGap shouldn't be negative: ", w12).toString());
                    }
                } else {
                    cVar.m(null);
                    cVar.m(i12.g());
                    i12.k(this.f12033Y);
                }
                if (cVar.f12023c - cVar.f12022b >= i10) {
                    return cVar;
                }
                if (i10 > 8) {
                    throw new IllegalStateException(AbstractC4194d.v("minSize of ", i10, " is too big (should be less than 8)"));
                }
            }
        }
    }
}
