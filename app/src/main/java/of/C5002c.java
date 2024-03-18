package of;

import Ad.l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5156c;
import wf.n;

/* renamed from: of.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5002c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public int f41335Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f41336Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f41337h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5002c(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k, n nVar, Object obj) {
        super(abstractC4825e, abstractC4831k);
        this.f41336Z = nVar;
        this.f41337h0 = obj;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>", abstractC4825e);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f41335Y;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f41335Y = 2;
                N.B0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f41335Y = 1;
        N.B0(obj);
        n nVar = this.f41336Z;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>", nVar);
        l.M(2, nVar);
        return nVar.invoke(this.f41337h0, this);
    }
}
