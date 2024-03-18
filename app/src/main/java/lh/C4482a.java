package lh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4482a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38455Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f38456Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4482a(z zVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38456Z = zVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4482a(this.f38456Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4482a) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38455Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            z zVar = this.f38456Z;
            kh.l lVar = zVar.f38523b;
            this.f38455Y = 1;
            obj = lVar.Z(zVar.f38522a);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
