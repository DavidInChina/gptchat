package A;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: A.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023i0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0031m0 f216Y;

    /* renamed from: Z  reason: collision with root package name */
    public D.h f217Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f218h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0031m0 f219i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f220j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023i0(C0031m0 c0031m0, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f219i0 = c0031m0;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f218h0 = obj;
        this.f220j0 |= Integer.MIN_VALUE;
        return this.f219i0.A0(this);
    }
}
