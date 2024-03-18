package ue;

import Ad.l;
import Lg.n;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.G;
import io.ktor.utils.io.internal.q;
import io.ktor.utils.io.t;
import io.ktor.utils.io.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f46719a;

    static {
        byte[] bArr;
        Charset charset = Lg.a.f11131a;
        if (AbstractC3557B.K(charset, charset)) {
            bArr = n.b2(Separators.NEWLINE);
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder);
            bArr = Le.a.c(newEncoder, Separators.NEWLINE, 2);
        }
        f46719a = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0143 -> B:50:0x0145). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Me.h hVar, z zVar, AbstractC4825e abstractC4825e) {
        C5907b c5907b;
        int i10;
        z zVar2;
        Me.h hVar2;
        Object obj;
        z zVar3;
        Me.a aVar;
        int i11;
        Throwable th2;
        q qVar;
        Me.h hVar3 = hVar;
        if (abstractC4825e instanceof C5907b) {
            C5907b c5907b2 = (C5907b) abstractC4825e;
            int i12 = c5907b2.f46718j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c5907b2.f46718j0 = i12 - Integer.MIN_VALUE;
                c5907b = c5907b2;
                Object obj2 = c5907b.f46717i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5907b.f46718j0;
                y yVar = y.f36177a;
                int i13 = 2;
                int i14 = 1;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th3 = (Throwable) c5907b.f46714Y;
                                N.B0(obj2);
                                throw th3;
                            }
                            Integer num = (Integer) c5907b.f46716h0;
                            z zVar4 = c5907b.f46715Z;
                            N.B0(obj2);
                            zVar2 = zVar4;
                            hVar3 = (Me.h) c5907b.f46714Y;
                            i13 = 2;
                            i14 = 1;
                            if (!hVar3.j()) {
                                c5907b.f46714Y = hVar3;
                                c5907b.f46715Z = zVar2;
                                c5907b.f46716h0 = zVar2;
                                c5907b.f46718j0 = i13;
                                if (zVar2 instanceof G) {
                                    qVar = ((t) ((G) zVar2)).f33586g;
                                    t tVar = qVar.f33477b;
                                    tVar.getClass();
                                    qVar.f33477b = tVar;
                                    qVar.f33478c = tVar.P();
                                    ByteBuffer byteBuffer = qVar.f33477b.l().f33468a;
                                    AbstractC3557B.c0("buffer", byteBuffer);
                                    ByteBuffer byteBuffer2 = Ke.c.f9786a;
                                    ByteBuffer order = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
                                    AbstractC3557B.b0("buffer.slice().order(ByteOrder.BIG_ENDIAN)", order);
                                    Ne.c cVar = new Ne.c(order, null, null);
                                    qVar.f33479d = cVar;
                                    N.r0(cVar, qVar.f33478c);
                                    qVar.f33480e = qVar.f33477b.l().f33469b;
                                } else {
                                    qVar = null;
                                }
                                if (qVar != null) {
                                    Ne.c a5 = qVar.a(i14);
                                    if (a5 != null) {
                                        obj = a5;
                                    } else {
                                        obj = AbstractC3557B.O2(qVar, i14, c5907b);
                                    }
                                } else {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ne.c.f12795i;
                                    Object C10 = Me.b.f12027a.C();
                                    Ne.c cVar2 = (Ne.c) C10;
                                    cVar2.f(cVar2.f12026f - cVar2.f12024d);
                                    cVar2.e();
                                    obj = (Me.a) C10;
                                }
                                if (obj != enumC5000a) {
                                    try {
                                        try {
                                            hVar2 = hVar3;
                                            zVar3 = zVar2;
                                            aVar = (Me.a) obj;
                                            if (aVar == null) {
                                                aVar = Ne.c.f12798l;
                                            }
                                            ByteBuffer byteBuffer3 = aVar.f12021a;
                                            long j6 = aVar.f12023c;
                                            Me.h hVar4 = hVar2;
                                            aVar.a(i11);
                                            Integer num2 = new Integer(i11);
                                            c5907b.f46714Y = hVar4;
                                            c5907b.f46715Z = zVar3;
                                            c5907b.f46716h0 = num2;
                                            c5907b.f46718j0 = 3;
                                            if (AbstractC3557B.g0(zVar2, aVar, i11, c5907b) == enumC5000a) {
                                                zVar2 = zVar3;
                                                hVar3 = hVar4;
                                                i13 = 2;
                                                i14 = 1;
                                                if (!hVar3.j()) {
                                                }
                                            } else {
                                                return enumC5000a;
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            c5907b.f46714Y = th2;
                                            c5907b.f46715Z = null;
                                            c5907b.f46716h0 = null;
                                            c5907b.f46718j0 = 4;
                                            if (AbstractC3557B.g0(zVar2, aVar, i11, c5907b) != enumC5000a) {
                                                throw th2;
                                            }
                                            return enumC5000a;
                                        }
                                        i11 = (int) l.U0(hVar2, byteBuffer3, j6, aVar.f12025e - j6);
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        i11 = 0;
                                    }
                                } else {
                                    return enumC5000a;
                                }
                            }
                        } else {
                            z zVar5 = c5907b.f46715Z;
                            N.B0(obj2);
                            hVar2 = (Me.h) c5907b.f46714Y;
                            zVar2 = (z) c5907b.f46716h0;
                            zVar3 = zVar5;
                            obj = obj2;
                            aVar = (Me.a) obj;
                            if (aVar == null) {
                            }
                            ByteBuffer byteBuffer32 = aVar.f12021a;
                            long j62 = aVar.f12023c;
                            Me.h hVar42 = hVar2;
                            i11 = (int) l.U0(hVar2, byteBuffer32, j62, aVar.f12025e - j62);
                            aVar.a(i11);
                            Integer num22 = new Integer(i11);
                            c5907b.f46714Y = hVar42;
                            c5907b.f46715Z = zVar3;
                            c5907b.f46716h0 = num22;
                            c5907b.f46718j0 = 3;
                            if (AbstractC3557B.g0(zVar2, aVar, i11, c5907b) == enumC5000a) {
                            }
                        }
                    } else {
                        N.B0(obj2);
                    }
                } else {
                    N.B0(obj2);
                    if (hVar3 instanceof Me.d) {
                        c5907b.f46718j0 = 1;
                        if (((t) zVar).b0((Me.d) hVar3, c5907b) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        zVar2 = zVar;
                        if (!hVar3.j()) {
                        }
                    }
                }
                return yVar;
            }
        }
        c5907b = new AbstractC5156c(abstractC4825e);
        Object obj22 = c5907b.f46717i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5907b.f46718j0;
        y yVar2 = y.f36177a;
        int i132 = 2;
        int i142 = 1;
        if (i10 == 0) {
        }
        return yVar2;
    }
}
