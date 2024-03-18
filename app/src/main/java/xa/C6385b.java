package xa;

import ca.C2311c;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xa.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6385b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public f f49692Y;

    /* renamed from: Z  reason: collision with root package name */
    public C2311c f49693Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f49694h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ f f49695i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f49696j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6385b(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49695i0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49694h0 = obj;
        this.f49696j0 |= Integer.MIN_VALUE;
        return this.f49695i0.b(null, this);
    }
}
