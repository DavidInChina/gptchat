package lh;

import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.InputStream;
import ji.AbstractC4141p;
import kh.C4300a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kh.l f38513Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f38514Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AbstractC4825e abstractC4825e, kh.l lVar) {
        super(2, abstractC4825e);
        this.f38513Y = lVar;
        this.f38514Z = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f38514Z, abstractC4825e, this.f38513Y);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        InputStream inputStream;
        w wVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        kh.l lVar = this.f38513Y;
        if (lVar instanceof kh.b) {
            inputStream = R4.b.J(AbstractC4141p.f36737a.l(((kh.b) lVar).f37544Y)).Q0();
        } else {
            boolean z10 = lVar instanceof C4300a;
            Context context = this.f38514Z;
            if (z10) {
                inputStream = ((C4300a) lVar).a(context);
            } else if (lVar instanceof kh.f) {
                kh.f fVar = (kh.f) lVar;
                fVar.getClass();
                AbstractC3557B.c0("context", context);
                inputStream = context.getResources().openRawResource(fVar.f37556Y);
                AbstractC3557B.b0("openRawResource(...)", inputStream);
            } else if (lVar instanceof kh.t) {
                inputStream = ((kh.t) lVar).a(context);
            } else {
                throw new RuntimeException();
            }
        }
        try {
            T1.g gVar = new T1.g(new h4.k(inputStream, 1));
            int l10 = gVar.l();
            if (l10 != 0) {
                if (l10 != 90) {
                    if (l10 != 180) {
                        if (l10 == 270) {
                            wVar = w.f38518j0;
                        } else {
                            int l11 = gVar.l();
                            throw new IllegalStateException(("Invalid image orientation at " + l11 + "\u00b0").toString());
                        }
                    } else {
                        wVar = w.f38517i0;
                    }
                } else {
                    wVar = w.f38516h0;
                }
            } else {
                wVar = w.f38515Z;
            }
            x xVar = new x(wVar);
            th = null;
            return xVar;
        } finally {
        }
    }
}
