package lh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import r0.C5341e;

/* renamed from: lh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4487f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4488g f38469Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z0.j f38470Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ BitmapFactory.Options f38471h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4487f(C4488g c4488g, Z0.j jVar, BitmapFactory.Options options, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38469Y = c4488g;
        this.f38470Z = jVar;
        this.f38471h0 = options;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4487f(this.f38469Y, this.f38470Z, this.f38471h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4487f) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C5341e c5341e;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C4488g c4488g = this.f38469Y;
        Z0.j jVar = this.f38470Z;
        BitmapFactory.Options options = this.f38471h0;
        Trace.beginSection(Gi.e.V("decodeRegion"));
        try {
            Bitmap decodeRegion = c4488g.f38474c.decodeRegion(new Rect(jVar.f22800a, jVar.f22801b, jVar.f22802c, jVar.f22803d), options);
            if (decodeRegion != null) {
                c5341e = new C5341e(decodeRegion);
            } else {
                c5341e = null;
            }
            return c5341e;
        } finally {
            Trace.endSection();
        }
    }
}
