package xc;

import N.W;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6392a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f49787Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f49788Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f49789h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6392a(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49789h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49787Y = obj;
        this.f49788Z |= Integer.MIN_VALUE;
        return this.f49789h0.c(null, this);
    }
}
