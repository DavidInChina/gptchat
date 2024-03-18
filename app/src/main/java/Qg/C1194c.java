package Qg;

import Pg.EnumC1170c;
import Rg.AbstractC1286g;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;

/* renamed from: Qg.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1194c extends C1198e {

    /* renamed from: k0  reason: collision with root package name */
    public final wf.n f14824k0;

    public C1194c(wf.n nVar, AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        super(nVar, abstractC4831k, i10, enumC1170c, 0);
        this.f14824k0 = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // Qg.C1198e, Rg.AbstractC1286g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Pg.A a5, AbstractC4825e abstractC4825e) {
        C1192b c1192b;
        int i10;
        if (abstractC4825e instanceof C1192b) {
            c1192b = (C1192b) abstractC4825e;
            int i11 = c1192b.f14821i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1192b.f14821i0 = i11 - Integer.MIN_VALUE;
                Object obj = c1192b.f14819Z;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = c1192b.f14821i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a5 = c1192b.f14818Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1192b.f14818Y = a5;
                    c1192b.f14821i0 = 1;
                    if (super.h(a5, c1192b) == obj2) {
                        return obj2;
                    }
                }
                if (!((Pg.p) a5).f14244i0.u()) {
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        c1192b = new C1192b(this, abstractC4825e);
        Object obj3 = c1192b.f14819Z;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = c1192b.f14821i0;
        if (i10 == 0) {
        }
        if (!((Pg.p) a5).f14244i0.u()) {
        }
    }

    @Override // Qg.C1198e, Rg.AbstractC1286g
    public final AbstractC1286g j(AbstractC4831k abstractC4831k, int i10, EnumC1170c enumC1170c) {
        return new C1194c(this.f14824k0, abstractC4831k, i10, enumC1170c);
    }
}
