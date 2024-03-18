package i9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: i9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3510b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f32880Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4991b f32881Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3510b(AbstractC4991b abstractC4991b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32881Z = abstractC4991b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3510b(this.f32881Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3510b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32880Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f32880Y = 1;
            if (this.f32881Z.b(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
