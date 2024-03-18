package C9;

import b9.EnumC2132a;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public l f2779Y;

    /* renamed from: Z  reason: collision with root package name */
    public EnumC2132a f2780Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f2781h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f2782i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2783j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2782i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2781h0 = obj;
        this.f2783j0 |= Integer.MIN_VALUE;
        return this.f2782i0.b(null, null, null, null, null, false, this);
    }
}
