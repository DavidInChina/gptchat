package h9;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;
import wf.n;

/* renamed from: h9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3339d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31961Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3341f f31962Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339d(C3341f c3341f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31962Z = c3341f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3339d c3339d = new C3339d(this.f31962Z, abstractC4825e);
        c3339d.f31961Y = obj;
        return c3339d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C3339d) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f31962Z.f31967c.a(new C3338c((C6205s) this.f31961Y, 0));
        return y.f36177a;
    }
}
