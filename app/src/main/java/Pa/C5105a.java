package pa;

import com.google.android.gms.internal.play_billing.N;
import e4.C2801i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;
import x8.W;

/* renamed from: pa.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5105a extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C5108d f42857Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2801i f42858Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5105a(C5108d c5108d, C2801i c2801i, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f42857Y = c5108d;
        this.f42858Z = c2801i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5105a(this.f42857Y, this.f42858Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((C5105a) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        Pc.c a5 = Pc.e.a();
        W.M(a5, "Closing database " + ((String) this.f42857Y.f42863b.getValue()), null, 6);
        this.f42858Z.close();
        return y.f36177a;
    }
}
