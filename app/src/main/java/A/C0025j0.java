package A;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: A.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025j0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0031m0 f222Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f223Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0031m0 f224h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f225i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025j0(C0031m0 c0031m0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f224h0 = c0031m0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f223Z = obj;
        this.f225i0 |= Integer.MIN_VALUE;
        return this.f224h0.B0(this);
    }
}
