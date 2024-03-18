package h9;

import Z8.n1;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: h9.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3344i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public n1 f31983Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31984Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3345j f31985h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31986i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344i(C3345j c3345j, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31985h0 = c3345j;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31984Z = obj;
        this.f31986i0 |= Integer.MIN_VALUE;
        return this.f31985h0.b(this);
    }
}
