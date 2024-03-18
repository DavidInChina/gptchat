package Lc;

import Ng.AbstractC1073l0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import xe.C6410O;
import xe.C6419h;
import xe.C6433v;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10980Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public int f10981Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f10982h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f10983i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f10984j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f10984j0 = bVar;
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10980Y) {
            case 0:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            default:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r9 == r2) goto L16;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6433v c6433v;
        String str;
        Object obj2;
        Object obj3 = this.f10984j0;
        jf.y yVar = jf.y.f36177a;
        switch (this.f10980Y) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i10 = this.f10981Z;
                if (i10 != 0) {
                    if (i10 == 1) {
                        str = (String) this.f10982h0;
                        c6433v = (C6433v) this.f10983i0;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C6433v c6433v2 = ((C5760d) ((Ie.e) this.f10983i0).f8578Y).f46127c;
                    e eVar = ((b) obj3).f10985a;
                    this.f10983i0 = c6433v2;
                    this.f10982h0 = "OAI-Device-Id";
                    this.f10981Z = 1;
                    Object a5 = eVar.a(this);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    c6433v = c6433v2;
                    obj = a5;
                    str = "OAI-Device-Id";
                }
                c6433v.f(str, (String) obj);
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i11 = this.f10981Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    Ie.e eVar2 = (Ie.e) this.f10982h0;
                    if (!((C5760d) eVar2.f8578Y).f46130f.a(Vc.m.f18555c)) {
                        C6410O b10 = ((C5760d) eVar2.f8578Y).f46125a.b();
                        this.f10981Z = 1;
                        obj = pe.o.a((ge.d) this.f10983i0, b10, this);
                        break;
                    } else {
                        return yVar;
                    }
                }
                List list = (List) obj;
                Ei.a aVar = pe.o.f43135a;
                AbstractC3557B.c0("<this>", list);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3557B.K(((C6419h) obj2).f49888a, "_playintegrity")) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (((C6419h) obj2) == null) {
                    n nVar = (n) obj3;
                    AbstractC1073l0 abstractC1073l0 = nVar.f11001b;
                    if (abstractC1073l0 == null || abstractC1073l0.j()) {
                        nVar.f11001b = Ad.l.O0(Ad.l.g(((ge.d) this.f10983i0).f31597j0), null, null, new m(nVar, null), 3);
                    }
                    AbstractC1073l0 abstractC1073l02 = nVar.f11001b;
                    if (abstractC1073l02 != null) {
                        this.f10981Z = 2;
                        if (abstractC1073l02.F(this) != enumC5000a2) {
                            return yVar;
                        }
                        return enumC5000a2;
                    }
                    return yVar;
                }
                return yVar;
        }
    }

    public final Object p(Ie.e eVar, Object obj, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        Object obj2 = this.f10984j0;
        switch (this.f10980Y) {
            case 0:
                a aVar = new a((b) obj2, abstractC4825e);
                aVar.f10983i0 = eVar;
                return aVar.invokeSuspend(yVar);
            default:
                a aVar2 = new a((ge.d) this.f10983i0, (n) obj2, abstractC4825e);
                aVar2.f10982h0 = eVar;
                return aVar2.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ge.d dVar, n nVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f10983i0 = dVar;
        this.f10984j0 = nVar;
    }
}
