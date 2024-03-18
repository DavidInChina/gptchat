package Oa;

import Df.H;
import Df.w;
import Ha.g;
import Ha.h;
import Ha.i;
import L9.C0897c;
import Lg.n;
import Q9.j;
import Vc.q;
import Vc.r;
import Vc.x;
import ca.C2311c;
import ca.C2321m;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.LinkedHashMap;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.C6182c0;
import wd.p0;
import wd.u0;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final i f13666a;

    public e(i iVar) {
        this.f13666a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, AbstractC4825e abstractC4825e, boolean z10) {
        a aVar;
        int i10;
        x xVar;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i11 = aVar.f13655h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f13655h0 = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f13653Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f13655h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    aVar.f13655h0 = 1;
                    i iVar = this.f13666a;
                    iVar.getClass();
                    Ha.e eVar = new Ha.e(new Q9.c(str, str2, z10), null);
                    w a5 = C.a(Q9.f.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Q9.f.class), a5);
                    Yc.a aVar2 = iVar.f7588a;
                    aVar2.getClass();
                    obj = W.S(aVar2, n22, eVar, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    Q9.f fVar = (Q9.f) ((Vc.w) xVar).f18565a;
                    AbstractC3557B.c0("<this>", fVar);
                    return new u0(new Q9.i(fVar.f14531a, fVar.f14532b, fVar.f14536f));
                } else if (xVar instanceof q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof r) {
                        xVar.getClass();
                        return x.a((r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f13653Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f13655h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f13658h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f13658h0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f13656Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f13658h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    bVar.f13658h0 = 1;
                    i iVar = this.f13666a;
                    iVar.getClass();
                    Ha.f fVar = new Ha.f(str, null);
                    w a5 = C.a(y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                    Yc.a aVar = iVar.f7588a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, fVar, bVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        bVar = new b(this, abstractC4825e);
        Object obj2 = bVar.f13656Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f13658h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        x xVar;
        boolean z10;
        String str2 = str;
        if (abstractC4825e instanceof c) {
            cVar = (c) abstractC4825e;
            int i11 = cVar.f13662i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f13662i0 = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f13660Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = cVar.f13662i0;
                String str3 = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str2 = cVar.f13659Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    cVar.f13659Y = str2;
                    cVar.f13662i0 = 1;
                    i iVar = this.f13666a;
                    iVar.getClass();
                    g gVar = new g(str2, null);
                    w a5 = C.a(C0897c.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C0897c.class), a5);
                    Yc.a aVar = iVar.f7588a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, gVar, cVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                String str4 = str2;
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    AbstractC3557B.c0("value", str4);
                    C0897c c0897c = (C0897c) ((Vc.w) xVar).f18565a;
                    AbstractC3557B.c0("$this$toDomainConversation", c0897c);
                    C3931c.Companion.getClass();
                    boolean z11 = false;
                    String str5 = c0897c.f10908a;
                    if (str5 != null && str5.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    C3931c c3931c = new C3931c(str5, z10, true, (String) null, false, 24);
                    Qa.e U12 = A7.b.U1(c0897c.f10914g, str4, c3931c);
                    String str6 = c0897c.f10910c;
                    if (str6 != null) {
                        str3 = n.U2(str6).toString();
                    }
                    String str7 = str3;
                    List list = c0897c.f10915h;
                    int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                    if (n02 < 16) {
                        n02 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                    for (Object obj2 : list) {
                        linkedHashMap.put(new C6182c0(((P9.f) obj2).f13883a), obj2);
                    }
                    C2311c c2311c = new C2311c(str4, str4, c0897c.f10912e, c0897c.f10913f, c0897c.f10911d, str7, linkedHashMap, c0897c.f10917j, false, U12, 7808);
                    Boolean bool = c0897c.f10909b;
                    if (bool != null) {
                        z11 = bool.booleanValue();
                    }
                    return new u0(new C2321m(c2311c, c3931c, z11));
                } else if (xVar instanceof q) {
                    return p0.f48449a;
                } else {
                    if (xVar instanceof r) {
                        xVar.getClass();
                        return x.a((r) xVar);
                    }
                    throw new RuntimeException();
                }
            }
        }
        cVar = new c(this, abstractC4825e);
        Object obj3 = cVar.f13660Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f13662i0;
        String str32 = null;
        if (i10 == 0) {
        }
        String str42 = str2;
        xVar = (x) obj3;
        if (!(xVar instanceof Vc.w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, AbstractC4825e abstractC4825e, boolean z10) {
        d dVar;
        int i10;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f13665h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f13665h0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f13663Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f13665h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    dVar.f13665h0 = 1;
                    i iVar = this.f13666a;
                    iVar.getClass();
                    h hVar = new h(new Ha.c(Boolean.valueOf(z10), str2), str, null);
                    w a5 = C.a(y.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(y.class), a5);
                    Yc.a aVar = iVar.f7588a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, hVar, dVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((x) obj).b();
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f13663Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f13665h0;
        if (i10 == 0) {
        }
        return ((x) obj2).b();
    }
}
