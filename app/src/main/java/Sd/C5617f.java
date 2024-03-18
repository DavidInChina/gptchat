package sd;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: sd.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5617f extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ h f45537Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5617f(h hVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45537Y = hVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5617f(this.f45537Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((C5617f) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f45537Y.f44959c.delete();
        return y.f36177a;
    }
}
