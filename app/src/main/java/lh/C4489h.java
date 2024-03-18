package lh;

import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lh.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4489h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38478Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f38479Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f38480h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4489h(q qVar, r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38479Z = qVar;
        this.f38480h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4489h(this.f38479Z, this.f38480h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4489h) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38478Y;
        r rVar = this.f38480h0;
        q qVar = this.f38479Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC4471A abstractC4471A = qVar.f38499a;
            this.f38478Y = 1;
            obj = abstractC4471A.c(rVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        r0.z zVar = (r0.z) obj;
        F0 f02 = qVar.f38502d;
        do {
            value = f02.getValue();
        } while (!f02.e(value, AbstractC4268D.g1((Map) value, new C3959i(rVar, new C4492k(zVar)))));
        return jf.y.f36177a;
    }
}
