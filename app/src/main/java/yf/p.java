package Yf;

import dg.AbstractC2653B;
import dg.AbstractC2657F;
import eg.EnumC2893a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kf.AbstractC4268D;
import o1.C4885I;
import sg.C5625b;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22375Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f22376Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(0);
        this.f22375Y = i10;
        this.f22376Z = qVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f22375Y;
        q qVar = this.f22376Z;
        switch (i10) {
            case 0:
                AbstractC2657F abstractC2657F = ((Xf.a) qVar.f22379m0.f45394a).f21963l;
                qVar.f14010j0.b();
                ((dg.q) abstractC2657F).getClass();
                return AbstractC4268D.k1(new ArrayList());
            case 1:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) A7.b.X0(qVar.f22380n0, q.f22377r0[0])).entrySet()) {
                    C5625b d10 = C5625b.d((String) entry.getKey());
                    C4885I c4885i = ((Rf.c) ((AbstractC2653B) entry.getValue())).f15500b;
                    int ordinal = ((EnumC2893a) c4885i.f40437c).ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 5) {
                            String str = c4885i.f40442h;
                            if (((EnumC2893a) c4885i.f40437c) != EnumC2893a.f29384n0) {
                                str = null;
                            }
                            if (str != null) {
                                hashMap.put(d10, C5625b.d(str));
                            }
                        }
                    } else {
                        hashMap.put(d10, d10);
                    }
                }
                return hashMap;
            default:
                qVar.f22378l0.getClass();
                return new ArrayList(AbstractC6583a.H1(kf.v.f37483Y, 10));
        }
    }
}
