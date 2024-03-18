package io.ktor.utils.io;

import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f33533Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f33534Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ char[] f33535h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f33536i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f33537j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f33538k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f33539l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Appendable f33540m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f33541n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.B b10, int i10, char[] cArr, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, kotlin.jvm.internal.x xVar, kotlin.jvm.internal.x xVar2, Appendable appendable, kotlin.jvm.internal.z zVar3) {
        super(1);
        this.f33533Y = b10;
        this.f33534Z = i10;
        this.f33535h0 = cArr;
        this.f33536i0 = zVar;
        this.f33537j0 = zVar2;
        this.f33538k0 = xVar;
        this.f33539l0 = xVar2;
        this.f33540m0 = appendable;
        this.f33541n0 = zVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b6, code lost:
        if (r5 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0307, code lost:
        if (r5 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0361, code lost:
        if (r5 != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r12 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        kotlin.jvm.internal.z zVar;
        int i10;
        long j6;
        int i11;
        long g02;
        long g03;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        char c11;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        AbstractC3557B.c0("buffer", byteBuffer);
        int position = byteBuffer.position();
        kotlin.jvm.internal.B b10 = this.f33533Y;
        ByteBuffer byteBuffer2 = (ByteBuffer) b10.f37622Y;
        if (byteBuffer2 != null) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(Math.min(byteBuffer.limit(), byteBuffer2.remaining() + byteBuffer.position()));
            byteBuffer2.put(byteBuffer);
            byteBuffer2.flip();
            byteBuffer.limit(limit);
        } else {
            byteBuffer2 = byteBuffer;
        }
        int i13 = this.f33534Z;
        kotlin.jvm.internal.z zVar2 = this.f33536i0;
        char[] cArr = this.f33535h0;
        int length = cArr.length;
        if (i13 != Integer.MAX_VALUE) {
            length = Math.min(length, i13 - zVar2.f37647Y);
        }
        AbstractC3557B.c0("out", cArr);
        if (byteBuffer2.hasArray()) {
            byte[] array = byteBuffer2.array();
            int position2 = byteBuffer2.position() + byteBuffer2.arrayOffset();
            int remaining = byteBuffer2.remaining() + position2;
            if (position2 <= remaining) {
                if (remaining <= array.length) {
                    if (length <= cArr.length) {
                        int i14 = 0;
                        boolean z22 = false;
                        while (position2 < remaining && i14 < length) {
                            int i15 = position2 + 1;
                            byte b11 = array[position2];
                            if (b11 >= 0) {
                                char c12 = (char) b11;
                                i10 = i13;
                                if (c12 == '\r') {
                                    z16 = true;
                                    z22 = true;
                                } else if (c12 == '\n') {
                                    z16 = false;
                                    z22 = false;
                                } else if (z22) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                if (!z16) {
                                    byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                    j6 = Ad.l.g0(i14, -1);
                                    zVar = zVar2;
                                    break;
                                }
                                cArr[i14] = c12;
                                i14++;
                                position2 = i15;
                                i13 = i10;
                            } else {
                                i10 = i13;
                                zVar = zVar2;
                                if ((b11 & 224) == 192) {
                                    if (i15 >= remaining) {
                                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                        j6 = Ad.l.g0(i14, 2);
                                        break;
                                    }
                                    int i16 = position2 + 2;
                                    char c13 = (char) ((array[i15] & 63) | ((b11 & 31) << 6));
                                    if (c13 == '\r') {
                                        z22 = true;
                                    } else {
                                        if (c13 == '\n') {
                                            z22 = false;
                                        }
                                        z21 = false;
                                        if (z21) {
                                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                            j6 = Ad.l.g0(i14, -1);
                                            break;
                                        }
                                        cArr[i14] = c13;
                                        i14++;
                                        position2 = i16;
                                        i13 = i10;
                                        zVar2 = zVar;
                                    }
                                    z21 = true;
                                    if (z21) {
                                    }
                                } else if ((b11 & 240) == 224) {
                                    if (remaining - i15 < 2) {
                                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                        j6 = Ad.l.g0(i14, 3);
                                        break;
                                    }
                                    byte b12 = array[i15];
                                    int i17 = position2 + 3;
                                    char c14 = (char) ((array[position2 + 2] & 63) | ((b12 & 63) << 6) | ((b11 & 15) << 12));
                                    if (c14 == '\r') {
                                        z20 = true;
                                        z22 = true;
                                    } else if (c14 == '\n') {
                                        z20 = false;
                                        z22 = false;
                                    } else if (z22) {
                                        z20 = false;
                                    } else {
                                        z20 = true;
                                    }
                                    if (!z20) {
                                        byteBuffer2.position((position2 - 1) - byteBuffer2.arrayOffset());
                                        j6 = Ad.l.g0(i14, -1);
                                        break;
                                    }
                                    cArr[i14] = c14;
                                    i14++;
                                    position2 = i17;
                                    i13 = i10;
                                    zVar2 = zVar;
                                } else if ((b11 & 248) == 240) {
                                    if (remaining - i15 < 3) {
                                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                        j6 = Ad.l.g0(i14, 4);
                                        break;
                                    }
                                    byte b13 = array[i15];
                                    int i18 = position2 + 4;
                                    int i19 = ((array[position2 + 2] & 63) << 6) | ((b13 & 63) << 12) | ((b11 & 7) << 18) | (array[position2 + 3] & 63);
                                    if (i19 <= 1114111) {
                                        if (length - i14 >= 2) {
                                            char c15 = (char) ((i19 >>> 10) + 55232);
                                            char c16 = (char) ((i19 & 1023) + 56320);
                                            if (c15 == '\r') {
                                                z18 = true;
                                                c11 = '\n';
                                                z17 = true;
                                            } else {
                                                c11 = '\n';
                                                if (c15 == '\n') {
                                                    z18 = false;
                                                    z17 = false;
                                                } else if (z22) {
                                                    z17 = z22;
                                                    z18 = false;
                                                } else {
                                                    z17 = z22;
                                                    z18 = true;
                                                }
                                            }
                                            if (z18) {
                                                if (c16 == '\r') {
                                                    z22 = true;
                                                } else {
                                                    if (c16 == c11) {
                                                        z22 = false;
                                                    } else if (z17) {
                                                        z22 = z17;
                                                    } else {
                                                        z22 = z17;
                                                    }
                                                    z19 = false;
                                                    if (!z19) {
                                                        int i20 = i14 + 1;
                                                        cArr[i14] = c15;
                                                        i14 += 2;
                                                        cArr[i20] = c16;
                                                        position2 = i18;
                                                        i13 = i10;
                                                        zVar2 = zVar;
                                                    }
                                                }
                                                z19 = true;
                                                if (!z19) {
                                                }
                                            } else {
                                                z22 = z17;
                                            }
                                            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                            j6 = Ad.l.g0(i14, -1);
                                            break;
                                        }
                                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                                        j6 = Ad.l.g0(i14, 0);
                                        break;
                                    }
                                    Ad.l.R0(i19);
                                    throw null;
                                } else {
                                    Ad.l.l1(b11);
                                    throw null;
                                }
                            }
                        }
                        i10 = i13;
                        zVar = zVar2;
                        byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                        j6 = Ad.l.g0(i14, 0);
                        int i21 = (int) (j6 & 4294967295L);
                        if (i21 == -1) {
                            int i22 = (int) (j6 >> 32);
                            if (z22) {
                                j6 = Ad.l.g0(i22 - 1, -1);
                            } else {
                                byteBuffer2.position(byteBuffer2.position() + 1);
                                if (i22 > 0) {
                                    int i23 = i22 - 1;
                                    if (cArr[i23] == '\r') {
                                        j6 = Ad.l.g0(i23, -1);
                                    }
                                }
                            }
                        } else if (i21 == 0 && z22) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            j6 = Ad.l.g0(((int) (j6 >> 32)) - 1, 2);
                        }
                    } else {
                        throw Ad.l.E0(length, cArr.length);
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            i10 = i13;
            zVar = zVar2;
            if (length <= cArr.length) {
                boolean z23 = false;
                int i24 = 0;
                while (byteBuffer2.hasRemaining() && i24 < length) {
                    byte b14 = byteBuffer2.get();
                    if (b14 >= 0) {
                        char c17 = (char) b14;
                        if (c17 == '\r') {
                            z23 = true;
                        } else {
                            if (c17 == '\n') {
                                z23 = false;
                            }
                            z10 = false;
                            if (z10) {
                                byteBuffer2.position(byteBuffer2.position() - 1);
                                j6 = Ad.l.g0(i24, -1);
                                break;
                            }
                            i12 = i24 + 1;
                            cArr[i24] = c17;
                            i24 = i12;
                        }
                        z10 = true;
                        if (z10) {
                        }
                    } else if ((b14 & 224) == 192) {
                        if (!byteBuffer2.hasRemaining()) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            j6 = Ad.l.g0(i24, 2);
                            break;
                        }
                        char c18 = (char) (((b14 & 31) << 6) | (byteBuffer2.get() & 63));
                        if (c18 == '\r') {
                            z23 = true;
                        } else {
                            if (c18 == '\n') {
                                z23 = false;
                            }
                            z11 = false;
                            if (z11) {
                                byteBuffer2.position(byteBuffer2.position() - 2);
                                j6 = Ad.l.g0(i24, -1);
                                break;
                            }
                            i12 = i24 + 1;
                            cArr[i24] = c18;
                            i24 = i12;
                        }
                        z11 = true;
                        if (z11) {
                        }
                    } else if ((b14 & 240) == 224) {
                        if (byteBuffer2.remaining() < 2) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            j6 = Ad.l.g0(i24, 3);
                            break;
                        }
                        char c19 = (char) (((b14 & 15) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63));
                        if (c19 == '\r') {
                            z23 = true;
                        } else {
                            if (c19 == '\n') {
                                z23 = false;
                            }
                            z12 = false;
                            if (z12) {
                                byteBuffer2.position(byteBuffer2.position() - 3);
                                j6 = Ad.l.g0(i24, -1);
                                break;
                            }
                            i12 = i24 + 1;
                            cArr[i24] = c19;
                            i24 = i12;
                        }
                        z12 = true;
                        if (z12) {
                        }
                    } else if ((b14 & 248) == 240) {
                        if (byteBuffer2.remaining() < 3) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            j6 = Ad.l.g0(i24, 4);
                            break;
                        }
                        int i25 = ((b14 & 7) << 18) | ((byteBuffer2.get() & 63) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63);
                        if (i25 <= 1114111) {
                            if (length - i24 >= 2) {
                                char c20 = (char) ((i25 >>> 10) + 55232);
                                char c21 = (char) ((i25 & 1023) + 56320);
                                if (c20 == '\r') {
                                    z14 = true;
                                    c10 = '\n';
                                    z13 = true;
                                } else {
                                    c10 = '\n';
                                    if (c20 == '\n') {
                                        z14 = false;
                                        z13 = false;
                                    } else if (z23) {
                                        z13 = z23;
                                        z14 = false;
                                    } else {
                                        z13 = z23;
                                        z14 = true;
                                    }
                                }
                                if (z14) {
                                    if (c21 == '\r') {
                                        z23 = true;
                                    } else {
                                        if (c21 == c10) {
                                            z23 = false;
                                        } else if (z13) {
                                            z23 = z13;
                                        } else {
                                            z23 = z13;
                                        }
                                        z15 = false;
                                        if (!z15) {
                                            int i26 = i24 + 1;
                                            cArr[i24] = c20;
                                            i24 += 2;
                                            cArr[i26] = c21;
                                        }
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                } else {
                                    z23 = z13;
                                }
                                byteBuffer2.position(byteBuffer2.position() - 4);
                                j6 = Ad.l.g0(i24, -1);
                                break;
                            }
                            byteBuffer2.position(byteBuffer2.position() - 4);
                            g03 = Ad.l.g0(i24, 0);
                            break;
                        }
                        Ad.l.R0(i25);
                        throw null;
                    } else {
                        Ad.l.l1(b14);
                        throw null;
                    }
                }
                g03 = Ad.l.g0(i24, 0);
                j6 = g03;
                int i27 = (int) (j6 & 4294967295L);
                if (i27 == -1) {
                    int i28 = (int) (j6 >> 32);
                    if (z23) {
                        j6 = Ad.l.g0(i28 - 1, -1);
                    } else {
                        byteBuffer2.position(byteBuffer2.position() + 1);
                        if (i28 > 0) {
                            int i29 = i28 - 1;
                            if (cArr[i29] == '\r') {
                                g02 = Ad.l.g0(i29, -1);
                                j6 = g02;
                            }
                        }
                    }
                } else if (i27 == 0 && z23) {
                    byteBuffer2.position(byteBuffer2.position() - 1);
                    g02 = Ad.l.g0(((int) (j6 >> 32)) - 1, 2);
                    j6 = g02;
                }
            } else {
                throw Ad.l.E0(length, cArr.length);
            }
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) b10.f37622Y;
        kotlin.jvm.internal.z zVar3 = this.f33541n0;
        if (byteBuffer3 != null) {
            byteBuffer.position((byteBuffer3.position() + position) - zVar3.f37647Y);
            io.ktor.utils.io.internal.f.f33453b.E0(byteBuffer3);
            b10.f37622Y = null;
            zVar3.f37647Y = 0;
        }
        int i30 = (int) (j6 >> 32);
        int i31 = (int) (j6 & 4294967295L);
        this.f33537j0.f37647Y = Math.max(1, i31);
        kotlin.jvm.internal.x xVar = this.f33538k0;
        if (i31 == -1) {
            xVar.f37645Y = true;
        }
        if (i31 != -1) {
            if (byteBuffer.hasRemaining() && byteBuffer.get(byteBuffer.position()) == 13) {
                byteBuffer.position(byteBuffer.position() + 1);
                this.f33539l0.f37645Y = true;
            }
            i11 = -1;
        } else {
            i11 = -1;
        }
        if (i31 != i11 && byteBuffer.hasRemaining() && byteBuffer.get(byteBuffer.position()) == 10) {
            byteBuffer.position(byteBuffer.position() + 1);
            xVar.f37645Y = true;
        }
        Appendable appendable = this.f33540m0;
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(cArr, 0, i30);
        } else {
            appendable.append(CharBuffer.wrap(cArr, 0, i30), 0, i30);
        }
        kotlin.jvm.internal.z zVar4 = zVar;
        zVar4.f37647Y += i30;
        if (i30 == 0 && byteBuffer.remaining() < i31) {
            Object C10 = io.ktor.utils.io.internal.f.f33453b.C();
            zVar3.f37647Y = byteBuffer.remaining();
            ((ByteBuffer) C10).put(byteBuffer);
            b10.f37622Y = C10;
        }
        int i32 = i10;
        if (i32 != Integer.MAX_VALUE && zVar4.f37647Y >= i32 && !xVar.f37645Y) {
            throw new Le.b("Line is longer than limit");
        }
        return jf.y.f36177a;
    }
}
