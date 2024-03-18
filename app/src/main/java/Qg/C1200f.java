package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1200f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14839Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y.F f14840Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14841h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200f(y.F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14840Z = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14839Y = obj;
        this.f14841h0 |= Integer.MIN_VALUE;
        return this.f14840Z.c(null, this);
    }
}
