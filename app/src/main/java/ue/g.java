package ue;

import K4.J;
import Lg.n;
import Lg.o;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.MultipartMimeContentImpl;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.z;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import xe.AbstractC6415d;
import xe.AbstractC6435x;
import xe.C6417f;
import yf.AbstractC6583a;
import zc.u;
import ze.AbstractC6847f;
import ze.AbstractC6852k;
import ze.C6849h;
import ze.C6850i;

/* loaded from: classes.dex */
public final class g extends AbstractC6847f {

    /* renamed from: a  reason: collision with root package name */
    public final C6417f f46734a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f46735b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f46736c;

    /* renamed from: d  reason: collision with root package name */
    public final int f46737d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46738e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f46739f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f46740g;

    public g(ArrayList arrayList) {
        byte[] bArr;
        byte[] bArr2;
        Long l10;
        h hVar;
        byte[] l02;
        byte[] l03;
        byte[] l04;
        byte[] bArr3 = c.f46719a;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            Af.d.f840Y.getClass();
            int d10 = Af.d.f841Z.d();
            J.j(16);
            String num = Integer.toString(d10, 16);
            AbstractC3557B.b0("toString(this, checkRadix(radix))", num);
            sb2.append(num);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        String Z22 = o.Z2(70, sb3);
        this.f46734a = AbstractC6415d.f49882a.c(MultipartMimeContentImpl.BOUNDARY, Z22);
        String A10 = android.gov.nist.core.a.A("--", Z22, Separators.NEWLINE);
        Charset charset = Lg.a.f11131a;
        if (AbstractC3557B.K(charset, charset)) {
            bArr = n.b2(A10);
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder);
            bArr = Le.a.c(newEncoder, A10, A10.length());
        }
        this.f46735b = bArr;
        String A11 = android.gov.nist.core.a.A("--", Z22, "--\r\n");
        if (AbstractC3557B.K(charset, charset)) {
            bArr2 = n.b2(A11);
        } else {
            CharsetEncoder newEncoder2 = charset.newEncoder();
            AbstractC3557B.b0("charset.newEncoder()", newEncoder2);
            bArr2 = Le.a.c(newEncoder2, A11, A11.length());
        }
        this.f46736c = bArr2;
        this.f46737d = bArr2.length;
        this.f46738e = (c.f46719a.length * 2) + bArr.length;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            Long l11 = null;
            if (it.hasNext()) {
                AbstractC6852k abstractC6852k = (AbstractC6852k) it.next();
                Me.c cVar = new Me.c();
                for (Map.Entry entry : abstractC6852k.f52012a.a()) {
                    List list = (List) entry.getValue();
                    StringBuilder r10 = android.gov.nist.core.a.r((String) entry.getKey(), ": ");
                    r10.append(t.m2(list, "; ", null, null, null, 62));
                    N.E0(cVar, r5, 0, r10.toString().length(), Lg.a.f11131a);
                    P4.a.V0(cVar, c.f46719a);
                }
                List list2 = AbstractC6435x.f49956a;
                String e10 = abstractC6852k.f52012a.e(SIPHeaderNames.CONTENT_LENGTH);
                if (e10 != null) {
                    l10 = Long.valueOf(Long.parseLong(e10));
                } else {
                    l10 = null;
                }
                if (abstractC6852k instanceof C6849h) {
                    hVar = new h(N.l0(cVar.p()), ((C6849h) abstractC6852k).f52008b, l10 != null ? Long.valueOf(l10.longValue() + this.f46738e + l04.length) : l11);
                } else if (abstractC6852k instanceof C6850i) {
                    Me.c cVar2 = new Me.c();
                    try {
                        N.E0(cVar2, r1, 0, ((C6850i) abstractC6852k).f52009b.length(), Lg.a.f11131a);
                        u uVar = new u(12, N.l0(cVar2.p()));
                        if (l10 == null) {
                            N.E0(cVar, r4, 0, ("Content-Length: " + l02.length).length(), Lg.a.f11131a);
                            P4.a.V0(cVar, c.f46719a);
                        }
                        hVar = new h(N.l0(cVar.p()), uVar, Long.valueOf(l02.length + this.f46738e + l03.length));
                    } catch (Throwable th2) {
                        cVar2.close();
                        throw th2;
                    }
                } else {
                    throw new RuntimeException();
                }
                arrayList2.add(hVar);
            } else {
                this.f46739f = arrayList2;
                Long l12 = 0L;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Long l13 = ((i) it2.next()).f46743b;
                        if (l13 == null) {
                            break;
                        } else if (l12 != null) {
                            l12 = Long.valueOf(l13.longValue() + l12.longValue());
                        } else {
                            l12 = null;
                        }
                    } else {
                        l11 = l12;
                        break;
                    }
                }
                this.f46740g = l11 != null ? Long.valueOf(l11.longValue() + this.f46737d) : l11;
                return;
            }
        }
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return this.f46740g;
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f46734a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(2:4|(4:6|8|76|9))|7|8|76|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        ((io.ktor.utils.io.t) r10).j(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017c, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
        P4.a.y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0180, code lost:
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: all -> 0x0034, TryCatch #6 {all -> 0x0034, blocks: (B:13:0x002f, B:37:0x00ad, B:38:0x00b4, B:40:0x00ba, B:44:0x00d5, B:47:0x00e9, B:59:0x0143, B:63:0x015a), top: B:76:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #7 {all -> 0x0080, blocks: (B:27:0x007b, B:31:0x0090, B:34:0x00a3, B:51:0x0100, B:53:0x0104, B:57:0x0123, B:25:0x0067, B:54:0x010e), top: B:76:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #6 {all -> 0x0034, blocks: (B:13:0x002f, B:37:0x00ad, B:38:0x00b4, B:40:0x00ba, B:44:0x00d5, B:47:0x00e9, B:59:0x0143, B:63:0x015a), top: B:76:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v34, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r3v17, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v12, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v14, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v16, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v17, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [io.ktor.utils.io.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0157 -> B:18:0x0044). Please submit an issue!!! */
    @Override // ze.AbstractC6847f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(io.ktor.utils.io.u uVar, AbstractC4825e abstractC4825e) {
        f fVar;
        ?? r32;
        io.ktor.utils.io.u uVar2;
        io.ktor.utils.io.u uVar3;
        g gVar;
        Iterator it;
        byte[] bArr;
        Iterator it2;
        g gVar2;
        ?? r52;
        Closeable closeable;
        i iVar;
        io.ktor.utils.io.u uVar4;
        i iVar2;
        byte[] bArr2;
        io.ktor.utils.io.u uVar5;
        Object T02;
        io.ktor.utils.io.u uVar6;
        g gVar3;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i10 = fVar.f46733l0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f46733l0 = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f46731j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                r32 = fVar.f46733l0;
                switch (r32) {
                    case 0:
                        N.B0(obj);
                        it2 = this.f46739f.iterator();
                        gVar3 = this;
                        uVar6 = uVar;
                        if (it2.hasNext()) {
                            iVar2 = (i) it2.next();
                            byte[] bArr3 = gVar3.f46735b;
                            fVar.f46727Y = gVar3;
                            fVar.f46728Z = uVar6;
                            fVar.f46729h0 = it2;
                            fVar.f46730i0 = iVar2;
                            fVar.f46733l0 = 1;
                            if (P4.a.T0(uVar6, bArr3, fVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            gVar2 = gVar3;
                            it = it2;
                            uVar5 = uVar6;
                            byte[] bArr4 = iVar2.f46742a;
                            fVar.f46727Y = gVar2;
                            fVar.f46728Z = uVar5;
                            fVar.f46729h0 = it;
                            fVar.f46730i0 = iVar2;
                            fVar.f46733l0 = 2;
                            T02 = P4.a.T0(uVar5, bArr4, fVar);
                            uVar4 = uVar5;
                            if (T02 == enumC5000a) {
                                return enumC5000a;
                            }
                            bArr2 = c.f46719a;
                            fVar.f46727Y = gVar2;
                            fVar.f46728Z = uVar4;
                            fVar.f46729h0 = it;
                            fVar.f46730i0 = iVar2;
                            fVar.f46733l0 = 3;
                            if (P4.a.T0(uVar4, bArr2, fVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            i iVar3 = iVar2;
                            r52 = uVar4;
                            iVar = iVar3;
                            if (iVar instanceof h) {
                                closeable = (Closeable) ((h) iVar).f46741c.mo122invoke();
                                fVar.f46727Y = gVar2;
                                fVar.f46728Z = r52;
                                fVar.f46729h0 = it;
                                fVar.f46730i0 = closeable;
                                fVar.f46733l0 = 4;
                                if (c.a((Me.h) closeable, r52, fVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                                closeable.close();
                            }
                            uVar3 = r52;
                            gVar = gVar2;
                            bArr = c.f46719a;
                            fVar.f46727Y = gVar;
                            fVar.f46728Z = uVar3;
                            fVar.f46729h0 = it;
                            fVar.f46730i0 = null;
                            fVar.f46733l0 = 6;
                            if (P4.a.T0(uVar3, bArr, fVar) != enumC5000a) {
                                return enumC5000a;
                            }
                            it2 = it;
                            gVar3 = gVar;
                            uVar6 = uVar3;
                            if (it2.hasNext()) {
                                byte[] bArr5 = gVar3.f46736c;
                                fVar.f46727Y = uVar6;
                                fVar.f46728Z = null;
                                fVar.f46729h0 = null;
                                fVar.f46733l0 = 7;
                                Object T03 = P4.a.T0(uVar6, bArr5, fVar);
                                uVar2 = uVar6;
                                if (T03 == enumC5000a) {
                                    return enumC5000a;
                                }
                                P4.a.y(uVar2);
                                return y.f36177a;
                            }
                        }
                    case 1:
                        i iVar4 = (i) fVar.f46730i0;
                        it = fVar.f46729h0;
                        ?? r53 = fVar.f46728Z;
                        gVar2 = (g) fVar.f46727Y;
                        N.B0(obj);
                        iVar2 = iVar4;
                        uVar5 = r53;
                        byte[] bArr42 = iVar2.f46742a;
                        fVar.f46727Y = gVar2;
                        fVar.f46728Z = uVar5;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = iVar2;
                        fVar.f46733l0 = 2;
                        T02 = P4.a.T0(uVar5, bArr42, fVar);
                        uVar4 = uVar5;
                        if (T02 == enumC5000a) {
                        }
                        bArr2 = c.f46719a;
                        fVar.f46727Y = gVar2;
                        fVar.f46728Z = uVar4;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = iVar2;
                        fVar.f46733l0 = 3;
                        if (P4.a.T0(uVar4, bArr2, fVar) == enumC5000a) {
                        }
                        break;
                    case 2:
                        i iVar5 = (i) fVar.f46730i0;
                        it = fVar.f46729h0;
                        ?? r54 = fVar.f46728Z;
                        gVar2 = (g) fVar.f46727Y;
                        N.B0(obj);
                        iVar2 = iVar5;
                        uVar4 = r54;
                        bArr2 = c.f46719a;
                        fVar.f46727Y = gVar2;
                        fVar.f46728Z = uVar4;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = iVar2;
                        fVar.f46733l0 = 3;
                        if (P4.a.T0(uVar4, bArr2, fVar) == enumC5000a) {
                        }
                        break;
                    case 3:
                        iVar = (i) fVar.f46730i0;
                        it = fVar.f46729h0;
                        r52 = fVar.f46728Z;
                        gVar2 = (g) fVar.f46727Y;
                        N.B0(obj);
                        if (iVar instanceof h) {
                        }
                        uVar3 = r52;
                        gVar = gVar2;
                        bArr = c.f46719a;
                        fVar.f46727Y = gVar;
                        fVar.f46728Z = uVar3;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = null;
                        fVar.f46733l0 = 6;
                        if (P4.a.T0(uVar3, bArr, fVar) != enumC5000a) {
                        }
                        break;
                    case 4:
                        closeable = (Closeable) fVar.f46730i0;
                        it = fVar.f46729h0;
                        r52 = fVar.f46728Z;
                        gVar2 = (g) fVar.f46727Y;
                        N.B0(obj);
                        closeable.close();
                        uVar3 = r52;
                        gVar = gVar2;
                        bArr = c.f46719a;
                        fVar.f46727Y = gVar;
                        fVar.f46728Z = uVar3;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = null;
                        fVar.f46733l0 = 6;
                        if (P4.a.T0(uVar3, bArr, fVar) != enumC5000a) {
                        }
                        break;
                    case 5:
                        Iterator it3 = fVar.f46729h0;
                        ?? r33 = fVar.f46728Z;
                        gVar = (g) fVar.f46727Y;
                        N.B0(obj);
                        it = it3;
                        uVar3 = r33;
                        bArr = c.f46719a;
                        fVar.f46727Y = gVar;
                        fVar.f46728Z = uVar3;
                        fVar.f46729h0 = it;
                        fVar.f46730i0 = null;
                        fVar.f46733l0 = 6;
                        if (P4.a.T0(uVar3, bArr, fVar) != enumC5000a) {
                        }
                        break;
                    case 6:
                        Iterator it4 = fVar.f46729h0;
                        ?? r34 = fVar.f46728Z;
                        gVar = (g) fVar.f46727Y;
                        N.B0(obj);
                        it2 = it4;
                        uVar3 = r34;
                        gVar3 = gVar;
                        uVar6 = uVar3;
                        if (it2.hasNext()) {
                        }
                        break;
                    case 7:
                        ?? r10 = (z) fVar.f46727Y;
                        N.B0(obj);
                        uVar2 = r10;
                        P4.a.y(uVar2);
                        return y.f36177a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f46731j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        r32 = fVar.f46733l0;
        switch (r32) {
        }
    }
}
