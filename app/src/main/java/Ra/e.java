package Ra;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public g f15190Y;

    /* renamed from: Z  reason: collision with root package name */
    public t f15191Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f15192h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f15193i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ g f15194j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f15195k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f15194j0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f15193i0 = obj;
        this.f15195k0 |= Integer.MIN_VALUE;
        return this.f15194j0.b(null, null, null, this);
    }
}
