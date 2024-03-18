package of;

import Ad.l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import pf.AbstractC5160g;
import wf.n;

/* renamed from: of.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5001b extends AbstractC5160g {

    /* renamed from: Y  reason: collision with root package name */
    public int f41332Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f41333Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f41334h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5001b(Object obj, AbstractC4825e abstractC4825e, n nVar) {
        super(abstractC4825e);
        this.f41333Z = nVar;
        this.f41334h0 = obj;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>", abstractC4825e);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f41332Y;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f41332Y = 2;
                N.B0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f41332Y = 1;
        N.B0(obj);
        n nVar = this.f41333Z;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>", nVar);
        l.M(2, nVar);
        return nVar.invoke(this.f41334h0, this);
    }
}
