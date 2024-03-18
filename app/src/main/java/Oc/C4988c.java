package oc;

import I9.I;
import Ng.F;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4988c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41247Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41248Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4988c(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41248Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4988c(this.f41248Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4988c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41247Y;
        k kVar = this.f41248Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            Rg.o oVar = ((C4972C) kVar.f41274j).f41058m;
            this.f41247Y = 1;
            obj = L4.a.m0(oVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C2311c c2311c = (C2311c) obj;
        if (c2311c != null) {
            kVar.l(new I(c2311c, 6));
            this.f41247Y = 2;
            if (k.n(kVar, c2311c, true, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
