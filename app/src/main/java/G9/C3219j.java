package g9;

import M1.v;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: g9.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219j extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31329Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f31330Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ v f31331h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3219j(v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31331h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31329Y = obj;
        this.f31330Z |= Integer.MIN_VALUE;
        return this.f31331h0.c(null, this);
    }
}
