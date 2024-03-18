package Sa;

import Df.H;
import F.s;
import Jc.AbstractC0810d;
import Jc.n;
import Jc.o;
import Jc.p;
import Ta.l;
import Vc.q;
import Vc.r;
import Vc.t;
import Vc.w;
import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import jf.C3963m;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import ld.C4429b;
import nd.C4812a;
import nf.AbstractC4825e;
import o9.C4953a;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes2.dex */
public final class f implements Ic.c {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f16463Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC0810d f16464Z;

    /* renamed from: h0  reason: collision with root package name */
    public final i f16465h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C4953a f16466i0;

    /* renamed from: k0  reason: collision with root package name */
    public final C3963m f16468k0;

    /* renamed from: j0  reason: collision with root package name */
    public final Pc.g f16467j0 = Bi.c.i1(Pc.b.f13930h0);

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f16469l0 = new ArrayList();

    public f(Application application, AbstractC0810d abstractC0810d, i iVar, C4812a c4812a, C4429b c4429b, C4953a c4953a) {
        this.f16463Y = application;
        this.f16464Z = abstractC0810d;
        this.f16465h0 = iVar;
        this.f16466i0 = c4953a;
        this.f16468k0 = R4.b.D1(new s(c4812a, this, c4429b, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Type inference failed for: r12v12, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ac -> B:27:0x00b0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, String str, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        f fVar2;
        String str2;
        B b10;
        B b11;
        Object obj;
        B b12;
        fVar.getClass();
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i15 = bVar.f16440n0;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f16440n0 = i15 - Integer.MIN_VALUE;
                Object obj2 = bVar.f16438l0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f16440n0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = bVar.f16437k0;
                            int i16 = bVar.f16436j0;
                            B b13 = bVar.f16434h0;
                            String str3 = bVar.f16433Z;
                            f fVar3 = bVar.f16432Y;
                            N.B0(obj2);
                            B b14 = b13;
                            i12 = i16;
                            str = str3;
                            i13 = i11 + 1;
                            fVar = fVar3;
                            b12 = b14;
                            if (i13 < i12) {
                                AbstractC0810d abstractC0810d = fVar.f16464Z;
                                bVar.f16432Y = fVar;
                                bVar.f16433Z = str;
                                bVar.f16434h0 = b12;
                                bVar.f16435i0 = b12;
                                bVar.f16436j0 = i12;
                                bVar.f16437k0 = i13;
                                bVar.f16440n0 = 1;
                                Object a5 = ((l) abstractC0810d).a(str, bVar);
                                if (a5 != enumC5000a) {
                                    fVar2 = fVar;
                                    i11 = i13;
                                    b10 = b12;
                                    obj2 = a5;
                                    str2 = str;
                                    i14 = i12;
                                    b11 = b10;
                                    b11.f37622Y = obj2;
                                    obj = b10.f37622Y;
                                    if (obj instanceof r) {
                                        return obj;
                                    }
                                    Mg.a aVar = Mg.b.f12127Z;
                                    long x02 = H.x0(1, Mg.d.f12134i0);
                                    bVar.f16432Y = fVar2;
                                    bVar.f16433Z = str2;
                                    bVar.f16434h0 = b10;
                                    bVar.f16435i0 = null;
                                    bVar.f16436j0 = i14;
                                    bVar.f16437k0 = i11;
                                    bVar.f16440n0 = 2;
                                    if (R4.b.q0(x02, bVar) != enumC5000a) {
                                        i12 = i14;
                                        b14 = b10;
                                        str = str2;
                                        fVar3 = fVar2;
                                        i13 = i11 + 1;
                                        fVar = fVar3;
                                        b12 = b14;
                                        if (i13 < i12) {
                                            return b12.f37622Y;
                                        }
                                    } else {
                                        return enumC5000a;
                                    }
                                } else {
                                    return enumC5000a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i11 = bVar.f16437k0;
                        i14 = bVar.f16436j0;
                        b11 = bVar.f16435i0;
                        b10 = bVar.f16434h0;
                        str2 = bVar.f16433Z;
                        fVar2 = bVar.f16432Y;
                        N.B0(obj2);
                        b11.f37622Y = obj2;
                        obj = b10.f37622Y;
                        if (obj instanceof r) {
                        }
                    }
                } else {
                    N.B0(obj2);
                    ?? obj3 = new Object();
                    obj3.f37622Y = q.f18560a;
                    i12 = 15;
                    i13 = 0;
                    b12 = obj3;
                    if (i13 < i12) {
                    }
                }
            }
        }
        bVar = new b(fVar, abstractC4825e);
        Object obj22 = bVar.f16438l0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f16440n0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (r15.equals("skipped") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (r15.equals("success") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return r6.f37622Y;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0123 -> B:51:0x0127). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(f fVar, String str, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        f fVar2;
        String str2;
        B b10;
        B b11;
        Object obj;
        w wVar;
        long x02;
        p pVar;
        o oVar;
        n nVar;
        String str3;
        int hashCode;
        B b12;
        fVar.getClass();
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i15 = cVar.f16449n0;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f16449n0 = i15 - Integer.MIN_VALUE;
                Object obj2 = cVar.f16447l0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f16449n0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = cVar.f16446k0;
                            int i16 = cVar.f16445j0;
                            B b13 = cVar.f16443h0;
                            String str4 = cVar.f16442Z;
                            f fVar3 = cVar.f16441Y;
                            N.B0(obj2);
                            B b14 = b13;
                            i12 = i16;
                            str = str4;
                            i13 = i11 + 1;
                            fVar = fVar3;
                            b12 = b14;
                            if (i13 < i12) {
                                AbstractC0810d abstractC0810d = fVar.f16464Z;
                                cVar.f16441Y = fVar;
                                cVar.f16442Z = str;
                                cVar.f16443h0 = b12;
                                cVar.f16444i0 = b12;
                                cVar.f16445j0 = i12;
                                cVar.f16446k0 = i13;
                                cVar.f16449n0 = 1;
                                l lVar = (l) abstractC0810d;
                                lVar.getClass();
                                Ta.f fVar4 = new Ta.f(str, null);
                                Df.w a5 = C.a(p.class);
                                Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(p.class), a5);
                                Yc.f fVar5 = lVar.f17014a;
                                fVar5.getClass();
                                Object S = W.S(fVar5, n22, fVar4, cVar);
                                if (S != enumC5000a) {
                                    fVar2 = fVar;
                                    i11 = i13;
                                    b10 = b12;
                                    obj2 = S;
                                    str2 = str;
                                    i14 = i12;
                                    b11 = b10;
                                    b11.f37622Y = obj2;
                                    obj = b10.f37622Y;
                                    if (!(obj instanceof w)) {
                                        wVar = (w) obj;
                                    } else {
                                        wVar = null;
                                    }
                                    if (wVar != null && (pVar = (p) wVar.f18565a) != null && (oVar = pVar.f9061a) != null && (nVar = oVar.f9060a) != null && (str3 = nVar.f9059a) != null) {
                                        hashCode = str3.hashCode();
                                        if (hashCode != -1867169789) {
                                            if (hashCode != -1281977283) {
                                                if (hashCode == 2147444528) {
                                                }
                                            } else if (str3.equals("failed")) {
                                                return new t(new IllegalArgumentException("Failed to index retrieval file"));
                                            }
                                        }
                                        i13 = i11 + 1;
                                        fVar = fVar3;
                                        b12 = b14;
                                        if (i13 < i12) {
                                            return b12.f37622Y;
                                        }
                                    }
                                    Mg.a aVar = Mg.b.f12127Z;
                                    x02 = H.x0(1, Mg.d.f12134i0);
                                    cVar.f16441Y = fVar2;
                                    cVar.f16442Z = str2;
                                    cVar.f16443h0 = b10;
                                    cVar.f16444i0 = null;
                                    cVar.f16445j0 = i14;
                                    cVar.f16446k0 = i11;
                                    cVar.f16449n0 = 2;
                                    if (R4.b.q0(x02, cVar) == enumC5000a) {
                                        i12 = i14;
                                        b14 = b10;
                                        str = str2;
                                        fVar3 = fVar2;
                                        i13 = i11 + 1;
                                        fVar = fVar3;
                                        b12 = b14;
                                        if (i13 < i12) {
                                        }
                                    } else {
                                        return enumC5000a;
                                    }
                                } else {
                                    return enumC5000a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i11 = cVar.f16446k0;
                        i14 = cVar.f16445j0;
                        b11 = cVar.f16444i0;
                        b10 = cVar.f16443h0;
                        str2 = cVar.f16442Z;
                        fVar2 = cVar.f16441Y;
                        N.B0(obj2);
                        b11.f37622Y = obj2;
                        obj = b10.f37622Y;
                        if (!(obj instanceof w)) {
                        }
                        if (wVar != null) {
                            hashCode = str3.hashCode();
                            if (hashCode != -1867169789) {
                            }
                            i13 = i11 + 1;
                            fVar = fVar3;
                            b12 = b14;
                            if (i13 < i12) {
                            }
                        }
                        Mg.a aVar2 = Mg.b.f12127Z;
                        x02 = H.x0(1, Mg.d.f12134i0);
                        cVar.f16441Y = fVar2;
                        cVar.f16442Z = str2;
                        cVar.f16443h0 = b10;
                        cVar.f16444i0 = null;
                        cVar.f16445j0 = i14;
                        cVar.f16446k0 = i11;
                        cVar.f16449n0 = 2;
                        if (R4.b.q0(x02, cVar) == enumC5000a) {
                        }
                    }
                } else {
                    N.B0(obj2);
                    ?? obj3 = new Object();
                    obj3.f37622Y = q.f18560a;
                    i12 = 15;
                    i13 = 0;
                    b12 = obj3;
                    if (i13 < i12) {
                    }
                }
            }
        }
        cVar = new c(fVar, abstractC4825e);
        Object obj22 = cVar.f16447l0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f16449n0;
        if (i10 == 0) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f16469l0.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final File i() {
        File createTempFile = File.createTempFile(UUID.randomUUID().toString(), "", (File) this.f16468k0.getValue());
        ArrayList arrayList = this.f16469l0;
        AbstractC3557B.Z(createTempFile);
        arrayList.add(createTempFile);
        return createTempFile;
    }
}
