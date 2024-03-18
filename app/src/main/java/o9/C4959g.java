package o9;

import N.W;
import Qg.AbstractC1207j;
import Qg.D0;
import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: o9.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4959g implements D0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f40999Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D0 f41000Z;

    public C4959g(wf.k kVar, F0 f02) {
        this.f40999Y = kVar;
        this.f41000Z = f02;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        C4958f c4958f;
        int i10;
        if (abstractC4825e instanceof C4958f) {
            c4958f = (C4958f) abstractC4825e;
            int i11 = c4958f.f40998h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4958f.f40998h0 = i11 - Integer.MIN_VALUE;
                Object obj = c4958f.f40996Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4958f.f40998h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    W w10 = new W(abstractC1207j, 3, this.f40999Y);
                    c4958f.f40998h0 = 1;
                    if (this.f41000Z.b(w10, c4958f) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                throw new RuntimeException();
            }
        }
        c4958f = new C4958f(this, abstractC4825e);
        Object obj2 = c4958f.f40996Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4958f.f40998h0;
        if (i10 == 0) {
        }
        throw new RuntimeException();
    }

    @Override // Qg.D0
    public final Object getValue() {
        return this.f40999Y.invoke(this.f41000Z.getValue());
    }
}
