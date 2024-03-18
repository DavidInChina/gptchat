package h2;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import wf.n;

/* renamed from: h2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3308e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public n f31769Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31770Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3309f f31771h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31772i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3308e(C3309f c3309f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31771h0 = c3309f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31770Z = obj;
        this.f31772i0 |= Integer.MIN_VALUE;
        return this.f31771h0.d(null, null, null, null, this);
    }
}
