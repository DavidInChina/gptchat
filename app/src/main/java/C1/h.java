package c1;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f26055Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f26056Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f26057h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f26058i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, l lVar, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26056Z = z10;
        this.f26057h0 = lVar;
        this.f26058i0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f26056Z, this.f26057h0, this.f26058i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26055Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            boolean z10 = this.f26056Z;
            l lVar = this.f26057h0;
            if (!z10) {
                A0.d dVar = lVar.f26071h0;
                int i11 = Z0.p.f22814c;
                long j6 = Z0.p.f22813b;
                this.f26055Y = 1;
                if (dVar.a(j6, this.f26058i0, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                A0.d dVar2 = lVar.f26071h0;
                int i12 = Z0.p.f22814c;
                long j10 = Z0.p.f22813b;
                this.f26055Y = 2;
                if (dVar2.a(this.f26058i0, j10, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
