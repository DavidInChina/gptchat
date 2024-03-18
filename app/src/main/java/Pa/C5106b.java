package pa;

import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;
import x8.W;

/* renamed from: pa.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5106b extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C5108d f42859Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Application f42860Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5106b(C5108d c5108d, Application application, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f42859Y = c5108d;
        this.f42860Z = application;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5106b(this.f42859Y, this.f42860Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((C5106b) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        Pc.c a5 = Pc.e.a();
        C5108d c5108d = this.f42859Y;
        W.M(a5, "Deleting database " + ((String) c5108d.f42863b.getValue()), null, 6);
        this.f42860Z.deleteDatabase((String) c5108d.f42863b.getValue());
        return y.f36177a;
    }
}
