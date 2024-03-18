package yc;

import com.google.android.gms.internal.play_billing.N;
import java.util.Collection;
import java.util.Set;
import jf.y;
import ne.g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import wd.C6189g;
import wf.p;

/* renamed from: yc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6575a extends AbstractC5163j implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50887Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ C5760d f50888Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Xc.c f50889h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6575a(Xc.c cVar, AbstractC4825e abstractC4825e, int i10) {
        super(4, abstractC4825e);
        this.f50887Y = i10;
        this.f50889h0 = cVar;
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f50887Y) {
            case 0:
                g gVar = (g) obj;
                return p((C5760d) obj2, (AbstractC4825e) obj4);
            default:
                g gVar2 = (g) obj;
                return p((C5760d) obj2, (AbstractC4825e) obj4);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f50887Y;
        Xc.c cVar = this.f50889h0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                N.B0(obj);
                C5760d c5760d = this.f50888Z;
                Set<Fe.a> set = C6576b.f50890d;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (Fe.a aVar : set) {
                        if (c5760d.f46130f.a(aVar)) {
                            return yVar;
                        }
                    }
                }
                C6576b c6576b = (C6576b) cVar;
                if (c6576b.f50891a.f40280g) {
                    c5760d.f46127c.f("ChatGPT-Account-ID", c6576b.f50892b);
                }
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                N.B0(obj);
                C5760d c5760d2 = this.f50888Z;
                Set<Fe.a> set2 = C6578d.f50895c;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (Fe.a aVar2 : set2) {
                        if (c5760d2.f46130f.a(aVar2)) {
                            return yVar;
                        }
                    }
                }
                C6189g c6189g = ((C6578d) cVar).f50896a;
                if (c6189g != null) {
                    Set set3 = C6578d.f50895c;
                    if (c6189g.b()) {
                        c5760d2.f46127c.f("ChatGPT-Account-ID", c6189g.f48410a);
                    }
                }
                return yVar;
        }
    }

    public final y p(C5760d c5760d, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f50887Y;
        Xc.c cVar = this.f50889h0;
        switch (i10) {
            case 0:
                C6575a c6575a = new C6575a((C6576b) cVar, abstractC4825e, 0);
                c6575a.f50888Z = c5760d;
                c6575a.invokeSuspend(yVar);
                return yVar;
            default:
                C6575a c6575a2 = new C6575a((C6578d) cVar, abstractC4825e, 1);
                c6575a2.f50888Z = c5760d;
                c6575a2.invokeSuspend(yVar);
                return yVar;
        }
    }
}
