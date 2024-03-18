package x9;

import Ng.F;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import f4.C2936a;
import f4.q;
import id.AbstractC3557B;
import jf.C3961k;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import r0.r;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49664Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f49665Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f49666h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Uri f49667i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, l lVar, Uri uri, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49665Z = context;
        this.f49666h0 = lVar;
        this.f49667i0 = uri;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new i(this.f49665Z, this.f49666h0, this.f49667i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49664Y;
        l lVar = this.f49666h0;
        Context context = this.f49665Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            q4.h hVar = new q4.h(context);
            hVar.f43805c = lVar.f49675a;
            hVar.f43820r = Boolean.FALSE;
            q4.j a5 = hVar.a();
            q a10 = C2936a.a(context);
            this.f49664Y = 1;
            obj = a10.b(a5, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        q4.k kVar = (q4.k) obj;
        if (kVar instanceof q4.q) {
            Drawable drawable = ((q4.q) kVar).f43886a;
            AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable", drawable);
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            AbstractC3557B.Z(bitmap);
            C6382a q02 = K8.d.q0(lVar, bitmap);
            AbstractC3557B.c0("context", context);
            Uri uri = this.f49667i0;
            AbstractC3557B.c0("outputFile", uri);
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            AbstractC3557B.b0("copy(...)", copy);
            obj2 = K8.d.P0(lVar, context, q02, uri, copy, androidx.compose.ui.graphics.a.s(((r) lVar.f49681g.getValue()).f44265a), Bitmap.CompressFormat.JPEG);
        } else if (kVar instanceof q4.e) {
            obj2 = N.w(((q4.e) kVar).f43785c);
        } else {
            throw new RuntimeException();
        }
        return new C3961k(obj2);
    }
}
