package lh;

import java.util.List;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lh.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4474D extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public z f38427Y;

    /* renamed from: Z  reason: collision with root package name */
    public y f38428Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f38429h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f38430i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f38431j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f38432k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f38433l0;

    /* renamed from: m0  reason: collision with root package name */
    public /* synthetic */ Object f38434m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ C4475E f38435n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f38436o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4474D(C4475E c4475e, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38435n0 = c4475e;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38434m0 = obj;
        this.f38436o0 |= Integer.MIN_VALUE;
        return this.f38435n0.a(null, this);
    }
}
