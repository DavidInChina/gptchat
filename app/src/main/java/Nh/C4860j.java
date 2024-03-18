package nh;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import ji.AbstractC4122K;
import ji.C4116E;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: nh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4860j extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4122K f40390Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4860j(AbstractC4122K abstractC4122K, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40390Y = abstractC4122K;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4860j(this.f40390Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4860j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        boolean z10 = false;
        AbstractC4122K abstractC4122K = this.f40390Y;
        if (abstractC4122K != null) {
            C4116E J10 = R4.b.J(abstractC4122K);
            try {
                boolean a5 = AbstractC4861k.a(J10);
                Ad.l.S(J10, null);
                if (a5) {
                    z10 = true;
                }
            } finally {
            }
        }
        return Boolean.valueOf(z10);
    }
}
