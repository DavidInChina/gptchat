package Ja;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8925Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8926Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f8927h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f8926Z = z10;
        this.f8927h0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new j(this.f8927h0, abstractC4825e, this.f8926Z);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8925Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            boolean z10 = this.f8926Z;
            if (z10) {
                str = "loadAll with lazyload";
            } else {
                str = "loadAll without lazyLoad";
            }
            p pVar = this.f8927h0;
            C4726e c4726e = pVar.f8950c;
            i iVar = new i(pVar, null, z10);
            this.f8925Y = 1;
            obj = p.c(pVar, c4726e, str, iVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
