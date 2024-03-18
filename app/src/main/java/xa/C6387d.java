package xa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xa.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6387d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f49704Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f49705Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f49706h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f49707i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6387d(f fVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49706h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49705Z = obj;
        this.f49707i0 |= Integer.MIN_VALUE;
        return this.f49706h0.d(null, this);
    }
}
