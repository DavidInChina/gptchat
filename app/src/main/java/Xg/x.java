package xg;

import Mf.AbstractC1003l;
import java.util.List;
import lg.AbstractC4456a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f50050Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4456a f50051h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ EnumC6447b f50052i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b, int i10) {
        super(0);
        this.f50049Y = i10;
        this.f50050Z = zVar;
        this.f50051h0 = abstractC4456a;
        this.f50052i0 = enumC6447b;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final List mo122invoke() {
        kf.v vVar = kf.v.f37483Y;
        int i10 = this.f50049Y;
        List list = null;
        EnumC6447b enumC6447b = this.f50052i0;
        AbstractC4456a abstractC4456a = this.f50051h0;
        z zVar = this.f50050Z;
        switch (i10) {
            case 0:
                D a5 = zVar.a((AbstractC1003l) zVar.f50057a.f11538c);
                if (a5 != null) {
                    list = kf.t.K2(((m) zVar.f50057a.f11536a).f50014e.i(a5, abstractC4456a, enumC6447b));
                }
                return list == null ? vVar : list;
            default:
                D a10 = zVar.a((AbstractC1003l) zVar.f50057a.f11538c);
                if (a10 != null) {
                    list = ((m) zVar.f50057a.f11536a).f50014e.e(a10, abstractC4456a, enumC6447b);
                }
                return list == null ? vVar : list;
        }
    }
}
