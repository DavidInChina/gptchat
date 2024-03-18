package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4364a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f37976Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f37977Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f37978h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4368e f37979i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f37980j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4364a(C4368e c4368e, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37979i0 = c4368e;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37978h0 = obj;
        this.f37980j0 |= Integer.MIN_VALUE;
        return this.f37979i0.b(null, null, null, this);
    }
}
