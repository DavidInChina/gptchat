package qa;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p9.s;
import pf.AbstractC5163j;
import s3.r;
import wd.C6205s;
import wf.n;

/* renamed from: qa.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5296f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44028Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5297g f44029Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ s f44030h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5296f(C5297g c5297g, s sVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44029Z = c5297g;
        this.f44030h0 = sVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5296f c5296f = new C5296f(this.f44029Z, this.f44030h0, abstractC4825e);
        c5296f.f44028Y = obj;
        return c5296f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5296f) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f44029Z.l(new r((C6205s) this.f44028Y, 26, this.f44030h0));
        return y.f36177a;
    }
}
