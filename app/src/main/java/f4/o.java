package f4;

import Ng.F;
import android.graphics.Bitmap;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29625Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q4.j f29626Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f29627h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r4.h f29628i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ e f29629j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Bitmap f29630k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q4.j jVar, q qVar, r4.h hVar, e eVar, Bitmap bitmap, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29626Z = jVar;
        this.f29627h0 = qVar;
        this.f29628i0 = hVar;
        this.f29629j0 = eVar;
        this.f29630k0 = bitmap;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new o(this.f29626Z, this.f29627h0, this.f29628i0, this.f29629j0, this.f29630k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29625Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ArrayList arrayList = this.f29627h0.f29640i;
            if (this.f29630k0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            r4.h hVar = this.f29628i0;
            e eVar = this.f29629j0;
            q4.j jVar = this.f29626Z;
            l4.l lVar = new l4.l(jVar, arrayList, 0, jVar, hVar, eVar, z10);
            this.f29625Y = 1;
            obj = lVar.b(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
