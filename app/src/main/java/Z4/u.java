package z4;

import Ng.F;
import android.content.Context;
import android.graphics.Typeface;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C5971a f51712Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f51713Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f51714h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f51715i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, C5971a c5971a, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51712Y = c5971a;
        this.f51713Z = context;
        this.f51714h0 = str;
        this.f51715i0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f51713Z, this.f51712Y, this.f51714h0, this.f51715i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((u) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        for (B4.c cVar : this.f51712Y.f47153f.values()) {
            Context context = this.f51713Z;
            AbstractC3557B.Z(cVar);
            String str = cVar.f1854c;
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), this.f51714h0 + cVar.f1852a + this.f51715i0);
                try {
                    AbstractC3557B.Z(createFromAsset);
                    AbstractC3557B.b0("getStyle(...)", str);
                    int i10 = 0;
                    boolean Z12 = Lg.n.Z1(str, "Italic", false);
                    boolean Z13 = Lg.n.Z1(str, "Bold", false);
                    if (Z12 && Z13) {
                        i10 = 3;
                    } else if (Z12) {
                        i10 = 2;
                    } else if (Z13) {
                        i10 = 1;
                    }
                    if (createFromAsset.getStyle() != i10) {
                        createFromAsset = Typeface.create(createFromAsset, i10);
                    }
                    cVar.f1855d = createFromAsset;
                } catch (Exception unused) {
                    I4.b.f8035a.getClass();
                }
            } catch (Exception unused2) {
                I4.b.f8035a.getClass();
            }
        }
        return y.f36177a;
    }
}
