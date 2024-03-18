package Hd;

import Ng.F;
import W.C1550f3;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7638Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f7639Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1550f3 c1550f3, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7639Z = c1550f3;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f7639Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7638Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            C1550f3 c1550f3 = this.f7639Z;
            if (c1550f3.c()) {
                this.f7638Y = 1;
                if (c1550f3.b(this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                this.f7638Y = 2;
                if (c1550f3.e(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
