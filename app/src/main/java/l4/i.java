package l4;

import U3.u;
import Wh.F;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.N;
import f4.q;
import h4.o;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import k4.AbstractC4163e;
import k4.AbstractC4165g;
import k4.C4162d;
import k4.C4172n;
import kf.t;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q4.n;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f4.i f37814a;

    /* renamed from: b  reason: collision with root package name */
    public final u4.k f37815b;

    /* renamed from: c  reason: collision with root package name */
    public final u f37816c;

    /* renamed from: d  reason: collision with root package name */
    public final o4.e f37817d;

    public i(f4.i iVar, u4.k kVar, u uVar) {
        this.f37814a = iVar;
        this.f37815b = kVar;
        this.f37816c = uVar;
        this.f37817d = new o4.e(iVar, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c6 -> B:23:0x00cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, C4172n c4172n, f4.c cVar, q4.j jVar, Object obj, n nVar, f4.e eVar, AbstractC4825e abstractC4825e) {
        i iVar2;
        b bVar;
        int i10;
        int i11;
        f4.e eVar2;
        n nVar2;
        Object obj2;
        q4.j jVar2;
        f4.c cVar2;
        C4172n c4172n2;
        b bVar2;
        o oVar;
        List list;
        C3959i c3959i;
        iVar.getClass();
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i12 = bVar.f37759p0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f37759p0 = i12 - Integer.MIN_VALUE;
                iVar2 = iVar;
                Object obj3 = bVar.f37757n0;
                Object obj4 = EnumC5000a.f41328Y;
                i10 = bVar.f37759p0;
                String str = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        int i13 = bVar.f37756m0;
                        f4.e eVar3 = bVar.f37755l0;
                        n nVar3 = bVar.f37754k0;
                        Object obj5 = bVar.f37753j0;
                        q4.j jVar3 = bVar.f37752i0;
                        f4.c cVar3 = bVar.f37751h0;
                        C4172n c4172n3 = bVar.f37750Z;
                        i iVar3 = bVar.f37749Y;
                        N.B0(obj3);
                        b bVar3 = bVar;
                        cVar2 = cVar3;
                        i11 = i13;
                        iVar2 = iVar3;
                        eVar2 = eVar3;
                        jVar2 = jVar3;
                        nVar2 = nVar3;
                        obj2 = obj5;
                        h4.g gVar = (h4.g) obj3;
                        eVar2.getClass();
                        if (gVar == null) {
                            h4.f fVar = c4172n3.f37032c;
                            F f6 = c4172n3.f37030a;
                            if (f6 instanceof o) {
                                oVar = (o) f6;
                            } else {
                                oVar = null;
                            }
                            if (oVar != null) {
                                str = oVar.f31898h0;
                            }
                            obj4 = new C4335a(gVar.f31884a, gVar.f31885b, fVar, str);
                            return obj4;
                        }
                        c4172n2 = c4172n3;
                        bVar2 = bVar3;
                        f4.i iVar4 = iVar2.f37814a;
                        list = cVar2.f29597e;
                        if (i11 >= list.size()) {
                            h4.c cVar4 = (h4.c) list.get(i11);
                            cVar4.getClass();
                            c3959i = new C3959i(new h4.e(c4172n2.f37030a, nVar2, cVar4.f31869b, cVar4.f31868a), Integer.valueOf(i11));
                        } else {
                            c3959i = null;
                        }
                        if (c3959i == null) {
                            int intValue = ((Number) c3959i.f36156Z).intValue() + 1;
                            eVar2.getClass();
                            bVar2.f37749Y = iVar2;
                            bVar2.f37750Z = c4172n2;
                            bVar2.f37751h0 = cVar2;
                            bVar2.f37752i0 = jVar2;
                            bVar2.f37753j0 = obj2;
                            bVar2.f37754k0 = nVar2;
                            bVar2.f37755l0 = eVar2;
                            bVar2.getClass();
                            bVar2.f37756m0 = intValue;
                            bVar2.f37759p0 = 1;
                            Object a5 = ((h4.e) ((h4.i) c3959i.f36155Y)).a(bVar2);
                            if (a5 != obj4) {
                                b bVar4 = bVar2;
                                c4172n3 = c4172n2;
                                obj3 = a5;
                                i11 = intValue;
                                bVar3 = bVar4;
                                h4.g gVar2 = (h4.g) obj3;
                                eVar2.getClass();
                                if (gVar2 == null) {
                                }
                            }
                            return obj4;
                        }
                        throw new IllegalStateException(("Unable to create a decoder that supports: " + obj2).toString());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj3);
                jVar2 = jVar;
                obj2 = obj;
                nVar2 = nVar;
                eVar2 = eVar;
                i11 = 0;
                bVar2 = bVar;
                c4172n2 = c4172n;
                cVar2 = cVar;
                f4.i iVar42 = iVar2.f37814a;
                list = cVar2.f29597e;
                if (i11 >= list.size()) {
                }
                if (c3959i == null) {
                }
            }
        }
        iVar2 = iVar;
        bVar = new b(iVar2, abstractC4825e);
        Object obj32 = bVar.f37757n0;
        Object obj42 = EnumC5000a.f41328Y;
        i10 = bVar.f37759p0;
        String str2 = null;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:4|(7:6|7|9|115|(1:(1:(1:(5:14|81|(1:83)(1:84)|(1:88)|89)(2:15|16))(8:17|18|58|65|(1:67)(1:68)|(1:72)|73|(3:75|(1:77)|79)))(3:21|22|23))(19:24|116|25|113|26|27|28|(7:31|32|33|(2:118|35)|(1:39)|40|41)|42|43|44|45|46|47|48|122|49|(1:51)|89)|52|(2:54|(2:56|89)(7:57|58|65|(0)(0)|(2:70|72)|73|(0)))(6:59|(10:61|62|111|63|64|65|(0)(0)|(0)|73|(0))(4:92|120|93|94)|102|(1:104)(1:105)|(1:109)|110)))|8|7|9|115|(0)(0)|52|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01de, code lost:
        if (r7.f43857p == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f6, code lost:
        if (r1 == r10) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141 A[Catch: all -> 0x0055, TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:22:0x006b, B:52:0x0136, B:54:0x0141, B:58:0x0176, B:59:0x017f, B:61:0x0183), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f A[Catch: all -> 0x0055, TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:22:0x006b, B:52:0x0136, B:54:0x0141, B:58:0x0176, B:59:0x017f, B:61:0x0183), top: B:115:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Type inference failed for: r10v0, types: [of.a] */
    /* JADX WARN: Type inference failed for: r10v3, types: [l4.a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, q4.j jVar, Object obj, n nVar, f4.e eVar, AbstractC4825e abstractC4825e) {
        c cVar;
        B b10;
        C4172n c4172n;
        Throwable th2;
        Object obj2;
        C4172n c4172n2;
        F f6;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap;
        f4.e eVar2;
        i iVar2;
        B b11;
        q4.j jVar2;
        C4335a c4335a;
        Object obj3;
        C4172n c4172n3;
        List list;
        F f10;
        i iVar3;
        q4.j jVar3;
        f4.e eVar3;
        B b12;
        Object obj4;
        B b13;
        B b14;
        B b15;
        f4.e eVar4;
        AbstractC4163e abstractC4163e;
        f4.c cVar2;
        n nVar2;
        i iVar4 = iVar;
        iVar.getClass();
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i10 = cVar.f37770p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f37770p0 = i10 - Integer.MIN_VALUE;
                c cVar3 = cVar;
                Object obj5 = cVar3.f37768n0;
                Object obj6 = EnumC5000a.f41328Y;
                b10 = cVar3.f37770p0;
                if (b10 == 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 == 3) {
                                N.B0(obj5);
                                bitmapDrawable = null;
                                obj6 = (C4335a) obj5;
                                Drawable drawable = obj6.f37745a;
                                if (drawable instanceof BitmapDrawable) {
                                    bitmapDrawable2 = (BitmapDrawable) drawable;
                                } else {
                                    bitmapDrawable2 = bitmapDrawable;
                                }
                                if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
                                    bitmap.prepareToDraw();
                                }
                                return obj6;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b10 = cVar3.f37764j0;
                        b12 = (B) cVar3.f37763i0;
                        eVar3 = (f4.e) cVar3.f37762h0;
                        jVar3 = cVar3.f37761Z;
                        iVar3 = cVar3.f37760Y;
                        N.B0(obj5);
                        c4335a = (C4335a) obj5;
                        b11 = b12;
                        eVar2 = eVar3;
                        jVar2 = jVar3;
                        iVar2 = iVar3;
                        obj3 = b10.f37622Y;
                        if (obj3 instanceof C4172n) {
                            c4172n3 = (C4172n) obj3;
                        } else {
                            c4172n3 = null;
                        }
                        if (c4172n3 != null && (f10 = c4172n3.f37030a) != null) {
                            u4.e.a(f10);
                        }
                        n nVar3 = (n) b11.f37622Y;
                        bitmapDrawable = null;
                        cVar3.f37760Y = null;
                        cVar3.f37761Z = null;
                        cVar3.f37762h0 = null;
                        cVar3.f37763i0 = null;
                        cVar3.f37764j0 = null;
                        cVar3.f37765k0 = null;
                        cVar3.f37766l0 = null;
                        cVar3.f37767m0 = null;
                        cVar3.f37770p0 = 3;
                        iVar2.getClass();
                        list = jVar2.f43853l;
                        obj5 = c4335a;
                        if (!list.isEmpty()) {
                            if (!(c4335a.f37745a instanceof BitmapDrawable)) {
                                obj5 = c4335a;
                            }
                            obj5 = Ad.l.n1(cVar3, jVar2.f43867z, new h(iVar2, c4335a, nVar3, list, eVar2, jVar2, null));
                        }
                    } else {
                        B b16 = cVar3.f37767m0;
                        b10 = cVar3.f37766l0;
                        B b17 = cVar3.f37765k0;
                        B b18 = cVar3.f37764j0;
                        f4.e eVar5 = (f4.e) cVar3.f37763i0;
                        Object obj7 = cVar3.f37762h0;
                        jVar2 = cVar3.f37761Z;
                        i iVar5 = cVar3.f37760Y;
                        N.B0(obj5);
                        b15 = b16;
                        b13 = b17;
                        b14 = b18;
                        eVar4 = eVar5;
                        obj4 = obj7;
                        iVar4 = iVar5;
                    }
                } else {
                    N.B0(obj5);
                    ?? obj8 = new Object();
                    obj8.f37622Y = nVar;
                    ?? obj9 = new Object();
                    obj9.f37622Y = ((q) iVar4.f37814a).f29639h;
                    ?? obj10 = new Object();
                    try {
                        try {
                            obj8.f37622Y = iVar4.f37816c.R((n) obj8.f37622Y);
                            C3959i c3959i = jVar.f43851j;
                            h4.c cVar4 = jVar.f43852k;
                            if (c3959i != null || cVar4 != null) {
                                f4.c cVar5 = (f4.c) obj9.f37622Y;
                                cVar5.getClass();
                                ArrayList M22 = t.M2(cVar5.f29593a);
                                ArrayList M23 = t.M2(cVar5.f29594b);
                                ArrayList M24 = t.M2(cVar5.f29595c);
                                ArrayList M25 = t.M2(cVar5.f29596d);
                                ArrayList M26 = t.M2(cVar5.f29597e);
                                C3959i c3959i2 = jVar.f43851j;
                                if (c3959i2 != null) {
                                    try {
                                        M25.add(0, c3959i2);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        b10 = obj10;
                                        c4172n = null;
                                        obj2 = b10.f37622Y;
                                        if (obj2 instanceof C4172n) {
                                        }
                                        if (c4172n2 != null) {
                                            u4.e.a(f6);
                                        }
                                        throw th2;
                                    }
                                }
                                if (cVar4 != null) {
                                    M26.add(0, cVar4);
                                }
                                obj9.f37622Y = new f4.c(A7.b.S1(M22), A7.b.S1(M23), A7.b.S1(M24), A7.b.S1(M25), A7.b.S1(M26));
                            }
                            cVar2 = (f4.c) obj9.f37622Y;
                            nVar2 = (n) obj8.f37622Y;
                            cVar3.f37760Y = iVar4;
                            cVar3.f37761Z = jVar;
                            cVar3.f37762h0 = obj;
                            eVar4 = eVar;
                            cVar3.f37763i0 = eVar4;
                            cVar3.f37764j0 = obj8;
                            cVar3.f37765k0 = obj9;
                            cVar3.f37766l0 = obj10;
                            cVar3.f37767m0 = obj10;
                            cVar3.f37770p0 = 1;
                            b15 = obj10;
                        } catch (Throwable th4) {
                            th2 = th4;
                            b15 = obj10;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        b15 = obj10;
                    }
                    try {
                        obj5 = iVar.c(cVar2, jVar, obj, nVar2, eVar, cVar3);
                        if (obj5 != obj6) {
                            jVar2 = jVar;
                            obj4 = obj;
                            b10 = b15;
                            b13 = obj9;
                            b14 = obj8;
                        }
                        return obj6;
                    } catch (Throwable th6) {
                        th2 = th6;
                        c4172n = null;
                        b10 = b15;
                        obj2 = b10.f37622Y;
                        if (obj2 instanceof C4172n) {
                        }
                        if (c4172n2 != null) {
                        }
                        throw th2;
                    }
                }
                b15.f37622Y = obj5;
                Object obj11 = b10.f37622Y;
                abstractC4163e = (AbstractC4163e) obj11;
                if (!(abstractC4163e instanceof C4172n)) {
                    Ng.B b19 = jVar2.f43866y;
                    d dVar = new d(iVar4, b10, b13, jVar2, obj4, b14, eVar4, null);
                    cVar3.f37760Y = iVar4;
                    cVar3.f37761Z = jVar2;
                    cVar3.f37762h0 = eVar4;
                    cVar3.f37763i0 = b14;
                    cVar3.f37764j0 = b10;
                    cVar3.f37765k0 = null;
                    cVar3.f37766l0 = null;
                    cVar3.f37767m0 = null;
                    cVar3.f37770p0 = 2;
                    obj5 = Ad.l.n1(cVar3, b19, dVar);
                    if (obj5 != obj6) {
                        iVar3 = iVar4;
                        jVar3 = jVar2;
                        eVar3 = eVar4;
                        b12 = b14;
                        c4335a = (C4335a) obj5;
                        b11 = b12;
                        eVar2 = eVar3;
                        jVar2 = jVar3;
                        iVar2 = iVar3;
                        obj3 = b10.f37622Y;
                        if (obj3 instanceof C4172n) {
                        }
                        if (c4172n3 != null) {
                            u4.e.a(f10);
                        }
                        n nVar32 = (n) b11.f37622Y;
                        bitmapDrawable = null;
                        cVar3.f37760Y = null;
                        cVar3.f37761Z = null;
                        cVar3.f37762h0 = null;
                        cVar3.f37763i0 = null;
                        cVar3.f37764j0 = null;
                        cVar3.f37765k0 = null;
                        cVar3.f37766l0 = null;
                        cVar3.f37767m0 = null;
                        cVar3.f37770p0 = 3;
                        iVar2.getClass();
                        list = jVar2.f43853l;
                        obj5 = c4335a;
                        if (!list.isEmpty()) {
                        }
                    } else {
                        return obj6;
                    }
                } else {
                    if (abstractC4163e instanceof C4162d) {
                        try {
                            iVar2 = iVar4;
                            c4335a = new C4335a(((C4162d) obj11).f37005a, ((C4162d) obj11).f37006b, ((C4162d) obj11).f37007c, null);
                            eVar2 = eVar4;
                            b11 = b14;
                            obj3 = b10.f37622Y;
                            if (obj3 instanceof C4172n) {
                            }
                            if (c4172n3 != null) {
                            }
                            n nVar322 = (n) b11.f37622Y;
                            bitmapDrawable = null;
                            cVar3.f37760Y = null;
                            cVar3.f37761Z = null;
                            cVar3.f37762h0 = null;
                            cVar3.f37763i0 = null;
                            cVar3.f37764j0 = null;
                            cVar3.f37765k0 = null;
                            cVar3.f37766l0 = null;
                            cVar3.f37767m0 = null;
                            cVar3.f37770p0 = 3;
                            iVar2.getClass();
                            list = jVar2.f43853l;
                            obj5 = c4335a;
                            if (!list.isEmpty()) {
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            c4172n = null;
                        }
                    } else {
                        c4172n = null;
                        try {
                            throw new RuntimeException();
                        } catch (Throwable th8) {
                            th2 = th8;
                        }
                    }
                    obj2 = b10.f37622Y;
                    if (obj2 instanceof C4172n) {
                        c4172n2 = (C4172n) obj2;
                    } else {
                        c4172n2 = c4172n;
                    }
                    if (c4172n2 != null && (f6 = c4172n2.f37030a) != null) {
                        u4.e.a(f6);
                    }
                    throw th2;
                }
            }
        }
        cVar = new c(iVar4, abstractC4825e);
        c cVar32 = cVar;
        Object obj52 = cVar32.f37768n0;
        Object obj62 = EnumC5000a.f41328Y;
        b10 = cVar32.f37770p0;
        if (b10 == 0) {
        }
        b15.f37622Y = obj52;
        Object obj112 = b10.f37622Y;
        abstractC4163e = (AbstractC4163e) obj112;
        if (!(abstractC4163e instanceof C4172n)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0082). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f4.c cVar, q4.j jVar, Object obj, n nVar, f4.e eVar, AbstractC4825e abstractC4825e) {
        e eVar2;
        int i10;
        i iVar;
        C4172n c4172n;
        F f6;
        int i11;
        C3959i a5;
        if (abstractC4825e instanceof e) {
            eVar2 = (e) abstractC4825e;
            int i12 = eVar2.f37788o0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar2.f37788o0 = i12 - Integer.MIN_VALUE;
                Object obj2 = eVar2.f37786m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar2.f37788o0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        int i13 = eVar2.f37785l0;
                        f4.e eVar3 = eVar2.f37784k0;
                        n nVar2 = eVar2.f37783j0;
                        Object obj3 = eVar2.f37782i0;
                        q4.j jVar2 = eVar2.f37781h0;
                        f4.c cVar2 = eVar2.f37780Z;
                        iVar = eVar2.f37779Y;
                        N.B0(obj2);
                        e eVar4 = eVar2;
                        int i14 = i13;
                        cVar = cVar2;
                        e eVar5 = eVar4;
                        eVar = eVar3;
                        jVar = jVar2;
                        nVar = nVar2;
                        obj = obj3;
                        AbstractC4163e abstractC4163e = (AbstractC4163e) obj2;
                        try {
                            eVar.getClass();
                            if (abstractC4163e == null) {
                                return abstractC4163e;
                            }
                            i11 = i14;
                            eVar2 = eVar5;
                            a5 = cVar.a(obj, nVar, iVar.f37814a, i11);
                            if (a5 == null) {
                                int intValue = ((Number) a5.f36156Z).intValue() + 1;
                                eVar.getClass();
                                eVar2.f37779Y = iVar;
                                eVar2.f37780Z = cVar;
                                eVar2.f37781h0 = jVar;
                                eVar2.f37782i0 = obj;
                                eVar2.f37783j0 = nVar;
                                eVar2.f37784k0 = eVar;
                                eVar2.getClass();
                                eVar2.f37785l0 = intValue;
                                eVar2.f37788o0 = 1;
                                Object a10 = ((AbstractC4165g) a5.f36155Y).a(eVar2);
                                if (a10 == enumC5000a) {
                                    return enumC5000a;
                                }
                                e eVar6 = eVar2;
                                i14 = intValue;
                                obj2 = a10;
                                eVar5 = eVar6;
                                AbstractC4163e abstractC4163e2 = (AbstractC4163e) obj2;
                                eVar.getClass();
                                if (abstractC4163e2 == null) {
                                }
                            } else {
                                throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                            }
                        } catch (Throwable th2) {
                            if (abstractC4163e2 instanceof C4172n) {
                                c4172n = (C4172n) abstractC4163e2;
                            } else {
                                c4172n = null;
                            }
                            if (c4172n != null && (f6 = c4172n.f37030a) != null) {
                                u4.e.a(f6);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    i11 = 0;
                    iVar = this;
                    a5 = cVar.a(obj, nVar, iVar.f37814a, i11);
                    if (a5 == null) {
                    }
                }
            }
        }
        eVar2 = new e(this, abstractC4825e);
        Object obj22 = eVar2.f37786m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar2.f37788o0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(l lVar, AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        i iVar;
        Throwable th2;
        o4.d dVar;
        l lVar2 = lVar;
        o4.e eVar = this.f37817d;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f37793j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f37793j0 = i11 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f37791h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar2.f37793j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        l lVar3 = fVar2.f37790Z;
                        iVar = fVar2.f37789Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            lVar2 = lVar3;
                            if (th2 instanceof CancellationException) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    try {
                        q4.j jVar = lVar2.f37826d;
                        Object obj2 = jVar.f43843b;
                        r4.h hVar = lVar2.f37827e;
                        Bitmap.Config[] configArr = u4.e.f46388a;
                        f4.e eVar2 = lVar2.f37828f;
                        n L10 = this.f37816c.L(jVar, hVar);
                        r4.g gVar = L10.f43873e;
                        eVar2.getClass();
                        List list = ((q) this.f37814a).f29639h.f29594b;
                        int size = list.size();
                        Object obj3 = obj2;
                        int i12 = 0;
                        while (i12 < size) {
                            C3959i c3959i = (C3959i) list.get(i12);
                            n4.b bVar = (n4.b) c3959i.f36155Y;
                            List list2 = list;
                            if (((Class) c3959i.f36156Z).isAssignableFrom(obj3.getClass())) {
                                AbstractC3557B.a0("null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>", bVar);
                                Object a5 = bVar.a(obj3, L10);
                                if (a5 != null) {
                                    obj3 = a5;
                                }
                            }
                            i12++;
                            list = list2;
                        }
                        o4.c b10 = eVar.b(jVar, obj3, L10, eVar2);
                        if (b10 != null) {
                            dVar = eVar.a(jVar, b10, hVar, gVar);
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            return o4.e.c(lVar2, jVar, b10, dVar);
                        }
                        Ng.B b11 = jVar.f43865x;
                        g gVar2 = new g(this, jVar, obj3, L10, eVar2, b10, lVar, null);
                        fVar2.f37789Y = this;
                        fVar2.f37790Z = lVar2;
                        fVar2.f37793j0 = 1;
                        obj = Ad.l.n1(fVar2, b11, gVar2);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        iVar = this;
                        if (th2 instanceof CancellationException) {
                            u uVar = iVar.f37816c;
                            q4.j jVar2 = lVar2.f37826d;
                            uVar.getClass();
                            return u.k(jVar2, th2);
                        }
                        throw th2;
                    }
                }
                return obj;
            }
        }
        fVar = new f(this, abstractC4825e);
        f fVar22 = fVar;
        Object obj4 = fVar22.f37791h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar22.f37793j0;
        if (i10 == 0) {
        }
        return obj4;
    }
}
