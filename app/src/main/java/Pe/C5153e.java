package pe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.AbstractC6034c;

/* renamed from: pe.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5153e extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43096Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f43097Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ F f43098h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f43099i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5153e(l lVar, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f43096Y = i10;
        this.f43099i0 = lVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f43096Y) {
            case 0:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            case 1:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            default:
                Ie.e eVar = (Ie.e) obj;
                C5153e c5153e = new C5153e(this.f43099i0, (AbstractC4825e) obj3, 2);
                c5153e.f43098h0 = (AbstractC6034c) obj2;
                return c5153e.invokeSuspend(y.f36177a);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f43096Y;
        l lVar = this.f43099i0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f43097Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                this.f43097Z = 1;
                if (lVar.a((C5760d) ((Ie.e) this.f43098h0).f8578Y, this) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i12 = this.f43097Z;
                if (i12 != 0) {
                    if (i12 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                this.f43097Z = 1;
                if (lVar.j((C5760d) ((Ie.e) this.f43098h0).f8578Y, this) == enumC5000a2) {
                    return enumC5000a2;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                int i13 = this.f43097Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                this.f43097Z = 1;
                if (lVar.i((AbstractC6034c) this.f43098h0, this) == enumC5000a3) {
                    return enumC5000a3;
                }
                return yVar;
        }
    }

    public final Object p(Ie.e eVar, Object obj, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f43096Y;
        l lVar = this.f43099i0;
        switch (i10) {
            case 0:
                C5153e c5153e = new C5153e(lVar, abstractC4825e, 0);
                c5153e.f43098h0 = eVar;
                return c5153e.invokeSuspend(yVar);
            default:
                C5153e c5153e2 = new C5153e(lVar, abstractC4825e, 1);
                c5153e2.f43098h0 = eVar;
                return c5153e2.invokeSuspend(yVar);
        }
    }
}
