package lb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4365b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f37981Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f37982Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.k f37983h0;

    /* renamed from: i0  reason: collision with root package name */
    public wf.n f37984i0;

    /* renamed from: j0  reason: collision with root package name */
    public wf.n f37985j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f37986k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C4368e f37987l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f37988m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4365b(C4368e c4368e, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37987l0 = c4368e;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37986k0 = obj;
        this.f37988m0 |= Integer.MIN_VALUE;
        return this.f37987l0.a(null, false, null, null, null, this);
    }
}
