package oc;

import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nc.s;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f41257Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41258Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f41258Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new f(this.f41258Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((f) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41257Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            k kVar = this.f41258Z;
            String str = ((s) kVar.f808e.getValue()).f40257i;
            if (str == null) {
                return yVar;
            }
            F0 f02 = kVar.f808e;
            if (((s) f02.getValue()).f40255g == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str2 = ((s) f02.getValue()).f40250b;
            this.f41257Y = 1;
            if (k.o(kVar, str, z10, str2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
