package nb;

import Ad.l;
import Ng.F;
import Ng.Q;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.play_billing.N;
import f4.C2936a;
import f4.q;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q4.j;
import q4.k;
import wd.s0;
import wf.n;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public String f40174Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f40175Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f40176h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f40177i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f40178j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40176h0 = str;
        this.f40177i0 = gVar;
        this.f40178j0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f40176h0, this.f40177i0, this.f40178j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40175Z;
        g gVar = this.f40177i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f40174Y;
            N.B0(obj);
            str = str2;
        } else {
            N.B0(obj);
            String str3 = this.f40176h0;
            String v22 = Lg.n.v2("file-service://", str3);
            EnumC4806a[] enumC4806aArr = EnumC4806a.f40164Y;
            String concat = v22.concat(".jpg");
            q4.h hVar = new q4.h(gVar.f40183a);
            hVar.f43805c = str3;
            j a5 = hVar.a();
            q a10 = C2936a.a(gVar.f40183a);
            this.f40174Y = concat;
            this.f40175Z = 1;
            Object b10 = a10.b(a5, this);
            if (b10 == enumC5000a) {
                return enumC5000a;
            }
            str = concat;
            obj = b10;
        }
        k kVar = (k) obj;
        if (!(kVar instanceof q4.q)) {
            AbstractC3557B.a0("null cannot be cast to non-null type coil.request.ErrorResult", kVar);
            return new s0(0, ((q4.e) kVar).f43785c);
        }
        Drawable drawable = ((q4.q) kVar).f43886a;
        AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable", drawable);
        d dVar = new d(0, ((BitmapDrawable) drawable).getBitmap());
        this.f40174Y = null;
        this.f40175Z = 2;
        gVar.f40184b.getClass();
        obj = l.n1(this, Q.f12906c, new f(gVar, str, null, dVar, this.f40178j0));
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        return obj;
    }
}
