package Od;

import Ng.F;
import Ng.K;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public B f13683Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f13684Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B f13685h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ K f13686i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(B b10, K k10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13685h0 = b10;
        this.f13686i0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b(this.f13685h0, this.f13686i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        B b10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13684Z;
        if (i10 != 0) {
            if (i10 == 1) {
                b10 = this.f13683Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            B b11 = this.f13685h0;
            this.f13683Y = b11;
            this.f13684Z = 1;
            Object f02 = this.f13686i0.f0(this);
            if (f02 == enumC5000a) {
                return enumC5000a;
            }
            b10 = b11;
            obj = f02;
        }
        b10.f37622Y = obj;
        return y.f36177a;
    }
}
