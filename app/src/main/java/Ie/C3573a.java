package ie;

import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.B;
import io.ktor.utils.io.u;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import ze.AbstractC6847f;

/* renamed from: ie.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3573a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f33151Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33152Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3574b f33153h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3573a(C3574b c3574b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33153h0 = c3574b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3573a c3573a = new C3573a(this.f33153h0, abstractC4825e);
        c3573a.f33152Z = obj;
        return c3573a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3573a) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33151Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            u uVar = ((B) this.f33152Z).f33365Y;
            this.f33151Y = 1;
            if (((AbstractC6847f) this.f33153h0.f33154a).e(uVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
