package eb;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: eb.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f29106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2827c f29107Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2826b(C2827c c2827c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29107Z = c2827c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2826b c2826b = new C2826b(this.f29107Z, abstractC4825e);
        c2826b.f29106Y = obj;
        return c2826b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C2826b) create((zd.n) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f29107Z.f29108a.setEnabled(((zd.n) this.f29106Y).f51993l);
        return y.f36177a;
    }
}
