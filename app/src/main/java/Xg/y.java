package xg;

import Mf.AbstractC1003l;
import id.AbstractC3557B;
import pg.AbstractC5170g;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50053Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f50054Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ fg.G f50055h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ zg.r f50056i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, fg.G g10, zg.r rVar, int i10) {
        super(0);
        this.f50053Y = i10;
        this.f50054Z = zVar;
        this.f50055h0 = g10;
        this.f50056i0 = rVar;
    }

    public final Ag.j a() {
        int i10 = this.f50053Y;
        fg.G g10 = this.f50055h0;
        zg.r rVar = this.f50056i0;
        z zVar = this.f50054Z;
        switch (i10) {
            case 1:
                Ag.u c10 = zVar.f50057a.c();
                y yVar = new y(zVar, g10, rVar, 0);
                Ag.q qVar = (Ag.q) c10;
                qVar.getClass();
                return new Ag.j(qVar, yVar);
            default:
                Ag.u c11 = zVar.f50057a.c();
                y yVar2 = new y(zVar, g10, rVar, 2);
                Ag.q qVar2 = (Ag.q) c11;
                qVar2.getClass();
                return new Ag.j(qVar2, yVar2);
        }
    }

    public final AbstractC5170g c() {
        int i10 = this.f50053Y;
        fg.G g10 = this.f50055h0;
        zg.r rVar = this.f50056i0;
        z zVar = this.f50054Z;
        switch (i10) {
            case 0:
                D a5 = zVar.a((AbstractC1003l) zVar.f50057a.f11538c);
                AbstractC3557B.Z(a5);
                AbstractC6448c abstractC6448c = ((m) zVar.f50057a.f11536a).f50014e;
                Bg.A returnType = rVar.getReturnType();
                AbstractC3557B.b0("getReturnType(...)", returnType);
                return (AbstractC5170g) abstractC6448c.h(a5, g10, returnType);
            default:
                D a10 = zVar.a((AbstractC1003l) zVar.f50057a.f11538c);
                AbstractC3557B.Z(a10);
                AbstractC6448c abstractC6448c2 = ((m) zVar.f50057a.f11536a).f50014e;
                Bg.A returnType2 = rVar.getReturnType();
                AbstractC3557B.b0("getReturnType(...)", returnType2);
                return (AbstractC5170g) abstractC6448c2.f(a10, g10, returnType2);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f50053Y) {
            case 0:
                return c();
            case 1:
                return a();
            case 2:
                return c();
            default:
                return a();
        }
    }
}
