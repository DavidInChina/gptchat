package kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: kd.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4253q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4255s f37339Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37340Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37341h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37342i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4253q(C4255s c4255s, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37341h0 = c4255s;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37340Z = obj;
        this.f37342i0 |= Integer.MIN_VALUE;
        return C4255s.d(this.f37341h0, this);
    }
}
