package Cb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class J extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2883Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f2884Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2885h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2884Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2883Y = obj;
        this.f2885h0 |= Integer.MIN_VALUE;
        return this.f2884Z.b(this);
    }
}
