package e9;

import com.google.android.gms.internal.play_billing.N;
import f9.w;
import g9.AbstractC3215f;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5472v;

/* renamed from: e9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2812e extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f29053Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2815h f29054Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2812e(C2815h c2815h, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f29054Z = c2815h;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C2812e(this.f29054Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C2812e) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        xd.b bVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29053Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC3215f abstractC3215f = (AbstractC3215f) this.f29054Z.f29065j.f31338g.f14881Y.getValue();
            if (abstractC3215f instanceof w) {
                wVar = (w) abstractC3215f;
            } else {
                wVar = null;
            }
            if (wVar != null && (bVar = (xd.b) wVar.f29985p.get()) != null) {
                this.f29053Y = 1;
                if (((C5472v) bVar).a(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
