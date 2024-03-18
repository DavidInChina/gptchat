package xa;

import L9.S;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import wd.v0;

/* renamed from: xa.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6386c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f49697Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f49698Z;

    /* renamed from: h0  reason: collision with root package name */
    public v0 f49699h0;

    /* renamed from: i0  reason: collision with root package name */
    public S f49700i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f49701j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ f f49702k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f49703l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6386c(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49702k0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49701j0 = obj;
        this.f49703l0 |= Integer.MIN_VALUE;
        return this.f49702k0.c(null, null, this);
    }
}
