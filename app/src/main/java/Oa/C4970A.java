package oa;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oa.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4970A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41037Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41038Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41039h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f41040i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4970A(C4972C c4972c, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41039h0 = c4972c;
        this.f41040i0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4970A c4970a = new C4970A(this.f41039h0, this.f41040i0, abstractC4825e);
        c4970a.f41038Z = obj;
        return c4970a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4970A) create((C2311c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41037Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ea.a aVar = this.f41039h0.f41047b;
            this.f41037Y = 1;
            obj = ((xa.f) aVar).e((C2311c) this.f41038Z, this.f41040i0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
