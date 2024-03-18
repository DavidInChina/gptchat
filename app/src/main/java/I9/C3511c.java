package i9;

import Ad.l;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: i9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3511c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32882Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3514f f32883Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3511c(C3514f c3514f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32883Z = c3514f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3511c c3511c = new C3511c(this.f32883Z, abstractC4825e);
        c3511c.f32882Y = obj;
        return c3511c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C3511c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        F f6 = (F) this.f32882Y;
        for (AbstractC4991b abstractC4991b : this.f32883Z.f32890b) {
            l.O0(f6, abstractC4991b.c(), null, new C3510b(abstractC4991b, null), 2);
        }
        return y.f36177a;
    }
}
