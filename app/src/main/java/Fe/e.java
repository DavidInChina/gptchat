package Fe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5310Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.u f5311Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ byte[] f5312h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f5313i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(io.ktor.utils.io.u uVar, byte[] bArr, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5311Z = uVar;
        this.f5312h0 = bArr;
        this.f5313i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f5311Z, this.f5312h0, this.f5313i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5310Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f5310Y = 1;
            if (((io.ktor.utils.io.t) this.f5311Z).Y(this.f5312h0, this.f5313i0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}