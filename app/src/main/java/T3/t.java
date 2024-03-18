package t3;

import Ng.F;
import Z.C1724m0;
import Z.l1;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import s3.C5562l;
import z.C6729v0;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f45709Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Map f45710Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l1 f45711h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ i f45712i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C6729v0 c6729v0, Map map, l1 l1Var, i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45709Y = c6729v0;
        this.f45710Z = map;
        this.f45711h0 = l1Var;
        this.f45712i0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f45709Y, this.f45710Z, this.f45711h0, this.f45712i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((t) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6729v0 c6729v0 = this.f45709Y;
        Object b10 = c6729v0.b();
        C1724m0 c1724m0 = c6729v0.f51386c;
        if (AbstractC3557B.K(b10, c1724m0.getValue())) {
            for (C5562l c5562l : (List) this.f45711h0.getValue()) {
                this.f45712i0.b().b(c5562l);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f45710Z;
            for (Map.Entry entry : map.entrySet()) {
                if (!AbstractC3557B.K(entry.getKey(), ((C5562l) c1724m0.getValue()).f45310k0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                map.remove(entry2.getKey());
            }
        }
        return jf.y.f36177a;
    }
}
