package x9;

import Ng.F;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49671Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f49672Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f49673h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Uri f49674i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, l lVar, Uri uri, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49672Z = context;
        this.f49673h0 = lVar;
        this.f49674i0 = uri;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f49672Z, this.f49673h0, this.f49674i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49671Y;
        l lVar = this.f49673h0;
        Context context = this.f49672Z;
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
            this.f49671Y = 1;
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
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            AbstractC3557B.c0("context", context);
            Uri uri = this.f49674i0;
            AbstractC3557B.c0("outputFile", uri);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(-1);
            AbstractC3557B.b0("apply(...)", createBitmap);
            obj2 = K8.d.P0(lVar, context, q02, uri, createBitmap, -16777216, Bitmap.CompressFormat.PNG);
        } else if (kVar instanceof q4.e) {
            obj2 = N.w(((q4.e) kVar).f43785c);
        } else {
            throw new RuntimeException();
        }
        return new C3961k(obj2);
    }
}
