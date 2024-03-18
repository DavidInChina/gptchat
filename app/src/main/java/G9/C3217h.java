package g9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: g9.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3217h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3220k f31322Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC3215f f31323Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31324h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3220k f31325i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f31326j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3217h(C3220k c3220k, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31325i0 = c3220k;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31324h0 = obj;
        this.f31326j0 |= Integer.MIN_VALUE;
        return C3220k.f(this.f31325i0, null, this);
    }
}
