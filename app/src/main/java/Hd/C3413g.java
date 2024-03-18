package hd;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import io.sentry.L0;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: hd.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3413g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public String f32251Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f32252Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3414h f32253h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3413g(C3414h c3414h, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32253h0 = c3414h;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3413g(this.f32253h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3413g) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32252Z;
        if (i10 != 0) {
            if (i10 == 1) {
                str = this.f32251Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Lc.e eVar = this.f32253h0.f32256c;
            this.f32251Y = "deviceId";
            this.f32252Z = 1;
            obj = eVar.a(this);
            if (obj != enumC5000a) {
                str = "deviceId";
            } else {
                return enumC5000a;
            }
        }
        L0.h(str, (String) obj);
        return y.f36177a;
    }
}
