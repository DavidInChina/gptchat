package Qe;

import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.o;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f14698Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f14699Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, Qe.i] */
    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ?? abstractC5163j = new AbstractC5163j(3, (AbstractC4825e) obj3);
        abstractC5163j.f14698Y = booleanValue;
        abstractC5163j.f14699Z = booleanValue2;
        return abstractC5163j.invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        return new C3959i(Boolean.valueOf(this.f14698Y), Boolean.valueOf(this.f14699Z));
    }
}
