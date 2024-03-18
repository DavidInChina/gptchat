package M1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class G extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public J f11399Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f11400Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f11401h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f11402i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ J f11403j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f11404k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11403j0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11402i0 = obj;
        this.f11404k0 |= Integer.MIN_VALUE;
        return this.f11403j0.j(this, null, null);
    }
}
