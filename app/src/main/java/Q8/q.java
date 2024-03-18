package Q8;

import R8.s;
import S8.S;
import S8.W;
import S8.b0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.y;
import kf.t;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14521Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s f14522Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.p f14523h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, wf.p pVar, int i10) {
        super(1);
        this.f14521Y = i10;
        this.f14522Z = sVar;
        this.f14523h0 = pVar;
    }

    public final void a(S s10) {
        s sVar;
        int i10 = this.f14521Y;
        wf.p pVar = this.f14523h0;
        s sVar2 = this.f14522Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$Table", s10);
                s sVar3 = (s) Kg.m.j1(K8.d.B0(sVar2, d.f14482k0));
                if (sVar3 != null && (sVar = (s) Kg.m.j1(K8.d.B0(sVar3, d.f14483l0))) != null) {
                    Kg.e eVar = new Kg.e(K8.d.B0(sVar, d.f14484m0));
                    while (eVar.hasNext()) {
                        s10.f16264a = new b0(t.x2(new C3288a(new k((s) eVar.next(), pVar, 1), true, 811495243), s10.f16264a.f16308a));
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$this$row", s10);
                Kg.e eVar2 = new Kg.e(K8.d.B0(sVar2, d.f14485n0));
                while (eVar2.hasNext()) {
                    s10.f16264a = new b0(t.x2(new C3288a(new k((s) eVar2.next(), pVar, 2), true, -354773441), s10.f16264a.f16308a));
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f14521Y) {
            case 0:
                a((S) obj);
                return yVar;
            case 1:
                a((S) obj);
                return yVar;
            default:
                W w10 = (W) obj;
                AbstractC3557B.c0("$this$Table", w10);
                s sVar = (s) Kg.m.j1(K8.d.B0(this.f14522Z, d.f14486o0));
                if (sVar != null) {
                    Kg.e eVar = new Kg.e(K8.d.B0(sVar, d.f14487p0));
                    while (eVar.hasNext()) {
                        q qVar = new q((s) eVar.next(), this.f14523h0, 1);
                        ArrayList arrayList = w10.f16280a;
                        S s10 = new S();
                        qVar.invoke(s10);
                        arrayList.add(s10);
                    }
                }
                return yVar;
        }
    }
}
